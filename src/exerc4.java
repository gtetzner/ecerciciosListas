import java.util.Scanner;

public class exerc4 {

    public static void main (String[] args){
        int nota1;
        int nota2;
        int nota3;
        int nota4;
        int media;

        Scanner scan = new Scanner(System.in);

        System.out.println("entre com a primeira nota");
        nota1 = scan.nextInt();

        System.out.println("entre com a segunda nota");
        nota2 = scan.nextInt();

        System.out.println("entre com a terceira nota");
        nota3 = scan.nextInt();

        System.out.println("entre com a quarta nota");
        nota4 = scan.nextInt();

        media = (nota1 + nota2 + nota3 + nota4 ) /4;

        System.out.println("a media foi:" + media);

    }


}
