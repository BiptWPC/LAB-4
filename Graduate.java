package SY4;

import java.util.Scanner;
 
public class Graduate implements StudentInterface,TeacherInterface{
	String name;
	String sex;
	int age;
	double fee;
	double pay;
	
	public void setPay(double pay) {
		this.pay = pay * 12;
		System.out.println("你的年收入为：" + this.pay);
	}
	
	public void getPay(double pay) {
		this.pay = pay * 12;
		System.out.println("你的年收入为：" + this.pay);
	}
	
	public void setFee(double fee) {
		this.fee = fee;
		System.out.println("你的学费设置为：" + this.fee);
	}
	
	public void getFee(double fee) {
		this.fee = fee;
		System.out.println("你的学费为：" + this.fee);
	}
	
	
	public static void main(String[] args) {
		Graduate graduate = new Graduate();
		graduate.name = "Jack";
		System.out.println("你好:" + graduate.name);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入你的月工资：");
		double pay = scanner.nextDouble();
		graduate.setPay(pay);
	
		System.out.println("请输入你的学费：");
		double fee = scanner.nextDouble();
		graduate.setFee(fee);
		
		
	}
 
}
