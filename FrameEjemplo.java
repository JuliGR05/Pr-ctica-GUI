import javax.swing.JFrame;
public class FrameEjemplo {
    private static JFrame frame;

public static void main (String[] args) {
    iniciarFrame();

}

public static void iniciarFrame () {
    frame =new JFrame ("Prueba");
    frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    frame.setSize (400, 300);
    frame.setVisible (true);
}
}
