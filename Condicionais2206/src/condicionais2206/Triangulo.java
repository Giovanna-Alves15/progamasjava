
package condicionais2206;

import javax.swing.JOptionPane;


public class Triangulo {
    public static void main(String[] args) {
        //var
        double a,b,c;
        //entrada
       a= Double.parseDouble( JOptionPane.showInputDialog("Digite o valor do lado a: "));   
       b= Double.parseDouble( JOptionPane.showInputDialog("Digite o valor do lado b: "));
       c= Double.parseDouble( JOptionPane.showInputDialog("Digite o valor do lado c: "));
       
        //condisão
        //abs significa valor absoluto só retorna valores verdadeiros
        if(((a<(b+c)) && (a>(Math.abs(b-c)))) && ((b<(a+c)) && (b>(Math.abs(a-c)))) && ((c<(a+b)) && (c>(Math.abs(a-b))))){
        if((a==b) && (b==c) && (a==c)){
        JOptionPane.showMessageDialog(null,"Esse triângulo é equilatero");
        }
        if((a!=b) && (a!=c) && (b!=c)){
        JOptionPane.showMessageDialog(null,"Esse triangulo é escaleno");
        }
        if(((a==b)&&(b!=c))||((b==c)&&(c!=a))||((a==c)&&(c!=b))){
        JOptionPane.showMessageDialog(null,"Esse triangulo é isóceles");
        }
        JOptionPane.showMessageDialog(null, "É um triângulo");
        }else{
            JOptionPane.showMessageDialog(null, "Não é um triângulo");
             }
    }
}
