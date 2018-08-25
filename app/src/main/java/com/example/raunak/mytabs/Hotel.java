package com.example.raunak.mytabs;

public class Hotel {

    private int image;
    private String hotelname;
    private String star;
    private String address;
    private String price;
    private int rate;

    public Hotel(int image, String hotelname, String star, String address, String price, int rate) {
        this.image = image;
        this.hotelname = hotelname;
        this.star = star;
        this.address = address;
        this.price = price;
        this.rate = rate;
    }

    public int getImage() {
        return image;
    }

    public String getHotelname() {
        return hotelname;
    }

    public String getStar() {
        return star;
    }

    public int getRate() {
        return rate;
    }

    public String getAddress() {
        return address;

    }

    public String getPrice() {
        return price;
    }
}
