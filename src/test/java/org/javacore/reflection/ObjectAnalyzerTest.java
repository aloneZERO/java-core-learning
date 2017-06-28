package org.javacore.reflection;

/**
 * {@link ObjectAnalyzer} 的测试类
 * @author justZero
 * @since 2017-6-28
 */
public class ObjectAnalyzerTest {
	
	public static void main(String[] args) {
		System.out.println(
				ObjectAnalyzer.toString(new Person("zero", 23)));
	}
	
}

class Person {
	private String name;
	private int age;
	
	public Person() {}
	public Person(String name, int age) {
		this.setName(name);
		this.setAge(age);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
