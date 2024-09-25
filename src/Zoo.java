public class Zoo {
    Animal[] animals;
    public String name;
    public String city;
    static final int NBRCAGES = 25;
    private int animalCount = 0;

    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[NBRCAGES];
    }

    public void displayZoo() {
        System.out.println("Zoo Name: " + name + ", City: " + city + ", Number of Cages: " + NBRCAGES);
    }


    public boolean addAnimal(Animal animal) {

        if (searchAnimal(animal) != -1) {
            System.out.println("L'animal " + animal.name + " existe déjà dans le zoo.");
            return false;
        }


        if (animalCount < NBRCAGES) {
            animals[animalCount] = animal;
            animalCount++;
            return true;
        } else {
            System.out.println("Le zoo est plein, impossible d'ajouter plus d'animaux.");
            return false;
        }
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
    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i] != null && animals[i].name.equals(animal.name)) {
                return i;
            }
        }
        return -1;
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
            System.out.println("L'animal " + animal.name + " n'existe pas dans le zoo.");
            return false;
        }
    }
    boolean isZooFull() {
        return animalCount == NBRCAGES;
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
