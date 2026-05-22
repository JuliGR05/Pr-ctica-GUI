package Ejercicios;
import javax.swing.*;
import java.awt.event.*;

public class Ejercicio1 extends JFrame {

    JTextField txtNombre;
    JButton btnSaludar;

    public Ejercicio1() {

        setTitle("Saludo Personalizado");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lblNombre = new JLabel("Ingrese su nombre:");
        lblNombre.setBounds(20, 20, 150, 30);
        add(lblNombre);

        txtNombre = new JTextField();
        txtNombre.setBounds(20, 50, 200, 30);
        add(txtNombre);

        btnSaludar = new JButton("Saludar");
        btnSaludar.setBounds(20, 100, 100, 30);
        add(btnSaludar);

        btnSaludar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String nombre = txtNombre.getText();

                JOptionPane.showMessageDialog(null,
                        "Hola " + nombre);
            }
        });
    }

    public static void main(String[] args) {

        Ejercicio1 ventana = new Ejercicio1();
        ventana.setVisible(true);
    }
}