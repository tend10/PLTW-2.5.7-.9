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
  private Song song;
  //2.5.8 Step 5
  //private static String owner = "PLTW";

  //2.5.8 Step 9
  public static String owner = "PLTW";
  //2.5.8 Step 12
  private static int numTotalEntries;
  //2.5.8 Step 29
  private static int numBookEntries;
  private static int numMovieEntries;
  private static int numSongEntries;

  public void addBook(Book b) {
    //PLTW 2.5.8 Step 23
    if (book == null) {
      book = b;
      //PLTW 2.5.8 Step 15 & 27
      numBookEntries++;
      numTotalEntries++;
    } else {
      //PLTW 2.5.8 Step 24
      System.out.println("A book has already been added to this library!");
    }
  }

  public void addMovie(Movie m) {
    //PLTW 2.5.8 Step 23
    if (movie == null) {
      movie = m;
      //PLTW 2.5.8 Step 15 & 27
      numTotalEntries++;
      numMovieEntries++;
    } else {
      //PLTW 2.5.8 Step 24
      System.out.println("A movie has already been added to this library!");
    }
  }
   
  //PLTW 2.5.8 Step 27
  public void addSong(Song s) {
    if (song == null) {
      song = s;
      numTotalEntries++;
      numSongEntries++;
    } else {
      System.out.println("A song has already been added to this library!");
    }
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

    if (song != null) {
      info += "Song: " + song + "\n";
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

  //2.5.8 Step 13
  public static int getNumTotalEntries() {
    //PLTW 2.5.8 Steps 18-21
    // System.out.println("Test: Owner is " + owner);
    // System.out.println("Test: Book is " + book + "Test: Movie is " + movie);
    // Prediction: Wont work, still a static variable
    // System.out.println("Test: MediaLib is " + this.book);
    return numTotalEntries;
  }

  //PLTW 2.5.8 Step 29
  public static int getNumBookEntries() {
    return numBookEntries;
  }

  public static int getNumMovieEntries() {
    return numMovieEntries;
  }

  public static int getNumSongEntries() {
    return numSongEntries;
  }
}
