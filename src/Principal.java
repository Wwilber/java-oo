public class Principal {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();

        meuCarro.modelo = "HR-V";
        meuCarro.anoFabricacao = 2021;
        meuCarro.cor = "Vermelho";
        meuCarro.fabricante = "Honda";

        Carro seuCarro = new Carro();

        seuCarro.modelo = "Golf";
        seuCarro.anoFabricacao = 2011;
        seuCarro.cor = "Branco";
        seuCarro.fabricante = "volks";

        System.out.printf("Modelo: %s%n", meuCarro.modelo);
        System.out.printf("Ano: %d%n", meuCarro.anoFabricacao);

        System.out.println("-------");
        System.out.printf("Modelo: %s%n", seuCarro.modelo);
        System.out.printf("Ano: %d%n", seuCarro.anoFabricacao);


    }
}
