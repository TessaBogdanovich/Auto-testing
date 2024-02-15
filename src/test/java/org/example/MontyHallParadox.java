package org.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class MontyHallParadoxGameTest {

    @Test
    public void testSwitchDoor() {
        MontyHallParadoxGame game = new MontyHallParadoxGame();
        game.chooseDoor(1);
        int goatDoor = game.openGoatDoor();
        game.chooseDoor(game.switchDoor() ? 3 : 2);

        assertTrue(game.switchDoor() == (game.carDoor != game.chosenDoor));
    }
}

