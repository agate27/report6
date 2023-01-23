package jp.ac.uryukyu.ie.e225722;

import java.util.ArrayList;
import java.util.List;

public class GameMaster {
    private Quiz[] qusetions = new Quiz[] {
        new YesNoQuiz("の複数形は women", "まる",1),
        new YesNoQuiz("の複数形は women", "まる",1),
        new YesNoQuiz("の複数形は women", "まる",1),
        new YesNoQuiz("の複数形は women", "まる",1),
        new WritingQuiz("を表す英単語は", "orange",1),
        new WritingQuiz("を表す英単語は", "orange",1),
        new WritingQuiz("を表す英単語は", "orange",1),
    };

    public void gameStart(Player player,Girl girl){
        for(int i = 0; i < qusetions.length; i ++) {
            Quiz question = qusetions[i];
            System.out.println("");
            System.out.println("⇨" + (i + 1) +  "日目");
            girl.showStatus();
            
            System.out.println(question.getQuiz());
            List<String> answerList = new ArrayList<String>();
            
            do{
                String input = player.Solution();
                if (question.cheak(input)){
                    answerList.add(input);
                    break ;
                }
                System.out.println("入力条件を確認してください");
            }while(true);

            String getInput =answerList.get(0);
            boolean judges = question.judge(getInput);

            if(judges){
                System.out.println("");
                System.out.println("やったね正解★");
                int happiness = question.getHappyness();
                int madness = player.dice();
                girl.observation(judges, madness, happiness);
            }else{
                System.out.println("");
                System.out.println("ざんねん不正解。正解は " + question.getAnswer() + "でした。");
                int happiness = question.getHappyness();
                int madness = player.dice();
                girl.observation(judges, madness, happiness);
                if (girl.isDead()){
                    break;
                }
            }
        }
    }
}
