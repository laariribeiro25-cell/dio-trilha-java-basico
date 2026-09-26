import java.util.Scanner;

public class ParEImpar {
    public static void main(String[] args) {
       Scanner scan = new Scanner (System.in);

       int quantidadeDeNumeros;

       System.out.println ("Quantidade de numeros: ");
       quantidadeDeNumeros = scan.nextInt();

         int pares = 0;
         int impares = 0;
         int numero;

         for (int i = 0; i < quantidadeDeNumeros; i++) {
             System.out.print("Digite um número: ");
             numero = scan.nextInt();
             if (numero % 2 == 0) {
                 pares++;
             } else {
                 impares++;
             }
         }
    

         System.out.println("Quantidade de números pares: " + pares);
         System.out.println("Quantidade de números ímpares: " + impares);

       scan.close();
    }
}
