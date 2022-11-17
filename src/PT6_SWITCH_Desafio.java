import java.util.Scanner;

public class PT6_SWITCH_Desafio {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String op;
        int num1;
        int num2;

        op = scan.nextLine();

        System.out.println("Digite o primeiro num: ");
        num1 = scan.nextInt();

        System.out.println("Digite o segundo num: ");
        num2 = scan.nextInt();

        switch (op) {
            case "soma":
                System.out.println("Soma: " + (num1+num2));
                break;
            case "sub":
                System.out.println("Subtracao: " + (num1-num2));
                break;
            case "div":
                System.out.println("Div: " + (num1/num2));
                break;
            case "mult":
                System.out.println("Soma: " + (num1*num2));
                break;
            default:
                System.out.println("Erro!");
                break;
        }

        scan.close();

    }

}

