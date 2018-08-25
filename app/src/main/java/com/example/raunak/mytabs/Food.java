package com.example.raunak.mytabs;

public class Food {

    private int image;
    private String dish_name, resturant;
    private String address;
    private String price;
    private String rating;

    public Food(int image, String dish_name, String resturant,String address, String price, String rating) {
        this.image = image;
        this.dish_name = dish_name;
        this.resturant = resturant;
        this.address=address;
        this.price = price;
        this.rating = rating;
    }

    public int getImage() {
        return image;
    }

    public String getDish_name() {
        return dish_name;
    }

    public String getResturant() {
        return resturant;
    }

    public String getAddress() {
        return address;
    }

    public String getPrice() {
        return price;
    }

    public String getRating() {
        return rating;
    }
}
