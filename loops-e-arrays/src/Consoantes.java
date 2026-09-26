import java.util.Scanner;

public class Consoantes {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    char[] consoantes = new char[6];
     int quantidadeConsoantes = 0;


     for (int i = 0; i < 6; i++) {
    System.out.print("Digite uma letra: ");
    char letra = Character.toLowerCase(scan.next().charAt(0));

    if (letra != 'a' && letra != 'e' && letra != 'i'
        && letra != 'o' && letra != 'u') {
    consoantes[quantidadeConsoantes] = letra;
    quantidadeConsoantes++;
}
}
System.out.println("Quantidade de consoantes: " + quantidadeConsoantes);

for (int i = 0; i < quantidadeConsoantes; i++) {
    System.out.println(consoantes[i]);
}
   scan.close();
}

    
}