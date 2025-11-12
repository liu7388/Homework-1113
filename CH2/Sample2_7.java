// CH2 P.19
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample2_7
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("請問你是男生嗎？");
        System.out.println("請輸入Y或N");

        BufferedReader br = 
            new BufferedReader(new InputStreamReader(System.in));
        
            
        String str = br.readLine();
        char letter = str.charAt(0);

        // 原本寫法
        // if(letter == 'Y' || letter == 'y')

        // 更改為toUpperCase
        if (Character.toUpperCase(letter) == 'Y')
        {
            System.out.println("你是男生阿！");
        }
        else if(letter == 'N' || letter == 'n')
        {
            System.out.println("你是女生阿！");
        }
        else
        {
            System.out.println("請輸入Y或N");
        }
    }
    
}
