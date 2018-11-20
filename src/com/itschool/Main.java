package com.itschool;

public class Main {

    public static void main(String[] args) {
        ZooItem zooItems = new ZooItem();
        try {
            if (zooItems.setType(EAnimalType.valueOf("predtor")) == true)
                System.out.println(zooItems.getType());
            else
                System.out.println("Error happend: " + zooItems.errors);
        }
        catch (Exception e) {}
    }
}
