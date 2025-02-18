package com.kodilla;

public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 1500, 2022);
        System.out.println(notebook.weight + " " + notebook.price + " " + notebook.productionYear);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkPriceAndProductionYear();

        Notebook heavyNotebook = new Notebook(2000, 3200, 2000);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price + " " + heavyNotebook.productionYear);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkPriceAndProductionYear();

        Notebook oldNotebook = new Notebook(1200, 720, 1995);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price + " " + oldNotebook.productionYear);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkPriceAndProductionYear();


        Notebook notebook1 = new Notebook(1800, 4500, 2023);
        System.out.println(notebook1.weight + " " + notebook1.price + " " + notebook1.productionYear);
        notebook1.checkPrice();
        notebook1.checkWeight();
        notebook1.checkPriceAndProductionYear();

        Notebook notebook2 = new Notebook(300, 3600, 2014);
        System.out.println(notebook2.weight + " " + notebook2.price + " " + notebook2.productionYear);
        notebook2.checkPrice();
        notebook2.checkWeight();
        notebook2.checkPriceAndProductionYear();

        Notebook notebook3 = new Notebook(1350, 280, 2025);
        System.out.println(notebook3.weight + " " + notebook3.price + " " + notebook3.productionYear);
        notebook3.checkPrice();
        notebook3.checkWeight();
        notebook3.checkPriceAndProductionYear();

        Notebook notebook4 = new Notebook(1900, 6500, 2024);
        System.out.println(notebook4.weight + " " + notebook4.price + " " + notebook4.productionYear);
        notebook4.checkPrice();
        notebook4.checkWeight();
        notebook4.checkPriceAndProductionYear();
    }
}