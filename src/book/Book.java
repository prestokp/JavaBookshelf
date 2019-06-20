package book;

public class Book {

  //Declares the variables that will contain the instance data for book objects
  private String title;
  private String authorName;
  private String publisherName;
  private int copyrightYear;

  //Makes the book objects and the parameter list in which arguments can be passed into
  public Book(String title, String authorName, String publisherName, int copyrightYear){
    this.title = title;
    this.authorName = authorName;
    this.publisherName = publisherName;
    this.copyrightYear = copyrightYear;
  }

  //Getter and Setter functions for the book class
  //Define the parameter list and then right click => generate => getter & setter
  //IntelliJ shortcut

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

  //This allows data be displayed as a string when generating output
  @Override
  public String toString() {
    return title + " " + authorName + " " + publisherName + " " + copyrightYear;
  }
}


