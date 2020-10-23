package com.vimpel.myfirstapp;

public class MyFirstApp {	
    public static void main(String[] args) {
        System.out.println("Hello, world MF");
    int i=10;
    int j=0;
    do {
        if(i%2!=0) j++;
        i++;
    }
    while(i<=20);
    System.out.println(j);
    }
}