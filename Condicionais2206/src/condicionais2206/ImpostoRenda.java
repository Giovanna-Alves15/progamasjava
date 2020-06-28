package condicionais2206;

import javax.swing.JOptionPane;


public class ImpostoRenda {
    public static void main(String[] args) {
    double salario,resul = 0;
    //entrada
salario=Double.parseDouble( JOptionPane.showInputDialog("Qual o seu salário? "));
    //desisão
if(salario<=1903.98){
   resul=0;
}
if((salario>=1903.99) && (salario<=2826.65)){
   resul=(salario*0.075);
}
if((salario>=2826.66) && (salario<=3751.05)){
   resul=(salario*0.15);
    }
if((salario>=3751.06) && (salario<=4664.68)){
   resul=(salario*0.225);
}
if (salario>4664.68){
   resul=(salario*0.275);
}
JOptionPane.showMessageDialog(null,"O desconto na sua folha de pagamento sera de: "+resul);
  }
}
