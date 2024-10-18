package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {

		
	public void search (String[] array) { 
		
		//HashMapを宣言
		HashMap<String,String> word = new HashMap<String,String>();
		
		//辞書に、次の10通りの英単語と訳を追加
		word.put("apple", "りんご");
		word.put("peach", "もも");
		word.put("banana", "バナナ");
		word.put("lemon", "レモン");
		word.put("pear", "梨");
		word.put("kiwi", "キウィ");
		word.put("strawberry", "いちご");
		word.put("grape", "ぶどう");
		word.put("muscat", "マスカット");
		word.put("cherry", "さくらんぼ");
			
			//配列から代入
			for( int i = 0; i < array.length; i++) {
				word.get(array[i]);
				
				if( word.get(array[i]) == null) {
					System.out.println( array[i] + "は辞書に存在しません");
				}else {
					System.out.println( array[i] + "の意味は" + word.get(array[i]));
			  }
			}
		}	
	}

