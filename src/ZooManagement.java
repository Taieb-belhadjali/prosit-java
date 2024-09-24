public class ZooManagement {
    public static void main(String[] args) {
        Animal lion = new Animal("Felidae", "Lion", 5, true);
        Zoo myZoo = new Zoo("Safari Park", "Paris", 15);

        myZoo.addAnimal(lion, 0);

        myZoo.displayZooInfo();
        lion.displayAnimalInfo();
    }
}
