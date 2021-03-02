package ru.jegensomme.main;

import ru.jegensomme.humans;

public class Main {
    
    public static void main(String[] args) {
        for (String arg : args) {
            Human human = new Human(arg);
            System.out.println(human);
        }
    }
}
