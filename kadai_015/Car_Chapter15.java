package kadai_015;

public class Car_Chapter15 {
	//フィールド
	private int gear;
	private int speed;
	//コンストラクタ
	public Car_Chapter15(int gear,int speed) {
		this.gear=gear;
		this.speed=speed;
	}
	public void changeGear( final int afterGear ) {
		System.out.println("ギア"+gear+"から"+afterGear+"に切り替えました");
		this.gear = afterGear;
	}
	public void run() {
		for(int i=1;i<=5;i++) {
			if(i == this.gear) {
				this.speed = i*10;
				System.out.println("速度は"+this.speed+"kmです");
			}
			
		}
		if((this.gear<0)||(this.gear>5)) {
			System.out.println("速度は10kmです");
		}
	}
}
