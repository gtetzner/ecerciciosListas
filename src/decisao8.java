import java.util.Scanner;

public class decisao8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double produto1;
        double produto2;
        double produto3;
        System.out.println("preço do produto 1");
        produto1 = scan.nextDouble();

        System.out.println("preço do produto 2");
        produto2 = scan.nextDouble();

        System.out.println("preço do produto 3");
        produto3 = scan.nextDouble();


         if (produto1 < produto2 && produto1 < produto3){
            System.out.println("compre o produto 1 " );
        }
        else if (produto2 < produto1 && produto2 < produto3){
            System.out.println("compre o produto 2 " );
        }

        else if (produto3 < produto1 && produto3 < produto2){
            System.out.println("compre o produto 3 " );
        }


    }
}
