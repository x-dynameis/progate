	package progate;
import java.util.Scanner;


class progate3_12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("名前を入力してください: ");
		
		String firstname = scanner.next();
		
		System.out.print("名字を入力してください： " );
		
		String lastname = scanner.next();
		
		System.out.print("年齢を入力してください：　");
		
		int age = scanner.nextInt();
		
		System.out.print("身長(cm)を入力してください：　");
		
		double height = scanner.nextDouble();
		
		System.out.print("体重(kg)を入力してください：　");
		
		double weight = scanner.nextDouble();
		
		System.out.print("職業を入力してください");
		
		String job=scanner.next();
		
		
		Person person1 = new Person(firstname,lastname,age,height,weight,job);
		person1.printData();

	}
}
