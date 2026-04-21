package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {

    // 自分の手を入力
    public String getMyChoice() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("自分のじゃんけんの手を入力しましょう");
        System.out.println("グーはrockのrを入力しましょう");
        System.out.println("チョキはscissorsのsを入力しましょう");
        System.out.println("パーはpaperのpを入力しましょう");

        String input = scanner.nextLine();
        return input;
    }

    // 相手の手をランダムで決定
    public String getRandom() {
        String[] hands = {"r", "s", "p"};

        double rand = Math.random() * 3;
        int index = (int) Math.floor(rand);

        return hands[index];
    }

    // じゃんけん実行
    public void playGame() {

        String my = getMyChoice();
        String enemy = getRandom();

        // 表示用
        HashMap<String, String> map = new HashMap<>();
        map.put("r", "グー");
        map.put("s", "チョキ");
        map.put("p", "パー");

        System.out.println("自分の手は" + map.get(my) + ",対戦相手の手は" + map.get(enemy));

        // 判定
        if (my.equals(enemy)) {
            System.out.println("あいこです");
        } else if (
                (my.equals("r") && enemy.equals("s")) ||
                (my.equals("s") && enemy.equals("p")) ||
                (my.equals("p") && enemy.equals("r"))
        ) {
            System.out.println("自分の勝ちです");
        } else {
            System.out.println("自分の負けです");
        }
        
    }
}
