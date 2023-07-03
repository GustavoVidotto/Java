import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Faça um programa que verifique se um número é par ou ímpar. " +
        "O programa deve receber um número inteiro e exibir uma mensagem indicando se é par ou ímpar.");
        System.out.println(" ");

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um numero:");
        int num = teclado.nextInt();
        if(num % 2 == 0){
            System.out.println("O numero e par"); 
        }
        else {
            System.out.println("O numero e impar");
        }
        System.out.println(num % 2);
    }
}
