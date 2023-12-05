package assignment.ass01;

import java.text.NumberFormat;

/**
*@author lyq
*@version 2023年11月18日下午4:41:09
*/
public class Frog {
	private int age;
	private double weight;
	
	public Frog() {
    }
	
	public Frog(int age,double weight) {
		this.age = age;
		this.weight = weight;
    }
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	private void sleepForOneDay() {
		this.weight += 0.01;
	}
	private void hibernate() {
		int i = 1;
		while(i<=90) {
			sleepForOneDay();
			i++;
		}
	}

	public static void main(String[] args) {
		Frog frog = new Frog();
		frog.setAge(18);
		frog.setWeight(60.00);
		frog.hibernate();
		System.out.printf("The frog of the Weight is %.2f",frog.getWeight());
	}

}
