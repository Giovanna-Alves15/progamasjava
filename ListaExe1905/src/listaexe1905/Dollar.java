
package listaexe1905;

import java.util.Scanner;

public class Dollar {
    
    public static void main(String[] args) {
        //var
        double cot, val, result;
        //entrada
        Scanner entrada = new Scanner(System.in);
        
        System.out.println (" Digite qual o valor da cotação do dollar ");
        cot=entrada.nextDouble();
        
        System.out.println ("Digite quanto quer converter");
        val= entrada.nextDouble();
        //processamento
        result=(val/cot);
        //saida
        System.out.println (val+" reais, é o mesmo que "+result+" dolares ");
}
}