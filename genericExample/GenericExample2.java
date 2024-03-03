package genericExample;

import java.util.ArrayList;
import java.util.List;

class Book{
    private String title;
    private String author;
    private boolean isPublished = false;

    public Book(String title, String author, boolean isPublished){
        this.title = title;
        this.author = author;
        this.isPublished = isPublished;
    }

    public String getAuthor(){
        return this.author;
    }

    public boolean publishedStatus(){
        return this.isPublished;
    }
}

public class GenericExample2 {


    public static void main(String[] args){
        Book book1 = new Book("laws of power","paul", true);
        Book book2 = new Book("Financial matters","John doe", false);
        List<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);

        System.out.println(bookList.get(0).getAuthor());
    } 
    
}
