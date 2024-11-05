
package tn.esprit.gestionzoo.entities;
import tn.esprit.gestionzoo.exception.ZooFullException;

public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    static final int NBRCAGES = 3;
    private int animalCount = 0;
    private Aquatic[] aquaticAnimals;
    static final int NBRAQUATIC = 10;
    private int aquaticCount = 0;

    public Zoo(String name, String city) {
        setName(name);
        this.city = city;
        this.animals = new Animal[NBRCAGES];
        this.aquaticAnimals = new Aquatic[NBRAQUATIC];
    }
    public void addAquaticAnimal(Aquatic aquatic) {
        if (aquaticCount >= NBRAQUATIC ) {
            System.out.print("Impossible d'ajouter un animal aquatic");
        } else {
            aquaticAnimals[aquaticCount] = aquatic;
            aquaticCount++;
        }
    }

    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0.0f;

        for (Aquatic aquaticAnimal : aquaticAnimals) {
            // Vérifier si l'animal est un pingouin
            if (aquaticAnimal instanceof Penguin) {
                Penguin penguin = (Penguin) aquaticAnimal;
                // Comparer la profondeur de nage du pingouin avec la profondeur maximale actuelle
                if (penguin.getSwimmingDepth() > maxDepth) {
                    maxDepth = penguin.getSwimmingDepth();
                }
            }
        }

        return maxDepth;
    }
    public void displayNumberOfAquaticsByType() {
        int nbr_dauphins = 0;
        int nbr_pingouins = 0;
        for (int i=0;i<NBRAQUATIC;i++){
            if(aquaticAnimals[i] instanceof Dolphin) {
                nbr_dauphins++;

            } else {
                nbr_pingouins++;

            }
        }
        System.out.println("Le nombre dauphins est : "+nbr_dauphins);
        System.out.println("Le nombre de pingouins est"+nbr_pingouins);

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

    public void addAnimal(Animal animal) throws ZooFullException {
        if (animalCount >= NBRCAGES) {
            throw new ZooFullException("Le zoo est plein, impossible d'ajouter plus d'animaux.");
        }
        animals[animalCount] = animal;
        animalCount++;
    }

    public int getAnimalCount() {
        return animalCount;
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