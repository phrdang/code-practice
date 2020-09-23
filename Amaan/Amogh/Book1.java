package Amogh;

public class Book1 {
    private String title;
    private String author;
    private String genre;
    private int numberOfPages;
    private double rating;

    public Book1(){
        title = "";
        author = "";
        genre = "";
        numberOfPages = 0;
        rating = 0;
    }

    private Book1(String title, String author, String genre, int numberOfPages, int rating){
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
        } else {
            System.out.println("Rating is not valid.");
        }
    }

    @Override
    public String toString() { return String.format("%s/%s/%s/%d/%f", title, author, genre, numberOfPages, rating); }
}
