package book;

/*public class Car {

  // Car class will have instance data

  private String make;    //Make of the car
  private String model;   //Model of the car
  private int year;       //Year the car was built

  //Constructor object
  public Car(String make, String model, int year){
    //Our parameter list consistes of the instance variables we
    this.make = make;  //this variable shadows the instance variable make, take parameter make and assign this to instance
    //variable make
    // this.make refers to instance variable make
    this.model = model;
    this.year = year;
 */

public class Book {

  private String title;
  private String authorName;
  private String publisherName;
  private int copyrightYear;

  public Book(String title, String authorName, String publisherName, int copyrightYear){
    this.title = title;
    this.authorName = authorName;
    this.publisherName = publisherName;
    this.copyrightYear = copyrightYear;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthorName() {
    return authorName;
  }

  public void setAuthorName(String authorName) {
    this.authorName = authorName;
  }

  public String getPublisherName() {
    return publisherName;
  }

  public void setPublisherName(String publisherName) {
    this.publisherName = publisherName;
  }

  public int getCopyrightYear() {
    return copyrightYear;
  }

  public void setCopyrightYear(int copyrightYear) {
    this.copyrightYear = copyrightYear;
  }

  //Conditional method that will determine if the car is antique or not
  public boolean isAntique(){
    int currentYear = LocalDate.now().getYear();
        /*
        if (currentYear - year > 45)
            return true;
        else
            return false;
        */
    return currentYear - year > 45; //If it's greater than 45 then it will return true, if not it returns false
  }

  @Override
  public String toString() {
    return title + " " + authorName + " " + publisherName + " " + copyrightYear;
  }
}


  /*String crazyRichTitle = "Crazy Rich Asians";
  String chinaRichTitle = "China Rich Girlfriend";
  String richPeopleTitle = "Rich People Problems";
  String authorName = "Kevin Kwan";
  String publisherName = "Penguin Random House LLC";

   */

