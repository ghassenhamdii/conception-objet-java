package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.exception.InvalidAgeException;

public class Terrestrial extends Animal implements Omnivore<Food> {
    private int nbrLegs;

    public Terrestrial(String family, String name, int age, Boolean isMammal, int nbrLegs) throws InvalidAgeException {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    public int getNbrLegs() {
        return nbrLegs;
    }

    public void setNbrLegs(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }

    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.BOTH) {
            System.out.println(this.getName() + " is eating meat.");
        } else {
            System.out.println(this.getName() + " cannot eat this type of food.");
        }
    }

    @Override
    public void eatPlant(Food plant) {
        if (plant == Food.PLANT || plant == Food.BOTH) {
            System.out.println(this.getName() + " is eating plants.");
        } else {
            System.out.println(this.getName() + " cannot eat this type of food.");
        }
    }

    @Override
    public void eatPlantAndMeet(Food food) {
        if (food == Food.BOTH) {
            System.out.println(this.getName() + " is eating both plants and meat.");
        } else {
            System.out.println(this.getName() + " cannot eat this type of food.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Nombre de pattes: " + nbrLegs;
    }
}
