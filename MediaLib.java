/*
 * Kevin Tend 
 * Activity 2.5.7
 * 
 * A MediaLib class for the MediaLibrary program
 */
public class MediaLib
{
  private Book book;
  private Movie movie;
  //2.5.8 Step 5
  private static String owner = "PLTW";
 
  public void addBook(Book b) {
    book = b;
  }

  public void addMovie(Movie m) {
    movie = m;
  }
   
  // 2.5.7 new step 18-22
  /* test scenario
  public void testBook(Book tester)
  {
	tester.setTitle("Animal Farm");
	// show state chagne with one of the following
	System.out.println(" in test: " + tester);
	System.out.println(" in test: " + tester.getTitle());
  }
  */
   
  public String toString() {
    String info = "";
  
    // 2.5.7 Step 5, avoid crashing by testing that book is not null before using its toString method
    if (book != null) {
      info += "Book: " + book + "\n";
    }

    if (movie != null) {
      info += "Movie: " + movie + "\n";
    }

    return info;
  }

  // 2.5.8 Steps 1-4
  public static String getOwner() {
    return owner;
  }

  //2.5.8 Steps 7
  public static void changeOwner(String o) {
    owner = o;
  }
}
