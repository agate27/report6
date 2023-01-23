package jp.ac.uryukyu.ie.e225722;
import java.util.Random;
import java.util.Scanner;

/**プレイヤーの行動に関するクラス
*　  
*/
public class Player {

    /**キーボードからの入力を受け付ける。
     * @return　 input 入力した文字列型
     */
    public String Solution(){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return input;
    }
    
    public int dice(){
        System.out.println("謎のダイスをふる");
        Random ran = new Random();
        int number = ran.nextInt(100);
        return number;
    }

}
