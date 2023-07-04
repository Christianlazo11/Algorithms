package com.GnomeSort;

public class Gnome {

    public Gnome(){}

    public void sortArr(int [] arr) {
        int index = 0;
        while(index < arr.length) {

            if(index == 0) {
                index++;
            }
            if(arr[index] >= arr[index - 1]) {
                index++;
            } else {
                int aux = 0;
                aux = arr[index];
                arr[index] = arr[index - 1];
                arr[index - 1] = aux;
                index--;
            }
        }

    }

    public void sortArr02(int [] arr) {

        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[i]) {
                    int aux = arr[i];
                    arr[i] = arr[j];
                    arr[j] = aux;
                }
            }
        }

    }

}
