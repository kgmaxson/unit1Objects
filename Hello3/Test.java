import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Test
{
    public static void main(String[] args) throws Exception
    {
        URL imageLocation = new URL(
            "http://www.allproanimalcontrol.com/wp-content/uploads/2014/05/Red-Squirrel.jpg");
        JOptionPane.showMessageDialog(null, "This is Kevin","Title",
            JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
    }
}