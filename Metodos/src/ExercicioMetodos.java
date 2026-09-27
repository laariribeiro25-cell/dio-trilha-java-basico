public class ExercicioMetodos {
   public static void main(String[] args) {


    double resultado = somar(10, 5);
    System.out.println("Soma: " + resultado);

    double resultadoSubtracao = subtrair(10, 5);
    System.out.println("Subtração: " + resultadoSubtracao);

    double resultadoMultiplicacao = multiplicar(10, 5);
    System.out.println("Multiplicação: " + resultadoMultiplicacao);

    double resultadoDivisao = dividir(10, 5);
    System.out.println("Divisão: " + resultadoDivisao);

    System.out.println(saudacao(10));

    double totalEmprestimo = calcularEmprestimo(1000, 6);
System.out.println("Total do empréstimo: " + totalEmprestimo);
}

    static double somar(double valor1, double valor2) {
    return valor1 + valor2;
}
    static double subtrair(double valor1, double valor2) {
    return valor1 - valor2;
}
   static double multiplicar(double valor1, double valor2) {  
   return valor1 * valor2;  
}
    static double dividir(double valor1, double valor2) {  
    return valor1 / valor2;  
}

static String saudacao(int hora) {
    // aqui vamos decidir qual mensagem devolver
    if (hora >= 6 && hora < 12) {
        return "Bom dia!";
    } else if (hora >= 12 && hora < 18) {
        return "Boa tarde!";
    } else {
        return "Boa noite!";
    }

}

static double calcularEmprestimo(double valor, int parcelas) {

    double taxa;

if (valor <= 1000) {
    taxa = 0.02;
} else if (valor <= 5000) {
    taxa = 0.03;
} else {
    taxa = 0.04;

    }

    double total = valor + (valor * taxa * parcelas);
return total;
}
}

