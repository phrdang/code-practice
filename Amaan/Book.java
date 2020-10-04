package Amaan;

public class Book {
    private String title;
    private String author;
    private String genre;
    private int numberOfPages;
    private double rating;

    public Book() {
        this.title = "Artemis Fowl: The Eternity Code";
        this.author = "Eoin Colfer";
        this.genre = "Science Fiction";
        this.numberOfPages = 352;
    }

    public Book(String title, String author, String genre, int numberOfPages, double rating) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.numberOfPages = numberOfPages;
        this.rating = rating;
    }

    /**
     * @return the title of the book
     * */
    public String getTitle() {
        return title;
    }

    /**
    * @param title sets title of book
    * */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the author of the book
     * */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author sets author of book
     * */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * @return the genre of the book
     * */
    public String getGenre() {
        return genre;
    }

    /**
     * @param genre sets genre of book
     * */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * @return the number of pages in the book
     * */
    public int getNumberOfPages() {
        return numberOfPages;
    }

    /**
     * @param numberOfPages sets the number of pages in the book
     * */
    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    /**
     * @return the rating of the book (between 0 and 5)
     * */
    public double getRating() {
        return rating;
    }

    /**
     * @param rating sets the rating of the book.
     *               If it is above 5 or below 0,
     *               it exits out of the function.
     * */
    public void setRating(double rating) {
        if (rating < 0 || rating > 5) {
            return;
        }
        this.rating = rating;
    }
}
