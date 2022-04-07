package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap list size");
        int size= scanner.nextInt();
        int[] list=new int[size];
        System.out.println("Nhap "+list.length+" value");
        for (int i=0;i< list.length;i++){
            list[i]=scanner.nextInt();
        }
        System.out.println("List vua nhap: ");
        for (int i=0;i< list.length;i++){
            System.out.printf(list[i]+"\t");
        }
        System.out.println("List sau khi sap xep: ");
        inSertionSort(list);
    }
    public static void inSertionSort(int[] list){
        int n= list.length;
        for (int i=0;i< list.length;i++){
            int key=list[i];
            int j=i-1;
            while (j>=0&&list[j]>key){
               list[j+1]=list[j];
               j=j-1;
            }
            list[j+1]=key;
        }
    }
}
