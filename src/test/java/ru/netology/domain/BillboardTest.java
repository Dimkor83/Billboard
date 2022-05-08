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


        board.save(first);
        board.save(second);
        board.save(third);
        board.save(fourth);
        board.save(fifth);
        board.save(sixth);

        Films[] expected = new Films[]{sixth, fifth, fourth, third, second};
        Films[] actual = board.findAll();
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


        board.save(first);
        board.save(second);
        board.save(third);
        board.save(fourth);
        board.save(fifth);
        board.save(sixth);

        Films[] expected = new Films[]{sixth, fifth, fourth};
        Films[] actual = board.findLast();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void findAll() {
        Billboard board = new Billboard();
        Films first = new Films(1, "first");
        Films third = new Films(3, "third");
        Films fourth = new Films(4, "fourth");
        Films sixth = new Films(6, "sixth");


        board.save(first);
        board.save(third);
        board.save(fourth);
        board.save(sixth);

        Films[] expected = {first, third, fourth, sixth};
        Films[] actual = board.findAll();
        assertArrayEquals(expected, actual);
    }
}