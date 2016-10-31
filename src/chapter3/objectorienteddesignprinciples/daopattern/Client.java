package chapter3.objectorienteddesignprinciples.daopattern;

import java.util.Collection;

/**
 * Created by dan on 10/31/16.
 */
class Emp {
    int id;
    String name;
    int age;
    String address;
}

interface EmpDAO {
    int create(Emp e);
    Emp get(int id);
    boolean delete(Emp e);
    boolean update(Emp e);
    Collection<Emp> getAll();
}

class EmpDAOImpl implements EmpDAO {

    @Override
    public int create(Emp e) {
        /*
        Connect to Datastore
        insert data for Emp
         */
        return 0;
    }

    @Override
    public Emp get(int id) {
        /*
        Connect to Datastore
        get data for Emp
         */
        return null;
    }

    @Override
    public boolean delete(Emp e) {
        /*
        Connect to Datastore
        delete data for Emp
         */
        return false;
    }

    @Override
    public boolean update(Emp e) {
        /*
        Connect to Datastore
        update data for Emp
         */
        return false;
    }

    @Override
    public Collection<Emp> getAll() {
        /*
        Connect to Datastore
        retrieve Emp data
        return as Collection
         */
        return null;
    }
}

public class Client {
    public static void main(String [] args){
        Emp emp = new Emp();
        emp.id = 10;
        emp.name = "Harry";
        emp.age = 39;
        emp.address = "UK";

        EmpDAO dao = new EmpDAOImpl();
        dao.create(emp);
        emp.name = "Harry M";
        emp.age = 40;
        dao.update(emp);

        Emp emp2 = dao.get(11);
        if(emp2 != null){
            dao.delete(emp2);
        }
    }
}
