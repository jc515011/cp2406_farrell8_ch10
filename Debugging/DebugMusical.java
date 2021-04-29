public class FixDebugMusical extends FixDebugPlay
{
   protected String composer;

   FixDebugMusical(String title, String author, String comp)
   {
      super(title, author);
      composer = comp;
   }
   @Override
   public void display()
   {
      super.display();
      System.out.println("The music for " + title + " is by " + composer);
   }
}