
package listaexe1905;

import java.util.Scanner;

public class SomaQuadradro {
    public static void main(String[] args) {
        //var
        double a,b,c,d,t;
        
        //entrada
        Scanner entrada = new Scanner(System.in);
        
        System.out.println ("digite um numero ");
        a =entrada.nextDouble();
        
        System.out.println ("digite mais um numero ");
        b= entrada.nextDouble();
        
        System.out.println ("digite mais um numero ");
        c = entrada.nextDouble();
        
        System.out.println ("digite mais um numero ");
        d= entrada.nextDouble();
        //processamento
        t=(a*a)+(b*b)+(c*c)+(d*d);
        //saida
        System.out.println ("o quadrado com a soma desses numeros é: "+t);
}
}