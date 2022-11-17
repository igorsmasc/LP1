import java.util.Scanner;

public class PT1_HelloWorld {
    public static void main(String[] args) {

//        System.out.print("Hello, World! \n");
//        System.out.println("Hello, World!");
//        System.out.printf("Tenho %d anos \n", 15);
        System.out.printf("Tenho %d anos e me chamo %s \n", 15, "Igor");
        System.out.printf("Tenho %d anos \n", (31/2));
//        System.out.printf("Tenho %d anos \n", 15.5);

        String nome = "Igor";
//
//        System.out.printf("Me chamo %s, tenho %d anos \n", nome, 10);
        System.out.println("Me chamo " + nome + ", tenho " + 10 + " anos");


        /**
         *
         * %d - inteiros
         * %f - numeros de ponto flutuante
         * %b - boolean
         * %c - char
         * %s - String
         *
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome:");

        System.out.printf("Hello, %s!", nome);

        input.close();
    }
}
