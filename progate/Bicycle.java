package progate;

class Bicycle {
	private String name;
	private String color;
	
	public Bicycle(String name,String color) {
		this.name = name;
		this.color = color;
	}
	public void printData() {
		System.out.println("【自転車の情報】");
		System.out.println("自転車の名前: "+ this.name);
		System.out.println("自転車の色: "+ this.color);
	}
	
}
