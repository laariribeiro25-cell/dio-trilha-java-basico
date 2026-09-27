public class AreasQuadrilateros {
    public static void main(String[] args) {

double areaQuadrado = calcularArea(4);
System.out.println("Área do quadrado: " + areaQuadrado);

double areaRetangulo = calcularArea(5, 3);
System.out.println("Área do retângulo: " + areaRetangulo);

double areaTrapezio = calcularArea(8, 4, 3);
System.out.println("Área do trapézio: " + areaTrapezio);
}
  static double calcularArea(double lado) {
    return lado * lado;
}
  static double calcularArea(double largura, double altura) {
    return largura * altura;
}
static double calcularArea(double baseMaior, double baseMenor, double altura) {
    return (baseMaior + baseMenor) * altura / 2;
}
}
