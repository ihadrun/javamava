import java.util.ArrayList;
import java.util.HashMap;
 class Animal{
 }
 }
public class App {

	public static void main(String[] args) {
		/////////Before Java 5 /////////
		ArrayList list = new ArrayList();
		
		list.add("apple");
		list.add("banana");
		list.add("orange");// TODO Auto-generated method stub
String fruit =(String)list.get(1);
System.out.println(fruit);

/////////////Modern style////////////

ArrayList<String> strings = new ArrayList<String>();

strings.add("cat1");
strings.add("cat");	
	strings.add("alli");
	String animal = strings.get(1);
	System.out.println(animal);
	
	////////////There can be more than one type argument/////////
	HashMap<Integer, String>map = new HashMap<Integer, String>();
/////////////////////Java 7 style//////////
	
	ArrayList<Animal> someList = new ArrayList<>();
	
}}
