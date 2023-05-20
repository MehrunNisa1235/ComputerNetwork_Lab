 
import java.util.*; 
public class CharStuffing 
{
    public static void main(String[] args)
    {
 
        System.out.print("Enter the input: ");
        Scanner sc=new Scanner(System.in);
        String data = sc.next();
        String res = "DLESTX";

        int i;
        for(i=0;i<data.length()-2;i++)
        {
            if ((data.charAt(i) == 'd' || data.charAt(i) == 'D') && (data.charAt(i+1) == 'l' ||
                data.charAt(i+1) == 'L') && (data.charAt(i+2) == 'e' || data.charAt(i+2) == 'E'))
            {
                    res = res + "DLE";
            }
                    res = res + data.charAt(i);
        }

                    res = res + data.charAt(i) + data.charAt(i+1) + "DLEETX";
            System.out.println("Output is: " +res);
    }
}
