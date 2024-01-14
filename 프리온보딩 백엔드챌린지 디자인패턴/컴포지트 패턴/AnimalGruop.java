import java.util.ArrayList;

public class AnimalGruop implements Animal {
    private ArrayList<Animal> animals = new ArrayList<>();

    public void add(Animal animal) {
        animals.add(animal);
    }

    @Override
    public void speak() {
        for(Animal animal : animals) {
            animal.speak();
        }
    }
}