import java.util.Scanner;

public class exerc7 {

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("entre com o tamanho do lado do quadrado");
        double lado = scanner.nextDouble();

        double area = lado * lado;

        System.out.println("a area foi:" + area *2);

    }
}
