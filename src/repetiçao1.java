import java.util.Scanner;

public class repetiçao1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double nota;
        System.out.println("digite uma nota entre 0 e 10");
        nota = scan.nextDouble();

        while (nota >10 || nota<0){
            System.out.println("digite uma nota valida");
            scan.nextDouble();

        }
        System.out.println("nota registrada com sucesso");
    }
}
