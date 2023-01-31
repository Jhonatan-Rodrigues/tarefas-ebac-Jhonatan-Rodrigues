package domain;

public class Panamera extends Car {
    public Panamera(String potenciaMotor, Double valor) {
        super(potenciaMotor, valor);
    }

    @Override
    public String toString() {
        return "Panamera" +
                ", Motor: " + getPotenciaMotor() +
                ", valor: " + getValor();
    }
}
