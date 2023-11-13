/*
 * Kevin Tend 
 * Activity 2.5.7
 *
 * A Book class for the MediaLibrary program
 */
public class Book
{
  private int rating;
  private String title;
  private String author;
 
  /*** Constructor ****/
  public Book(String t, String a) {
    title = t;
    author = a;
    // 2.5.9 Step 6
    System.out.println("Adding book " + t);
  }
 
   /*** Accessor methods ***/
  public String getTitle() {
    return title;
  }
 
  public String getAuthor() {
    return author;
  }
 
  public int getRating() {
    // 2.5.9 Step 12, can't work since formal parameters are local
    //return r
    return rating;
  }
 
  public String toString() {
    // 2.5.9 Step 4-5, can't make a local variable public/private
    //public String info = "\"" + title + "\", written by " + author;
    String info = "\"" + title + "\", written by " + author;
    if (rating != 0) {
      info += ", rating is " + rating;
    }

	  return info;
  }
 
  // 2.5.7 Step 23 - 29
  public boolean equals(Book b) {
    // 2.5.9 Step 8-9, doesn't work since constructor variables are local.  
    // System.out.println("Checking book " + t);
    if(this.title.equals(b.title) && this.author.equals(b.author)) {
      return true;  
    } else {
      return false;
    }
  }
 
  /*** Mutator methods ***/
  public void setAuthor(String a) {
    author = a;
  }
	 
  public void setTitle(String t) {
    title = t;
  }
 
  // Step 7: create the method
  public void adjustRating(int r) {
    // 2.5.9 Step 10
    System.out.println("Adjusting rating by " + r);
    // 2.5.7 Step 10-11 improve the method
    if ((rating + r >= 0) && (rating + r <= 10)) {
      rating += r;
    }

    r = 10;// 2.5.7 Step 9: changing the param here has no effect in the runner
  }

  // 2.5.9 Step 3
  // public String getInfo() {
  //   return "The current book information is " + info;
  // }
 
}
