public class App {
    public static void main(String[] args) throws Exception {
      
        Carro carro = new Carro();

carro.setCor("Prata");
carro.setModelo("Hatch");
carro.setCapacidadeTanque(50);

System.out.println("Cor: " + carro.getCor());
System.out.println("Modelo: " + carro.getModelo());
System.out.println("Tanque: " + carro.getCapacidadeTanque() + " litros");

double total = carro.calcularValorParaEncher(6.00);
System.out.println("Total para encher o tanque: R$ " + total);
    }
}
