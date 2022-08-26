package org.launchcode.java.studios.restaurantMenu;

public class Restaurant {
    public static void main(String[] args) {

        MenuItem gyoza = new MenuItem("gyoza", 4.95, "delicious steamed pillow pockets of love", "appetizer", false);
        MenuItem phillyRoll = new MenuItem("Philadelphia Roll", 8.95, "Salmon with Cream Cheese", "Maki", true);
        MenuItem sweetStickyRice = new MenuItem("Sweet Sticky Rice", 6.75, "Sticky rice with coconut milk and egg custard", "Dessert", true);

        Menu sushiMenu = new Menu();
        sushiMenu.addMenuItem(gyoza);
        sushiMenu.addMenuItem(phillyRoll);
        sushiMenu.addMenuItem(sweetStickyRice);



        for (MenuItem item: sushiMenu.getMenuItems()){
            System.out.println(item.getName());
        }

        sushiMenu.setLastupdated();
        System.out.println(sushiMenu.getLastupdated());

    }
}
