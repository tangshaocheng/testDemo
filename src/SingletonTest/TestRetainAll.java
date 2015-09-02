package SingletonTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestRetainAll {
	public static void main(String[] args) {
		List newList = new ArrayList();
		newList.add("1111");
		//newList.add("2222");
		newList.add("3333");
		//newList.add("4444");
		newList.add("5555");
		newList.add("55552");
		List oldList = new ArrayList();
		//oldList.add("1111");
		oldList.add("2222");
		oldList.add("3333");
		oldList.add("4444");
		// 并集
		// list1.addAll(list2);
		// 交集
		// list1.retainAll(list2);
		// 差集
		//newList.removeAll(oldList);
		oldList.removeAll(newList);
		
		// 无重复并集
		// list2.removeAll(list1);
		// list1.addAll(list2);
		//System.out.println(newList);
		System.out.println(oldList);
		System.out.println(oldList.size() );
	}

}
