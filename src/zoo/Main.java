package zoo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int a = 1;
        Animal animal = new Animal("cat", 1);
        Animal animal2 = new Animal("dog", 1);
        List<Animal> animalList = new ArrayList<>();
        animalList.add(animal);
        animalList.add(animal2);
        animal = new Animal("bird", 10);
    }
}
