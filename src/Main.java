public class Main {
    public static void main(String[] args) {

        Animal lion = new Animal("Simba", "Leo", 5, true);


        Zoo myZoo = new Zoo("Belvedaire", "Tunis", 25);


        myZoo.animals[0] = lion;


        myZoo.displayZoo();


        System.out.println(myZoo);
        System.out.println(myZoo.toString());

        System.out.println(lion);
    }
}
