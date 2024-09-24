import java.util.ArrayList;
import java.util.Objects;

public class Veiculo {

    private String placa;
    private String modelo;
    private String marca;
    private String cor;
    private int ano;
    private Tamanho tamanho;
    private ArrayList<Caracteristica> caracteristica = new ArrayList<>();



    //contructor vazio
    public Veiculo() {
    }
    //Constructor cheio
    public Veiculo(String placa, String modelo, String marca, String cor, int ano, double peso, boolean usado) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.ano = ano;

    }

    //contructor completo


    public Veiculo(String placa, ArrayList<Caracteristica> caracteristica, Tamanho tamanho, int ano, String cor, String marca, String modelo) {
        this.placa = placa;
        this.caracteristica = caracteristica;
        this.tamanho = tamanho;
        this.ano = ano;
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
    }

    //gets e setters
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public ArrayList<Caracteristica> getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(ArrayList<Caracteristica> caracteristica) {
        this.caracteristica = caracteristica;
    }

    //Equals e Hashcode


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Veiculo veiculo = (Veiculo) o;
        return getAno() == veiculo.getAno() && Objects.equals(getPlaca(), veiculo.getPlaca()) && Objects.equals(getModelo(), veiculo.getModelo()) && Objects.equals(getMarca(), veiculo.getMarca()) && Objects.equals(getCor(), veiculo.getCor()) && Objects.equals(getTamanho(), veiculo.getTamanho()) && Objects.equals(getCaracteristica(), veiculo.getCaracteristica());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPlaca(), getModelo(), getMarca(), getCor(), getAno(), getTamanho(), getCaracteristica());
    }

    //To String


    @Override
    public String toString() {
        return "Veiculo{" +
                "placa='" + placa + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", cor='" + cor + '\'' +
                ", ano=" + ano +
                ", tamanho=" + tamanho +
                ", caracteristica=" + caracteristica +
                '}';
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }


}


