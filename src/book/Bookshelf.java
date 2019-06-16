package book;

public class Bookshelf {
  public static void main(String[] args) {

    Book crazyRich, chinaRich, richPeople; //creates the reference variables to the three books on my shelf of type book

    crazyRich = new Book();   //creates the new book objects titled crazyRich, chinaRich, and richPeople respectively.
    chinaRich = new Book();
    richPeople = new Book();

    //This is the code block referring to the output of data related to Crazy Rich Asians
    System.out.println("Book Title: " + crazyRich.);
    System.out.println("Author: " + crazyRich.);
    System.out.println("Publisher: " + crazyRich.);
    System.out.println("Copyright Year: " + crazyRich.);
    System.out.println();
    System.out.println();

    //This is the code block referring to the output of data related to China Rich Girlfriend
    System.out.println("Book Title: " + chinaRich.);
    System.out.println("Author: " + chinaRich.);
    System.out.println("Publisher: " + chinaRich.);
    System.out.println("Copyright Year: " + chinaRich.);
    System.out.println();
    System.out.println();

    //This is the code block referring to the output of data related to Rich People Problems
    System.out.println("Book Title: " + richPeople.);
    System.out.println("Author: " + richPeople.);
    System.out.println("Publisher: " + richPeople.);
    System.out.println("Copyright Year: " + richPeople.);
    System.out.println();
    System.out.println();
  }
}


//Adjustments that can be made is having methods that call and retrieve the categorical data the program is after
//instead of organizing data by type.

//Program Design Notes: I'm running into problems on how to organize my data and manipulate getter and setter functions