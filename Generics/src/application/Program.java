package application;

import domain.BmwX6;
import domain.Jetta;
import domain.Panamera;
import generic.GenericDao;

public class Program {

    public static void main(String[] args) {

        GenericDao genericDao = new GenericDao();

        genericDao.cadastrar(new BmwX6( "200", 100000.0));
        genericDao.cadastrar(new Jetta("150", 150000.0));
        genericDao.cadastrar(new Panamera( "300", 280000.0));

        genericDao.print();


    }
}
