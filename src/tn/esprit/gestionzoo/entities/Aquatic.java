package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.exception.InvalidAgeException;

public abstract class Aquatic extends Animal implements Carnivore<Food>{
    private String habitat;

    public Aquatic(String family, String name , int age, Boolean isMamal,String habitat) throws InvalidAgeException {
        super(family,name,age,isMamal);
        this.habitat=habitat;
    }
    public String getHabitat(){
        return habitat;
    }
    public void setHabitat(String habitat){
        this.habitat=habitat;
    }

    public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.BOTH) {
            System.out.println(this.getName() + " is eating meat.");
        } else {
            System.out.println(this.getName() + " cannot eat this type of food.");
        }
    }

    public String toString() {
        return super.toString() + ", Habitat: " + habitat;
    }
    public abstract void swim();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Aquatic)) {
            return false;
        }
        Aquatic other = (Aquatic) obj;
        return this.getName().equals(other.getName()) && this.getAge() == other.getAge() && this.habitat.equals(other.habitat);
    }
}