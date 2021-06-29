import java.util.Scanner;

public class exerc8 {

    public static void main (String[] args){
        Scanner Scan = new Scanner(System.in);

        System.out.println("entre com com o valor das horas");
        double valorhora = Scan.nextDouble();

        System.out.println("entre com a quantidade de horas trabalhadas no mes");
        double horas = Scan.nextDouble();

        double salario = valorhora * horas;

        System.out.println("o salario foi de:" + salario);
    }
}
