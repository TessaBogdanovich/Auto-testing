package org.example;

public class Main {
    public static void main(String[] args) {
        int winsBySticking = 0;
        int winsBySwitching = 0;

        for (int i = 0; i < 1000; i++) {
            MontyHallParadoxGame game = new MontyHallParadoxGame();
            game.chooseDoor((int) (Math.random() * 3) + 1);
            int goatDoor = game.openGoatDoor();

            if (!game.switchDoor()) {
                winsBySticking++;
            } else {
                winsBySwitching++;
            }
        }

        System.out.println("Wins by sticking: " + winsBySticking);
        System.out.println("Wins by switching: " + winsBySwitching);
    }
}
