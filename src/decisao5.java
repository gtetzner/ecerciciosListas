import java.util.Scanner;

public class decisao5 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        double nota1;
        double nota2;
        double media;
        System.out.println("digite a primeira nota");
        nota1 = scan.nextDouble();

        System.out.println("digite a segunda nota");
        nota2 = scan.nextDouble();

        media = (nota1 + nota2)/2;

        if (media >=7){
            System.out.println("Aprovado " + media);
        }
        else if (media <7){
            System.out.println("Reprovado" + media);
        }
        else if (media == 10){
            System.out.println("Aprovado com destinção" + media);
        }
        else  {
            System.out.println("nota invalida");
        }


    }
}
