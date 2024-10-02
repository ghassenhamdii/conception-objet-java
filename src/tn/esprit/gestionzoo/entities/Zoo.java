package tn.esprit.gestionzoo.entities;

public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    static final int NBRCAGES = 25;
    private int animalCount = 0;

    public Zoo(String name, String city) {
        setName(name);
        this.city = city;
        this.animals = new Animal[NBRCAGES];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Le nom du zoo ne peut pas être vide.");
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean addAnimal(Animal animal) {
        if (searchAnimal(animal) != -1) {
            System.out.println("L'animal " + animal.getName() + " existe déjà dans le zoo.");
            return false;
        }

        if (isZooFull()) {
            System.out.println("Le zoo est plein, impossible d'ajouter plus d'animaux.");
            return false;
        }

        animals[animalCount] = animal;
        animalCount++;
        return true;
    }

    public boolean isZooFull() {
        return animalCount == NBRCAGES;
    }

    public void displayAnimals() {
        System.out.println("Animaux dans le zoo " + name + ":");
        for (int i = 0; i < animalCount; i++) {
            if (animals[i] != null) {
                System.out.println(animals[i]);
            }
        }
        if (animalCount == 0) {
            System.out.println("Aucun animal dans le zoo.");
        }
    }

    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index != -1) {
            for (int i = index; i < animalCount - 1; i++) {
                animals[i] = animals[i + 1];
            }
            animals[animalCount - 1] = null;
            animalCount--;
            return true;
        } else {
            System.out.println("L'animal " + animal.getName() + " n'existe pas dans le zoo.");
            return false;
        }
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i] != null && animals[i].getName().equals(animal.getName())) {
                return i;
            }
        }
        return -1;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.animalCount > z2.animalCount) {
            return z1;
        } else if (z2.animalCount > z1.animalCount) {
            return z2;
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        return "Zoo [name=" + name + ", city=" + city + ", NBRCAGES=" + NBRCAGES + ", animalCount=" + animalCount + "]";
    }
}
