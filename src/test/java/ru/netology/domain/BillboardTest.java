package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BillboardTest {

    @Test
    public void findLast() {
        Billboard board = new Billboard();
        Films first = new Films(1, "first");
        Films second = new Films(2, "second");
        Films third = new Films(3, "third");
        Films fourth = new Films(4, "fourth");
        Films fifth = new Films(5, "fifth");
        Films sixth = new Films(6, "sixth");
        Films seventh = new Films(7, "seventh");
        Films eighth = new Films(8, "eighth");
        Films ninth = new Films(9, "ninth");
        Films tenth = new Films(10, "tenth");
        Films eleventh = new Films(11, "eleventh");
        Films twelfth = new Films(12, "twelfth");


        board.save(first);
        board.save(second);
        board.save(third);
        board.save(fourth);
        board.save(fifth);
        board.save(sixth);
        board.save(seventh);
        board.save(eighth);
        board.save(ninth);
        board.save(tenth);
        board.save(eleventh);
        board.save(twelfth);

        Films[] expected = new Films[]{twelfth, eleventh,tenth, ninth, eighth};
        Films[] actual = board.findLast();
        assertArrayEquals(expected, actual);

    }

    @Test
    public void findLast1() {
        Billboard board = new Billboard(3);
        Films first = new Films(1, "first");
        Films second = new Films(2, "second");
        Films third = new Films(3, "third");
        Films fourth = new Films(4, "fourth");
        Films fifth = new Films(5, "fifth");
        Films sixth = new Films(6, "sixth");
        Films seventh = new Films(7, "seventh");
        Films eighth = new Films(8, "eighth");
        Films ninth = new Films(9, "ninth");
        Films tenth = new Films(10, "tenth");
        Films eleventh = new Films(11, "eleventh");
        Films twelfth = new Films(12, "twelfth");


        board.save(first);
        board.save(second);
        board.save(third);
        board.save(fourth);
        board.save(fifth);
        board.save(sixth);
        board.save(seventh);
        board.save(eighth);
        board.save(ninth);
        board.save(tenth);
        board.save(eleventh);
        board.save(twelfth);

        Films[] expected = new Films[]{twelfth, eleventh,tenth};
        Films[] actual = board.findLast();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void findAll() {
        Billboard board = new Billboard();
        Films first = new Films(1, "first");
        Films second = new Films(2, "second");
        Films third = new Films(3, "third");
        Films fourth = new Films(4, "fourth");
        Films fifth = new Films(5, "fifth");
        Films sixth = new Films(6, "sixth");
        Films seventh = new Films(7, "seventh");
        Films eighth = new Films(8, "eighth");
        Films ninth = new Films(9, "ninth");
        Films tenth = new Films(10, "tenth");
        Films eleventh = new Films(11, "eleventh");
        Films twelfth = new Films(12, "twelfth");


        board.save(first);
        board.save(second);
        board.save(third);
        board.save(fourth);
        board.save(fifth);
        board.save(sixth);
        board.save(seventh);
        board.save(eighth);
        board.save(ninth);
        board.save(tenth);
        board.save(eleventh);
        board.save(twelfth);

        Films[] expected = {first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh, twelfth};
        Films[] actual = board.findAll();
        assertArrayEquals(expected, actual);
    }
}