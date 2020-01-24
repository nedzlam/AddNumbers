package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> lista = new ArrayList<>();
        int suma = 0;
        for(;;) {
            lista.add(scanner.nextLine());
            if(lista.contains("")) break;
        }
        for(int i=0; i<lista.size(); i++) {
            System.out.printf(lista.get(i) + " ");
            try {
            suma = suma + Integer.parseInt(lista.get(i));
        }catch (NumberFormatException e){
                //exception;
            }
    }
        System.out.println("Result is: " +suma);
}}
