package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;

public class ZooManagement {
    public static void main(String[] args) {
        try {
            Zoo invalidZoo = new Zoo("", "Paris");
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur: " + e.getMessage());
        }

        try {
            Animal invalidAnimal = new Animal("Felidae", "lion", -5, true);
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur: " + e.getMessage());
        }

        Zoo validZoo = new Zoo("Safari Park", "Paris");
        Animal validAnimal = new Animal("Felidae", "Tigre", 4, true);

        validZoo.addAnimal(validAnimal);

        validZoo.displayZooInfo();
        validAnimal.displayAnimalInfo();
    }
}
