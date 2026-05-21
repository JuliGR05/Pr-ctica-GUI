import javax.swing.*;

public class Label {
    private static JFrame frame;

public static void main (String[] args) {
    iniciarFrame();
    JPanel panel = new JPanel();
    JLabel label = new JLabel("Hola, munndo!");
    panel.add (label);

    frame.add (panel);
}

public static void iniciarFrame (){

}
}
