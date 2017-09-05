public class Hello {
    public static void main(String[] args) {
        int i = 0;//カウンタ

    for(; i < args.length; i++) {//パラメータの数まで続ける、カウンタは1ずつ増える
      System.out.println("Hello " + args[i] + "!");
      }

/*  whileで書いた場合
        while (i < args.length) {//パラメータの数まで
            System.out.println("Hello " + args[i] + "!");

            i = i + 1;//カウンタを１増やす
        }
*/
    }
}
