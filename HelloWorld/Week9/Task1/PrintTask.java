package Task1;

public class PrintTask implements Runnable{

	@Override
	public void run() {
		System.out.println("Waiting for...");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
