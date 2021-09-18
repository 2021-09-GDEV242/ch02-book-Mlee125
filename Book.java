/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle)
    {
        author = bookAuthor;
        title = bookTitle;
    }
    
    // Add the methods here ...
    //Satisfies the requirement for 2.83
    /**
     * Prints out the authors name 
     */
    public String getAuthor()
    {
       return author; 
    }
    //Satisfies the requirement for 2.83
    /**
     * Prints out the title of the book
     */
    public String getTitle()
    {
        return title;
    }
    //Satisfies the requirement for 2.84
    /**
     * Prints out the authors name in the terminal
     */
    public void printAuthor()
    {
        System.out.println("The author of this book is " + author);
    }
    //Satisfies the requirement for 2.84
    /**
     * Prints out the title of the book in the terminal
     */
    public void printTitle()
    {
        System.out.println("The title of this book is " + title);
    }
    
    
    
    
    
    
    
    
}
