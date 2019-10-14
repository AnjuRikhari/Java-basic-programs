public class myThread{
       
    public static void main(String[] args) {
         String s1 = new String("abc");
         String s2 = new String("xyz");
         String s3 = new String("abc");
         System.out.println(s1.equals(s2));
         if(s1==s3)
             System.out.println("true");
         else
             System.out.println("false");
         System.out.println(s1.compareTo(s3));
    }
    
}
