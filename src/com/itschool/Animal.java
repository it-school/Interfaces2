package com.itschool;

public class Animal implements IAnimals {

    String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public EAnimalType getType() {
        return null;
    }

    @Override
    public boolean setType(EAnimalType animaltype) {
        return false;
    }

    @Override
    public String Voice() {
        return null;
    }
}
