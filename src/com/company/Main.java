package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Task 1");
        IntArrayList intArrayList = new IntArrayList();
        System.out.println(intArrayList);
        intArrayList.add(45);
        System.out.println(intArrayList);
        intArrayList.add(4);
        intArrayList.add(5);
        intArrayList.add(70);
        intArrayList.add(68);
        System.out.println(intArrayList);
        System.out.println(intArrayList.size());
        intArrayList.set(20, 50);
        System.out.println(intArrayList);
        System.out.println(intArrayList.size());
        intArrayList.add(10, 10);
        System.out.println(intArrayList);
        System.out.println(intArrayList.size());
        intArrayList.add(0, 1000);
        System.out.println(intArrayList);
        System.out.println(intArrayList.size());
        intArrayList.remove(3);
        System.out.println(intArrayList);
        System.out.println(intArrayList.contains(68));
        System.out.println(intArrayList.get(intArrayList.size() - 1));
        intArrayList.clear();
        System.out.println(intArrayList.isEmpty());
        System.out.println("===================");
        System.out.println("Task 2");
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        eveOdd(array);
        System.out.println(Arrays.toString(array));
        System.out.println("Task 3");
        int[][] matrix={{0,1,0},{1,1,0},{1,0,0},{0,0,1}};
        System.out.println("Matrix: ");
        write(matrix);
        reverseInvert(matrix);
        System.out.println("Revered and inverted matrix:");
        write(matrix);
    }

    private static void write(int[][] matrix) {
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static void reverseInvert(int[][] matrix) {
        for (int i = 0; i <matrix.length ; i++) {
            int count=matrix[i].length-1;
            for (int j = 0; j <matrix[i].length/2 ; j++) {
                int tmp=matrix[i][j];
                matrix[i][j]=matrix[i][count];
                matrix[i][count]=tmp;
                count--;
            }
            for (int j = 0; j <matrix[i].length ; j++) {
                if(matrix[i][j]==0){
                    matrix[i][j]=1;
                }else {
                    matrix[i][j]=0;
                }
            }
        }
    }

    private static void eveOdd(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int count=i;
            for (int j = i-1; j >= 0; j--) {
                if(array[count]%2==0&&array[j]%2!=0){
                    int tmp=array[count];
                    array[count]=array[j];
                    array[j]=tmp;
                    count--;
                }
            }


        }
    }
}
