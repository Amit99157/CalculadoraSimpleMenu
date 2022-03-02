package com.amit;

import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int add, subtract, out, n, a, b, c, d;

        do {
            System.out.println("MENU");
            System.out.println("=========================================");
            System.out.println("1.- Sumar");
            System.out.println("2.- Restar");
            System.out.println("3.- Salir");
            System.out.print("Elige una opcion : ");
            n = entrada.nextInt();
            if (n == 1) {
                System.out.println("dame dos numero ");
                a = entrada.nextInt();
                b = entrada.nextInt();
                c = a + b;
                System.out.println(c);
            } else if (n == 2) {
                System.out.println("dame dos numero ");
                a = entrada.nextInt();
                b = entrada.nextInt();
                c = a - b;
                System.out.println(c);
            } else if (n == 3) {
                System.out.println("");
            } else;
        } while(n != 0);
    }
}
