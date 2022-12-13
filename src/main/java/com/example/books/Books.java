package com.example.books;

public class Books {
    private String name;
    private int volume ;
    private String author;

    public Books() {
    }

    public Books(String name, int volume, String author) {
        this.name = name;
        this.volume = volume;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
