import java.util.Objects;

public class Caracteristica {

    private String placa;
    private String modelo;
    private String marca;
    private String cor;
    private int ano;

    public Caracteristica() {
    }

    public Caracteristica(String placa, String modelo, String marca, String cor, int ano) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.ano = ano;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Caracteristica that = (Caracteristica) o;
        return getAno() == that.getAno() && Objects.equals(getPlaca(), that.getPlaca()) && Objects.equals(getModelo(), that.getModelo()) && Objects.equals(getMarca(), that.getMarca()) && Objects.equals(getCor(), that.getCor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPlaca(), getModelo(), getMarca(), getCor(), getAno());
    }

    @Override
    public String toString() {
        return "Caracteristica{" +
                "placa='" + placa + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", cor='" + cor + '\'' +
                ", ano=" + ano +
                '}';
    }
}
