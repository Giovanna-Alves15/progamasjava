package condicionais2206;

import javax.swing.JOptionPane;


public class PesoLutador {
    public static void main(String[] args) {
    double pes;
    //entrada
    pes=Double.parseDouble( JOptionPane.showInputDialog("Digite seu peso: "));

    //processsamento
    if (pes>=46.27 && pes<47.63) {
        JOptionPane.showMessageDialog(null,"Você esta na categoria palha ligeiro: "+pes);
    }

    if(pes>=47.63 && pes<48.99){
        JOptionPane.showMessageDialog(null,"Você esta na categoria palha: "+pes);
    }

    if(pes>=48.99 && pes<50.35) {
        JOptionPane.showMessageDialog(null,"Você esta na categoria mosca ligeiro: "+pes);
    }

    if(pes>=50.35 && pes<51.71){
        JOptionPane.showMessageDialog(null,"Você esta na categoria mosca: "+pes);
    }

    if(pes>=51.71 && pes<53.52){
        JOptionPane.showMessageDialog(null,"Você esta na categoria super mosca: "+pes);
    }

    if(pes>=53.52 && pes<55.34) {
        JOptionPane.showMessageDialog(null,"Você esta na categoria galo: "+pes);
    }

    if(pes>=55.34 && pes<57.15) {
        JOptionPane.showMessageDialog(null,"Você esta na categoria super galo: "+pes);
    }

    if(pes>=57.15 && pes<58.97){
        JOptionPane.showMessageDialog(null,"Você esta na categoria pena: "+pes);
    }

    if(pes>=58.97 && pes<61.23) {
        JOptionPane.showMessageDialog(null,"Você esta na categoria super pena: "+pes);
    }

    if(pes>=61.23 && pes<63.5) {
        JOptionPane.showMessageDialog(null,"Você esta na categoria leve: "+pes);
    }

    if(pes>=63.5 && pes<66.68){
        JOptionPane.showMessageDialog(null,"Você esta na categoria super leve: "+pes);
    }

    if(pes>=66.68 && pes<69.85) {
        JOptionPane.showMessageDialog(null,"Você esta na categoria meio-médio: "+pes);
    }

    if(pes>=69.85 && pes<73.03) {
        JOptionPane.showMessageDialog(null,"Você esta na categoria super meio-médio: "+pes);
    }

    if(pes>=73.03 && pes<76.2) {
        JOptionPane.showMessageDialog(null,"Você esta na categoria médio: "+pes);
    }

    if(pes>=76.2 && pes<79.38) {
        JOptionPane.showMessageDialog(null,"Você esta na categoria super médio: "+pes);
    }

    if(pes>=79.38 && pes<90.72) {
        JOptionPane.showMessageDialog(null,"Você esta na categoria meio-pesado: "+pes);
    }

    if(pes==90.72){
        JOptionPane.showMessageDialog(null,"Você esta na categoria cruzador: "+pes);
    }

    if(pes>90.72){
        JOptionPane.showMessageDialog(null,"Você esta na categoria pesado: "+pes);
    }
 }
}
