package org.example;

/**
 * Hello world!
 *
 */
public class MontyHallParadoxGame {
    private int carDoor;
    private int chosenDoor;

    public MontyHallParadoxGame() {
        carDoor = (int) (Math.random() * 3) + 1;
    }

    public void chooseDoor(int door) {
        chosenDoor = door;
    }

    public int openGoatDoor() {
        for (int i = 1; i <= 3; i++) {
            if (i != carDoor && i != chosenDoor) {
                return i;
            }
        }
        return -1; // Should never reach here
    }

    public boolean switchDoor() {
        return chosenDoor != carDoor;
    }
}

