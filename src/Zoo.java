public class Zoo {
    Animal[] animals;
    public String name;
    public String city;
    int nbrCages;


    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[nbrCages]; // Limite de 25 animaux
    }

    public void displayZoo() {
        System.out.println("Zoo Name: " + name + ", City: " + city + ", Number of Cages: " + nbrCages);
    }

    public String toString() {
        return "Zoo [name=" + name + ", city=" + city + ", nbrCages=" + nbrCages + "]";
    }
}