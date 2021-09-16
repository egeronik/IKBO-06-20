package com.company;

public class Book   {
    private int numberOfPages;
    private String author;
    private String name;

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) throws Exception{
        if(numberOfPages<=0) throw new Exception("Неверное количество страниц");
        this.numberOfPages = numberOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) throws Exception{
        if(author.isEmpty()) throw new Exception("Неверный автор");
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception{
        if(name.isEmpty()) throw new Exception("Неверное имя");
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "numberOfPages=" + numberOfPages +
                ", author='" + author + '\'' +
                ", name='" + name + '\'' +
                '}';
    }


    public Book() {
    }
}
