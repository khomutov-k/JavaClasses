package Task3;

public class Microphone implements ITelephoneMic {

	private int volume;
	private boolean micState = false;
	@Override
	public boolean micOn() {
		if (!micState) {
			micState=true;
			return true;
		}
		else return false;
	}
	@Override
	public boolean micOff() {
		if (micState) {
			micState=false;
			return true;
		}
		else return false;
	}
	
	@Override
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	@Override
	public int getVolume() {
		return volume;
	}

}
