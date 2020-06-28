package condicionais2206;

import javax.swing.JOptionPane;


public class IMC {
    public static void main(String[] args) {
    double alt, pe, imc;
    //entrada
alt=Double.parseDouble( JOptionPane.showInputDialog("Digite sua altura: "));

pe=Double.parseDouble( JOptionPane.showInputDialog("Digite seu peso: "));

//processsamento
imc=pe/(alt*alt);
//decisão
if(imc<=18.5){ 
   JOptionPane.showMessageDialog(null,"Você esta abaixo do peso: "+imc);
           }
if((imc>18.5)&&(imc<=24.9)){
   JOptionPane.showMessageDialog(null,"Você esta com o ideal: "+imc);
           }
if((imc>=25)&&(imc<=29.9)){
   JOptionPane.showMessageDialog(null,"Você esta sobrepeso: "+imc);
           }
if((imc>=30)&&(imc<=34.9)){
   JOptionPane.showMessageDialog(null,"Você esta com obesidade grau 1: "+imc);
           }
if((imc>=35)&&(imc<=39.9)){
   JOptionPane.showMessageDialog(null,"Você esta com obesidade grau 2: "+imc);
           }
if(imc>=40){
   JOptionPane.showMessageDialog(null,"Você esta com obesidade grau 3: "+imc);
           }
  }
}
