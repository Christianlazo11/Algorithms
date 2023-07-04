package com.GnomeSort;

public class MainGnome02 {
    public static void main(String[] args) {

        int []arr = {10,8,15,12,11};
        //Se crea la clase
        Gnome gnome = new Gnome();

        //Recorremos el array para mostrar por consola los elementos
        for(int n : arr) {
            System.out.print(n + " | ");
        }

        //llamamos al metodo para ordenar el array
        gnome.sortArr(arr);

        System.out.println();
        System.out.println("-----------------------------------------------------------------");

        //Mostramos por consola los elementos
        for(int n : arr) {
            System.out.print(n + " | ");
        }


        //BigO n^2 aunque no tiene bucles anidados, el indice esta en constante cambio de forma bidireccional
    }
}
