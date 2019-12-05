package Task1;

public class StartClass {

	public static void main(String[] args) {
		PrintTask task = new PrintTask();
		
		Thread th = new Thread(task);
		
		th.start();
	}

}
