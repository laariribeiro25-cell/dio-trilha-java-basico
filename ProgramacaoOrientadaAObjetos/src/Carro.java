public class Carro extends Veiculo {
    double capacidadeTanque;


    Carro() {
}

Carro(String cor, String modelo, double capacidadeTanque) {
    this.cor = cor;
    this.modelo = modelo;
    this.capacidadeTanque = capacidadeTanque;
}



void setCapacidadeTanque(double capacidadeTanque) {
    this.capacidadeTanque = capacidadeTanque;
}

double getCapacidadeTanque() {
    return capacidadeTanque;
}


double calcularValorParaEncher(double precoGasolina) {
    return capacidadeTanque * precoGasolina;
}
}