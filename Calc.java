public class Calc {
    public static void main(String[] args) {
        //文字列をint型に変換する
        int i1 = Integer.parseInt(args[0]);
        int i2 = Integer.parseInt(args[1]);

        Puls pls = new Plus(i1, i2);
        int result = pls.doCalc();

        System.out.println(i1 + " + " + i2 + " は " + result + " です。");
    }
}
