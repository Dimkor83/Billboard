package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BillboardTest {

    @Test
    public void shouldRemoveExists() {
        Billboard board = new Billboard();
        int idToRemove = 1;
        Films first = new Films(1, "first");
        Films second = new Films(2, "second");
        Films third = new Films(3,"third");
        board.save(first);
        board.save(second);
        board.save(third);

        board.removeById(idToRemove);

        Films[] actual = board.findAll();
        Films[] expected = new Films[]{third, second};

        assertArrayEquals(expected, actual);
    }
}