public class Dog extends Animal{
    private boolean goodBoy;
    public Dog(){}

    public Dog(String name, String nickname, boolean goodBoy) {
        super(name, nickname);
        this.goodBoy = goodBoy;
    }

    public boolean isGoodBoy() {
        return goodBoy;
    }

    public void setGoodBoy(boolean goodBoy) {
        this.goodBoy = goodBoy;
    }

    public String goodBoyOrNot(){
        if(goodBoy){
            return "I am a good boy!";
        }
        else{
            return "I am not a good boy!";
        }
    }

    @Override
    public String animalSound() {
        return "Woof";
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +", goodBoy='" + goodBoyOrNot() + '\''+ ", sound='"+animalSound()+ '\''+
                '}';
    }
}
