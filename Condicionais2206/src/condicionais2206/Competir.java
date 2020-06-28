package condicionais2206;

import javax.swing.JOptionPane;


public class Competir {
    public static void main(String[] args) {
    double alt,ida;
    //entrada
    alt=Double.parseDouble( JOptionPane.showInputDialog("Digite sua altura: "));

    ida=Double.parseDouble( JOptionPane.showInputDialog("Digite sua idade: "));
    //processsamento_decisão
    if((alt>=1.75)&&(ida>=18)){
    JOptionPane.showMessageDialog(null,"De acordo com a regra você esta permitido competir ");
        }else{
    JOptionPane.showMessageDialog(null,"Sua idade e/ou sua altura não te permitem competir ");
        }
    }
}
