package src.main.com.agp.queue.AnimalShelter;
public class Dog extends Animal {
  public Dog(String n) {
    super(n);
  }

  public String name() {
    return "Dog: " + name;
  }
}