package com.best.java.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author: xjxu3
 * @Date: 2020/1/27 17:08
 * @Description:
 */
public class ListTest {
	//	public static void main(String[] args) {
//		List<String> lists = new ArrayList<>();
//		lists.add("aaa");
//		lists.add("aaa");
//		lists.add("bbb");
//		lists.add("ccc");
//		lists.add("ddd");
//		for (int i = 0; i < lists.size(); i++) {
//			if ("aaa".equals(lists.get(i))) {
//				lists.remove(i);
//			}
//		}
//		lists.forEach(System.out::println);
//	}
	public static void main(String[] args) {
		Set<Short> s = new HashSet<Short>();
		for (Short i = 0; i < 100; i++) {
			s.add(i);
			s.remove(i - 1);
		}
		System.out.println(s.size());
	}

}