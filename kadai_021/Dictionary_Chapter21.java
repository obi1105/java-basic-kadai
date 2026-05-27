package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
		
		private HashMap <String,String> dictionary = new HashMap <String,String>();
		
		public void searchWords(String[] words){
		dictionary.put("apple", "りんご");
		dictionary.put("peach", "桃");
		dictionary.put("banana", "バナナ");
		dictionary.put("lemon", "レモン");
		dictionary.put("pear", "梨");
		dictionary.put("kiwi", "キウィ");
		dictionary.put("strawberry", "いちご");
		dictionary.put("grape", "ぶどう");
		dictionary.put("muscat", "マスカット");
		dictionary.put("cherry", "さくらんぼ");
		
		for(String check : words) {
			String val = dictionary.get(check);
			
			if(dictionary.get(check) != null ) {
				System.out.println( check + "の意味は"+ val);
			} else {
				System.out.println(check + "は辞書に存在しません");
			}

		}

	}
}

	
	

