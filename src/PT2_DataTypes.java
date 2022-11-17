import java.math.BigDecimal;

public class PT2_DataTypes {
    public static void main(String[] args) {

        /**
         *
         * JAVA é uma linguagem fortemente tipada, ou seja,
         * as variáveis precisam ter um valor definido na sua criação.
         *
         */

        // 8 tipos primitivos

        // 4 inteiros

        // CamelCase nas variaveis
        byte numByte = 1; // 1 byte | -128 a 127

        short numShort = 1; // 2 bytes | -32.768 a 32.767

        int numInt = 10; // 4 bytes | -2.147.483.648 a 2.147.483.647

        long numLong = 5_100_000_000L; // 8 bytes | -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807
        long numLong2 = 5100000000L;

        float numFloat = 2.0f; // 4 bytes | 6-7 dígitos decimais significativos

        double numDouble = 2.0; // 8 bytes | 15 dígitos decimais significativos

        char letra = 'a';

        boolean ehMaiorDeIdade = true;

        String text = "\"Hello World\"";

        final int QUANTIDADE = 3; // Constante
        final int QUANTIDADE_TOTAL = 3; // Constante

        System.out.println(QUANTIDADE);
    }
}
