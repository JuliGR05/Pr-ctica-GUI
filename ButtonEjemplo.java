import javax.swing.*;

public class ButtonEjemplo {
 private static JFrame frame;
 
 public static void main (String[] args){
    iniciarFrame();
    JPanel panel =  new JPanel();
    JButton boton = new JButton("Soy un botón");
    panel.add(boton);

    frame.add(panel);
    frame.setVisible(true);
 }

 public static void iniciarFrame(){
   frame =new JFrame ("Botón");
    frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    frame.setSize (400, 300);
    frame.setVisible (true);
}
}