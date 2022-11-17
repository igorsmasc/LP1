import java.util.Scanner;

public class PT5_IF_ELSE_Desafio {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Voce deseja entrar na festa?");
//        String respostaDesejaEntrar = input.nextLine();
//
//        if(respostaDesejaEntrar.equals("sim")) {
//            System.out.println("Qual sua idade?");
//            int respostaIdade = input.nextInt();
//            input.nextLine();
//
//            if(respostaIdade >= 18) {
//                System.out.println("Pode entrar!");
//            } else {
//                if(respostaIdade >= 16) {
//                    System.out.println("Voce esta acompanhado?");
//                    String respostaEstaAcompanhado = input.nextLine();
//                    if(respostaEstaAcompanhado.equals("sim")) {
//                        System.out.println("Pode entrar!");
//                    } else {
//                        System.out.println("Apenas acompanhado!");
//                    }
//                } else {
//                    System.out.println("Não pode entrar ainda!");
//                }
//            }
//
//        } else {
//            System.out.println("Tchau!");
//        }
//
//        input.close();

//        int testscore = 76;
//        char grade;
//
//        if (testscore >= 90) {
//            grade = 'A';
//        } else if (testscore >= 80) {
//            grade = 'B';
//        } else if (testscore >= 70) {
//            grade = 'C';
//        } else if (testscore >= 60) {
//            grade = 'D';
//        } else {
//            grade = 'F';
//        }

//        System.out.println("Grade = " + grade);

        //String msg = (condicao) ? (...) : (...);
        int idade = 18;

        String msg = (idade >= 18) ? "Maior de idade" : "Menor de idade";

        System.out.println(msg);
    }




}
