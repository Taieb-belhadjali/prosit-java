public class Zoo {
    Animal[] animals = new Animal[25];
    String name;
    String city;
    int nbrCages;
    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }
    public void addAnimal(Animal animal, int index) {
        if (index < 25) {
            animals[index] = animal;
        } else {
            System.out.println("Impossible d'ajouter plus de 25 animaux.");
        }
    }
    public void displayZooInfo() {
        System.out.println("Nom du zoo: " + name);
        System.out.println("Ville: " + city);
        System.out.println("Nombre de cages: " + nbrCages);
    }
}
