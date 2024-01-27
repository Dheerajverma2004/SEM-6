/* With reference to the 1.java, if you call hear() before prepareVoice() or only
call hear() but no prepareVoice(), the program will not work as expected. So you may
want to enforce some way on users to use your program. One way to do so is by
creating another method inside Voice that will call the methods in required sequence.
Write another class Voice2 having a templateMethod() to call the required procedures
in sequence. */

package AP.LAB2;

/* class Animal {
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
 */

 public class Voice2 {
    public void templateMethod() {
        prepareVoice();
        hear();
    }
}