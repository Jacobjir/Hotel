package com.engeto.hotel;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Guest adelaMalikova = new Guest("Adéla", "Malíková", LocalDate.of(1993,3,13));
        Guest janDvoracek = new Guest("Jan","Dvořáček",LocalDate.of(1995,5,5));

        // Původně jsem to měl takto, ale myslím si, že je určitě lepší použít List
        // System.out.println("Information about guests: " + adelaMalikova.getDescription() + "; " + janDvoracek.getDescription());

        List<Guest> guestList = new ArrayList<>();

        guestList.add(adelaMalikova);
        guestList.add(janDvoracek);


        System.out.println("Available information about guests: " + guestList);


        Room room1 = new Room(1,1,true,true, BigDecimal.valueOf(1000));
        Room room2 = new Room(2,1,true,true,BigDecimal.valueOf(1000));
        Room room3 = new Room(3,3,false,true,BigDecimal.valueOf(2400));

        Booking booking1 = new Booking(1,(adelaMalikova.getFirstName() + " " + adelaMalikova.getSurname()),
                LocalDate.of(2021,7,19),LocalDate.of(2021,7,26));
        Booking booking2 = new Booking(3,(adelaMalikova.getFirstName() + " " + adelaMalikova.getSurname() + " and " + janDvoracek.getFirstName() + " " + janDvoracek.getSurname()),
                LocalDate.of(2021,9,3),LocalDate.of(2021,9,14));

        List<Booking> bookingList = new ArrayList<>();

        bookingList.add(booking1);
        bookingList.add(booking2);

        System.out.println("List of all bookings:");

        int i = 1;
        for (Booking booking : bookingList) {
            System.out.println(""+i+": "+booking);
            i++;
            
        }

    }
}
