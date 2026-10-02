import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
       
     Map<Integer, Integer> resultados = new HashMap<>();
Random dado = new Random();

for (int lancamento = 0; lancamento < 100; lancamento++) {
    int valor = dado.nextInt(6) + 1;

    resultados.put(valor, resultados.getOrDefault(valor, 0) + 1);
}
for (Map.Entry<Integer, Integer> entrada : resultados.entrySet()) {
    System.out.println("Face " + entrada.getKey() + ": " + entrada.getValue() + " vez(es)");
}

    }
}
