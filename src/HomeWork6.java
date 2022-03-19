public class HomeWork6 {
    public static void main(String[] args) {

        Animal animal = new Animal("Cats");
        Cat cat = new Cat("Cake ", 200, false);
        animal.animalInfo();
        cat.animalInfo();
        cat.catInfo();

        Animal doganimal = new Animal("Dogs");
        Dog dog = new Dog("Jake ", 500, 10);
        doganimal.animalInfo();
        dog.animalInfo();
        dog.dogInfo();
    }
}
