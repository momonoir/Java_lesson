public class Plus {
    //public static void main(String[] args) {
      //文字列をint型に変換する
      //int i1 = Integer.parseInt(args[0]);
      //int i2 = Integer.parseInt(args[1]);
      //合計値
      //int result = i1 + i2;
      //System.out.println(i1 + " + " + i2 + " は " + result + " です");

      int x;
      int y;

      //コンストラクタ
      //public Plus(int x, int y) {
      //this.x = x;
      //this.y = y;
      //}

      Plus(int x, int y) {
        this.x = x;
        this.y = y;
      }
      //足し算する処理
      public int doCalc() {
        return x + y;
      }
  //  }
  }
