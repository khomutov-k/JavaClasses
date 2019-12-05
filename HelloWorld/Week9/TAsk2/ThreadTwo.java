package TAsk2;

import java.io.File;

public class ThreadTwo extends Thread{
	
	private int sleepInterval;
	private String fileName;
	public ThreadTwo(int sleepInterval, String fileName) {
		super();
		this.sleepInterval = sleepInterval;
		this.fileName = fileName;
	}
	
	public void run() {
		File myFile = new File(fileName);
		do {
			if (myFile.exists()) {
				break;
			} 
			try {
				Thread.sleep(sleepInterval);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} while (true);
	}
}
