
package retangulo;

import java.util.Scanner;

public class Retangulo {

    
    public static void main(String[] args) {
        //definição de variaveis
        double base, altura, area, perimetro;
        
        //entrada
        Scanner entrada = new Scanner(System. in);
        
        System.out.println("Digite a Base");
        base =entrada.nextDouble();
        
        System.out.println("Digite a Altura");
        altura =entrada.nextDouble();
          
        //processamento
        area = base*altura;
        perimetro = (base*base)+(altura*altura);
         
        //saída
        System.out.println("A área do retângulo é:1 "+area); 
        System.out.println("O perimetro do retângulo é: "+perimetro); 
         
         
         
         
         
         
         
         
         
        
         
    
    }
    
}
