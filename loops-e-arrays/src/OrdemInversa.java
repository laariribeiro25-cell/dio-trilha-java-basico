import java.util.Scanner;

public class OrdemInversa {
    public static void main(String[] args) {

Scanner scan = new Scanner(System.in);
int[] numeros = new int[6];

        for (int i = 0; i < 6; i++) {
    System.out.print("Digite um número: ");
    numeros[i] = scan.nextInt();
}
for (int i = 5; i >= 0; i--) {
    System.out.println(numeros[i]);
}
scan.close();
}
}
