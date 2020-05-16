
package listaexe1905;

import java.util.Scanner;

public class GastoGasolina {
     public static void main(String[] args) {
        //var
        double km, con, pre, ida, idav;
        //entrada
        Scanner entrada = new Scanner(System.in);
        
        System.out.println ("Quantos km ira percorrer?");
        km=entrada.nextDouble();
        
        System.out.println ("Quantos km seu carro precisa correr para consumir um litro?");
        con=entrada.nextDouble();
        
        System.out.println ("Qual o preço médio da gasolina?");
        pre=entrada.nextDouble();
        //processamento
        ida=(km/con)*pre;
        idav=(ida*2);
        //saida
        System.out.println ("Você gastara em média "+ida+"reais para a ida e "+idav+" reais para a ida e volta");
}
}