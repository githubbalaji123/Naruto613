package com.backend.testing;

public class A_mtd_chaining {

	public A_mtd_chaining a() {
		System.out.println("execute mtd a its chaining program");
		return new A_mtd_chaining();
	}
	
	public A_mtd_chaining b() {
		System.out.println("execute mtd b its chaining program");
		return new A_mtd_chaining();
	}
	
	public A_mtd_chaining c() {
		System.out.println("execute mtd c its chaining program");
		return new A_mtd_chaining();
	}
	public static A_mtd_chaining a1() {
		System.out.println("execute mtd a static chaining program");
		return new A_mtd_chaining();
	}
	
	public static A_mtd_chaining b1() {
		System.out.println("execute mtd b static chaining program");
		return new A_mtd_chaining();
	}
	
	public static A_mtd_chaining c1() {
		System.out.println("execute mtd c static chaining program");
		return new A_mtd_chaining();
	}
	
	
}
