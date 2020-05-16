
package listaexe1905;

import java.util.Scanner;

public class VelocidadeMedia {

  
    public static void main(String[] args) {
        //var
        double km, hr, min, temp, result;
        //entrada
        Scanner entrada = new Scanner(System.in);
        
        System.out.println ("Quantos km percorreu? ");
        km =entrada.nextDouble();
        
        System.out.println ("Digite a Horas: ");
        hr = entrada.nextDouble();
        
        System.out.println ("Digite o minuto: ");
        min = entrada.nextDouble();
        //processamento
        temp=(min/60)+hr;
        result=km/temp;
        //saida
        System.out.println ("Percorreu "+result+"km/h");
    }
    
}
