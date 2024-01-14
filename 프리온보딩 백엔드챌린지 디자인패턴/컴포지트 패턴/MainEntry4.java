public class MainEntry4 {
    public static void main(String[] args) {
        AnimalGruop catGroup = new AnimalGruop();
        catGroup.add(new Cat());
        catGroup.add(new Cat());
        catGroup.add(new Cat());

        AnimalGruop dogGroup = new AnimalGruop();
        dogGroup.add(new Dog());
        dogGroup.add(new Dog());
        dogGroup.add(new Dog());

        AnimalGruop zoo = new AnimalGruop();
        zoo.add(catGroup);
        zoo.add(dogGroup);

        zoo.speak();
    }
}