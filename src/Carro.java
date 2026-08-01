public class Carro {

    String fabricante;
    String modelo;
    String cor;
    double precoCompra;
    int anoFabricacao;
    Pessoa proprietario;

// INSTANCIAÇÃO DO OBJETO PESSOA AO PROPRIETARIO:
//    Pessoa proprietario = new Pessoa();

    double calcularValorRevenda() {
        int tempoDeUsoEmAnos = 2022 - anoFabricacao;
        int vidaUtilEmAnos = 20;

        double valorRevenda = (precoCompra / vidaUtilEmAnos)
                * (vidaUtilEmAnos - tempoDeUsoEmAnos);

        if (valorRevenda < 0) {
            valorRevenda = 0;
        }

        // System.out.printf("-- Tempo de uso (anos): %d%n", tempoDeUsoEmAnos);
        //  System.out.printf("-- Valor de revenda: %6.2f%n", valorRevenda);

        return valorRevenda;

    }


}
