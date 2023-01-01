package progate;

class progate3_2 {
	
	public static void main(String[] args) {
		//メソッドの呼び出し
		String name = fullName("Kate","Jones");
		printData(name,27,160, 50.0);
//		printData("John Christopher Smith",65);
		printData(fullName("jone","Christopher","Smith"),65,175,80.0);
	}
	
	public static void printData(String name,int years,double height,double weight) {
		System.out.println("my name is " +name +".");
		System.out.println("age is " + years +" years old.");
		System.out.println("身長は"+ height +"cmです");
		System.out.println("体重は"+ weight + "です");
		//doubleをintにキャスト
		double bmi=bmi(height,weight);
		System.out.println("BMIは" + bmi + "です");
		if (isHealthy(bmi)) {
			System.out.println("健康です");
		}else {
			System.out.println("健康ではありません");
		}

	}
	
	public static String fullName(String first,String last) {
		return first + " " + last;
	}
	
	public static String fullName(String first,String middle,String last) {
		return first + " " + middle + " " + last;
	}
	//BMIの計算
	public static double bmi(double height,double weight) {
		height = height /100;
		return Math.floor(weight / height /height);
	}
	//健康メソッド
	public static boolean isHealthy(double bmi) {
		if(bmi >=18.5 && bmi<25.0) {
			return true;
		}else {
			return false;
		}
	}
	
}
