package jp.ac.uryukyu.ie.e225722;

public class Main {
    public static void main(String[] args){
        Player player = new Player();
        GameMaster gameMaster = new GameMaster();
        Girl girl = new Girl("丼子", 80);

        System.out.println("∴∵∴ ୨୧ ∴∵∴ ୨୧ ∴∵∴ ୨୧ ∴∵∴　୨୧ ∴∵∴ ୨୧ ∴∵∴ ୨୧ ∴∵∴");
        System.out.println("あなたはとあるダンジョンの隠し部屋で、謎の生命体(  ◝▿◜  )に出会いました。");
        System.out.println("名前は" + girl.getName() + "と話しています。");
        System.out.println("どうやらお腹が減っているようで、このままだとヤバそうです。。");
        System.out.println("クイズに正しく答えて食べ物を獲得しましょう！");
        System.out.println("獲得した食べ物を与えて狂気度を下げましょう");
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
