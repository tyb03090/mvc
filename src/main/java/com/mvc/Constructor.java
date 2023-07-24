package com.mvc;

public class Constructor {
	int num;

	public Constructor() {
		System.out.println(num);
	}
	public Constructor(int num) {
		this.num = num;
		System.out.println(num);
	}
	
	void test(){
		System.out.println("생성자 호출");
	}
}

class Execute {
	public static void main(String[] args) {
		Constructor c = new Constructor(100);
		System.out.println(c.num);
	}
}
