package com.poo.exercicio.questao19;

import com.poo.exercicio.questao16.Questao16_V1;

public class Main {

    public static void main(String[] args) {
        try {
            Questao16_V1 objeto3 = new Questao16_V1(30); //- se der erro
            Questao16_V1 objeto = new Questao16_V1(10);
            Questao16_V1 objeto2 = new Questao16_V1(20);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}


