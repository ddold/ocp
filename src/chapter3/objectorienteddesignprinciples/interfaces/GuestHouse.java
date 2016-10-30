package chapter3.objectorienteddesignprinciples.interfaces;

/**
 * Created by dan on 10/30/16.
 *
 * interfaces extend each other
 * They can extend multiple interfaces
 *
 * A class that implements an interface that extends multiple interfaces must
 * implement all of the methods in all of the interfaces
 */
public interface GuestHouse {
    void welcome();
}

interface PayingGuestHouse extends GuestHouse {
    void paidBreakfast();
}

interface StudentPGHouse extends GuestHouse {
    void laundry();
}

interface ChildFriendly {
    void toys();
}

interface FamilyPGHouse extends ChildFriendly, PayingGuestHouse {
    void kitchen();
}

class Class implements FamilyPGHouse {

    @Override
    public void kitchen() {

    }

    @Override
    public void toys() {

    }

    @Override
    public void paidBreakfast() {

    }

    @Override
    public void welcome() {

    }
}