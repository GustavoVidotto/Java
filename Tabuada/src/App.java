import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Faça um programa que exiba a tabuada de um número. "
        + "O programa deve receber um número inteiro e exibir a tabuada desse número de 1 a 10.");

        Scanner teclado = new Scanner(System.in);
        System.out.println("--Digite um numero inteiro para exibir a tabuada de 1 a 10 dele--");
        System.out.print("Numero: ");

        int num = teclado.nextInt();

        int t1 = num *1;
        int t2 = num *2;
        int t3 = num *3;
        int t4 = num *4;
        int t5 = num *5;
        int t6 = num *6;
        int t7 = num *7;
        int t8 = num *8;
        int t9 = num *9;
        int t10 = num *10;
        System.out.println(" ");
        System.out.println(num + " x 1 = " + t1);
        System.out.println(num + " x 2 = " + t2);
        System.out.println(num + " x 3 = " + t3);
        System.out.println(num + " x 4 = " + t4);
        System.out.println(num + " x 5 = " + t5);
        System.out.println(num + " x 6 = " + t6);
        System.out.println(num + " x 7 = " + t7);
        System.out.println(num + " x 8 = " + t8);
        System.out.println(num + " x 9 = " + t9);
        System.out.println(num + " x 10 = " + t10);
    }
}
