package com.poo.exercicio.questao16;

import com.poo.exception.ExceptionB;
import com.poo.exception.ExceptionC;

public class Questao16_V2 {
    public Questao16_V2(int n) throws Exception {

        try {
            if (n == 30)
                throw new ExceptionC("Numero 30");
            else if(n == 20){
                throw new ExceptionB("Vai ser capturado la fora");
            }
        }catch (ExceptionC excessao){ //o que eu sei que vai acontecer, trato aqui dentro
            System.out.println("Foi capturado dentro do metodo");
        }
    }
}
