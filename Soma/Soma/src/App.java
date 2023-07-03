import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("-----Programa da soma-----");
            System.out.println("Digite o primeiro numero:");
            
            int n1 = entrada.nextInt();
            System.out.println(" ");
            
            System.out.println("Digite o segundo numero:");
            
            int n2 = entrada.nextInt();
            System.out.println(" ");
            int soma = n1 + n2;

            System.out.println("Esse é o resultado da sua soma: " + soma);
            System.out.println("ou");
            System.out.println("A soma do numero " + n1 + " mais o numero " + n2 + " ficara em " + soma);
        }
    }
}
