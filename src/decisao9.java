import java.util.Scanner;

public class decisao9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double numb1;
        double numb2;
        double numb3;
        System.out.println("digite o primeiro numero");
        numb1 = scan.nextDouble();

        System.out.println("digite o segundo numero");
        numb2 = scan.nextDouble();

        System.out.println("digite o terceiro numero");
        numb3 = scan.nextDouble();


        if (numb1 < numb2 && numb1 < numb3){
            System.out.println("a ordem fica:" +numb3 + numb2 +numb1);
        }
        else if (numb2 < numb1 && numb2 < numb3){
            System.out.println("a ordem fica: " + numb1 + numb2 + numb3 );
        }

        else if (numb3 < numb1 && numb3 < numb2){
            System.out.println("a ordem fica: " + numb2 + numb1 + numb3 );
        }
    }
}
