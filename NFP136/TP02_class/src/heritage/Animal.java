package heritage;

public abstract class Animal {
    private String race;
    private int age;

    public Animal(String race, int age){
        this.race = race;
        this.age = age;
    }

    public void naitre(){
        System.out.println("Naissance de l'animal");
    }

    public void mourir(){
        System.out.println("Décès de l'animal... :(");
    }

    public void manger(){
        System.out.println("L'animal se nourrit");
    }


    // Getters functions
    public String getRace(){
        return race;
    }

    public int getAge(){
        return age;
    }

    // Tester un setter pour l'âge
    public void setAge(int age){
        this.age = age;
    }
}
