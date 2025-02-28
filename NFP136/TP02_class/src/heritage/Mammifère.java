package heritage;

public abstract class Mammifère extends Animal {
    
    public Mammifère(String race, int age) { 
        super(race, age);
    }

    public void boireduLait() {
        System.out.println("L'animal boit du lait");
    }
}
