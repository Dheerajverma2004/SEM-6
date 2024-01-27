/* JUET students create a game of ducks. There were Rubber Ducks (RD), Wooden Ducks
(WD), RedHead Ducks (RHD), and Lake Ducks (LD), as of now. There may be more in the
future. As it can be guessed, all ducks can swim. RD and WD can’t fly. RD squeaks. WD is
mute. RHD and LD quack. Design and Implement.
You might be tempted to make an abstract class ‘Duck’ by keeping fly and quack
behaviors abstract and swim behavior defined. Although this approach is not wrong, but
definitely not the best. Think and write some beautiful code using interfaces.
Hint: Separate out uncompromisers. */

interface Flyable {
    public void fly();
}

interface Quackable {
    public void quack();
}

interface Swimable {
    public void swim();
}

class RubberDuck implements Swimable {
    public void swim() {
        System.out.println("Rubber duck swimming");
    }
}

class WoodenDuck implements Swimable {
    public void swim() {
        System.out.println("Wooden duck swimming");
    }
}

class RedHeadDuck implements Flyable, Quackable, Swimable {
    public void fly() {
        System.out.println("Red head duck flying");
    }

    public void quack() {
        System.out.println("Red head duck quacking");
    }

    public void swim() {
        System.out.println("Red head duck swimming");
    }
}

class LakeDuck implements Flyable, Quackable, Swimable {
    public void fly() {
        System.out.println("Lake duck flying");
    }

    public void quack() {
        System.out.println("Lake duck quacking");
    }

    public void swim() {
        System.out.println("Lake duck swimming");
    }
}

public class DuckGame {
    public static void main(String[] args) {
        RubberDuck rubberDuck = new RubberDuck();
        WoodenDuck woodenDuck = new WoodenDuck();
        RedHeadDuck redHeadDuck = new RedHeadDuck();
        LakeDuck lakeDuck = new LakeDuck();

        rubberDuck.swim();
        woodenDuck.swim();
        redHeadDuck.fly();
        redHeadDuck.quack();
        redHeadDuck.swim();
        lakeDuck.fly();
        lakeDuck.quack();
        lakeDuck.swim();
    }
}

