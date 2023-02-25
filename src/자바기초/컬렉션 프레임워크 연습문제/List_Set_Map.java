package 자바기초;
import java.util.HashMap;


public class List_Set_Map {

	public static void main(String[] args) {
		
		HashMap<String , String> map = new HashMap<String , String>();
		
		map.put("People","사람");
		map.put("baseball", "야구");
		map.remove("People");
		
		System.out.println(map.get("People"));
		System.out.println(map.containsKey("People"));
		System.out.println(map.size());
		
		
		
	}

}
