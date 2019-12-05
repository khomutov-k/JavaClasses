package Week8;

public class Bicycle extends Vehicle{
	private int frameHeight;
	private int wheelSize;

	public int getFrameHeight() {
		return frameHeight;
	}

	public void setFrameHeight(int frameHeight) {
		this.frameHeight = frameHeight;
	}
	

	public int getWheelSize() {
		return wheelSize;
	}

	public void setWheelSize(int wheelSize) {
		this.wheelSize = wheelSize;
	}

	@Override
	public String toString() {
		return "Bicycle [frameHeight=" + frameHeight + ","
				+ " wheelSize=" + wheelSize + "]";
	}
	
}
