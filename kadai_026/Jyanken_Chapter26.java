package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	
	//自分のじゃんけんの手を入力するメソッド
	public String getMyChoice() {
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		Scanner scanner = new Scanner(System.in);
		
		String input= scanner.next();
		
		if(input.equals("r") || input.equals("s") || input.equals("p") ) {
			return input;
		}else{
			return getMyChoice();
		}
	}
	
	//対戦相手のじゃんけんの手を乱数で選ぶメソッド
	public String getRandom() {
		String[] array = {"r", "s", "p"};
		
		String randJyan = array[(int)(Math.random() * 3)];
		
		return randJyan;
	}
	//じゃんけんを行うメソッド
	public void playGame(String input, String randJyan) {
		HashMap<String,String> done = new HashMap<String,String>();
		
		done.put("r", "グー");
		done.put("s", "チョキ");
		done.put("p", "パー");
		
		System.out.println("自分の手は" + done.get(input) + ",対戦相手の手は" + done.get(randJyan) );
	
		if(input.equals(randJyan)) {
			System.out.println("あいこです");
		}else if((input.equals("r")) && (randJyan.equals("s")) || (input.equals("s")) && (randJyan.equals("p"))  || (input.equals("p")) && (randJyan.equals("r")) ){
			System.out.println("自分の勝ちです");
		}else {
			System.out.println("自分の負けです");
		}
	}
}

