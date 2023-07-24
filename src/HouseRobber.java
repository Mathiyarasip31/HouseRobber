import java.util.Scanner;

public class HouseRobber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int array[]=new int[size];
        for(int i=0;i<size;i++)
        {
            array[i]=scanner.nextInt();
        }
        System.out.println(Count(array,size));
    }
    public static int Count(int array[],int size)
    {
        int count=0,count1=0,result=0;
        for(int i=0;i<size;i++)
        {
            if(i%2==0)
            {
                count+=array[i];
            }
            else
            {
                count1+=array[i];
            }
        }return Math.max(count,count1);
    }
}
