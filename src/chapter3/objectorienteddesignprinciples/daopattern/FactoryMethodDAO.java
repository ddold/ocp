package chapter3.objectorienteddesignprinciples.daopattern;

import java.util.Collection;

/**
 * Created by dan on 10/31/16.
 */
class Emp3{
    int id;
    String name;
    int age;
    String address;
}
class Dept{}

interface EmpDAO3 {
    int create(Emp3 e);
    Emp3 get(int id);
    boolean delete(Emp3 e);
    boolean update(Emp3 e);
    Collection<Emp3> getAll();
}
interface DeptDAO{}

class EmpDAOOracleImpl3 implements EmpDAO3 {
    @Override
    public int create(Emp3 e) {
        return 0;
    }

    @Override
    public Emp3 get(int id) {
        return null;
    }

    @Override
    public boolean delete(Emp3 e) {
        return false;
    }

    @Override
    public boolean update(Emp3 e) {
        return false;
    }

    @Override
    public Collection<Emp3> getAll() {
        return null;
    }
}
class DeptDAOOracleImpl implements DeptDAO{}

class EmpDAOMySQLImpl3 implements EmpDAO3 {

    @Override
    public int create(Emp3 e) {
        return 0;
    }

    @Override
    public Emp3 get(int id) {
        return null;
    }

    @Override
    public boolean delete(Emp3 e) {
        return false;
    }

    @Override
    public boolean update(Emp3 e) {
        return false;
    }

    @Override
    public Collection<Emp3> getAll() {
        return null;
    }
}
class DeptDAOMySQLImpl implements DeptDAO{}

abstract class DAOFactory3 {
    protected abstract EmpDAO3 getEmpDAO();
    protected abstract DeptDAO getDeptDAO();
    public EmpDAO3 getEmpDAOInstance(){
        return getEmpDAO();
    }
    public DeptDAO getDeptDAOInstance(){
        return getDeptDAO();
    }
}

class OracleDAOFactory extends DAOFactory3 {

    @Override
    protected EmpDAO3 getEmpDAO() {
        return new EmpDAOOracleImpl3();
    }

    @Override
    protected DeptDAO getDeptDAO() {
        return new DeptDAOOracleImpl();
    }
}

class MySQLDAOFactory extends DAOFactory3 {

    @Override
    protected EmpDAO3 getEmpDAO() {
        return new EmpDAOMySQLImpl3();
    }

    @Override
    protected DeptDAO getDeptDAO() {
        return new DeptDAOMySQLImpl();
    }
}

public class FactoryMethodDAO {
    public static void main(String [] args){
        DAOFactory3 factory = new OracleDAOFactory();
        EmpDAO3 empDAO = factory.getEmpDAOInstance();
        DeptDAO deptDAO = factory.getDeptDAOInstance();

        Emp3 emp = new Emp3();
        empDAO.create(emp);

        Dept dept = new Dept();
    }
}
