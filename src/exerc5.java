import java.util.Scanner;

public class exerc5 {

    public static void main (String[] args){
        int metros;


        Scanner scanner = new Scanner(System.in);

        System.out.println("entre com a quantidade de metros");
        metros = scanner.nextInt();


        int centimetros = metros * 100;

        System.out.println("centimetros:" + centimetros);

    }
}



