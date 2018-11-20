package com.itschool;

import java.util.Arrays;
import java.util.Date;

public class ZooItem implements IAnimalItem {
    int [] errors;

    private String title;
    EAnimalType type;

    public ZooItem() {
        errors = new int[Constants.fields];
    }


    @Override
    public String Voice() {
        return null;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public EAnimalType getType() {
        return this.type;
    }

    @Override
    public boolean setType(EAnimalType animaltype) {
        boolean result = false;

        try {
         this.type = animaltype;
         result = true;
        }
        catch (Exception exc)
        {
            this.errors[6] = 1;
        }

        return result;
    }

    @Override
    public double getInPrice() {
        return 0;
    }

    @Override
    public boolean setInPrice(double price) {
        return false;
    }

    @Override
    public double getOutPrice() {
        return 0;
    }

    @Override
    public boolean setOutPrice(double price) {
        return false;
    }

    @Override
    public Date getInDate() {
        return null;
    }

    @Override
    public boolean setInDate(Date dateIn) {
        return false;
    }

    @Override
    public Date getOutDate() {
        return null;
    }

    @Override
    public boolean setOutDate(Date dateOut) {
        return false;
    }

    @Override
    public int getTermInDays() {
        return 0;
    }

    @Override
    public boolean setTermInDays(int days) {
        return false;
    }
}
