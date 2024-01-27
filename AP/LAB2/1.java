/* Make a java class ‘Voice’. Inside this class, create a method prepareVoice(). This method
will have an array of type ‘Animal’. The size of the array should be 5. Create five objects:
cow, dog, pig, goat and lion, and assign them as the array elements. Make another
method hear(). This method will contain a loop that will display different voices on your
terminal. Make another class called ‘Test’ where you will test your system of classes.
This means that Test will contain main method, and therefore, it will be an executable
class. */

class Animal {
    public void makeSound() {
        System.out.println("Animal sound");
    }
}

public class Voice {
    public void prepareVoice() {
        Animal[] animals = new Animal[5];
        animals[0] = new Cow();
        animals[1] = new Dog();
        animals[2] = new Pig();
        animals[3] = new Goat();
        animals[4] = new Lion();
    }

    public void hear() {
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}


public class Test {
    public static void main(String[] args) {
        Voice voice = new Voice();
        voice.prepareVoice();
        voice.hear();
    }
}
