package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.exception.InvalidAgeException;

public class Animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    public Animal(String family, String name, int age, boolean isMammal) throws InvalidAgeException {
        this.family = family;
        this.name = name;
        setAge(age);  // Appel à la méthode setAge pour vérifier l'âge
        this.isMammal = isMammal;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException("L'âge ne peut pas être négatif.");
        }
        this.age = age;
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean isMammal) {
        this.isMammal = isMammal;
    }

    @Override
    public String toString() {
        return "Animal [family=" + family + ", name=" + name + ", age=" + age + ", isMammal=" + isMammal + "]";
    }
}
