import javax.swing.*;

public class ComboBox {
   private static JFrame frame;
   
   public static void main (String[] args){
    iniciarFrame();
    JPanel panel = new JPanel();
    JComboBox<String> comboBox = new JComboBox<>();
    comboBox.addItem("Opción 1");
   comboBox.addItem("Opción 2");
   panel.add (comboBox);
    

    frame.add (panel);
    frame.setVisible(true);
   }

   public static void iniciarFrame(){
    
   }
}
