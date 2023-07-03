import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Faça um programa que receba o nome e "
        + "a idade de uma pessoa e exiba uma mensagem de boas-vindas, "
        + "incluindo o nome e a idade.");
        System.out.println(" ");

        Scanner teclado = new Scanner(System.in);
        System.out.print("Ola, digite seu nome: ");
        String nome = teclado.nextLine();
        System.out.print("Agora digite sua idade: ");
        int idade = teclado.nextInt();
        System.out.println("Seja bem vindo(a) " + nome + "," + " de idade: " + idade + " anos.");

    }
}
