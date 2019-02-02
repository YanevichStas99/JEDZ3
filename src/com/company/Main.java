package com.company;

public class Main {

    public static void main(String[] args) {
        IntArrayList intArrayList=new IntArrayList();
        System.out.println(intArrayList);
        intArrayList.add(45);
        System.out.println(intArrayList);
        intArrayList.add(4);
        intArrayList.add(5);
        intArrayList.add(70);
        intArrayList.add(68);
        System.out.println(intArrayList);
        System.out.println(intArrayList.size());
        intArrayList.set(20,50);
        System.out.println(intArrayList);
        System.out.println(intArrayList.size());
        intArrayList.add(10,10);
        System.out.println(intArrayList);
        System.out.println(intArrayList.size());
        intArrayList.add(0,1000);
        System.out.println(intArrayList);
        System.out.println(intArrayList.size());
        intArrayList.remove(3);
        System.out.println(intArrayList);
        System.out.println(intArrayList.contains(68));
        System.out.println(intArrayList.get(intArrayList.size()-1));
        intArrayList.clear();
        System.out.println(intArrayList.isEmpty());
    }
}
