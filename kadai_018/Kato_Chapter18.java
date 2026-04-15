package kadai_018;

abstract public class Kato_Chapter18 {
	public String familyName = "加藤";//上の名前
	public String givenName;//下の名前
	public String address = "住所は東京都中野区〇×";//住所
	
	public void commonIntroduce() {				//共通のこと
		System.out.println("名前は"+familyName+givenName+"です");
		System.out.println("住所は"+address+"です");
	}
	abstract public void eachIntroduce();		//個別のこと
	public void execIntroduce() {				//紹介を実行
		commonIntroduce();
		eachIntroduce();
		System.out.println();
	}
}
