package condicionais2206;

import javax.swing.JOptionPane;

public class AumentoSalario {
    public static void main(String[] args) {
    double salario, resul;
    //entrada
    salario= Double.parseDouble( JOptionPane.showInputDialog("Digite seu salario atual: "));
    //decisão
    if (salario<=1500){
    resul= salario*1.20;
    }
    else if(salario>1500 && salario<=3000){
    resul= salario*1.15;
    }else{
    resul=salario*1.10;
    }
    JOptionPane.showMessageDialog(null,"Seu salario agora é de: R$ "+resul);
  }
}
