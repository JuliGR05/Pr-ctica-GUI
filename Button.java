import javax.swing.*;

public class Button {
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
    
 }
}
