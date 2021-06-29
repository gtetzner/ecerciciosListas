import java.util.Scanner;

public class exerc3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("entre com o primeiro número:");
        int num1 = scan.nextInt();

        System.out.println("entre com o segundo número:");
        int num2 = scan.nextInt();

        int resultado = num1 + num2;
        System.out.println("a soma dos números é " + resultado);

    }
}


