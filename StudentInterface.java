package sy41;


import java.util.Scanner;


public class StudentInterface{
 String name;
 String sex;
 int age;
 double fee1;
 double fee12;
 double feecheck;
 double pay1;
 double paycheck;
 double number1;

 public void setPay(double pay1) {
  this.pay1 = pay1;
  System.out.println("你的薪水查询为：" + this.pay1);
 }
 
 public void number1(double number1) {
		this.number1 = number1;
		System.out.println("你的学号为：" + this.number1);
	}

 
 public void getPay(double pay1) {
  this.pay1 = pay1;
  System.out.println("你的薪水为：" + this.pay1);
 }
 
 public void setFee(double fee1) {
  this.fee1 = 12324;
  System.out.println("你的学费查询为：" + this.fee1);
 }
 
 public void getFee(double fee12) {
  this.fee12 = 12324;
  System.out.println("你的学费应缴纳：" + this.fee12);
 
 }

 
 public static void main(String[] args) {
	 StudentInterface graduate = new StudentInterface();
		graduate.name = "zhangsan";
		System.out.println("你好:" + graduate.name);
		
		System.out.println("请输入你的学费：");
		double number1 = scanner.nextDouble();
		graduate.setFee(number1);
}
}
