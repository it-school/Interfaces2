package com.itschool;

import java.time.DateTimeException;
import java.util.Date;

public interface IItem
{
    double getInPrice();
    boolean setInPrice(double price);
    double getOutPrice();
    boolean setOutPrice(double price);
    Date getInDate();
    boolean setInDate(Date dateIn);
    Date getOutDate();
    boolean setOutDate(Date dateOut);
    int getTermInDays();
    boolean setTermInDays(int days);

}
