package com.company;

public class Client {

    public static void main(String[] args) {
        MallarDuck duck = new MallarDuck();

        WildTurkey turkey =  new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        turkey.gobble();
        turkey.fly();

        testDuck(duck);

        testDuck(turkeyAdapter);

    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
