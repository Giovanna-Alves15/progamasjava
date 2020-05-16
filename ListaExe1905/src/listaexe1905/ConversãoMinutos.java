
package listaexe1905;

import java.util.Scanner;

public class ConversãoMinutos {
    public static void main(String[] args) {
        //var
        double hr, min,result;
        //entrada
        Scanner entrada = new Scanner(System.in);
        
        System.out.println ("horas: ");
        hr=entrada.nextDouble();
        
        System.out.println ("minutos: ");
        min=entrada.nextDouble();
        //processamento
        result=(min/60)+hr;
        //saida
        System.out.println ("a sua conversão deu "+result);
}
}