public class Carro {
    String cor;
String modelo;
double capacidadeTanque;

    Carro() {
}

Carro(String cor, String modelo, double capacidadeTanque) {
    this.cor = cor;
    this.modelo = modelo;
    this.capacidadeTanque = capacidadeTanque;
}

void setCor(String cor) {
    this.cor = cor;
}

String getCor() {
    return cor;
}

void setModelo(String modelo) {
    this.modelo = modelo;
}

String getModelo() {
    return modelo;
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