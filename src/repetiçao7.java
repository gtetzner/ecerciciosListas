import java.util.Scanner;

public class repetiçao7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite 5 numeros");

        double []numero = new double[5];
        double maiornumb = 0;

        for (int i = 0; i<numero.length;i++){
            numero[i] = scan.nextDouble();
            maiornumb =  Math.max(maiornumb, numero[i]);
        }
        System.out.println("o maior numero foi: " +maiornumb);


    }
}
