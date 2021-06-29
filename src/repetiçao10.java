import java.util.Scanner;

public class repetiçao10 {
    public static void main(String[] args) {

            int num1 = 1, num2 = 1;

            System.out.println("Digite seu número inicial: ");

            Scanner entrada = new Scanner(System.in);

            num1 = entrada.nextInt();

            System.out.println("Digite seu número final: ");

            entrada = new Scanner(System.in);

            num2 = entrada.nextInt();

            System.out.println("Seu intervalo numérico é: ");

            for (int n = num1+1; n < num2; n++){
                System.out.print(n + ", ");
            }
        }

    }

