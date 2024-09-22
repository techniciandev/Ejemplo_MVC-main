package vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Vista extends JFrame {

    // Declaración de componentes
    public JTextField cajaNumero1;
    public JTextField cajaNumero2;
    public JTextField cajaResultado;
    public JButton botonSumar;

    public Vista() {
        // Configuración de la ventana
        setTitle("MVC Sumar");
        setSize(400, 200);  // Tamaño fijo de la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());  // Usamos GridBagLayout para una disposición flexible
        setResizable(false);  // Evita que la ventana sea redimensionable
        setLocationRelativeTo(null);  // Centrar ventana en pantalla

        // Inicialización de componentes
        cajaNumero1 = new JTextField(10);
        cajaNumero2 = new JTextField(10);
        cajaResultado = new JTextField(10);
        cajaResultado.setEditable(false);  // Solo lectura para el resultado
        botonSumar = new JButton("Sumar");

        // Validación: solo números en las cajas de texto
        cajaNumero1.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                char c = evt.getKeyChar();
                if (!Character.isDigit(c)) {
                    evt.consume();  // Ignorar la entrada si no es un número
                    JOptionPane.showMessageDialog(null, "Solo se permiten números");
                }
            }
        });

        cajaNumero2.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                char c = evt.getKeyChar();
                if (!Character.isDigit(c)) {
                    evt.consume();  // Ignorar la entrada si no es un número
                    JOptionPane.showMessageDialog(null, "Solo se permiten números");
                }
            }
        });

        // Configuración de disposición con GridBagLayout
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Caja para el primer número
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new JLabel("Número 1:"), gbc);

        gbc.gridx = 1;
        add(cajaNumero1, gbc);

        // Caja para el segundo número
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(new JLabel("Número 2:"), gbc);

        gbc.gridx = 1;
        add(cajaNumero2, gbc);

        // Botón Sumar
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.gridheight = 2;
        add(botonSumar, gbc);

        // Etiqueta y campo de resultado
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(new JLabel("Resultado:"), gbc);

        gbc.gridx = 1;
        add(cajaResultado, gbc);
    }
}
