package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class Main {
    public static void main(String[] args) {

        Animal lion = new Animal("Felidae", "Leo", 5, true);
        Animal tiger = new Animal("Felidae", "Tiger", 3, true);
        Animal elephant = new Animal("Elephantidae", "Dumbo", 10, true);
        Animal dog = new Animal("Canine", "Snoopy", 2, true);
        Animal dog2 = new Animal("Canine", "Rex", 2, true);
        Aquatic aquatic = new Aquatic("Fish", "Shark", 10, false, "Ocean");
        Terrestrial terrestrial = new Terrestrial("Mammal", "Lion", 8, true, 4);
        Dolphin dolphin = new Dolphin("Mammal", "Dolphin", 5, true, "Ocean", 35.5f);
        Penguin penguin = new Penguin("Bird", "Penguin", 3, false, "Arctic", 20.0f);

        aquatic.swim();
        dolphin.swim();
        penguin.swim();
        System.out.println(aquatic);
        System.out.println(dolphin);
        System.out.println(penguin);



        // Affichage des objets créés avec le constructeur paramétré
        System.out.println("Aquatic : " + aquatic);
        System.out.println("Terrestrial : " + terrestrial);
        System.out.println("Dolphin : " + dolphin);
        System.out.println("Penguin : " + penguin);



        Zoo myZoo = new Zoo("Belvedaire", "Tunis");
        Zoo anotherZoo = new Zoo("Zoo B", "Paris");


        myZoo.addAnimal(lion);
        myZoo.addAnimal(tiger);
        myZoo.addAnimal(elephant);
        myZoo.addAnimal(dog);


        System.out.println(myZoo);
        System.out.println(anotherZoo);


        if (!myZoo.addAnimal(lion)) {
            System.out.println("L'animal " + lion.getName() + " ne peut pas être ajouté car il existe déjà dans le zoo.");
        }


        if (myZoo.removeAnimal(lion)) {
            System.out.println("L'animal " + lion.getName() + " a été supprimé.");
        } else {
            System.out.println("L'animal " + lion.getName() + " n'a pas pu être supprimé.");
        }


        if (myZoo.isZooFull()) {
            System.out.println("Le zoo est plein.");
        } else {
            System.out.println("Il y a encore de la place dans le zoo.");
        }


        myZoo.displayAnimals();


        System.out.println("Recherche pour Snoopy : " + myZoo.searchAnimal(dog));
        System.out.println("Recherche pour Rex : " + myZoo.searchAnimal(dog2));


        Zoo largerZoo = Zoo.comparerZoo(myZoo, anotherZoo);
        if (largerZoo != null) {
            System.out.println("Le zoo avec le plus d'animaux est : " + largerZoo.getName());
        } else {
            System.out.println("Les deux zoos ont le même nombre d'animaux.");
        }
    }
}
