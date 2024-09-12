import java.util.Scanner;
public class ZooManagement {
    /**public int nbrCages = 20;
     public String zooName = "my zoo";**/
    public int nbrCages=0;
    String zooName;
    public static void main(String[] args)
    {
        /**ZooManagement myzoo = new ZooManagement();
         System.out.println(myzoo.zooName +" Comporte "+ myzoo.nbrCages +" Cages");**/

        ZooManagement Z1 = new ZooManagement();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vous devez entrer le nombres des cages : ");
        Z1.nbrCages = scanner.nextInt();
        while(Z1.nbrCages<=0)
        {
            System.out.println("Vous devez entrer un nombre valide : ");
            Z1.nbrCages = scanner.nextInt();
        }

        scanner.nextLine();
        System.out.println("Vous devez entrer le nom du zoo : ");
        Z1.zooName = scanner.nextLine();
        while(Z1.zooName.isEmpty())
        {
            System.out.println("le nom du zoo ne doit pas etre vide! Enter un nom : ");
            Z1.zooName = scanner.nextLine();
        }
        System.out.println(Z1.zooName +" Comporte "+ Z1.nbrCages +" Cages");
    }

}
