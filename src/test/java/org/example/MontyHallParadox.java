package org.example;

import static org.junit.Assert.*;
import org.junit.Test;

//у Вас наименование класса не совпадает с наименование самого файла
public class MontyHallParadoxGameTest {

    @Test
    public void testSwitchDoor() {
        MontyHallParadoxGame game = new MontyHallParadoxGame();
        game.chooseDoor(1);
        int goatDoor = game.openGoatDoor();
        game.chooseDoor(game.switchDoor() ? 3 : 2);

        //у Вас carDoor и chosenDoor - приватные члены класса MontyHallParadoxGame и не доступны извне
        assertTrue(game.switchDoor() == (game.carDoor != game.chosenDoor));
    }
}

