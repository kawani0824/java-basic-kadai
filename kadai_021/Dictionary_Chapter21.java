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
	public void search(String word) {

   
        boolean found = false;

        for (String a : dictionary.keySet()) {
            if (a.equals(word)) {
                System.out.println(word + "の意味は" + dictionary.get(word));
                found = true;
                break;
            }
        }

        if (found == false) {
            System.out.println(word + "は辞書に存在しません");
        }
	}
	
}
