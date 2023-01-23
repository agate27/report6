package jp.ac.uryukyu.ie.e225722;

public class Main {
    public static void main(String[] args){
        Player player = new Player();
        GameMaster gameMaster = new GameMaster();
        Girl girl = new Girl("丼子", 10);
        System.out.println("∴∵∴ ୨୧ ∴∵∴ ୨୧ ∴∵∴ ୨୧ ∴∵∴　୨୧ ∴∵∴ ୨୧ ∴∵∴ ୨୧ ∴∵∴");
        System.out.println("あなたは森の中で謎の生命体(  ◝▿◜  )を保護しました。");
        System.out.println("どうやら名前は" + girl.getName() + "と話しています。");
        System.out.println("大変！！どうやらお腹が減っているようです。");
        System.out.println("クイズに正しく答えてご飯を獲得しましょう！");
        System.out.println("∴∵∴ ୨୧ ∴∵∴ ୨୧ ∴∵∴ ୨୧ ∴∵∴　୨୧ ∴∵∴ ୨୧ ∴∵∴ ୨୧ ∴∵∴");
        System.out.print("理解できましたか？ (yse/はい)");

        do{
            String str = player.Solution();
            if (str.equals("yes") || str.equals("はい") ){
                System.out.println("部屋から出られなくなった！");
                break ;
            }
            System.out.println("(  ◝▿◜  )");
        }while(true);
        
        gameMaster.gameStart(player, girl);
    }
}
