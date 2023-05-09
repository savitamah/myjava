package Map;
import java.util.*;

public class MapUse {
	public static void main(String args[]) {
		HashMap<String, Integer> map= new HashMap<>();
		map.put("abc", 1);
		map.put("def", 2);
		System.out.println("map size:"+map.size());
		//check Presence
		if(map.containsKey("abc")) {
			System.out.println("Has Abc");
			
		}
		if(map.containsKey("abc1")) {
			System.out.println("Has Abc1");
			
		}
		int v=0;
		v=map.get("abc");
		System.out.println(v);
		int v1=0;
		if(map.containsKey("abc1")) {
			
			v1=map.get("abc1");
			
			
			
		}
		System.out.println(v1);
		//remove
		int s=map.remove("abc");
		System.out.println(s);
		//iterate
		Set <String> keys=map.keySet();
		for(String str:keys) {
			System.out.println(str);
			
		}
	}
	
	
	
	

	

}
