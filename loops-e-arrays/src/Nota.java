import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
Scanner leitor = new Scanner(System.in);
double nota = -1;
while (nota < 0 || nota > 10) {
    // pergunta, leitura e verificação

System.out.println("Digite a nota (0-10):");
nota = leitor.nextDouble();

if (nota < 0 || nota > 10) {
    System.out.println("Nota inválida. Tente novamente.");
}

}
leitor.close();
}

}