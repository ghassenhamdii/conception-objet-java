package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;
import tn.esprit.gestionzoo.exception.*;

public class Main {
    public static void main(String[] args) throws InvalidAgeException {

        try {
            // Création d'animaux terrestres
            Animal lion = new Animal("Felidae", "Leo", 5, true);
            Animal tiger = new Animal("Felidae", "Tiger", 3, true);
            Animal elephant = new Animal("Elephantidae", "Dumbo", 10, true);
            Animal dog = new Animal("Canine", "Snoopy", 2, true);

            // Création d'animaux aquatiques
            Dolphin aquatic = new Dolphin("Fish", "Shark", 10, false, "Ocean", 40.0f);
            Dolphin dolphin = new Dolphin("Mammal", "Dolphin", 5, true, "Ocean", 35.5f);
            Penguin penguin = new Penguin("Bird", "Penguin", 3, false, "Arctic", 20.0f);

            // Création de zoos
            Zoo myZoo = new Zoo("Belvedaire", "Tunis");
            Zoo anotherZoo = new Zoo("Zoo B", "Paris");

            // Ajout d'animaux au zoo avec gestion de l'exception ZooFullException
            myZoo.addAnimal(lion);
            System.out.println("Nombre d'animaux dans le zoo : " + myZoo.getAnimalCount());

            myZoo.addAnimal(tiger);
            System.out.println("Nombre d'animaux dans le zoo : " + myZoo.getAnimalCount());

            myZoo.addAnimal(elephant);
            System.out.println("Nombre d'animaux dans le zoo : " + myZoo.getAnimalCount());

            myZoo.addAnimal(dog);  // Ceci devrait lever une ZooFullException
            System.out.println("Nombre d'animaux dans le zoo : " + myZoo.getAnimalCount());

        } catch (ZooFullException e) {
            System.out.println("Erreur : " + e.getMessage());
        } catch (InvalidAgeException e) {
            System.out.println("Erreur d'âge : " + e.getMessage());
        }

        
        // Affichage des animaux aquatiques
        Dolphin dolphin1 = new Dolphin("Mammal", "Flipper", 5, true, "Ocean", 35.0f);
        Dolphin dolphin2 = new Dolphin("Mammal", "Flipper", 5, true, "Ocean", 40.0f);
        System.out.println("Dolphin1 est égal à Dolphin2 ? " + dolphin1.equals(dolphin2));
    }
}
