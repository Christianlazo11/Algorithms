package com.BCU;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GFG {
    // Grafo
    // Devolvemos el coste minimo
    static List<Integer> uniform_cost_search(List<Integer> goal, int start, List<List<Integer>> graph, HashMap<List<Integer>, Integer> cost) {

        // Creamos la respuesta
        List<Integer> answer = new ArrayList<Integer>();

        // Creamos la cola de prioridades
        List<Tuple<Integer, Integer>> queue = new ArrayList<Tuple<Integer, Integer>>();

        // Establecemos el vector de respuesta en el valor máximo
        for (int i = 0; i < goal.size(); i++)
            answer.add(Integer.MAX_VALUE);

        // Introducimos el indice inicial
        queue.add(new Tuple<Integer, Integer>(0, start));

        // Almacenamos los nodos visitados
        HashMap<Integer, Integer> visited = new HashMap<Integer, Integer>();

        // contador
        int count = 0;

        // Mientras la cola no este vacia
        while (!queue.isEmpty()) {

            // Obtenemos el elementos superior de la cola de prioridades

            Tuple<Integer, Integer> q = queue.get(0);
            Tuple<Integer, Integer> p = new Tuple<Integer, Integer>(-q.x, q.y);

            // Eliminamos el elemento
            queue.remove(0);

            if (goal.contains(p.y)) {
                // Obtenemos la posición
                int index = goal.indexOf(p.y);
                // Si se alcanza un nuevo objetivo
                if (answer.get(index) == Integer.MAX_VALUE)
                    count++;
                // Si el coste es inferior
                if (answer.get(index) > p.x)
                    answer.set(index, p.x);
                // Eliminamos el elemento
                queue.remove(0);
                // Si se alcanzan  todos los objetivos
                if (count == goal.size())
                    return answer;
            }
            //Si el nodo no ha sido visitado, recorremos los nodos adyacentes
            if (!visited.containsKey(p.y))
                for (int i = 0; i < graph.get(p.y).size(); i++) {

                    //Creamos una nueva tupla con el costo de cada arista para obtener el costo acumulado hasta el nodo adyacente
                    queue.add(new Tuple<Integer, Integer>((p.x +
                            (cost.containsKey(Arrays.asList(p.y, graph.get(p.y).get(i))) ?
                                    cost.get(Arrays.asList(p.y, graph.get(p.y).get(i))) : 0)) * -1,
                            graph.get(p.y).get(i)));
                }

            // Marcamos el nodo como visitado
            visited.put(p.y, 1);
        }

        return answer;
    }
}
