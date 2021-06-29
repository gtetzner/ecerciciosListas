import java.util.Scanner;

public class decisao1 {

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int numb1;
        int numb2;
        System.out.println("entre com o primeiro numero");
        numb1 = scan.nextInt();

        System.out.println("entre com o segundo numero");
        numb2 = scan.nextInt();

        if (numb1 > numb2){
            System.out.println("o maior numero foi " + numb1);
        }
        else {
            System.out.println("o maior numero foi " + numb2);
        }
    }
}
