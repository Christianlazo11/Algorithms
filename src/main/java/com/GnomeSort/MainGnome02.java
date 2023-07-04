package com.GnomeSort;

public class MainGnome02 {
    public static void main(String[] args) {

        int []arr = {10,8,15,12,11};
        Gnome gnome = new Gnome();

        for(int n : arr) {
            System.out.print(n + " | ");
        }

        gnome.sortArr(arr);

        System.out.println();
        System.out.println("-----------------------------------------------------------------");

        for(int n : arr) {
            System.out.print(n + " | ");
        }


        //BigO n^2 aunque no tiene bucles anidados, el indice esta en constante cambio de forma bidireccional
    }
}
