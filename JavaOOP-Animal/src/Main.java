import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Mickey","Doggie",true);
        Dog dog2 = new Dog("Rolly","Ro",false);
        Cat cat1 = new Cat("Milic", "Mica", 6);
        Cat cat2 = new Cat("Zoran","Zoki",7);
        Cat cat3 = new Cat("Petra","Pekica",4);
        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(dog1);
        animalList.add(dog2);
        animalList.add(cat1);
        animalList.add(cat2);
        animalList.add(cat3);
        for(int i = 0; i<animalList.size(); i++){
            Animal animal=animalList.get(i);
            if(animal instanceof Cat){
                System.out.println("cat: " + animal.toString());
            }
            else{
                System.out.println("dog: " + animal.toString());
            }
        }
    }
}