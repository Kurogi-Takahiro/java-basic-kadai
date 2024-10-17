package kadai_018;

abstract public class Kato_Chapter18 {

	//名字フィールド
	String familyName = "加藤";
	//名前フィールド
	String givenName;
	//住所フィールド
	String address = "東京都中野区〇×";
	
	//出力メソッド
	public void commonIntroduce() {
		System.out.println("名前は" + familyName + givenName + "です");
		System.out.println("住所は" + address + "です");
	}	
	//抽象メソッド
	abstract void eachIntroduce();
	
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
	}
	
}