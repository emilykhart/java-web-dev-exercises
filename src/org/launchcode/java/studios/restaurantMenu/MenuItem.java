package org.launchcode.java.studios.restaurantMenu;

public class MenuItem {

    private String name;
    private double price;
    private String description;
    private String category;
    private boolean newItem;

    public MenuItem(String name, double price, String description, String category, boolean newItem){
        this.name=name;
        this.price=price;
        this.description=description;
        this.category=category;
        this.newItem=newItem;

    }


}
