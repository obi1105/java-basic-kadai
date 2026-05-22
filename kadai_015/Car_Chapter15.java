package kadai_015;

public class Car_Chapter15 {
	private int gear = 1;
	private int speed = 10;
	
	public Car_Chapter15(int gear, int speed) {
		this.gear = gear;
		this.speed = speed;
		
	}
	
	public void changeGear (int afterGear){
		System.out.println("ギア" + this.gear + "から");	
		System.out.println("ギア" + afterGear + "に切り替えました");
		
	}
	
	public void run() {
		System.out.println("時速は" + this.speed +"kmです");
	}
}
