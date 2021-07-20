package com.company;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.round((Math.random() * 30));
            System.out.print(arr[i] + "|");
        }


        System.out.println(" ");
        ////////////////#3////////////////
            int sum3 = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                sum3 = sum3 + arr[i];
            }
        }
        System.out.println("#3: " + sum3);


        ////////////////#4////////////////

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 9 == 0) {
                sum3 = sum3 * arr[i];
            }
        }
        System.out.println("#4: " + sum3);

        ////////////////#2////////////////
        Scanner in = new Scanner(System.in);
        System.out.print("Количество элементов массива #2: ");
        int n = in.nextInt();

        int[] arr2 = new int[n];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = (int) Math.round((Math.random() * 30));
            if((i > 0) && ((i & (i - 1)) == 0)) {
                System.out.print(arr2[i] + "|");
            }
        }
        System.out.println(" ");
        ////////////////#1////////////////
        int n1;
        Scanner inn = new Scanner(System.in);
        System.out.print("Количество элементов массива #1: ");
        n1 = inn.nextInt();
        double res1 = 0.00;
        double[] arr1 = new double[n1];
        System.out.println("Массив 1");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (double)Math.round((Math.random() * 43)*100)/100;
            if(arr1[i] > res1){
                res1 = arr1[i];
            }

            System.out.print(arr1[i] + "|");

        }
        System.out.println(" ");
        System.out.println("Ответ 1 = " + res1);

        ////////////////#8////////////////
        int[] arr8 = new int[6];
        System.out.println("Массив 8");
        for (int i = 0; i < arr8.length; i++) {
            arr8[i] = (int) Math.round((Math.random() * 30));
            System.out.print(arr8[i] + "|");
        }
        System.out.println(" ");
        System.out.println("8 виссаМ");


        for(int i = 0; i < arr8.length / 2; i++){
            int temp = arr8[i];
            arr8[i] = arr8[arr8.length - i - 1];
            arr8[arr8.length - i - 1] = temp;
        }
        for(int i = 0; i < arr8.length; i++){
            System.out.print(arr8[i] + "|");
        }
    }
}
