/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.Calculos;

public class Calculo {
// taributos
    Integer resultadoSuma=0;
    Integer resultadoResta=0;
    Integer resultadoMultiplicacion=0;
    Integer resultadoDivicion=0;
    Integer numeroUno=0;
    Integer numeroDos=0;
    public Calculo() {// constructor vacio
    }
   public void CalculoMatematico(int a, int b, Calculos view){// metodo 
        this.numeroUno=a;
        this.numeroDos=b;
        resultadoSuma=numeroUno+numeroDos;
        resultadoResta=numeroUno-numeroDos;
        resultadoMultiplicacion=numeroUno*numeroDos;
        resultadoDivicion=numeroUno/numeroDos;
        // envio de los valores
        view.getLbl_resultado_Suma().setText(String.valueOf(resultadoSuma));
        view.getLbl_Resultado_Resta().setText(String.valueOf(resultadoResta));
        view.getLbl_Resultado_Multiplicacion().setText(String.valueOf(resultadoMultiplicacion));
        view.getLbl_resultado_Divicion().setText(String.valueOf(resultadoDivicion));
    } 
}

