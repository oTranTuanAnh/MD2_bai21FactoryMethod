public class Main {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();
        Animal a1 = animalFactory.getAnimal("feline");
        System.out.println(a1.makeSound());
        Animal a2 = animalFactory.getAnimal("caine");
        System.out.println(a2.makeSound());
    }
}
