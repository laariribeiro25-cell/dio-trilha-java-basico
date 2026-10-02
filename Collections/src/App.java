import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
        Scanner leitor = new Scanner(System.in);

List<String> perguntas = new ArrayList<>();
perguntas.add("Telefonou para a vítima?");
perguntas.add("Esteve no local do crime?");
perguntas.add("Mora perto da vítima?");
perguntas.add("Devia para a vítima?");
perguntas.add("Já trabalhou com a vítima?");

List<String> respostas = new ArrayList<>();

for (String pergunta : perguntas) {
    System.out.println(pergunta + " Responda sim ou não:");
    respostas.add(leitor.nextLine());
}

int respostasPositivas = 0;

for (String resposta : respostas) {
    if (resposta.equalsIgnoreCase("sim")) {
        respostasPositivas++;
    }
}

if (respostasPositivas == 2) {
    System.out.println("Suspeita");
} else if (respostasPositivas == 3 || respostasPositivas == 4) {
    System.out.println("Cúmplice");
} else if (respostasPositivas == 5) {
    System.out.println("Assassina");
} else {
    System.out.println("Inocente");
}

leitor.close();
    }
}
