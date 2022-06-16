package com.poo.exercicio.questao18;

import com.poo.exception.ExceptionA;
import com.poo.exception.ExceptionB;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            try {
                jogaExcessao();
            } catch (ExceptionA excessaoA) {
                System.out.println("A capturado");
            } catch (Exception excessao) {
                if (excessao instanceof NullPointerException) {
                    System.out.println("Excessao de NullPointer");
                } else if (excessao instanceof ExceptionB) {
                    System.out.println("Excessao B");
                } else if (excessao instanceof IOException) {
                    System.out.println("Excessao de IOException");
                } else {
                    System.out.println("Excessao A foi capturada no canto Errado");
                }
            }
        }
    }

    public static void jogaExcessao() throws Exception{
        int random = (int)(4*Math.random());
        switch (random){
            case 0:
                throw new ExceptionA();
            case 1:
                throw new ExceptionB();
            case 2:
                throw new IOException();
            case 3:
                throw new NullPointerException();

        }
    }
}
