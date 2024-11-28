/*
Esste es el paquete modelo que contiene la lógica de la aplicación, como se evidencia es básicamente el cálculo del IMC con 
sus respectivos resultados y variables.
 */
package Modelo;

/**
 *
 * @author Fernando Cardona Restrepo
 */
public class IMCCalculator {
    public double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }
    
    public String interpretarIMC(double imc) {
        if (imc < 18.5) {
            return "Bajo peso";
        } else if (imc >= 18.5 && imc < 25) {
            return "Normal";
        } else if (imc >= 25 && imc < 30) {
            return "Sobrepeso";
        } else {
            return "Obesidad";
        }
    }
}
