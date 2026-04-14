package kadai_015;

public class Car_Chapter15 {
	//フィールド
	private int gear=1;
	private int speed=10;
	public void changeGear( final int afterGear ) {
		System.out.println("ギア"+gear+"から"+afterGear+"に切り替えました");
		gear = afterGear;
		if((gear<1)&&(gear>5)) {
			speed = 10;
		}else {
			speed = gear*10;
		}
	}
	public void run() {
		System.out.println("速度は時速"+speed+"kmです");
	}
}
