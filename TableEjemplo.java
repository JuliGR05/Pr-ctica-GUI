import javax.swing.*;

public class TableEjemplo {
    private static JFrame frame;

    public static void main (String[] args){
        iniciarFrame();
        JPanel panel = new JPanel();
        String[] columnas = {"C1", "C2", "C3"};
        String[][] datos = {
            {"F1-C1", "F1-C2", "F1-C3"},
            {"F2-C1", "F2-C2", "F2-C3"},
            {"F3-C1", "F3-C2", "F3-C3"}
        };
        JTable tabla = new JTable(datos, columnas);
        JScrollPane scroll = new JScrollPane(tabla);
        panel.add (scroll);

        frame.add(panel);
        frame.setVisible(true);
    }
    public static void iniciarFrame(){
   frame =new JFrame ("Tabla");
    frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    frame.setSize (400, 300);
    frame.setVisible (true);
}
}
