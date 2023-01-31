package domain;


public class Jetta extends Car {
    public Jetta(String potenciaMotor, Double valor) {
        super(potenciaMotor, valor);
    }

    @Override
    public String toString() {
        return "Jetta" +
                ", Motor: " + getPotenciaMotor() +
                ", valor: " + getValor();
    }
}
