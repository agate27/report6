package jp.ac.uryukyu.ie.e225722;

public class Girl {
    private String name;
    private int madness;
    private boolean dead;

    Girl (String name, int madness){
        this.name = name;
        this.madness = madness;
        this.dead = false;
    }

    public void showStatus() {
        System.out.println("▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲");
        System.out.println("--今日のステータスを表示します--");
        System.out.printf("%s:狂気度％ %d\n", name, madness);
        System.out.println("▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲");
    }

    public void decrease(int happiness) {
        if(happiness < 0) {
           throw new IllegalArgumentException("Character.damaged:引数damegeは正の数である必要があります");
        }
        this.madness -= happiness;
        System.out.print("狂気度が" + happiness + "％減少した。");
    }
    
    public void increase(int madness){
        if(madness < 0) {
            throw new IllegalArgumentException("Character.resilience:引数resilienceは正の数である必要があります");
        }
        this.madness += madness;
        System.out.print("狂気度が" + madness + "％増加した。");
    }

    public void observation(boolean result,int madness, int happiness){
        if(result){
            System.out.println("----" + name + "に食べ物を与えたᗦ↞◃ ----");
            System.out.println("");
            System.out.println("(((╭( ˇωˇ)╯)))ﾙﾝﾙﾝ");
            System.out.println("");
            System.out.println("ŧ‹”ŧ‹”( ‘ч’ )ŧ‹”ŧ‹”");
            System.out.println("");
            decrease(happiness);
        }else{
            System.out.println("---" + name + "に何もあげることができなかった---");
            increase(madness);
            System.out.println(": (っ`ω´c):ﾑﾑﾑﾑﾑｩ");
            if(madness >=100 ){
                dead = true;
                System.out.println("お腹の空いた" + name + "に食べられた。Σ(ﾟ∀´(ω･´　)ｶﾞﾌﾞｶﾞﾌﾞｶﾞﾌﾞｶﾞﾌﾞｶﾞﾌﾞ");
                System.out.println("----Game over----");
            }
        }
    }

    public String getName() {
        return name;
    }

    public int getMadness() {
        return madness;
    }

    public boolean isDead() {
        return dead;
    }
}

