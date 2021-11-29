package edu.java.map01;

import java.util.HashMap;
import java.util.Map;

/*
 * Collection<E>
 * |__ List<E>, Set<E>
 * List<E>, Set<E> 공통점: 한 가지 타입의 객체 여러개를 저장하는 자료 구조. 
 * List<E>: 저장 순서가 중요. 인덱스가 있음. 같은 값을 저장할 수 있음.
 * Set<E>: 저장 순서가 중요하지 않음. 인덱스 없음. 같은 값을 저장할 수 없음.
 * 
 * List<E>
 * |__ ArrayList<E>, LinkedList<E>
 * ArrayList<E>: add/remove 속도 느림. get 속도 빠름.
 * LinkedList<E>: add/remove 속도 빠름. get 속도 느림.
 * 
 * Set<E>
 * |__ HashSet<E>, TreeSet<E>
 * HashSet<E>: 검색을 빨리 하기 위한 알고리즘(hash 알고리즘)이 적용된 집합(set)
 * TreeSet<E>: (오름차순/내림차순) 정렬을 빨리 하기 위한 알고리즘(tree 알고리즘)이 적용된 집합(set)
 * 
 * Map<K, V>
 * |__ HashMap<K, V>, TreeMap<K, V>
 * Map<K, V>: Key(키)와 Value(값)의 쌍으로 구성된 데이터를 저장하는 자료 구조.
 * 1) Key는 중복된 값을 가질 수 없음.
 * 2) Key의 목적은 데이터를 저장, 검색, 수정, 삭제를 할 때 값을 찾기 위한 용도.
 * 3) Value(값)은 중복된 값을 가질 수 있음.
 * HashMap<K, V>: 검색을 빨리 하기 위한 hash 알고리즘이 적용된 Map.
 * TreeMap<K, V>: 정렬을 빨리 하기 위한 tree 알고리즘이 적용된 Map.
 * 
 */

public class MapMain01 {

	public static void main(String[] args) {
		// Key(정수)-Value(문자열) 타입의 HashMap을 생성
		Map<Integer, String> students = new HashMap<>();
		
		// map에 저장된 원소의 개수: size()
		System.out.println("size = " + students.size());
		
		// map에 새로운 데이터 추가(저장): put(key, value)
		students.put(1, "홍길동");
		System.out.println(students);
		
		students.put(10, "오쌤");
		System.out.println(students);

	}

}
