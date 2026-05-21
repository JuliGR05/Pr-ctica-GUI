import javax.swing.*;

public class CheckboxEjemplo {
 private static JFrame frame;
 
 public static void main (String[] args){
    iniciarFrame();
    JPanel panel =  new JPanel();
    JCheckBox checkBox1 = new JCheckBox("CB1");
    JCheckBox checkBox2 = new JCheckBox("CB2");
    panel.add(checkBox1);
    panel.add(checkBox2);

    frame.add(panel);
    frame.setVisible(true);
 }

 public static void iniciarFrame(){
    frame =new JFrame ("Checkbox");
    frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    frame.setSize (400, 300);
    frame.setVisible (true);
}
}

