class Two_d
{
    int x,y;
    public
            Two_d()
            {
                x=y=0;
            }
            Two_d(int a,int b)
            {
                x=a;
                y=b;
            }
            void print()
            {
                System.out.println("x : "+x+", y : "+y);
            }
}
class Three_d extends Two_d
{
    int z;
    public
            Three_d()
            {
                super();
                z=0;
            }
            Three_d(int a,int b,int c)
            {
                super(a,b);   //base class variables used
                z=c;     
            }
            void print()
            {
                super.print();
                System.out.println("z : "+z);
            }
}

public class point {
    public static void main(String args[])
    {
        Two_d t = new Two_d(1,2);
        System.out.println("Base Class");
        t.print();
        Three_d t2=new Three_d(3,4,5);
        System.out.println("Derived Class");
        t2.print();
        
    }
    
}


