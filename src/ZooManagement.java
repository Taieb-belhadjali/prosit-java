public class ZooManagement {
    public static void main(String[] args) {
        // Création de deux zoos
        Zoo zoo1 = new Zoo("Safari Park", "Paris");
        Zoo zoo2 = new Zoo("Wildlife Reserve", "Lyon");

        // Création de quelques animaux
        Animal lion = new Animal("Felidae", "Lion", 5, true);
        Animal tiger = new Animal("Felidae", "Tigre", 4, true);
        Animal bear = new Animal("Ursidae", "Ours", 7, true);

        // Ajout d'animaux dans zoo1
        zoo1.addAnimal(lion);
        zoo1.addAnimal(tiger);

        // Ajout d'animaux dans zoo2
        zoo2.addAnimal(bear);
        zoo2.addAnimal(new Animal("Felidae", "Panther", 3, true));
        zoo2.addAnimal(new Animal("Canidae", "Loup", 6, true));

        // Comparaison des deux zoos
        Zoo biggerZoo = Zoo.comparerZoo(zoo1, zoo2);

        // Affichage du zoo avec le plus d'animaux
        System.out.println("\nLe zoo avec le plus d'animaux est :");
        biggerZoo.displayZooInfo();
    }
}
