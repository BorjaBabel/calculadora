package babel.calculadora;

import babel.calculadora.apps.Calculadora;
import babel.calculadora.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class AppRunner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Calculadora calc = context.getBean(Calculadora.class);
        calc.startAndOperate();
    }
}
