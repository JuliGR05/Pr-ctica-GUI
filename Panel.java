import javax.swing.JFrame;
import javax.swing.*;

public class Panel {
    private static JFrame frame;

public static void main (String[] args) {
    iniciarFrame();
    JPanel panel = new JPanel();
    panel.setBackground(Color.BLUE);
    frame.add (panel);
}

public static void iniciarFrame () {
    
}
}
