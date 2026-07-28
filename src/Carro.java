public class Carro {

    String fabricante;
    String modelo;
    String cor;
    int anoFabricacao;

    Pessoa proprietario;

// INSTANCIAÇÃO DO OBJETO PESSOA AO PROPRIETARIO:
//    Pessoa proprietario = new Pessoa();

    void calcularValorRevenda(){
        System.out.printf("Calcular valor de revenda de: %s %d%n ",
                modelo, anoFabricacao);
    }



}
