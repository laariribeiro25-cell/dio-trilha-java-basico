import java.util.Scanner;

public class MaiorEMedia {
    
    
public static void main (String[] args) {
 Scanner scan = new Scanner(System.in);
 
int numero;
int soma = 0;
int maior = 0;

for (int i = 1; i <= 5; i++) {

System.out.println("Numero: ");


numero = scan.nextInt();
soma += numero;
if (i == 1 || numero > maior) {
    maior = numero;
}


}
double media = soma / 5.0;
System.out.println("Maior numero: " + maior) ;
System.out.println("Media: " + media) ;
scan.close();
}
}
