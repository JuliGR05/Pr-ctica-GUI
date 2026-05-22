package Ejercicios;
import javax.swing.*;
import java.awt.event.*;

public class Ejercicio3 extends JFrame {

    private JTextField txtUsuario;
    private JPasswordField txtPass;
    private JButton btnIngresar;

    public Ejercicio3() {
        setTitle("Login Falso");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lblUsuario = new JLabel("Usuario:");
        lblUsuario.setBounds(20, 20, 80, 25);
        add(lblUsuario);

        txtUsuario = new JTextField();
        txtUsuario.setBounds(120, 20, 150, 25);
        add(txtUsuario);

        JLabel lblPass = new JLabel("Contraseña:");
        lblPass.setBounds(20, 60, 80, 25);
        add(lblPass);

        txtPass = new JPasswordField();
        txtPass.setBounds(120, 60, 150, 25);
        add(txtPass);

        btnIngresar = new JButton("Ingresar");
        btnIngresar.setBounds(120, 100, 100, 30);
        add(btnIngresar);

        btnIngresar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {

                String usuario = txtUsuario.getText();
                String pass = txtPass.getText();

                if (usuario.equals("admin") && pass.equals("1234")) {

                    JOptionPane.showMessageDialog(null,
                            "Acceso correcto");

                } else {

                    JOptionPane.showMessageDialog(null,
                            "Datos incorrectos");
                }
            }
        });
    }

    public static void main(String[] args) {
        new Ejercicio3().setVisible(true);
    }
}