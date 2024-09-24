import java.util.Objects;

public class Tamanho {

    private int largura;
    private int altura;
    private int comprimento;
    private int peso;

    public Tamanho() {
    }

    public Tamanho(int largura, int altura, int comprimento, int peso) {
        this.largura = largura;
        this.altura = altura;
        this.comprimento = comprimento;
        this.peso = peso;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tamanho tamanho = (Tamanho) o;
        return Double.compare(getLargura(), tamanho.getLargura()) == 0 && Double.compare(getAltura(), tamanho.getAltura()) == 0 && Double.compare(getComprimento(), tamanho.getComprimento()) == 0 && Double.compare(getPeso(), tamanho.getPeso()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLargura(), getAltura(), getComprimento(), getPeso());
    }

    @Override
    public String toString() {
        return "Tamanho{" +
                "largura=" + largura +
                ", altura=" + altura +
                ", comprimento=" + comprimento +
                ", peso=" + peso +
                '}';
    }
}
