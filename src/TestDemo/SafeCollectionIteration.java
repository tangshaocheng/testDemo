package TestDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SafeCollectionIteration {
	public static void main(String[] args) {
		List wordList=Collections.synchronizedList(new ArrayList());
		wordList.add("aabb");
		wordList.add("bb");
		wordList.add("ccaaaaa");
		synchronized (wordList) {
			Iterator ite=wordList.iterator();
			while(ite.hasNext()){
				String s=(String) ite.next();
				System.out.println("found string: " + s + ", length=" + s.length());
			} 
		}
	}
}
