package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic{
    private float swimmingSpeed;
    public Dolphin(String family,String name,int age,Boolean isMamal,String habitat,float swimmingSpeed){
        super(family,name,age,isMamal,habitat);
        this.swimmingSpeed=swimmingSpeed;
    }
    public float getSwimmingSpeed(){
        return swimmingSpeed;
    }
    public void setSwimmingSpeed(float swimmingSpeed){
        this.swimmingSpeed=swimmingSpeed;
    }
    public String toString() {
        return super.toString() + ", Vitesse de nage: " + swimmingSpeed + " km/h";
    }
    public void swim(){
        System.out.println("This dolphin is swimming");
    }

}
