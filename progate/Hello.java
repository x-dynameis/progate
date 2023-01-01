package progate;

class Hello {
	public static void main(String[] args) {
//		System.out.println("Hello world!");
		Person person1 = new Person("hiroyuki","ozaki",47,174,82,"介護支援専門員");
		person1.printData();		
		Person person2 = new Person("Jone","clistopher","Smith",65,175,80,"教師");
		person2.printData();
		
		Person.printCount();
		
//		Bicycle bicycle = new Bicycle("ビアンキ","赤");
//		bicycle.printData();
		
	}
}
