package tn.esprit.gestionzoo.entities;

public class Aquatic extends Animal{
    private String habitat;

    public Aquatic(String family, String name , int age, Boolean isMamal,String habitat){
        super(family,name,age,isMamal);
        this.habitat=habitat;
    }
    public String getHabitat(){
        return habitat;
    }
    public void setHabitat(String habitat){
        this.habitat=habitat;
    }
    public String toString() {
        return super.toString() + ", Habitat: " + habitat;
    }
    public void swim() {
        System.out.println("This aquatic animal is swimming");
    }
}
