public class Calc {
	public static void main(String[] args) {
		//�������int�^�ɕϊ�����
		int i1 = Integer.parseInt(args[0]);
		int i2 = Integer.parseInt(args[1]);

		Plus pls = new Plus(i1, i2);
		int ans = pls.doCalc();
		System.out.println(args[0] + " + " + args[1] + " �� " + ans + " �ł��B");
    }
}
