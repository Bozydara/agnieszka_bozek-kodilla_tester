package com.kodilla;

public class Notebook {
    int weight;
    int price;
    int productionYear;

    public Notebook(int weight, int price, int productionYear) {
        this.weight = weight;
        this.price = price;
        this.productionYear = productionYear;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price < 1000) {
            System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is expensive.");
        }
    }

    public void checkWeight() {
        if (this.weight < 500) {
            System.out.println("This notebook is light.");
        } else if (this.weight < 2000) {
            System.out.println("This notebook is not too heavy.");
        } else {
            System.out.println("This notebook is very heavy!");
        }
    }

    public void checkPriceAndProductionYear() {
        if (this.price < 500 && this.productionYear > 2023) {
            System.out.println("Watch out! This notebook may have many defects or come from the black market.");
        } else if (this.price > 1000 && this.price < 3000 && this.productionYear > 2020) {
            System.out.println("This is an offer worth to considering.");
        }else if (this.price > 3000 && this.price < 5000 && this.productionYear > 2022) {
            System.out.println("It will be money well spent.");
        } else if (this.price > 5000 && this.productionYear > 2023) {
            System.out.println("Looking for a very great notebook, aren't you?");
        } else {
            System.out.println("Not worth buying such a notebook. Unless you are a collector ;)");
        }
    }
}