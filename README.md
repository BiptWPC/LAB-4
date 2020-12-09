# LAB-4
第四次 接口异常处理实验

  
## 实验目的
掌握Java中抽象类和抽象方法的定义； 
掌握Java中接口的定义，熟练掌握接口的定义形式以及接口的实现方法
了解异常的使用方法，并在程序中根据输入情况做异常处理

## 实验内容
某学校为了给学生提供勤工俭学机会，也减轻授课教师的部分压力，准许博士研究生参与课程的助教工作。此时，该博士研究生有双重身份：学生和助教教师。
1.设计两个管理接口：学生管理接口和教师管理接口。学生接口必须包括缴纳学费、查学费的方法；教师接口包括发放薪水和查询薪水的方法。
2.设计博士研究生类，实现上述的两个接口，该博士研究生应具有姓名、性别、年龄、每学期学费、每月薪水等属性。（其他属性及方法，可自行发挥）
3.编写测试类，并实例化至少两名博士研究生，统计他们的年收入和学费。根据两者之差，算出每名博士研究生的年应纳税金额（国家最新工资纳税标准，请自行检索）。


  
## 实验过程
# 实验思路
首先创建一个package，在包中创建两个接口StudentInterface和TeacherInterface，分别设定博士研究生作为学生和助教的两类行为标准口，然后用Students类实现接口。之后开始编写主方法，实现学生的实例化。加入异常处理模块，对getfee等方法进行监控。实现捕捉异常后，改写加入while循环，使出现问题时可以重新输入。最后编写计算税收的静态final方法，在主方法中调用并输出。至此实现所有实验要求。进行测试，检查功能的完整性。



## 核心方法

//初始化学生信息
  Scanner sc = new Scanner(System.in);
//Teacher teacher = new Teacher(args[0],args[1],age);
  int[] age = new int[5];
  String[] information = new String[10];
  System.out.println("输入研究生信息");
  System.out.println("性别，姓名，年龄");
  information[0] = sc.nextLine();
  information[1] = sc.nextLine();
  age[0] = sc.nextInt();
  sc.nextLine();
  Student li = new Student(information[0], information[1], age[0]);


		int[] age = new int[5];
		String[] information = new String[10];
		System.out.println("输入研究生信息");
		System.out.println("性别，姓名，年龄");
		information[0] = sc.nextLine();
		information[1] = sc.nextLine();
		age[0] = sc.nextInt();
		sc.nextLine();
		Student li = new Student(information[0], information[1], age[0]);

//捕捉输入异常
boolean i = true;
		while (i) {
			try {
				System.out.println("输入薪水");
				int salary = 0;
				salary = sc.nextInt();
				System.out.println(salary);
				li.setsalary(salary);
				int fee = 0;
				System.out.println("输入学费");
				fee = sc.nextInt();
				System.out.println(salary);
				li.setfee(fee);
				//System.out.println(""+li.getfee());
				i = false;
			} catch (ArrayIndexOutOfBoundsException ne) {
				System.out.println("数组越界");

			} catch (NumberFormatException e) {
				System.out.println(e.getMessage() + "数字格式错误");
			} catch (Exception m) {
				System.out.println("出现未知错误");
			} finally {
				sc.nextLine();
			}
		}
		System.out.println("交税信息");
		calculator(li.getsalary(),li.getfee());

//学生管理的接口，定义学生必须要有的方法
interface StudentManage {
    void setfee(int fee);
    int getfee();
}

//计算需要缴纳税款的方法（部分省略）
public final static void calculator(int salary,int fee) {
		int  year_salary = salary - fee;
		double x = 0;
		if (year_salary <= 36000) {
			x = year_salary * 0.03;
		}
		else if (36000 < year_salary && year_salary <= 144000){
			x = year_salary * 0.1 - 2520; }
               
	        ...
	
	
		else if (960000 < year_salary) {
			x = year_salary * 0.45 - 181920;
		}
		System.out.println("需要缴纳的税款" +x);
	}


## 实验结果


## 实验感想
通过本次实验，我学会了如何去设计抽象类，还明白了接口与类的不同，前者是描述对象的属性和方法后者则包含含类要实现的方法，并且也对异常处理也有了一部分的经验，本次试验后，我会继续学习一些有关异常处理知识来补充实验和课堂的不足。
