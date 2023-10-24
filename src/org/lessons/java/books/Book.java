package org.lessons.java.books;

public class Book {
    private String title;
    private int numPages;
    private String author;
    private String publisher;

    public Book(String title, int numPages, String author, String publisher) {
        setTitle(title);
        setNumPages(numPages);
        setAuthor(author);
        setPublisher(publisher);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title != null && !title.isEmpty()) {
            this.title = title;
        } else {
            throw new IllegalArgumentException("Il titolo del libro non può essere vuoto.");
        }
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        if (numPages > 0) {
            this.numPages = numPages;
        } else {
            throw new IllegalArgumentException("Il numero di pagine deve essere maggiore di zero.");
        }
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author != null && !author.isEmpty()) {
            this.author = author;
        } else {
            throw new IllegalArgumentException("Il nome dell'autore non può essere vuoto.");
        }
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        if (publisher != null && !publisher.isEmpty()) {
            this.publisher = publisher;
        } else {
            throw new IllegalArgumentException("Il nome dell'editore non può essere vuoto.");
        }
    }
}
