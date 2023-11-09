public class MediaLibRunnerStatic {
  public static void main(String[] args)
  {
    System.out.println(MediaLib.getOwner() + "'s Library");
    MediaLib.changeOwner("hi");
    System.out.println(MediaLib.getOwner() + "'s Library");
    
    
  }
}