import javax.swing.*;

public class OptionPaneEjemplo {
 private static JFrame frame;
 
 public static void main (String[] args){
    iniciarFrame();
    JPanel panel =  new JPanel();
    JLabel etiqueta = new JLabel("");
    panel.add(etiqueta);

    frame.add(panel);
    frame.setVisible(true);
    JOptionPane.showMessageDialog(null, "Mensaje emergente");
    String texto = JOptionPane.showInputDialog("Ingrese un texto");
    etiqueta.setText(texto);
 }

 public static void iniciarFrame(){
  frame =new JFrame ("OptionPane");
    frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    frame.setSize (400, 300);
    frame.setVisible (true);
}
}
