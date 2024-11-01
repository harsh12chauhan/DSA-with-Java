package com.cdac.hashTable;

import java.util.Scanner;

public class HashTableMain {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			HashTable ht = new HashTable();
			
			//dummy data
			ht.insert(12);
			ht.insert(19);
			ht.insert(32);
			ht.insert(102);
			ht.insert(92);
			ht.insert(1112);
			
			boolean exit = false;
			while(!exit) {
			
				System.out.println("choice:- ");
				System.out.println("1. Insert Data");
				System.out.println("2. search");
				System.out.println("0. Exit");
				int value = sc.nextInt();
				
				switch(value) {
				
					case 1:{
						System.out.println("Enter data to insert: ");
						int data = sc.nextInt();
						ht.insert(data);					
						System.out.println("Inserted !");
					}break;
					
					case 2:{
						System.out.println("Enter data to : ");
						int data = sc.nextInt();
						if ( ht.search(data) ){					
							System.out.println("data is present !");
						}else {
							System.out.println("not present !");
						}
					}break;
					
					case 0:{
							System.out.println("exit");
							exit = true;
					}break;
				}
			}
		}
	}
}