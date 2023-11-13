/*
 * Kevin Tend 
 * Activity 2.5.8
 *
 * The static runner for the MediaLibrary program
 */
public class MediaLibRunnerStatic {
  public static void main(String[] args)
  {
    //PLTW 2.5.8 Steps 1-8
    // System.out.println(MediaLib.getOwner() + "'s Library");
    // MediaLib.changeOwner("hi");
    // System.out.println(MediaLib.getOwner() + "'s Library");

    //PLTW 2.5.8 Step 10
    System.out.println(MediaLib.owner + "'s Library");
    MediaLib.changeOwner("hi");
    System.out.println(MediaLib.owner + "'s Library");
    
    //PLTW 2.5.8 Step 14
    System.out.println(MediaLib.getNumTotalEntries());

    //PLTW 2.5.8 Steps 16-17
    MediaLib library1 = new MediaLib();
    Movie newMovie = new Movie("test title", 100);
    library1.addMovie(newMovie);
    Song newSong = new Song("test");
    library1.addSong(newSong);
    // Testing Song .equals method
    Song newSong2 = new Song("test");
    System.out.println(newSong.equals(newSong2));


    MediaLib library2 = new MediaLib();
    Book newBook = new Book("test title", "test author");
    library2.addBook(newBook);
    // Book newBook2 = new Book("test title", "test author");
    // library2.addBook(newBook2);
    // Book newBook3 = new Book("test title", "test author");
    // library2.addBook(newBook3);

    System.out.println(library1);
    System.out.println(library2);
    System.out.println(MediaLib.getNumTotalEntries());

    
  }
}   