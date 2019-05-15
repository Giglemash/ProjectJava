package main;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> words = Arrays.asList(
                "Decidueye",
                "Incineroar",
                "Primarina",
                "Bulbasaur",
                "Charizard",
                "Squirtle",
                "Butterfree",
                "Beedrill",
                "Pikachu",
                "Bulbasaur",
                "Alakazam",
                "Meowth",
                "Meowth",
                "Nidoking",
                "Nidoqueen",
                "Pikachu",
                "Bulbasaur",
                "DetectivePikachu",
                "Pikachu",
                "Meowth");
        Set<String> unique = new HashSet<String>(words);
        System.out.println("Уникальные слова");
        System.out.println(unique.toString());
        System.out.println("Частота встречаемости слов");
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(words, key));
        }
    }
}




