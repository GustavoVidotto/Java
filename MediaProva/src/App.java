import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Faça um programa que calcule e exiba a média de três notas. O programa deve receber as três notas e calcular a média.");
        System.out.println();

        Scanner teclado = new Scanner(System.in);
        System.out.println("---Cálculo de Média de Três Notas---");
        System.out.println();

        double nota1, nota2, nota3;

        do {
            System.out.print("Digite a primeira nota: ");
            nota1 = teclado.nextDouble();
            System.out.println(" ");
            if(nota1 > 10 || nota1 <0){
                System.out.println("Nota invalida");
            }
            
        } while (nota1 > 10 || nota1 < 0);

        do {
            System.out.print("Digite a segunda nota: ");
            nota2 = teclado.nextDouble();
            System.out.println(" ");
            if(nota2 > 10 || nota2 <0){
                System.out.println("Nota invalida");
            }
        } while (nota2 > 10 || nota2 < 0);

        do {
            System.out.print("Digite a terceira nota: ");
            nota3 = teclado.nextDouble();
            System.out.println(" ");
            if(nota3 > 10 || nota3 <0){
                System.out.println("Nota invalida");
            }
        } while (nota3 > 10 || nota3 < 0);

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("A média dessas notas é: " + media);
        System.out.println();
        System.out.print("Status do Aluno: ");
        if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}
