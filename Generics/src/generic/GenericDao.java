package generic;

import domain.Car;

import java.util.ArrayList;
import java.util.List;

public class GenericDao<T extends Car> {

    List<T> list = new ArrayList<>();

    public void cadastrar(T value) {
        list.add(value);
    }
    public void print(){
        for(T list : this.list){
            System.out.println(list);
        }
    }


}
