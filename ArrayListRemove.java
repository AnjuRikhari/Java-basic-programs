import java.util.*;
class ArrayListRemove
{
	public static void main(String args[])
	{
		ArrayList<String> list = new ArrayList<String>(); //creating arraylist
		System.out.println("Initial size of list:" + list.size());
		list.add("Ramesh"); //Adding object in arraylist
		list.add("Himanshu");
		list.add("Sunny");
		list.add(1, "Chirag");
		list.add("Manvi");
		System.out.println("Size of list after addition :" + list.size());
		System.out.println("Contents of list:" + list); //Invoking arraylist object
		//Remove element from the array list
		list.remove("Manvi");
		list.remove(1);
		System.out.println("Size of list after delection:" + list.size());
		System.out.println("Contents of list:" + list);
	}
}
