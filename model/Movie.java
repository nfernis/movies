package model;
import java.util.List;

public class Movie {
    private String title;//название
    private String genre;//жанр
    private int year;//год выпуска
    private String director;//режиссер
    private List<String> cast;//список актеров
    private int duration; // длительность в минутах
    private double rating; //рейтинг например, от 1.0 до 10.0
    private String description;//краткое описание

    public Movie(String title, String genre, int year, String director, List<String> cast, int duration, double rating, String description) {
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.director = director;
        this.cast = cast;
        this.duration = duration;
        this.rating = rating;
        this.description = description;
    }

    public String getTitle() { return title; }
    public String getGenre() { return genre; }
    public int getYear() { return year; }
    public String getDirector() { return director; }
    public List<String> getCast() { return cast; }
    public int getDuration() { return duration; }
    public double getRating() { return rating; }
    public String getDescription() { return description; }
    public void setRating(double rating) {this.rating = rating;} // Устанавливает новый рейтинг фильма
    public void addCastMember(String actor) {cast.add(actor);}
    public void removeCastMember(String actor) {cast.remove(actor);}

    @Override
    public String toString() {
        return title + " (" + year + ") - Genre: " + genre + ", Director: " + director + ", Rating: " + rating;
    }
}
