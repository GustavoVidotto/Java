import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Faça um programa que verifique se um número é primo. "
        + "O programa deve receber um número inteiro e exibir uma mensagem indicando se é primo ou não");
        System.out.println(" ");

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um numero:");
        int num = teclado.nextInt();

        if (num == 2 || num == 3) {
            System.out.println("É um número Primo");

        } else if (num % 2 == 0 || num % 3 == 0) {
            System.out.println("Não é um número Primo");
        } 
        else {
            int sqrtNum = (int) Math.sqrt(num) + 1;
            for (int i = 5; i < sqrtNum; i += 6) {
                if (num % i == 0 || num % (i + 2) == 0) {
                    System.out.println("Não é um número Primo");
                }
            }
            System.out.println("É um número Primo");
        }
    }

}    