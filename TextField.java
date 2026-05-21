import javax.swing.*;

public class TextField {
   private static JFrame frame;
   
   public static void main (String[] args){
    iniciarFrame();
    JPanel panel = new JPanel();
    JTextField campoTexto = new JTextField(30);
    panel.add(campoTexto);

    frame.add (panel);
    frame.setVisible(true);
   }

   public static void iniciarFrame(){
    
   }
}
