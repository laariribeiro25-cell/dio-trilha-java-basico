import java.util.Scanner;

public class NomeEIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome (ou 0 para parar):");
        String nome = scanner.nextLine();

        while (!nome.equals("0")) {
            System.out.println("Digite a idade:");
            int idade = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Nome: " + nome + " - Idade: " + idade);

            System.out.println("Digite o nome (ou 0 para parar):");
            nome = scanner.nextLine();
        }

        System.out.println("Programa encerrado.");
    }
}