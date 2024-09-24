import java.util.Objects;

public class Carro extends Veiculo {

    private int porta;
    private String potencia;
    private boolean step;

    //Constructor vazio
    public Carro() {
    }

    //Constructor cheio
    public Carro(String placa, String modelo, String marca, String cor, int ano, double peso, boolean usado, int porta, String potencia, boolean step) {
        super(placa, modelo, marca, cor, ano, peso, usado);
    }

    public Carro(int porta, String potencia, boolean step) {
        this.porta = porta;
        this.potencia = potencia;
        this.step = step;
    }

    //Gets e Seters

    public int getPorta() {
        return porta;
    }

    public void setPorta(int porta) {
        this.porta = porta;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public boolean isStep() {
        return step;
    }

    public void setStep(boolean step) {
        this.step = step;
    }

    //Hashcode e equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Carro carro = (Carro) o;
        return getPorta() == carro.getPorta() && isStep() == carro.isStep() && Objects.equals(getPotencia(), carro.getPotencia());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getPorta(), getPotencia(), isStep());
    }

    //To String
    @Override
    public String toString() {
        return "Carro{" +
                "porta=" + porta +
                ", potencia='" + potencia + '\'' +
                ", step=" + step +
                '}';
    }
}
