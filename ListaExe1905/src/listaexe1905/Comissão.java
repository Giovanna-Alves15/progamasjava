
package listaexe1905;

import java.util.Scanner;

public class Comissão {
    public static void main(String[] args) {
        //var
        double pp,qtd,c,vt;
        //entrada
        Scanner entrada = new Scanner(System.in);
        
        System.out.println ("qual o preço de sua peça?");
        pp =entrada.nextDouble();
        
        System.out.println ("quantas peças você vendeu? ");
        qtd= entrada.nextDouble();
        //processamento
        vt=(pp*qtd);
        c=(vt/100)*5;
        //saida
        System.out.println ("a venda total foi de:"+vt);
        System.out.println ("a comissão de 5% foi:"+c);
}
}