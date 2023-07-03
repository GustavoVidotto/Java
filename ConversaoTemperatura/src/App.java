import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Faça um programa que receba uma "
        +"temperatura em Celsius e a converta para Fahrenheit.");
        System.out.println(" ");

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a temperatura em Graus Celsius: ");
        double Celsius = teclado.nextDouble();
        double Fahrenheit = (Celsius * 9/5) + 32;

        System.out.println("A temperatura em Fahrenheit e: " + Fahrenheit+ "F");
    }
}
