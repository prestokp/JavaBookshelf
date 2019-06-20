package book;

import java.util.Scanner;

public class Bookshelf {

  public static void main(String[] args) {

    Book crazyRich, chinaRich, richPeople; //creates the reference variables to the three books on my shelf of type book
    //creates the new book objects titled crazyRich, chinaRich, and richPeople respectively.

    //Arguments are passed into the parameters of the book objects
    crazyRich = new Book("Crazy Rich Asians", "Kevin Kwan", "Penguin Random House LLC", 2013);
    chinaRich = new Book("China Rich Girlfriend", "Kevin Kwan", "Penguin Random House LLC", 2015);
    richPeople = new Book("Rich People Problems", "Kevin Kwan", "Penguin Random House LLC", 2017);

    //This is the code block referring to the output of data related to Crazy Rich Asians
    System.out.println("Book Title: " + crazyRich.getTitle());
    System.out.println("Author: " + crazyRich.getAuthorName());
    System.out.println("Publisher: " + crazyRich.getPublisherName());
    System.out.println("Copyright Year: " + crazyRich.getCopyrightYear());
    System.out.println();
    System.out.println();

    //This is the code block referring to the output of data related to China Rich Girlfriend
    System.out.println("Book Title: " + chinaRich.getTitle());
    System.out.println("Author: " + chinaRich.getAuthorName());
    System.out.println("Publisher: " + chinaRich.getPublisherName());
    System.out.println("Copyright Year: " + chinaRich.getCopyrightYear());
    System.out.println();
    System.out.println();

    //This is the code block referring to the output of data related to Rich People Problems
    System.out.println("Book Title: " + richPeople.getTitle());
    System.out.println("Author: " + richPeople.getAuthorName());
    System.out.println("Publisher: " + richPeople.getPublisherName());
    System.out.println("Copyright Year: " + richPeople.getCopyrightYear());
    System.out.println();
    System.out.println();

  }
}


//Adjustments that can be made is having methods that call and retrieve the categorical data the program is after
//instead of organizing data by type.

//Program Design Notes: I'm running into problems on how to organize my data and manipulate getter and setter functions