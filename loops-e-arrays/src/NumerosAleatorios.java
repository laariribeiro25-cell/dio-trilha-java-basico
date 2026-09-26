import java.util.Random;


public class NumerosAleatorios {
     public static void main(String[] args) {

     Random random = new Random();
     int[] numeros = new int[20];

     for (int i = 0; i < numeros.length; i++) {
    numeros[i] = random.nextInt(101);
     }
    for (int i = 0; i < numeros.length; i++) {
    System.out.println(numeros[i] + " e seu sucessor: " + (numeros[i] + 1));
}
}
}
