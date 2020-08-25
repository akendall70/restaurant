package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> menuItems;
    private Date lastUpdated;

    Menu() {
        this.menuItems = new ArrayList<>();
        this.lastUpdated = new Date();
    }



}