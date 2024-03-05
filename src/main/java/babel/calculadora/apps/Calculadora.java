package babel.calculadora.apps;

import babel.calculadora.models.Number;
import babel.calculadora.services.IOperation;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class Calculadora {
    private IOperation operacion;

    public Calculadora(IOperation operacion) {

        this.operacion = operacion;
    }
    public void startAndOperate(){

        while(true) {
            showOptions();
            int opcion = readInt();
            if(opcion == 5){
                System.exit(0);
            }
            System.out.println("Introduzca el primer número:");
            Double a = readDouble();
            Number number1 = new Number(a);

            System.out.println("Introduzca el segundo número:");
            Double b = readDouble();
            Number number2 = new Number(b);
            calculate(opcion, number1, number2);
        }
    }
    private void showOptions(){
        System.out.println("Seleccione una operación:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
    }
    private int readInt(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private double readDouble(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    public void calculate(int opcion, Number number1, Number number2){
        switch (opcion) {
            case 1:
                addition(number1.getValue(), number2.getValue());
                break;
            case 2:
                subtraction(number1.getValue(), number2.getValue());
                break;
            case 3:
                divide(number1.getValue(), number2.getValue());
                break;
            case 4:
                multiplication(number1.getValue(), number2.getValue());
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }
    public void addition(double a, double b){ operacion.addition(a,b); }
    public void subtraction(double a, double b){ operacion.subtraction(a,b); }
    public void divide(double a, double b){ operacion.divide(a,b); }
    public void multiplication(double a, double b){ operacion.multiplication(a,b); }
}