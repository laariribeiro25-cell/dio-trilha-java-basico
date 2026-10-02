
import java.util.Arrays;
import java.util.List;


public class App {
    public static void main(String[] args) throws Exception {
       
List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
numeros.stream()
       
        .filter(numero -> numero % 2 == 0)
        .map(numero -> numero * 2)
        .forEach(System.out::println);
    }
}

