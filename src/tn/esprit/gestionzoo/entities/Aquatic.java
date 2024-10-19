package tn.esprit.gestionzoo.entities;

public abstract class Aquatic extends Animal{
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