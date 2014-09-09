import java.util.StringTokenizer;

public class StringTokenizerDemo
{
   public static void main(String[] args)
   {
      String sentence = "These carrots taste like lime jello";
      StringTokenizer mystery = new StringTokenizer(sentence);
      System.out.println(mystery.countTokens());
      System.out.println(mystery.nextToken());
      System.out.println(mystery.nextToken(3));
      System.out.println(mystery.nextToken());
      System.out.println(mystery.nextToken());
      System.out.println(mystery.nextToken());
      System.out.println(mystery.nextToken());
   }
}