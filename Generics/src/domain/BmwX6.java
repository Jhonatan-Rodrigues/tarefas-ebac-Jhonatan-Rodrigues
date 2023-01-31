package domain;

public class BmwX6 extends Car {
    public BmwX6(String potenciaMotor, Double valor) {
        super(potenciaMotor, valor);
    }

    @Override
    public String toString() {
        return "BmwX6"+
                ", Motor: "+ getPotenciaMotor()+
                ", valor: "+ getValor();
    }
}
