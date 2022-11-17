import java.util.Scanner;

public class PT7_While_Exercicio {

    /**
     *
     * Criar um carro com os atributos:
     *  - marca
     *  - ligado
     *  - velocidadeAtual
     *
     * Enquanto o carro estiver ligado deve ser capaz de:
     * - Desligar
     * - Acelerar
     * - Frear
     * - Motrar estado atual
     *
     * Regras:
     * - Só podemos desligar o carro quando ele parar (velocidadeAtual = 0)
     * - Só podemos realizar as ações com o carro ligado
     * - A velocidade máxima do nosso carro é de 100km/h
     * - Não existe velocidade negativa
     * - Acelerar + 10km/h (Aumenta 10)
     * - Frear - 10km/h (Diminui 10)
     *
     */


    public static void main(String[] args) {


        // Carro
        String marca = "Fiat";
        boolean ligado = true;
        int velocidadeAtual = 0;
        int escolha;

        Scanner input = new Scanner(System.in);

        while(ligado) {
            System.out.println();
            System.out.println("Escolha uma operação:");
            System.out.println("1 - Acelerar");
            System.out.println("2 - Frear");
            System.out.println("3 - Estado atual");
            System.out.println("0 - Desligar");
            System.out.printf("Operacao: ");
            System.out.println();

            escolha = input.nextInt();

            if(escolha == 0) {
                ligado = false;
            } else if(escolha == 1) {
                if((velocidadeAtual + 10) >= 100) {
                    velocidadeAtual = 100;
                } else {
                   // velocidadeAtual = velocidadeAtual + 10;
                    velocidadeAtual += 10;
                }
            } else if(escolha == 3) {
                System.out.println("A velocidade atual é de: " + velocidadeAtual);
            } else {
                System.out.println("Opcao invalida!");
            }
        }

        System.out.println("Voce estacionou o carro!");

        input.close();
    }
}
