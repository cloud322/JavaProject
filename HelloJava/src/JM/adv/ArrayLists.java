package JM.adv;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import JM.lab.SungJukV0;



public class ArrayLists {

	public static void main(String[] args) {
		//배열
		int[] intArray = new int[5];
		intArray[0] = 1;
		intArray[1] = 2;
		
		
		// 컬렉션 프래임워크
		//동일한 자료형의 여러 객체의 묶음을 손쉽게 다루게 해줌
		// list :순차구조 , 순서있는 개체다름, 중복 허용
		List list = new ArrayList();
		list.add("지현");
		list.add(98);
		list.add(123.456);
		list.add(true);
		list.add(new SungJukV0());
		
		for(int i =0; i<5; ++i)
			System.out.println(list.get(i));
		
		//Array list 에 저장되 내용들은 object
		// 따라서 그것을 get 에서 각가의 변수에 저장하여 할때
		//불필요한 형변환이 발생 --- 성능저하 요인!!
		String name = (String) list.get(0);
		int tot = (int) list.get(1);
		double avg = (double) list.get(2);
		boolean x = (boolean) list.get(3);
		SungJukV0 sj = (SungJukV0) list.get(4);
		
		//제네릭스 Generic
		//컬렉션 프레임워크를 사용할때
		//타입을 지정하지 않고객체를 저장하면
		//그것을 출력시 불필요한 형변환 발생하는데 JDKS에서는 이것을 막고자 제네릭을 도입 
		//컬렉션을 선언할때 어떤 종류의 객체를 저장할지 미리 결정하는데 그것을 <> 기호로 정의
		List cage1 = new ArrayList();
		cage1.add(new Tiger());
		cage1.add(new Zebra());
		cage1.add(new Lion());
		
		Tiger t =(Tiger)cage1.get(0);
		//Zebra z =cage1.get(1);
		//Lion l =cage1.get(2);
		
		List<Tiger> cage2 = new ArrayList<Tiger>();
		List<Zebra> cage3 = new ArrayList<Zebra>();
		List<Lion> cage4 = new ArrayList<Lion>();
		
		cage2.add(new Tiger());
		t=cage2.get(0);
		//cage2.add(new Zebra());
		
		//ArrayLists CRUD
		List<String> names = new ArrayList<>();
		//추가 add
		names.add("헤교");
		names.add("지현");
		names.add("수지");
		//조회 get
//		System.out.println(names.get(0));
//		System.out.println(names.get(1));
//		System.out.println(names.get(2));
		for(int i = 0; i<names.size();++i)
			System.out.println(names.get(i));
		
		for(String val : names)
			System.out.println(val);				//향상된 for 
		
		//검색 : Indexof(값)
		int pos = names.indexOf("수지");
		System.out.println(pos);
		System.out.println();
		//순환자를 이용해서 컬렉션의 모든 요소 출력
		//컬렉션 클래스로 선언된 요소를 하나씩 읽어오기 위한 표준화된 방식을 제공 - 속도 느림 ㅠㅠ
		//has.next 컬렉션요소가 존재하는지 여부 검사
		//next : 요소를 읽어 올수 있는지 여부 검사
 		Iterator<String> it = names.iterator();
		while(it.hasNext())
			{
				String val = it.next();
				System.out.println(val);
			}
		
			
		//갯수 :size
		System.out.println(names.size());
		//삭제:remove
		names.remove(2);
		System.out.println(names.size());
		//수정:set(위치, 값)
		System.out.println(names.get(0));
		names.set(0, "wndrl");
		System.out.println(names.get(0));
		
		//모두 제거 :clear
		names.clear();
		System.out.println(names.size());
		
		
		
	}

}

class Tiger {}
class Zebra {}
class Lion {}
