/*
 * Kevin Tend 
 * Activity 2.5.7
 *
 * A Movie class for the MediaLibrary program
 */
public class Movie
{
  private int rating;
  private String title;
  private int duration;
 
  /*** Constructor ****/
  public Movie(String t, int d) {
    title = t;
    duration = d;
  }
 
   /*** Accessor methods ***/
  public String getTitle() {
    return title;
  }
 
  public int getDuration() {
    return duration;
  }
 
  public int getRating() {
    return rating;
  }
 
  public String toString() {
    String info = "\"" + title + "\", duration is " + duration;
    if (rating != 0) {
      info += ", rating is " + rating;
    }

	  return info;
  }
 
  public boolean equals(Movie b) {
    if(this.title.equals(b.title) && this.duration == b.duration) {
      return true;  
    } else {
      return false;
    }
  }
 
  /*** Mutator methods ***/
  public void setDuration (int d) {
    duration = d;
  }
	 
  public void setTitle(String t) {
    title = t;
  }
 
  public void adjustRating(int r) {
    // Step 10-11 improve the method
    if ((rating + r >= 0) && (rating + r <= 10)) {
      rating += r;
    }

  }
 
}
