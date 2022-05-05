package ru.netology.domain;

import ru.netology.domain.Films;

public class Billboard {
    private Films[] films = new Films[0];
    private int findLast = 10;

    public Billboard() {
    }

    public Billboard(int findLast) {
        this.findLast = findLast;
    }

    public void save(Films film) {
        int length = films.length + 1;
        Films[] tmp = new Films[length];
        System.arraycopy(films, 0, tmp, 0, films.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = film;
        films = tmp;
    }

    public Films[] findAll() {
        int resultLength;
        if (films.length < findLast) {
            resultLength = films.length;
        } else {
            resultLength = findLast;
        }
        Films[] result = new Films[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;
    }

    public void removeById(int id) {
        int length = films.length - 1;
        Films[] tmp = new Films[length];
        int index = 0;
        for (Films item : films) {
            if (item.getId() != id) {
                tmp[index] = item;
                index++;
            }
        }
        films = tmp;
    }
}