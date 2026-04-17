package kadai_021;

import java.util.HashMap;
import java.util.Map;

public class Dictionary_Chapter21 {
	Map<String,String> dictionary = new HashMap<>();
	public Dictionary_Chapter21() {
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
	}
	public void search(String[] word) {

   
        for (int a = 0; a<word.length;a++) {
            if (dictionary.get(word[a])!=null) {
                System.out.println(word[a] + "の意味は" + dictionary.get(word[a]));
            }else {
            	 System.out.println(word[a] + "は辞書に存在しません");
            }
        }
  
	}
	
}
