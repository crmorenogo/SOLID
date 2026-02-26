void main() {

  Dog dog = new Dog();
  Cat cat = new Cat();
  Bird bird = new Bird();

  MakeTheAnimalSound(dog);
  MakeTheAnimalSound(cat);
  MakeTheAnimalSound(bird);

}

public static void MakeTheAnimalSound(Animal animal) {
  animal.makeSound();
}

public static void MakeTheAnimalFly(Flyable animal) {
    animal.fly();
}