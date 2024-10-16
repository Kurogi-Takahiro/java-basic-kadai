package kadai_015;

//商品のクラス
public class Car_Chapter15 {
	//フィールド（内部のデータ）実際変化する部分
	private int  gear = 1;
	private int speed = 10;
	
	//コンストラクタ（初期化処理）
	public Car_Chapter15() {
	}
	
	//メソッド 
	public void gearChange( int afterGear) {
		System.out.println("ギア1から" + afterGear + "に切り替えました");
		
		switch(afterGear) {
		case 1 -> this.speed = 10;
		case 2 -> this.speed = 20;
		case 3 -> this.speed = 30;
		case 4 -> this.speed = 40;
		case 5 -> this.speed = 50;
		default -> this.speed = 10;
		};
	}
	
	public void run(){
		System.out.println("速度は時速" + this.speed + "kmです" );
	}
	
}
