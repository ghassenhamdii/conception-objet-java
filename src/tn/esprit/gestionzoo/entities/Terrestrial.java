
package tn.esprit.gestionzoo.entities;

public class Terrestrial extends Animal{
    private int nbrLegs;
    public Terrestrial(String family,String name, int age, Boolean isMamal, int nbrLegs) {
        super(family,name,age,isMamal);
        this.nbrLegs=nbrLegs;
    }
    public int getNbrLegs(){
        return nbrLegs;
    }
    public void setNbrLegs(int nbrLegs){
        this.nbrLegs=nbrLegs;
    }
    public String toString() {
        return super.toString() + ", Nombre de pattes: " + nbrLegs;
    }
}
