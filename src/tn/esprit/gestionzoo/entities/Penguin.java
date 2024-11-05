
package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.exception.InvalidAgeException;

public class Penguin extends Aquatic{
    private float swimmingDepth;
    public Penguin(String family,String name,int age,Boolean isMamal,String habitat ,float swimmingDepth) throws InvalidAgeException {
        super(family,name,age,isMamal,habitat);
        this.swimmingDepth=swimmingDepth;
    }
    public float getSwimmingDepth(){
        return swimmingDepth;
    }
    public void setSwimmingDepth(float swimmingDepth){
        this.swimmingDepth=swimmingDepth;
    }
    public String toString() {
        return super.toString() + ", Profondeur de nage: " + swimmingDepth + " m";
    }
    public void swim() {
        System.out.println("The penguin is swimming at a depth of " + swimmingDepth + " meters");
    }


}