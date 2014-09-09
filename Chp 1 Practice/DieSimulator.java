import java.util.Random;

public class DieSimulator
{
    public static void main(String[] args)
    {
        Random randNumber = new Random();
        int randNum = randNumber.nextInt(6)+1;
        System.out.println(randNum);
    }
}