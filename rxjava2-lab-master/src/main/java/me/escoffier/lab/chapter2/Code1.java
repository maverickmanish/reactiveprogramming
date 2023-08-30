package me.escoffier.lab.chapter2;


import io.reactivex.Observable;

import java.util.Arrays;
import java.util.List;

public class Code1 {

    private static List<String> SUPER_HEROES = Arrays.asList(
        "Superman",
        "Batman",
        "Aquaman",
        "Asterix",
        "Captain America"
    );

    public static void main(String... args) {
        Observable.fromIterable(SUPER_HEROES)
            .doOnNext(i-> System.out.println("Next >> "+i))
            .doOnComplete(()->System.out.println("Completion"))
            .subscribe();
    }
}
