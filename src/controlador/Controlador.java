package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Modelo;
import vista.Vista;

public class Controlador implements ActionListener {
    private Vista vista;
    private Modelo modelo;

    // Constructor de controlador
    public Controlador(Vista vista, Modelo modelo) {
        this.vista = vista;
        this.modelo = modelo;
        this.vista.botonSumar.addActionListener(this);
    }

    public void iniciar() {
        vista.setTitle("MVC Sumar");
        vista.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        try {
            modelo.setNumero1(Integer.parseInt(vista.cajaNumero1.getText()));
            modelo.setNumero2(Integer.parseInt(vista.cajaNumero2.getText()));
            modelo.sumar();
            vista.cajaResultado.setText(String.valueOf(modelo.getResultado()));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, ingresa solo números.");
        }
    }
}
