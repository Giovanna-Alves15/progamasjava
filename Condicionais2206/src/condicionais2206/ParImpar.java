package condicionais2206;

import javax.swing.JOptionPane;


public class ParImpar {
    public static void main(String[] args) {
    double num;
    //entrada
    num=Double.parseDouble( JOptionPane.showInputDialog("Digite o valor: "));
    //condisão
    if((num %= 2)==0) {
    JOptionPane.showMessageDialog(null,"Esse numero é par");
         }else{
    JOptionPane.showMessageDialog(null,"Esse numero é impar");
         }
    JOptionPane.showMessageDialog(null,"/(*-*)/");
  }
}
