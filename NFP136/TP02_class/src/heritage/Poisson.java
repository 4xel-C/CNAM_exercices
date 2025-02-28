package heritage;

public class Poisson extends Animal{

    private int nbDeNageoires;

    public Poisson(String race, int age) {
        super(race, age);
        this.nbDeNageoires = 3;
    }

    public void nager()  {
        System.out.println("Le poisson nage...");
    }

    // getter
    public int getNbDeNageoires() {
        return this.nbDeNageoires;
    }
}
