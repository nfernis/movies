package model;

import java.util.Iterator;
import java.util.Map;
import java.util.List;

public class MovieCollectionIterator implements Iterator<Movie> {
    private Iterator<Map.Entry<String, Movie>> iterator;

    // Конструктор, принимающий коллекцию фильмов
    public MovieCollectionIterator(MovieCollection movieCollection) {
        this.iterator = movieCollection.getMovies().entrySet().iterator();
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public Movie next() {
        return iterator.next().getValue(); // Возвращаем объект Movie
    }

    @Override
    public void remove() {
        iterator.remove(); // Удаляет текущий элемент из коллекции
    }
}