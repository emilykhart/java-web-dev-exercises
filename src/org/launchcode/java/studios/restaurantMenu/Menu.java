package org.launchcode.java.studios.restaurantMenu;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class Menu {
        private ArrayList<MenuItem> menuItems = new ArrayList<>();


        private LocalDate lastupdated;

        public void addMenuItem(MenuItem item){
            this.menuItems.add(item);

        }

    public ArrayList<MenuItem> getMenuItems() {

            return menuItems;
    }

    public LocalDate getLastupdated() {

            return lastupdated; //allows to print
    }

    public void setLastupdated(){

            this.lastupdated = LocalDate.now(); //gets the time from my computer
    }
}


