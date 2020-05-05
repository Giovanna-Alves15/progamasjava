
package emprestimo;

import java.util.Scanner;

public class Emprestimo {

    public static void main(String[] args) {
        //declaração de variaveis
       double emp,taxa, result;
        int temp;
        Scanner entrada = new Scanner (System.in);
        //entrada
        System.out.println("Quanto quer emprestado? ");
        emp = entrada.nextDouble();
        System.out.println("Em quantos meses vai pagar?  ");
        temp= entrada.nextInt();
        taxa= 0.02;
        //processamento
       
        result = emp*(Math.pow((1+taxa), temp));
        
        //saída
        System.out.println("Ao final de "+ temp+ " meses, você pagara: R$"+result);
        
        
        
        
        
        
        
        
        
    }
    
}
