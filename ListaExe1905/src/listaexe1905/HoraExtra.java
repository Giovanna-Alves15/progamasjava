
package listaexe1905;

import java.util.Scanner;

public class HoraExtra {
    public static void main(String[] args) {
        //var
        double hr, min, gph,result,resulta,resultado;
        //entrada
        Scanner entrada = new Scanner(System.in);
        
        System.out.println ("horas: ");
        hr=entrada.nextDouble();
        
        System.out.println ("minutos: ");
        min=entrada.nextDouble();
        
        System.out.println ("Quanto ganha por hora?");
        gph=entrada.nextDouble();
        //processamento
        //70%
        result=(min/60)+hr;
        resulta=result*gph;
        resultado=resulta*1.7;
        //saida
        System.out.println ("R$"+resultado+"com 70% a mais");
}
}