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
    //Satisfies the requirement for 2.85
    private int pages;
    //Satisfies the requirement for 2.88
    private String refNumber;
    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
    }
    
    // Add the methods here ...
    //Satisfies the requirement for 2.83
    /**
     * Returns authors name 
     */
    public String getAuthor()
    {
       return author; 
    }
    //Satisfies the requirement for 2.83
    /**
     * Returns the title of the book
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
    //Satisfies the requirement for 2.85
    /**
     * returns the amount of pages
     */
    public int getPages()
    {
        return pages;
    }
    //Satisfies the requirement for 2.87
    /**
     * Prints out all details of the book in the terminal 
     */
    public void printDetails()
    {
        System.out.println("Title - " + title);
        System.out.println("Author - " + author);
        System.out.println("Pages - " + pages);
    }
    //Satisfies the requirement for 2.88
    /**
     * Sets the reference number for this book
     */
    public void setrefNumber(String ref)
    {
        refNumber = ref;
    }
    /**
     * returns the refNumber
     */
    public String refNumber()
    {
        return refNumber;
    }
    
    
    
    
    
}
