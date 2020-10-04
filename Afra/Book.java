public class Book {
    /*
    Create a class called Book with 5 private fields:
title (String), author (String), genre (String),
numberOfPages (int), and rating (a double from 0 to 5).
Create a default constructor and a 5-argument constructor.
Create getters and setters for all of the fields.
Bonus points if you write Javadoc comments for each of the methods!
     */
    private String title;
    private String author;
    private String genre;
    private int numberOfPages;
    private double rating;

    public Book(){
        title = "Magyk";
        author = "Angie Sage";
        genre = "fantasy";
        numberOfPages = 350;
        rating = 5;
    }

    public Book(String title, String author, String genre, int numberOfPages, double rating){
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.numberOfPages = numberOfPages;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        if (rating >= 0 && rating <= 5){
            this.rating = rating;
        }
    }
}
