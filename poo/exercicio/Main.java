package com.poo.exercicio;

import com.poo.exception.ExceptionA;
import com.poo.exception.ExceptionB;
import com.poo.exception.ExceptionC;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            try {
                jogaExcessao();
            } catch (Exception excessao) {
                if (excessao instanceof ExceptionC) {
                    System.out.println("Excessao C");
                } else if (excessao instanceof ExceptionB) {
                    System.out.println("Excessao B");
                } else if (excessao instanceof ExceptionA) {
                    System.out.println("Excessao de A");
                } else {
                    System.out.println("Outra excessão");
                }
            }
        }
    }

    public static void jogaExcessao() throws Exception {
        int random = (int) (4 * Math.random());
        switch (random) {
            case 0 -> throw new ExceptionA();
            case 1 -> throw new ExceptionB();
            case 2 -> throw new IOException();
            case 3 -> throw new NullPointerException();
        }
    }
}
