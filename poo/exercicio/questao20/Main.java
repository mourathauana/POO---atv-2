package com.poo.exercicio.questao20;

import com.poo.exception.ExceptionA;

public class Main {

    public static void main(String[] args) {
        try {
            SomeMethod();
        } catch (ExceptionA e) {
            System.out.println(e.getMessage());
        }
    }

    public static void SomeMethod() throws ExceptionA {
        try {
            SomeMethod2();
        }catch (ExceptionA e){
            System.out.println("Capturado uma "+ e.getMessage());
            throw e;
        }
    }
    public static void SomeMethod2() throws ExceptionA {
        throw new ExceptionA("Excessao A");
    }

}
