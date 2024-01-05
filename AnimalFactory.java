public class AnimalFactory {
    public Animal getAnimal(String type){
        if ("caine".equals(type)){
            return new Dog();
        }else {
            return new Cat();
        }
    }
}
