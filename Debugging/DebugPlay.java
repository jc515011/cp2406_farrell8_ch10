public class FixDebugPlay
{
   protected String title;
   protected String author;

   public FixDebugPlay(String thetitle, String theauthor)
   {
      title = thetitle;
      author = theauthor;
   }
   public void display()
   {
      System.out.println("The performance is " + title + " by " + author);
   }
   // System.out.println("The performance is " + title + " by " + author + "\nThe music for " + title + " is by " + composer);
}