import javax.swing.*;

public class RadioButtonEjemplo {
 private static JFrame frame;
 
 public static void main (String[] args){
    iniciarFrame();
    JPanel panel =  new JPanel();
    ButtonGroup grupo = new ButtonGroup();
    JRadioButton rb1 = new JRadioButton("Opción 1");
    JRadioButton rb2 = new JRadioButton("Opción 2");
    grupo.add(rb1);
    grupo.add(rb2);
    panel.add(rb1);
    panel.add(rb2);


    frame.add(panel);
    frame.setVisible(true);
 }

 public static void iniciarFrame(){
   frame =new JFrame ("RadioButton");
    frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    frame.setSize (400, 300);
    frame.setVisible (true);
}
}