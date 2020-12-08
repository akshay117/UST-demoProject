package com.oopecom;

public class Laptop implements  Comparable<Laptop> {
    private String title;
    private String Brand;
    private int price;
    private int rating;

    public Laptop(String title, String brand, int price, int rating) {
        this.title = title;
        Brand = brand;
        this.price = price;
        this.rating = rating;
    }

    public Laptop() {

    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public String getBrand() {
        return Brand;
    }

    public int getPrice() {
        return price;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public int compareTo(Laptop o) {
        return 0;
    }
}
