package com.company;

import java.util.Arrays;

public class IntArrayList implements IntList {

    private int[] array = new int[0];
    private int count = 0;

    @Override
    public String toString() {
        int[] arrayToString=new int[count];
        for (int i = 0; i <count ; i++) {
            arrayToString[i]=array[i];
        }
        return "IntArrayList{" +
                "array=" + Arrays.toString(arrayToString) +
                '}';
    }

    @Override
    public void add(int value) {
        if (count == 0 || array.length == count) {
            int newSize = array.length * 3 / 2 + 1;
            int[] newArray = new int[newSize];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            newArray[count] = value;
            count++;
            array = newArray;
        } else {
            array[count] = value;
            count++;
        }

    }

    @Override
    public void add(int index, int element) {
        if (count == 0 || array.length == count) {
            int newSize = array.length * 3 / 2 + 1;
            int[] newArray = new int[newSize];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
        if (index + 1 > array.length) {
            int newSize = array.length;
            while (index + 1 > newSize) {
                newSize = newSize * 3 / 2 + 1;
            }
            int[] newArray = new int[newSize];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
        if (index >= count) {
            set(index, element);
        } else {
            int[] newArray = new int[array.length];
            for (int i = 0; i < index; i++) {
                newArray[i] = array[i];
            }
            newArray[index] = element;
            for (int i = index + 1; i < array.length; i++) {
                newArray[i] = array[i - 1];
            }
            count++;
            array = newArray;
        }

    }

    @Override
    public void clear() {
        count = 0;
    }

    @Override
    public boolean contains(int value) {
        int countValue = 0;
        for (int i = 0; i < count; i++) {
            if (array[i] == value) {
                countValue++;
            }
        }
        if (countValue > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int get(int index) {
        return array[index];
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public int remove(int index) {
        if(index>count-1){
            return 0;
        }else {
            int[] newArray = new int[array.length];
            for (int i = 0; i < index; i++) {
                newArray[i] = array[i];
            }
            for (int i = index + 1; i < array.length; i++) {
                newArray[i - 1] = array[i];
            }
            array = newArray;
            count--;
            return 0;
        }
    }

    @Override
    public void set(int index, int element) {
        if (index > array.length) {
            int newSize = array.length;
            while (index > newSize) {
                newSize = newSize * 3 / 2 + 1;
            }
            int[] newArray = new int[newSize];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
        array[index] = element;
        if (index > count) {
            count = index + 1;
        }
    }

    @Override
    public int size() {
        return count;
    }

}