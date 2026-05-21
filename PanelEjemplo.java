import java.awt.Color;
import javax.swing.*;

public class PanelEjemplo {
    private static JFrame frame;

public static void main (String[] args) {
    iniciarFrame();
    JPanel panel = new JPanel();
    panel.setBackground(Color.BLUE);
    frame.add (panel);
}

public static void iniciarFrame () {
  frame =new JFrame ("Panel");
    frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    frame.setSize (400, 300);
    frame.setVisible (true);
}
}