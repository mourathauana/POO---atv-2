package com.poo.exercicio.questao21;

import com.poo.exercicio.questao16.Questao16_V2;

public class Main {

    public static void main(String[] args) {
        try {
            Questao16_V2 objeto3 = new Questao16_V2(30); //- se der erro

            Questao16_V2 objeto2 = new Questao16_V2(20); //oq eu n sei, trato aqui fora
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
