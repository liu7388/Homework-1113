// CH3 P.47

package CH3.Sample3_23;

public class Sample3_23
{
    public static void main(String[] args)
    {
        Car car1;
        car1 = new Car();
        
        car1.show();

        int number = 1234;
        double gasoline = 20.5;
        String str = "1號車";

        car1.setCar(number, gasoline);
        car1.setName(str);

        car1.show();

        // 新增之有參數的建構式使用範例
        Car car2;
        car2 = new Car(2345, 30.5, "2號車");

        car2.show();

    }
}


// Car類別
class Car
{
    private int num;
    private double gas;
    private String name;

    public Car()
    {
        num = 0;
        gas = 0.0;
        name = "沒有名稱";
        System.out.println("生產了車子");
    }

    // 新增有參數的建構式
    public Car(int n, double g, String nm)
    {
        num = n;
        gas = g;
        name = nm;
        System.out.println("生產了車號為 " + num + " 的車子");
    }

    public void setCar(int n, double g)
    {
        num = n;
        gas = g;
        System.out.println("將車號設為" + num + "，汽油量設為" + gas);
    }

    public void setName(String nm)
    {
        name = nm;
        System.out.println("將車名設為" + name);
    }

    public void show()
    {
        System.out.println("車號是" + num);
        System.out.println("汽油量是" + gas);
        System.out.println("車名是" + name);
    }
}