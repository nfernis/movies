package model;

import java.util.*;

public class MovieCollection {
    private Map<String, Movie> movies; // Словарь для хранения фильмов

    // Конструктор
    public MovieCollection() {
        movies = new HashMap<>();
    }

    // Метод для добавления фильма
    public void addMovie(Movie movie) {
        if (!movies.containsKey(movie.getTitle())) {
            movies.put(movie.getTitle(), movie);
        } else {
            System.out.println("Фильм '" + movie.getTitle() + "' уже существует в коллекции.");
        }
    }

    // Метод для удаления фильма
    public void removeMovie(String title) {
        if (movies.containsKey(title)) {
            movies.remove(title);
        } else {
            System.out.println("Фильм '" + title + "' не найден в коллекции.");
        }
    }

    // Метод для поиска фильмов по критериям
    public Collection<Movie> searchMovies(String criteria) {
        Collection<Movie> results = new ArrayList<>();
        for (Movie movie : movies.values()) {
            if (movie.getTitle().toLowerCase().contains(criteria.toLowerCase()) ||
                    movie.getGenre().toLowerCase().contains(criteria.toLowerCase())) {
                results.add(movie);
            }
        }
        return results;
    }

    // Метод для отображения коллекции фильмов
    public void displayCollection() {
        Iterator<Map.Entry<String, Movie>> iterator = movies.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Movie> entry = iterator.next();
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public Map<String, Movie> getMovies() {
        return movies; // Возвращает словарь фильмов для итератора
    }
}
