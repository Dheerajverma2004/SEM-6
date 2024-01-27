/* There were Pandavs and Kauravs. Arjun and Bheem were Pandavs. Duryodhan was a
Kaurav. Pandavs were characterized by their skills of fighting (fight ( )), obedience (obey
( )), and kindness (kind ( )). [Note: kind is an adjective not a verb, so it should not be
used a function, but let us bear with it for this problem] Though Bheem was little less
kind but equally obedient as Arjun. Kauravs were notorious for disobeying and cruelty.
But Kauravs were fighters. Kauravs were 100 in numbers, but one of them ‘Vikarn’ was a
noble man- a good fighter, kind and obedient. If you dive a little more in the history, you
will come to know that Pandavs and Kauravs were actually Bharatvanshi. And all
bharatvanshis had been fighters.
You are required to create a design first on paper and then write implementation on
your machine. Make abstract classes and concrete classes. Decide which methods
should be made abstract or non-abstract.  */

package AP.LAB2;

abstract class Bharatvanshi {
    public abstract void fight();
}

abstract class Pandav extends Bharatvanshi {
    public void obey() {
        System.out.println("Obeying");
    }

    public void kind() {
        System.out.println("Kind");
    }
}

abstract class Kaurav extends Bharatvanshi {
    public void disobey() {
        System.out.println("Disobeying");
    }

    public void cruel() {
        System.out.println("Cruel");
    }
}

class Arjun extends Pandav {
    public void fight() {
        System.out.println("Fighting");
    }
}

class Bheem extends Pandav {
    public void fight() {
        System.out.println("Fighting");
    }
}

class Duryodhan extends Kaurav {
    public void fight() {
        System.out.println("Fighting");
    }
}

class Vikarn extends Kaurav {
    public void fight() {
        System.out.println("Fighting");
    }
}

public class BharatvanshiTest {
    public static void main(String[] args) {
        Arjun arjun = new Arjun();
        Bheem bheem = new Bheem();
        Duryodhan duryodhan = new Duryodhan();
        Vikarn vikarn = new Vikarn();

        arjun.fight();
        arjun.obey();
        arjun.kind();

        bheem.fight();
        bheem.obey();
        bheem.kind();

        duryodhan.fight();
        duryodhan.disobey();
        duryodhan.cruel();

        vikarn.fight();
        vikarn.disobey();
        vikarn.cruel();
    }
}

