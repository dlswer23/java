package Interface;

public class Tv implements RemoteControl {

	// 필드
	private int volume;

	// turnOn() 추상 메소드의 실제 메소드
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다");

	}

	// turnOff() 추상 메소드의 실체 메소드
	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다");

	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			System.out.println("현재 TV 볼륨 : " + this.volume);
		}
	}
}
