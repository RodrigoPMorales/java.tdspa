import java.util.Objects;

public class Moto extends Veiculo{

    private String cilindrada;

    //constructor vazio
    public Moto() {
    }
    //Constructor cheio

    public Moto(String placa, String modelo, String marca, String cor, int ano, double peso, boolean usado, String cilindrada) {
        super(placa, modelo, marca, cor, ano, peso, usado);
        this.cilindrada = cilindrada;
    }


    //Gets e Sters

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    //Hashcode e equals

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Moto moto = (Moto) o;
        return Objects.equals(getCilindrada(), moto.getCilindrada());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getCilindrada());
    }

    //to String

    @Override
    public String toString() {
        return "Moto{" +
                "cilindrada='" + cilindrada + '\'' +
                '}';
    }
}
