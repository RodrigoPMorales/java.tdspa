import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        var carro1 = new Carro();
        carro1.setModelo("M3");
        carro1.setMarca("BMW");
        carro1.setPlaca("EMU9764");
        carro1.setAno(2020);
        carro1.setCor("Azul");
        carro1.setPorta(4);
        carro1.setPotencia("V6");

        carro1.getCaracteristica().add(
                new Caracteristica("EMU9764","M3","BMW", "Azul", 2000)
        );
        carro1.setTamanho(new Tamanho(200, 200, 200, 200));

        System.out.println(carro1.getCaracteristica().toString());
//        System.out.println("Você está vendo uma " + carro1.getMarca() + " Modelo: " + carro1.getModelo() +
//                " Com placa : " + carro1.getPlaca() + " Ano: " + carro1.getAno() + " e cor " + carro1.getCor() + " com um motor " + carro1.getPotencia());

        var pesquisa = new Scanner(System.in);
        System.out.println("Digite o nome da Marca de carro: ");
        var busca1 = pesquisa.nextLine();

        System.out.println("Digite o modelo do carro: ");
        var busca2 = pesquisa.nextLine();
        System.out.println("Voc pesquisou " + busca1 + " e " + busca2 );


    }
}