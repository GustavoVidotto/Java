import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Faca um programa que receba tres numeros inteiros"
        +" e exiba o maior e o menor deles.");
        System.out.println(" ");

        Scanner teclado = new Scanner(System.in);
        System.out.println("----Digite três numeros inteiros----");
        System.out.println(" ");

        System.out.print("Primeiro numero: ");
        int n1 = teclado.nextInt();
        System.out.println(" ");
        System.out.print("Digite o segundo: ");
        int n2 = teclado.nextInt();
        System.out.println(" ");
        System.out.print("Digite o terceiro: ");
        int n3 = teclado.nextInt();
        System.out.println(" ");

        System.out.println("---------------");
        System.out.println("Numero 1: " + n1);
        System.out.println("Numero 2: " + n2);
        System.out.println("Numero 3: " + n3);
        System.out.println("--------------");

        System.out.println(" ");

        if(n1 > n2 && n1 > n3){
            System.out.println("O primeiro numero (" + n1 + ") é o maior");
        }

        else if(n2 > n1 && n2 > n3){
            System.out.println("O segundo numero (" + n2 + ") é o maior");
        }

        else if(n3 > n1 && n3 > n2){
            System.out.println("O terceiro numero (" + n3 + ") é o maior");
        }

        if(n1 < n2 && n1 < n3){
            System.out.println("E primeiro numero (" + n1 + ") é o menor");
        }

        else if(n2 < n1 && n2 < n3){
            System.out.println("E segundo numero (" + n2 + ") é o menor");
        }

        else if(n3 < n1 && n3 < n2){
            System.out.println("E terceiro numero (" + n3 + ") é o menor");
        }

    }
}
