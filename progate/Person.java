package progate;

class Person {
	private String firstName;
	private String middleName;
	private String lastName;
	private int years;
	private double height;
	private double weight;
	private String job;
	private static int count=0;
	public Person(String first ,String last,int years,double height,double weight,String job) {
//		this.name = fullName(first,last);
		this.firstName=first;
		this.lastName=last;
		this.years=years;
		this.height=height;
		this.weight=weight;
		this.job=job;
		Person.count ++;
	}	
	public Person(String first ,String middle,String last,int years,double height,double weight,String job) {
//		this.name = fullName(first,middle,last);
		this.firstName=first;
		this.middleName=middle;
		this.lastName=last;
		this.years=years;
		this.height=height;
		this.height=weight;
		this.job=job;
		
		Person.count ++;

	}

	public  void printData() {
		System.out.println("my name is " + this.fullname() +".");
		System.out.println("age is " + this.years +" years old.");
		System.out.println("身長は"+ this.height +"cmです");
		System.out.println("体重は"+ this.weight + "kgです");
		//doubleをintにキャスト
		double bmi=bmi();
		System.out.println("BMIは" + bmi + "です");
		if (isHealthy(bmi)) {
			System.out.println("健康です");
		}else {
			System.out.println("健康ではありません");
		}
		System.out.println("職業は"+ this.job +"です");

	}
	
//	public static String fullName(String first,String last) {
//		return first + " " + last;
//	}
//	
//	public static String fullName(String first,String middle,String last) {
//		return first + " " + middle + " " + last;
//	}
	public String fullname() {
		if(this.middleName==null) {
			return this.firstName + " " +this.lastName;
		}else {
			return this.firstName + " " +this.middleName + " " + this.lastName;
		}
	}
	//BMIの計算
	public  double bmi() {
		
//		return Math.floor(this.weight / this.height /this.height);
		double height = this.height/100;
//		return Math.floor(this.weight /height /height);
		return Math.round(this.weight /height /height);
	}
	//健康メソッド
	public static boolean isHealthy(double bmi) {
		if(bmi >=18.5 && bmi<25.0) {
			return true;
		}else {
			return false;
		}
	}
	public static void printCount() {
		System.out.println("合計は" + Person.count +"人です");
	}
	//セッター
	public void setJob(String job) {
		this.job=job;
	}
	//ゲッター
	public  String getJob() {
		return this.job;
	}

}
