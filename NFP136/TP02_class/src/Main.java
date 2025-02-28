// import des classes
import heritage.Baleine;
import heritage.Chat;
import heritage.Poisson;

public class Main {

    public static void main(String args[]){

        // creation des instances chat / baleine / poisson
        Baleine mobydick = new Baleine("Baleine blanche", 30);
        Chat tyna = new Chat("Persan", 3);
        Poisson bubulle = new Poisson("Poisson rouge", 2);


        // == HERITAGE == 

        // Possibilité de faire naître / mourir et manger n'importe quel animal instancié ci dessus car chacune des classes partagent les méthodes de la classe mère "Animal"
        // Chacun des objets partagent les attributs de la classe Animal en plus des leurs
        mobydick.naitre();
        tyna.naitre();
        bubulle.naitre();

        System.out.println("mobydick est une " + mobydick.getRace());

        // == ENCAPSULATION ==

        // tester les attributs hérités et privé de la classe animal via un getter et "age"
        System.out.println("Tyna est une " + tyna.getRace());
        System.out.println("Tyna est agée de " + tyna.getAge() + " ans");
        System.out.println("Tyna grandit d'un an!");

        // Modifier l'age à l'aide d'un setter
        tyna.setAge(tyna.getAge() + 1);
        System.out.println("Tyna est maintenant agée de " + tyna.getAge() + " ans");

        // == POLYMORPHISME ==
        // l'objet bubulle est à la fois un animal (il peut manger) et un poisson: il peut nager

        bubulle.manger();
        bubulle.nager();

    }
    


}
