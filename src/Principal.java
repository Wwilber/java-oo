public class Principal {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        Pessoa eu = new Pessoa();
        eu.nome = "wilber Ribeiro";
        eu.cpf = "371.778.693-87";
        eu.anoNascimento = 1972;


        meuCarro.modelo = "HR-V";
        meuCarro.anoFabricacao = 2021;
        meuCarro.cor = "Vermelho";
        meuCarro.fabricante = "Honda";
        meuCarro.precoCompra = 120000;

        meuCarro.calcularValorRevenda();

        // meuCarro.proprietario = new Pessoa();
        //        meuCarro.proprietario.nome = "Wilber Ribeiro";
        //        meuCarro.proprietario.cpf = "371.778.693-87";
        //        meuCarro.proprietario.anoNascimento = 1972;

        meuCarro.proprietario = eu;


        Carro seuCarro = new Carro();

        seuCarro.modelo = "Golf";
        seuCarro.anoFabricacao = 2011;
        seuCarro.cor = "Branco";
        seuCarro.fabricante = "volks";

        seuCarro.calcularValorRevenda();

        System.out.printf("Modelo: %s%n", meuCarro.modelo);
        System.out.printf("Ano: %d%n", meuCarro.anoFabricacao);
        System.out.printf("Proprietario: %s%n", meuCarro.proprietario.nome);
        System.out.printf("Proprietario: %s%n", meuCarro.proprietario.cpf);
        System.out.printf("Proprietario: %s%n", meuCarro.proprietario.anoNascimento);


//        System.out.println("-------");
//        System.out.printf("Modelo: %s%n", seuCarro.modelo);
//        System.out.printf("Ano: %d%n", seuCarro.anoFabricacao);


    }
}
