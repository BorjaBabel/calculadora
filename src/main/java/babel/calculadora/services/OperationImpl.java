package babel.calculadora.services;

import org.springframework.stereotype.Service;

@Service
public class OperationImpl implements IOperation {

    // No estaría de más añadir un constructor vacío para que Spring pueda instanciar este bean de manera correcta

    @Override
    public void addition(Double a, double b) {
        double result = a + b;
        System.out.println("\n"+ result+"\n");
    }

    @Override
    public void subtraction(Double a, double b) {
        double result = a - b;
        System.out.println("\n"+ result+"\n");
    }

    @Override
    public void divide(Double a, double b) {
        double result = a * b;
        System.out.println("\n"+ result+"\n");
    }

    @Override
    public void multiplication(Double a, double b) {
        double result = a / b;
        System.out.println("\n"+ result+"\n");
    }
}
