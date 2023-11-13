/*
 * Kevin Tend 
 * Activity 2.5.8
 *
 * A Song class for the MediaLibrary program
 */
//PLTW 2.5.8 Step 26
public class Song
{
  private int rating;
  private String title;
 
  /*** Constructor ****/
  public Song(String t) {
    title = t;
  }
 
   /*** Accessor methods ***/
  public String getTitle() {
    return title;
  }
 
  public int getRating() {
    return rating;
  }
 
  public String toString() {
    String info = "\"" + title + "\"";
    if (rating != 0) {
      info += ", rating is " + rating;
    }

	  return info;
  }
 
  public boolean equals(Song s) {
    if(this.title.equals(s.title)) {
      return true;  
    } else {
      return false;
    }
  }
 
  /*** Mutator methods ***/
  public void setTitle(String t) {
    title = t;
  }
 
  public void adjustRating(int r) {
    if ((rating + r >= 0) && (rating + r <= 10)) {
      rating += r;
    }

  }
 
}
