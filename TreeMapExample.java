
import java.util.TreeMap;
public class TreeMapExample{

	public static void main(String[] args) {
		TreeMap<Integer, String> map=new TreeMap<Integer, String>();
		//map.put(null,"Z");//TreeMap does not allow to insert null
		map.put(3,"C");
		map.put(4,"D");
		map.put(1,"A");
		map.put(2,"B");
		System.out.println(map);
	}
}