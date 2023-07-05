public class Cat extends Animal {
    private double weight;
    public Cat(){}

    public Cat(String name, String nickname, double weight) {
        super(name, nickname);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public String chonk() {
        String chonk = "";
        if (getWeight() > 5) {
            return"I'm a chonk!";
        } else {
            return"I'm not a chonk!";
        }
    }
    public String animalSound(){
        return "Meow";
    }

    @Override
    public String toString() {
        return "{" +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +", weight='" + chonk() + '\''+ ", sound='" + animalSound()+ '\''+
                '}';
    }
}
