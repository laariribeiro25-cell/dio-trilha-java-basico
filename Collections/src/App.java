import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

import java.util.Set;
import java.util.TreeSet;
public class App {
    public static void main(String[] args) throws Exception {
       
     

 Set<String> cores = new LinkedHashSet<>(Arrays.asList(
            "vermelho", "laranja", "amarelo", "verde",
            "azul", "anil", "violeta"
        ));

        // A: exibir uma cor por linha
        for (String cor : cores) {
            System.out.println(cor);
        }

           // B: mostrar a quantidade de cores
        System.out.println("Quantidade de cores: " + cores.size());
    
// C: exibir as cores em ordem alfabética
Set<String> coresOrdenadas = new TreeSet<>(cores);
System.out.println("Cores em ordem alfabética:");
for (String cor : coresOrdenadas) {
    System.out.println(cor);
}

// D: exibir as cores na ordem inversa da inclusão
List<String> coresReversas = new ArrayList<>(cores);
Collections.reverse(coresReversas);
System.out.println("Cores na ordem inversa:");
for (String cor : coresReversas) {
    System.out.println(cor);
}
   // E: exibir as cores que começam com "v"
System.out.println("Cores que começam com v:");
for (String cor : cores) {
    if (cor.startsWith("v")) {
        System.out.println(cor);
    }
}

// F: remover as cores que não começam com "v"
cores.removeIf(cor -> !cor.startsWith("v"));
System.out.println("Conjunto após remover as outras cores: " + cores);

// G: limpar o conjunto
cores.clear();

// H: verificar se está vazio
System.out.println("O conjunto está vazio? " + cores.isEmpty());
    }
}
