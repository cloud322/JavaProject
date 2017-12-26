package JM.lab;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class HashMapEx3
{
	static HashMap phoneBook = new HashMap();
	
	public static void main(String[] args)
	{
		addPhoneNo("f","a","010-1111-1111");
		addPhoneNo("f","b","010-2222-1111");
		addPhoneNo("f","c","010-3333-1111");
		addPhoneNo("f","d","010-4444-1111");
		addPhoneNo("f","e","010-5555-1111");
		addPhoneNo("f","f","010-6666-1111");
		addPhoneNo("f","g","010-7777-1111");
		addPhoneNo("ㅅㅌ","010-8888-1111");
		
		printList();
	}
	
	static void addPhoneNo(String groupName, String name, String tel)
	{
		addGroup (groupName);
		HashMap group =(HashMap)phoneBook.get(groupName);
		group.put(tel, name);
	}
	
	static void addGroup (String groupName)
	{
		if(!phoneBook.containsKey(groupName))
			phoneBook.put(groupName, new HashMap());
	}
	
	
	static void addPhoneNo(String name, String tel)
	{
		addPhoneNo("기타",name,tel);
	}
	
	static void printList()
	{
		Set set = phoneBook.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext())
		{
			Map.Entry e = (Map.Entry)it.next();
			
			Set subSet = ((HashMap)e.getValue()).entrySet();
			Iterator subIt = subSet.iterator();
			
			System.out.println("*" + e.getKey() + "[" + subSet.size() + "]");
			
			while(subIt.hasNext())
			{
				Map.Entry subE = (Map.Entry)subIt.next();
				String telNo = (String) subE.getKey();
				String name = (String) subE.getValue();
				System.out.println(name + "" + telNo);
			}
			System.out.println();
			
			
		}
	}//printList()
	
}//class


