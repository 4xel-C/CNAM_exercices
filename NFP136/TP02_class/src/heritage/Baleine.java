package heritage;

public class Baleine extends Mammifère {

    private int nbDeNageoires;

    public Baleine(String race, int age){
        super(race, age);
        this.nbDeNageoires = 3;
    }

    public void nager() {
        System.out.println("La baleine nage...");
    }
    
    // getter
    public int getNbDeNageoires() {
        return this.nbDeNageoires;
    }
}
