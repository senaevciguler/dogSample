public class Dog {
    private String name;
    private int age;
    Gender gender;
    private double race;
    private double weight;

    public Dog(String name, int age, Gender gender, double race, double weight) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.race = race;
        this.weight = weight;
    }

    public Dog(Gender gender, double race) {
        this.gender = gender;
        this.race = race;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight(double weight) {
        return weight;
    }

    public double setWeight(double weights){

        return weights;
    }

    public double getRace(double race) {
        return race;
    }

    public void setRace(double race) {
        this.race = race;
    }
}
