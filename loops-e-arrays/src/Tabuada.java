import java.util.Scanner;

    public class Tabuada {
        public static void main(String[] args) {


            Scanner scan = new Scanner(System.in);
            System.out.println("Tabuada");
             int numero = scan .nextInt();

for (int i = 1; i <= 10; i++) {

System.out.println(numero + " x " + i + " = " + (numero * i));
    }
    scan.close();
}


    }