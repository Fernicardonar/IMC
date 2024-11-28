/*
Esta es la clase del controlador, encargado de gestionar toda la realación de comunicación entre la vista y el modelo.
 */
package Controlador;

/**
 * @author Fernando Cardona
 */
import Vista.IMCView;
import Modelo.IMCCalculator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IMCController {
    private IMCView view;
    private IMCCalculator model;
    
    public IMCController(IMCView view, IMCCalculator model) {
        this.view = view;
        this.model = model;
        
        this.view.agregarListener(new CalcularIMCListener());
    }
    
    class CalcularIMCListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            double peso = view.getPeso();
            double altura = view.getAltura();
            
            double imc = model.calcularIMC(peso, altura);
            String interpretacion = model.interpretarIMC(imc);
            
            view.mostrarResultado(imc, interpretacion);
        }
    }
    
    public static void main(String[] args) {
        IMCView view = new IMCView();
        IMCCalculator model = new IMCCalculator();
        IMCController controller = new IMCController(view, model);
    }
}

