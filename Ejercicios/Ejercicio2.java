package Ejercicios;
import javax.swing.*;
import java.awt.event.*;

public class Ejercicio2 extends JFrame {

    private JTextField txtNum1;
    private JTextField txtNum2;
    private JButton btnSumar;
    private JLabel lblResultado;

    public Ejercicio2() {
        setTitle("Suma Simple");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lbl1 = new JLabel("Número 1:");
        lbl1.setBounds(20, 20, 80, 25);
        add(lbl1);

        txtNum1 = new JTextField();
        txtNum1.setBounds(120, 20, 150, 25);
        add(txtNum1);

        JLabel lbl2 = new JLabel("Número 2:");
        lbl2.setBounds(20, 60, 80, 25);
        add(lbl2);

        txtNum2 = new JTextField();
        txtNum2.setBounds(120, 60, 150, 25);
        add(txtNum2);

        btnSumar = new JButton("Sumar");
        btnSumar.setBounds(120, 100, 100, 30);
        add(btnSumar);

        lblResultado = new JLabel("Resultado:");
        lblResultado.setBounds(20, 140, 250, 25);
        add(lblResultado);

        btnSumar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {

                try {
                    int n1 = Integer.parseInt(txtNum1.getText());
                    int n2 = Integer.parseInt(txtNum2.getText());

                    int suma = n1 + n2;

                    lblResultado.setText("Resultado: " + suma);

                } catch (Exception e) {

                    JOptionPane.showMessageDialog(null,
                            "Ingrese números válidos");
                }
            }
        });
    }

    public static void main(String[] args) {
        new Ejercicio2().setVisible(true);
    }
}