package ch7_OOP2;

public class MyTv2 {
	private boolean m_isPowerOn;
	private int m_channel;
	private int m_volume;
	private int m_prevChannel;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL= 100;
	final int MIN_CHANNEL= 1;
	
	public void turnOnOff() {
		m_isPowerOn = !m_isPowerOn;
	}
	
	public void gotoPrevChannel() {
//		int tmp = m_channel;
//		m_channel = m_prevChannel;
//		m_prevChannel = tmp;
		setChannel(m_prevChannel);
	}
	
	public void setVolume(int volume) {
		if(volume > MAX_VOLUME || volume < MIN_VOLUME)
			return;
		m_volume = volume;
	}
	
	public int getVolume() {
		return m_volume;
	}
	
	public void setChannel(int channel) {
		if(channel > MAX_CHANNEL || channel < MIN_VOLUME)
			return;
		m_prevChannel = m_channel;
		m_channel = channel;
	}
	
	public int getChannel() {
		return m_channel;
	}
}

