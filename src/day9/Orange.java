package day9;

public class Orange implements FruitMkt,VegMarket {
	
	public void tasty() {
		System.out.println("Orange is very very Tasty");
		
	}
	
	public void healthy() {
		System.out.println("Vegetable are healthy for health");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Orange obj=new Orange();
		obj.tasty();
		obj.healthy();
		obj.show();
		

	}

	
	

	

}
