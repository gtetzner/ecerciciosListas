import java.util.Scanner;

public class decisao6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("digite o priemiro numero");
        double numb1 = scan.nextDouble();

        System.out.println("digite o segundo numero");
        double numb2 = scan.nextDouble();

        System.out.println("digite o terceiro numero");
        double numb3 = scan.nextDouble();

        if (numb1 > numb2 && numb1>numb3){
            System.out.println("o maior numero digitado foi " + numb1);
        }
        else if (numb2 > numb1 && numb2 > numb3 ){
            System.out.println("o maior numero digitado foi " + numb2);
        }

        else if (numb3 > numb2 && numb3 > numb1) {
            System.out.println(" o maior numero digitado foi " + numb3);
        }
        else if (numb3 == numb2 && numb3 == numb1) {
            System.out.println(" todos são iguais");
        }
        else{
            System.out.println("opa, deu ruim");
        }
    }
}


