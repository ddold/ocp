package chapter3.objectorienteddesignprinciples.isahasarelationship;

/**
 * Created by dan on 10/30/16.
 */
interface Movable{}
interface Hunter extends Movable{}

class Animal implements Hunter{}
class Herbivore extends Animal{}
class Carnivore extends Animal{}

class Cow extends Herbivore{}
class Goat extends Herbivore{}

class Lion extends Carnivore{}
class Tiger extends Carnivore{}

public class IsA {
    /**
     * Hunter is a Movable
     * Animal is a Hunter
     * Herbivore and Carnivore is a Animal
     * Cow and Goat is a Carnivore
     * Lion and Tiger is a Herbivore
     *
     * Movable is not a Hunter
     * Animal is not a Herbivore or Carnivore
     */
}