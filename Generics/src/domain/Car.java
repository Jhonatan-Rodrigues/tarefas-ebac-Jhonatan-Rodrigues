package domain;

public abstract class Car {

    private String potenciaMotor;
    private Double valor;

    public Car(String potenciaMotor, Double valor) {
        this.potenciaMotor = potenciaMotor;
        this.valor = valor;
    }

    public String getPotenciaMotor() {
        return potenciaMotor;
    }

    public void setPotenciaMotor(String potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
