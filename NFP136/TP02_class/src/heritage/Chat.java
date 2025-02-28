package heritage;

public class Chat extends Mammifère{

    private int nbDePattes;

    public Chat(String name, int age) {
        super(name, age);
        this.nbDePattes = 4;
    }

    public void ronronner() {
        System.out.println("Puuur....");
    }

    // getter
    public int getNbDePattes() {
        return this.nbDePattes;
    }
}
