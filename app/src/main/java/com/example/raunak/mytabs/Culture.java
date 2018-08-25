package com.example.raunak.mytabs;

public class Culture {

    private int image;
    private String culture_name, description;



    public Culture(int image, String dish_name, String resturant) {
        this.image = image;
        this.culture_name = dish_name;
        this.description = resturant;
    }

    public int getImage() {
        return image;
    }

    public String getCulture_name() {
        return culture_name;
    }

    public String getDescription() {
        return description;
    }
}
