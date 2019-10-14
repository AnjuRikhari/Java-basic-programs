package thread_prog;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lab01-38
 */
public class multi_child implements Runnable {
    String name;
    static int dollar,rupee;
    Thread t;
    multi_child(String n,int d)
    {
      t=new Thread(this,n);
      dollar=d;
      rupee=0;
      t.start();
    }

    @Override
    public void run() {
      if(t.getName().equals(name))
      {
        System.out.println("Name child1: "+t.getName());
          rupee = dollar*80;
         System.out.println("Dollar to Nepali rupee : "+ rupee);
         
      }
      else 
      {   System.out.println("Dollar to Pakistani rupee : "+ dollar*90);
          System.out.println("Name : "+t.getName());}
    }
    public static void main(String args[])
    {
     multi_child t1 = new multi_child("Child1",10);
     multi_child t2 = new multi_child("Child2",10);
     System.out.println("Dollar to Indian rupee : "+ dollar*70);
    }
    
}
