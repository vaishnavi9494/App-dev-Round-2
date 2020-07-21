package com.example.myapplication;

public class listItem {
    private String head;
    private String des;
    private String cost;
    private String book;
    private int imageResource;

    public listItem(String head, String des, String cost, String book, int imageResource) {
        this.head = head;
        this.des = des;
        this.cost = cost;
        this.book = book;
        this.imageResource = imageResource;
    }

    public String getBook() {
        return book;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getCost() {
        return cost;
    }

    public String getHead() {
        return head;
    }

    public String getDes() {
        return des;
    }


}
