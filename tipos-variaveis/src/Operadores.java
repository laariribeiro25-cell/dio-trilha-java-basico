public class Operadores {

     public static void main(String[] args) {

    int numero = 5;

System.out.println("Antes: " + numero);
System.out.println("Pós-incremento: " + numero++);
System.out.println("Depois do pós: " + numero);

System.out.println("Pré-incremento: " + ++numero);
System.out.println("Depois do pré: " + numero);

System.out.println("Antes do --: " + numero);
System.out.println("Pós-decremento: " + numero--);
System.out.println("Depois do pós --: " + numero);

System.out.println("Pré-decremento: " + --numero);
System.out.println("Depois do pré --: " + numero);

int totalPaes = 5;
String status = (totalPaes > 0) ? "Em estoque" : "Sem estoque";
System.out.println(status);
}
    
}
