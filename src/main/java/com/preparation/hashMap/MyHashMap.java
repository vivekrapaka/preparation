package com.preparation.hashMap;

public class MyHashMap<K,V> {

	public int capacity = 16;
	Nodes<K, V>[] buckets;
	
	int size = 0;
	float lf = 0.7f;
	int threshold = (int)(capacity * lf);
	
	public MyHashMap() {
		buckets = new Nodes[capacity];
	}
	
	private int getIndex(K key) {
		return Math.abs(key.hashCode()) % capacity;
	}
	
	private void put(K key, V value) {
		int index = getIndex(key);
		Nodes<K, V> head = buckets[index];
		if(size > threshold) {
			resize();
		}
		
		if (head == null) {
			buckets[index] = new Nodes<>(key, value);
			size++;
			return;
		}
		Nodes<K, V> current = head;
		while (current.next != null) {
			if (current.key.equals(key)) {
				current.value = value;
				return;
			}
			current = current.next;
		}

		current = head;

		while (current.next != null) {
			current = current.next;
		}
		current.next = new Nodes<>(key, value);
	}
	
	private V get(K key) {
		int index = getIndex(key);
		Nodes<K, V> current = buckets[index];
		while (current.next != null) {
			if (current.key.equals(key)) {
				return current.value;
			}
			current = current.next;
		}
		return null;
	}
	
	private void resize() {
		capacity = capacity * 2;
		Nodes<K, V>[] oldBucket = buckets;
		buckets = new Nodes[capacity];
		size = 0;
		for (Nodes<K, V> head : oldBucket) {
			if (head != null) {
				put(head.key, head.value);
				head = head.next;
			}
		}
		threshold = (int) (capacity * lf);

	}
	
	public static void main(String[] args) {
		MyHashMap<String, Integer> myhash = new MyHashMap<String, Integer>();
		myhash.put("v", 1);
		myhash.put("I", 2);
		myhash.put("v", 3);
		myhash.put("a", 4);
		myhash.put("b", 5);
		myhash.put("x", 6);
		myhash.put("Ed",7);
		myhash.put("Ed", 8);
		myhash.put("Ee", 9);
		myhash.put("Ea", 10);
		myhash.put("Er", 11);
		myhash.put("Eq", 12);
		myhash.put("Ea", 13);
		myhash.put("Eg", 14);
		myhash.put("Er", 15);
		myhash.put("ab", 16);
		myhash.put("ac", 17);
		myhash.put("ad", 18);
		myhash.put("ae", 19);
		myhash.put("af", 20);
		
		System.out.println(myhash.get("ae"));
		System.out.println(myhash.capacity);
	}
}
