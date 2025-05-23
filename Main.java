import model.Movie;
import model.MovieCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        MovieCollection movieCollection = new MovieCollection();
        Scanner scanner = new Scanner(System.in);
        String command;
        String title;
        while (true) {
            System.out.println("Введите команду (add, remove, search, display, exit): ");
            command = scanner.nextLine().trim().toLowerCase();

            switch (command) {
                case "add":
                    // Добавление фильма
                    System.out.println("Введите название фильма: ");
                    title = scanner.nextLine();

                    System.out.println("Введите жанр: ");
                    String genre = scanner.nextLine();

                    System.out.println("Введите год выпуска: ");
                    int year = Integer.parseInt(scanner.nextLine());

                    System.out.println("Введите режиссера: ");
                    String director = scanner.nextLine();

                    System.out.println("Введите длительность: ");
                    int duration = Integer.parseInt(scanner.nextLine());

                    System.out.println("Введите рейтинг: ");
                    double rating = Double.parseDouble(scanner.nextLine());

                    System.out.println("Введите описание: ");
                    String description = scanner.nextLine();

                    Movie movie = new Movie(title, genre, year, director,
                            new ArrayList<>(), duration, rating, description);
                    movieCollection.addMovie(movie);
                    break;

                case "remove":
                    // Удаление фильма
                    System.out.println("Введите название фильма для удаления: ");
                    title = scanner.nextLine();
                    movieCollection.removeMovie(title);
                    break;

                case "search":
                    // Поиск фильмов
                    System.out.println("Введите критерий для поиска: ");
                    String criteria = scanner.nextLine();
                    Collection<Movie> results = movieCollection.searchMovies(criteria);
                    for (Movie m : results) {
                        System.out.println(m);
                    }
                    break;

                case "display":
                    // Отображение всех фильмов
                    movieCollection.displayCollection();
                    break;

                case "exit":
                    // Выход из программы
                    System.out.println("Выход из программы.");
                    scanner.close();
                    return; // Выход из метода main

                default:
                    System.out.println("Неизвестная команда. Пожалуйста, повторите попытку.");
            }
        }
    }
}

