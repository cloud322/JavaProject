package JM.adv;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

import project.v1.SungJukV0;

public class HashMaps {

	
	public static void main(String[] args) {
		//hashmaps -데이터 저장은 느리지만, 많은 양의 데이터 검색시 유리
		//키와 값으로 데이터를 저장 - 키는 중복x 값은 중복o 
		
		HashMap<Integer,String> hmap1 = new HashMap<>();
		//key는 숫자형 값은 문자형인 Hashmap 객체 생성
		HashMap<String,SungJukV0> hmap2 = new HashMap<>();
		//key는 문자형 값은 SungJukV0인 Hashmap 객체 생성
		
		hmap1.put(1, "지현");
		hmap1.put(2, "지현2");
		hmap1.put(3, "지현3");
		hmap1.put(4, "지현4");
		hmap1.put(5, "지현5");
		//hashmap 각 요소 추 가
		
		System.out.println("키1:"+hmap1.get(1));
		System.out.println("키2:"+hmap1.get(2));
		
		//특정키로 검색하기
		
		System.out.println("키3:"+hmap1.get(3));
		hmap1.remove(3);
		System.out.println("키3:"+hmap1.get(3));
		
		//모든내용 출력
//		Itetator it =hmap1.keySet().iterator();
//		while(it.hasnext())
//		{
//			Integer key = (Integer) it.next();
//			System.out.println(key+"/"+hmap1.get(key));
//		}
		Iterator<Integer> it =hmap1.keySet().iterator();
		while(it.hasNext())
		{
			Integer key = it.next();
			System.out.println(key+"/"+hmap1.get(key));
		}
		
		SungJukV0 sj1 = new SungJukV0("지현",99,90,90);
		SungJukV0 sj2 = new SungJukV0("수지",89,90,90);
		SungJukV0 sj3 = new SungJukV0("제니",79,90,90);
		SungJukV0 sj4 = new SungJukV0("혜교",69,90,90);
		
		hmap2.put("지현", sj1);
		hmap2.put("수지", sj2);
		hmap2.put("제니", sj3);
		hmap2.put("혜교", sj4);
		
		
		System.out.println(hmap2.get("지현"));
		System.out.println(hmap2.get("수지"));
		System.out.println(hmap2.get("제니"));
		System.out.println(hmap2.get("혜교"));
		
		Iterator<String> it2 =hmap2.keySet().iterator();
		while(it2.hasNext())
		{
			String key = it2.next();
			System.out.println(key+"/"+hmap2.get(key));
		}
	
		//간단한검색
		Integer key1 = 1;
		String key2 = "지현";
		
		if(hmap1.containsKey(key1))
			System.out.println(key1+"/"+hmap1.get(key1));
		else
			System.out.println("no DATA");
		
		if(hmap2.containsKey(key2))
			System.out.println(key2+"/"+hmap2.get(key2));
		else
			System.out.println("no DATA");
		
		@SuppressWarnings({ "rawtypes", "unused" })
		Iterator it3 = hmap2.keySet().iterator();
		
		Date today = new Date();
		today.getYear();
		today.getMonth();
		today.getDay();
		today.getHours();
		today.getMinutes();
		today.getSeconds();
		
		
		
	}

}
