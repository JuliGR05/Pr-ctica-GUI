import javax.swing.*;

public class TextAreaEjemplo {
   private static JFrame frame;
   
   public static void main (String[] args){
    iniciarFrame();
    JPanel panel = new JPanel();
    JTextArea campoTexto = new JTextArea(10, 30);
    panel.add(campoTexto);

    frame.add (panel);
    frame.setVisible(true);
   }

   public static void iniciarFrame(){
    frame =new JFrame ("Área de texto");
    frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    frame.setSize (400, 300);
    frame.setVisible (true);
}
}