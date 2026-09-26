
import java.util.Random;

public class MatrizAleatoria {

    public static void main(String[] args) {

        Random random = new Random();
        int[][] matriz = new int[4][4];

        for (int linha = 0; linha < 4; linha++) {
    for (int coluna = 0; coluna < 4; coluna++) {
        matriz[linha][coluna] = random.nextInt(10);
    }
}
for (int linha = 0; linha < 4; linha++) {
    for (int coluna = 0; coluna < 4; coluna++) {
        System.out.print(matriz[linha][coluna] + " ");
    }
    System.out.println();
}
    }
}
