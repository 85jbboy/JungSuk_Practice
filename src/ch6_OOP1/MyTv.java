package ch6_OOP1;

public class MyTv {
	boolean isPowerOn;
	int channel;
	int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL= 100;
	final int MIN_CHANNEL= 1;
	
	void turnOnOff() { // isPowerOn의 값이 true이면 false로 false이면 true로 바꿈
		isPowerOn = !isPowerOn;
	}
	
	void volumeUp() { //MAX_VOLUME보다 작은 때만 값을 1증가시킴
		if(volume < MAX_VOLUME) 
			volume++;
	}
	
	void volumeDown() { // MIN_VOLUME보다 클 때만 값을 1감소시킴
		if(volume > MIN_VOLUME)
			volume--;
	}
	
	void channelUp() {// Channel값 1증가. MAx이면 Min으로 바꿈
		if(channel == MAX_CHANNEL)
			channel = MIN_CHANNEL;
		else
			channel++;
	
	}
	
	void channelDown() { // channel값 1 감소, min이면 max로 바꿈
		if(channel == MIN_CHANNEL)
			channel = MAX_CHANNEL;
		else
			channel--;
	}	
}

