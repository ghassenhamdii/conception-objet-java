package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;
import tn.esprit.gestionzoo.exception.*;

public class Main {
    public static void main(String[] args) {
        try {
            // Création d'un objet Dolphin (Aquatic)
            Dolphin dolphin = new Dolphin("Mammal", "Flipper", 5, true, "Ocean", 30.5f);
            System.out.println(dolphin);
            dolphin.swim();
            dolphin.eatMeat(Food.MEAT);  // Test de l'alimentation avec MEAT
            dolphin.eatMeat(Food.PLANT); // Test de l'alimentation avec PLANT

            // Création d'un objet Penguin
            Penguin penguin = new Penguin("Bird", "Penguin", 3, false, "Arctic", 15.0f);
            System.out.println(penguin);
            penguin.swim();
            penguin.eatMeat(Food.MEAT);  // Test de l'alimentation avec MEAT
            penguin.eatMeat(Food.BOTH);  // Test de l'alimentation avec BOTH

            // Création d'un objet Terrestrial
            Terrestrial lion = new Terrestrial("Felidae", "Lion", 7, true, 4);
            System.out.println(lion);
            lion.eatMeat(Food.MEAT);      // Test de l'alimentation carnivore
            lion.eatPlant(Food.PLANT);    // Test de l'alimentation herbivore
            lion.eatPlantAndMeet(Food.BOTH);  // Test de l'alimentation omnivore

        } catch (InvalidAgeException e) {
            System.out.println("Erreur d'âge : " + e.getMessage());
        }
    }
}
