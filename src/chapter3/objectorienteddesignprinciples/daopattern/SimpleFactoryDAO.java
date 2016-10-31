package chapter3.objectorienteddesignprinciples.daopattern;

import java.util.Collection;

/**
 * Created by dan on 10/31/16.
 */
class Emp2 {
    int id;
    String name;
    int age;
    String address;
}

interface EmpDAO2 {
    int create(Emp2 e);
    Emp2 get(int id);
    boolean delete(Emp2 e);
    boolean update(Emp2 e);
    Collection<Emp2> getAll();
}

class EmpDAOOracleImpl implements EmpDAO2 {
    //Implement methods to connect to datastore
    @Override
    public int create(Emp2 e) {
        return 0;
    }

    @Override
    public Emp2 get(int id) {
        return null;
    }

    @Override
    public boolean delete(Emp2 e) {
        return false;
    }

    @Override
    public boolean update(Emp2 e) {
        return false;
    }

    @Override
    public Collection<Emp2> getAll() {
        return null;
    }
}

class EmpDAOMySQLImpl implements EmpDAO2 {
    //Implement methods to connect to datastore
    @Override
    public int create(Emp2 e) {
        return 0;
    }

    @Override
    public Emp2 get(int id) {
        return null;
    }

    @Override
    public boolean delete(Emp2 e) {
        return false;
    }

    @Override
    public boolean update(Emp2 e) {
        return false;
    }

    @Override
    public Collection<Emp2> getAll() {
        return null;
    }
}

abstract class DAOFactory {
    public static int ORACLE = 1;
    public static int MYSQL = 2;
    public static EmpDAO2 getEmpDAOInstance(int DBType){
        if(DBType == ORACLE){
            return new EmpDAOOracleImpl();
        } else if(DBType == MYSQL){
            return new EmpDAOMySQLImpl();
        } else {
            return null;
        }
    }
}

public class SimpleFactoryDAO {
    public static void main(String [] args){
        EmpDAO2 empDao = DAOFactory.getEmpDAOInstance(DAOFactory.ORACLE);
        Emp2 emp = new Emp2();
        emp.id = 10;
        emp.name = "Harry";
        emp.age = 39;
        emp.address = "UK";
        empDao.create(emp);
    }
}
