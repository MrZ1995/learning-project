package test;

import test.Person;

class Person {
	private String name;
	private int age;
	public Person(String tempName, int tempAge) {
		name=tempName;
		if(tempAge>0 && tempAge<250) {
			age=tempAge;
		}
	}
	public void tell() {
		System.out.println("������"+name+"�����䣺"+age);
	}
	public void setName(String tempName) {
		name=tempName;
	}
	public void setAge(int tempAge) {
		if(tempAge>0 && tempAge<250) {
			age=tempAge;
		}
		
	}
	public String getname() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
}
 public class Test {
	 public static void main(String args[]) {
		 Person per=new Person("����1q" ,-18);
		// per.setName("����");
		// per.setAge(-18);
				 per.tell();
	 }
 }