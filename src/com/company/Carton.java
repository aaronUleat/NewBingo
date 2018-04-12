package com.company;

import java.lang.reflect.Array;

public class Carton {


    public void newCarton() {
        String [][] bing_arr = new String[5][5];
        for (int i = 0; i < 5 ; i++) {

            agregarNumeros(i, bing_arr);
        }
    }

    public static void agregarNumeros (int index, String [][]bingonums) {


        switch (index) {
            case 0: generarNumero(index, 1, bingonums);
                break;
            case 1: generarNumero(index, 16, bingonums);
                break;
            case 2: generarNumero(index, 31, bingonums);
                break;
            case 3: generarNumero(index, 46, bingonums);
                break;
            case 4: generarNumero(index, 60, bingonums);
                break;
        }

    }

    public static void generarNumero( int index, int col, String [][] numsarray) {

        int count = 0;

        for (int i = 0; i < 5; i++) {
            int num = (int) (Math.random() * 15) + col;
            String num_str = Integer.toString(num);
            numsarray[index][i] = num_str;
            //System.out.println( numsarray[index][i] );
        }

        String str = String.join(",", numsarray[index]);

        verifyRepitedNumber(str);

    }


    public static void verifyRepitedNumber(String str) {
        System.out.println(str);
    }



} // finish class


