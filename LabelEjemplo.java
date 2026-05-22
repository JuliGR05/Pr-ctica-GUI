import javax.swing.*;

public class LabelEjemplo {
    private static JFrame frame;

public static void main (String[] args) {
    iniciarFrame();
    JPanel panel = new JPanel();
    JLabel label = new JLabel("Hola, mundo!");
    panel.add (label);

    frame.add (panel);
}

public static void iniciarFrame (){
frame =new JFrame ("Etiqueta");
    frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    frame.setSize (400, 300);
    frame.setVisible (true);
}
}
