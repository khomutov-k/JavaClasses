package Task3;

public class Computer extends Product{
	private String mark;
	private String model;
	public Computer(String mark, String model,String productNumber, int location, int amount) {
		super(productNumber,location, amount);
		this.mark = mark;
		this.model = model;
	}
	public Computer(String mark, String model, int amount, String productNumber){
		super(productNumber);
		this.mark = mark;
		this.model = model;
	}
	public Computer(String mark, String model) {
		super();
		this.mark = mark;
		this.model = model;
	}
	public Computer() {
		super();
	}
	@Override
	public String toString() {
		return "Computer [mark=" + mark + ", model=" + model + ", " + super.toString() + "]";
	}
	
}
