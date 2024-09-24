import java.util.Objects;

public class Caminhao extends Veiculo {

    private int eixo;
    private double capacidadeKG;

    //Constructor vazio
    public Caminhao() {
    }
    //Constructor cheio
    public Caminhao(String placa, String modelo, String marca, String cor, int ano, double peso, boolean usado, int eixo, double capacidadeKG) {
        super(placa, modelo, marca, cor, ano, peso, usado);
        this.eixo = eixo;
        this.capacidadeKG = capacidadeKG;
    }

    //Gets e Sters

    public int getEixo() {
        return eixo;
    }

    public void setEixo(int eixo) {
        this.eixo = eixo;
    }

    public double getCapacidadeKG() {
        return capacidadeKG;
    }

    public void setCapacidadeKG(double capacidadeKG) {
        this.capacidadeKG = capacidadeKG;
    }

    //Hashcode e equals

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Caminhao caminhao = (Caminhao) o;
        return getEixo() == caminhao.getEixo() && Double.compare(getCapacidadeKG(), caminhao.getCapacidadeKG()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getEixo(), getCapacidadeKG());
    }

    //To String

    @Override
    public String toString() {
        return "Caminhao{" +
                "eixo=" + eixo +
                ", capacidadeKG=" + capacidadeKG +
                '}';
    }
}
