import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Faça um programa que calcule e exiba o quadrado de um número inteiro.");
        System.out.println(" ");
        System.out.println("Digite o numero para calcular ao Quadrado:");
        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();
        int quadrado = num * num;
        System.out.println("O numero: " +num+ " elevado ao quadrado fica: " + quadrado);
    }
}
