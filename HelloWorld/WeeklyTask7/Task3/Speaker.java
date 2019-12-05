package Task3;

public class Speaker implements ITelephoneSpeaker {

	private int volume = 0;
	private boolean isMuted = false;
	@Override
	public boolean mute() {
		if (!isMuted) {
			isMuted = true;
			return true;
		}
		else return false;
	}

	@Override
	public boolean unMute() {
		if (isMuted) {
			isMuted = false;
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
