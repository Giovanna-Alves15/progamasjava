
package listaexe1905;

import java.util.Scanner;

public class FabricadeCarro {
    public static void main(String[] args) {
        //var
        double vf,i,t,d,tt;
        //entrada
        Scanner entrada = new Scanner(System.in);
        
        System.out.println ("me diga o valor de fabrica de seu carro");
        vf =entrada.nextDouble();
        //processamento
        i=(vf/100)*45;
        t=(vf+i);
        d=(t/100)*28;
        tt=(t+d);
        //saida
        System.out.println ("o valor de fabrica é:"+vf);
        System.out.println ("o valor de impostos é:"+i);
        System.out.println ("a distribuição é:"+d);
        System.out.println ("o consumidor devera pagar:"+tt);
}
}