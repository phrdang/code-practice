/*Create a class called Book with 5 private fields:
        title (String), author (String), genre (String),
        numberOfPages (int), and rating (a double from 0 to 5).
        Create a default constructor and a 5-argument constructor.
        Create getters and setters for all of the fields.
        Bonus points if you write Javadoc comments for each of the methods!

*/

public class Book {
    private String title;
    private String author;
    private String genre;
    private int numberOfPages;
    private double rating;

    public Book(){
        title = "Hogwarts: A History";
        author = "Bathilda Bagshot";
        genre = "terribly boring but surprisingly informative (nonfiction)";
        numberOfPages = 349;
        rating = 2.487;
    }

    public Book(String newTitle, String newAuthor, String newGenre, int newNumberOfPages, double newRating){
        title = newTitle;
        author = newAuthor;
        genre = newGenre;
        numberOfPages = newNumberOfPages;
        rating = newRating;
    }

    public void setTitle(String newTitle){
        title = newTitle;
    }

    public void setAuthor(String newAuthor){
        author = newAuthor;
    }

    public void setGenre(String newGenre){
        genre = newGenre;
    }

    public void setNumberOfPages(int newNumberOfPages){
        numberOfPages = newNumberOfPages;
    }

    public void setRating(double newRating){
        if (rating <= 5 && rating >= 0)
          rating = newRating;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public String getGenre(){
        return genre;
    }

    public int getNumberOfPages(){
        return numberOfPages;
    }

    public double getRating(){
        return rating;
    }

    public String toString(){
        return("Title: " + title + /n"Author: " + author +/n"Genre: " + genre + /n"Number of Pages: " + numberOfPages + /n"Rating: " + rating);
    }
}