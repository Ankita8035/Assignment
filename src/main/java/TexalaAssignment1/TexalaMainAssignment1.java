package TexalaAssignment1;

public class TexalaMainAssignment1
{
    public static void main(String[] args)
    {
        Servicedata data=new Servicedata();
        int a=data.loadingServiceData();
        if(a==1)
        {
            System.out.println("Done!");
            }

            else
        {
                System.out.println("not done!!");
        }




    }
}
