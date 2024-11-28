/*
En la clase de vista se configura toda la interfaz con el susuario, se parametrizan todas las ventanas y botones que estarán en 
interacción con el susuario y desde los que se generan las solicitudes al sistema.
 */
package Vista;

/**
 *author Fernando Carodna
 */
import java.awt.event.ActionListener;
import javax.swing.*;

public class IMCView extends JFrame {
    private final JTextField pesoTextField;
    private final JTextField alturaTextField;
    private final JButton calcularButton;
    private final JLabel resultadoLabel;
    
    public IMCView() {
        setTitle("Calculadora de IMC");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        getContentPane().add(panel);
        panel.setLayout(null);
        
        JLabel pesoLabel = new JLabel("Peso (kg):");
        pesoLabel.setBounds(10, 20, 80, 25);
        panel.add(pesoLabel);
        
        pesoTextField = new JTextField(10);
        pesoTextField.setBounds(100, 20, 165, 25);
        panel.add(pesoTextField);
        
        JLabel alturaLabel = new JLabel("Altura (m):");
        alturaLabel.setBounds(10, 50, 80, 25);
        panel.add(alturaLabel);
        
        alturaTextField = new JTextField(10);
        alturaTextField.setBounds(100, 50, 165, 25);
        panel.add(alturaTextField);
        
        calcularButton = new JButton("Calcular IMC");
        calcularButton.setBounds(100, 80, 120, 25);
        panel.add(calcularButton);
        
        resultadoLabel = new JLabel("");
        resultadoLabel.setBounds(10, 110, 300, 25);
        panel.add(resultadoLabel);
        
        setVisible(true);
    }
    
    public double getPeso() {
        return Double.parseDouble(pesoTextField.getText());
    }
    
    public double getAltura() {
        return Double.parseDouble(alturaTextField.getText());
    }
    
    public void mostrarResultado(double imc, String interpretacion) {
        resultadoLabel.setText("IMC: " + imc + " - " + interpretacion);
    }
    
    public void agregarListener(ActionListener listener) {
        calcularButton.addActionListener(listener);
    }
}
