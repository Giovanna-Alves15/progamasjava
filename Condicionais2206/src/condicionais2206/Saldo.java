package condicionais2206;

import javax.swing.JOptionPane;


public class Saldo {
    public static void main(String[] args) {
        double sal,saq, cb, limi;
        
        //entrada
        saq= Double.parseDouble( JOptionPane.showInputDialog("Digite o valor do seu saque: "));
        //decisão
        limi=10000;
        sal=50000;
        cb=(sal-saq);
        if(cb>=0){
        JOptionPane.showMessageDialog(null,"seu saldo agora esta positivo com: R$ "+cb);
        }
        if((cb<0) && (cb>=(-limi))){
        JOptionPane.showMessageDialog(null,"Seu saldo agora esta negativo com R$ "+cb);
        }else{
        JOptionPane.showMessageDialog(null,"Você não tem limite o suficiente, pois seu limite é de "+limi);
        }
    }
}
