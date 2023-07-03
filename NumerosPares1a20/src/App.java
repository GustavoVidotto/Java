public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Faça um programa que exiba os números pares de 1 a 20.");

        for(int num=1; num <= 20; num ++){
            if(num % 2 == 0){
                System.out.println(num);
            }
        }
    }
}
