package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class Main {
    public static void main(String[] args) {

        // Création d'animaux terrestres
        Animal lion = new Animal("Felidae", "Leo", 5, true);
        Animal tiger = new Animal("Felidae", "Tiger", 3, true);
        Animal elephant = new Animal("Elephantidae", "Dumbo", 10, true);
        Animal dog = new Animal("Canine", "Snoopy", 2, true);
        Animal dog2 = new Animal("Canine", "Rex", 2, true);

        // Création d'animaux aquatiques
        Dolphin aquatic = new Dolphin("Fish", "Shark", 10, false, "Ocean", 40.0f);
        Dolphin dolphin = new Dolphin("Mammal", "Dolphin", 5, true, "Ocean", 35.5f);
        Penguin penguin = new Penguin("Bird", "Penguin", 3, false, "Arctic", 20.0f);

        // Appel à la méthode swim pour chaque animal aquatique
        aquatic.swim();
        dolphin.swim();
        penguin.swim();

        // Affichage des animaux
        System.out.println(aquatic);
        System.out.println(dolphin);
        System.out.println(penguin);

        // Affichage des objets créés avec le constructeur paramétré
        System.out.println("Aquatic : " + aquatic);
        System.out.println("Dolphin : " + dolphin);
        System.out.println("Penguin : " + penguin);

        // Création de zoos
        Zoo myZoo = new Zoo("Belvedaire", "Tunis");
        Zoo anotherZoo = new Zoo("Zoo B", "Paris");

        // Ajout d'animaux au zoo
        myZoo.addAnimal(lion);
        myZoo.addAnimal(tiger);
        myZoo.addAnimal(elephant);
        myZoo.addAnimal(dog);
        myZoo.addAquaticAnimal(aquatic);
        myZoo.addAquaticAnimal(dolphin);
        myZoo.addAquaticAnimal(penguin);

        // Affichage du nombre d'animaux aquatiques par type
        myZoo.displayNumberOfAquaticsByType();

        // Affichage des zoos et de la profondeur maximale de nage des pingouins
        System.out.println(myZoo);
        System.out.println(anotherZoo);
        System.out.println("Profondeur maximale de nage des pingouins : " + myZoo.maxPenguinSwimmingDepth() + " mètres");

        // Essai d'ajout d'un animal déjà existant
        if (!myZoo.addAnimal(lion)) {
            System.out.println("L'animal " + lion.getName() + " ne peut pas être ajouté car il existe déjà dans le zoo.");
        }

        // Suppression d'un animal
        if (myZoo.removeAnimal(lion)) {
            System.out.println("L'animal " + lion.getName() + " a été supprimé.");
        } else {
            System.out.println("L'animal " + lion.getName() + " n'a pas pu être supprimé.");
        }

        // Vérification de la capacité du zoo
        if (myZoo.isZooFull()) {
            System.out.println("Le zoo est plein.");
        } else {
            System.out.println("Il y a encore de la place dans le zoo.");
        }

        // Affichage des animaux dans le zoo
        myZoo.displayAnimals();

        // Recherche d'animaux dans le zoo
        System.out.println("Recherche pour Snoopy : " + myZoo.searchAnimal(dog));
        System.out.println("Recherche pour Rex : " + myZoo.searchAnimal(dog2));

        // Comparaison des zoos
        Zoo largerZoo = Zoo.comparerZoo(myZoo, anotherZoo);
        if (largerZoo != null) {
            System.out.println("Le zoo avec le plus d'animaux est : " + largerZoo.getName());
        } else {
            System.out.println("Les deux zoos ont le même nombre d'animaux.");
        }

        // Comparaison des dauphins
        System.out.println("Comparaison des dauphins :");
        Dolphin dolphin1 = new Dolphin("Mammal", "Flipper", 5, true, "Ocean", 35.0f);
        Dolphin dolphin2 = new Dolphin("Mammal", "Flipper", 5, true, "Ocean", 40.0f);
        System.out.println("Dolphin1 est égal à Dolphin2 ? " + dolphin1.equals(dolphin2));
    }
}
