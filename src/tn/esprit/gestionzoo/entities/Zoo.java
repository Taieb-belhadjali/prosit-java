package tn.esprit.gestionzoo.entities;
public class Zoo {
    private Animal[] animals;
    private String name;
    private  String city;
    private final int NBR_CAGES = 25;  // Constante pour le nombre maximum de cages
    private int animalCount;

    // Constructeur du zoo
    public Zoo(String name, String city) {
        setName(name);
        this.city = city;
        this.animals = new Animal[NBR_CAGES]; // Tableau de 25 animaux maximum
        this.animalCount = 0;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if(name == null || name.length() == 0) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    // Méthode pour ajouter un animal dans le zoo
    public boolean addAnimal(Animal animal) {
        if (isZooFull()) {
            System.out.println("Le zoo est plein, impossible d'ajouter plus d'animaux.");
            return false;
        }

        if (isAnimalInZoo(animal)) {
            System.out.println("Cet animal existe déjà dans le zoo.");
            return false;
        }

        animals[animalCount] = animal;
        animalCount++;
        return true;
    }

    // Méthode pour vérifier si un animal est déjà dans le zoo
    public boolean isAnimalInZoo(Animal animal) {
        return animalCount >= NBR_CAGES;
    }
    public boolean isZooFull(){
        return animalCount >= NBR_CAGES;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.animalCount == z2.animalCount) {
            return z1;
        } else if (z2.animalCount > z1.animalCount) {
            return z2;
        }
        else{
            return z1;
        }
    }
    // Méthode pour afficher les informations du zoo
    public void displayZooInfo() {
        System.out.println("Nom du zoo: " + name);
        System.out.println("Ville: " + city);
        System.out.println("Nombre maximal de cages: " + NBR_CAGES);
        System.out.println("Nombre actuel d'animaux: " + animalCount);
        System.out.println("le zoo est plain: " + isZooFull());
    }

    // Méthode pour afficher les animaux du zoo
    public void displayAnimals() {
        if (animalCount == 0) {
            System.out.println("Le zoo ne contient aucun animal.");
        } else {
            System.out.println("Animaux dans le zoo:");
            for (int i = 0; i < animalCount; i++) {
                System.out.println((i + 1) + ". " + animals[i].getName());
            }
        }
    }
}
