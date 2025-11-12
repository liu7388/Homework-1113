// CH2 P.7 
// import java.io.BufferedReader;
import java.io.IOException;
// import java.io.InputStreamReader;
import java.util.Scanner;

public class Sample2_1 
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("請輸入整數");

        // 原本程式碼
        /*
        BufferedReader br = 
            new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
         */

        // 更改為Scanner
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num == 1)
        {
            System.out.println("輸入的是1");
            System.out.println("選擇的是1");
        }
        
        System.out.println("結束處理");
        sc.close();
    }
    
}
