public class ConcatDemo
{
   public static void main(String[] args)
   {
      String animal1 = "quick brown fox";
      String animal2 = "lazy dog";
      String article = "the";
      String action = "jumps over";
      String message = article.concat(animal1).concat(action).concat(article).concat(animal2);
      System.out.println(message);
   }
}