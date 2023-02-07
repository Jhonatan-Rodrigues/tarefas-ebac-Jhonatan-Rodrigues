package reflection;

import reflection.Pessoa;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Teste {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        Pessoa pessoa = new Pessoa();
        pessoa.setCpf(10);
        pessoa.setNome("Drake");


        Field[] fields = pessoa.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(Tabela.class)) {
                Tabela tabela = field.getAnnotation(Tabela.class);
                String nomeMetodo = tabela.value();
                System.out.println(nomeMetodo);


            }
        }
    }
}