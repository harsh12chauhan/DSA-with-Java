package com.cdac.hashTable;

import java.util.Arrays;
import java.util.Objects;

import com.cdac.linkedList.impl.SinglyLinkedListClass;
import com.cdac.linkedList.interfaces.SinglyLinkedList;

public class HashTable {
	private SinglyLinkedList []hashTable;
	private int size;
	
	public HashTable() {
		this.size = 5;
		hashTable = new SinglyLinkedList[size];
		for(int i = 0 ; i < size ; i++ ) {
			hashTable[i] = new SinglyLinkedListClass();
		}
	}
	
	public HashTable(int size) {
		this.size = size;
		 hashTable = new SinglyLinkedList[size];
		for(int i = 0 ; i < size ; i++ ) {
			hashTable[i] = new SinglyLinkedListClass();
		}
	}
	
	public void insert(int data) {
		int index = getHashCode(data);
		hashTable[index].insertAtEnd(data);
	}
	
	public boolean search(int data) {
		int index = getHashCode(data);
		return hashTable[index].search(data);
	}
	
	private int getHashCode(int data) {
		final int prime = 31;
		int hash = ( prime * data ) % size;
		return hash;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(hashTable);
		result = prime * result + Objects.hash(size);
		return result;
	}	
	
}
