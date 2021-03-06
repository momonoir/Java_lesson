public class Plus {
	//この例題の場合は、
	//コンストラクタで、値を設定して、
	//メソッドで、それを処理させるので、
	//フィールド変数を用意してやってください

	private int x;  //フィールド変数です
	private int y;  //これも、フィールド変数です

	//private は、アクセス修飾子の一つです。
	//アクセス修飾子は、どの範囲からこの変数を使えるかを
	//指定するもので、仲間は以下の３つ

	// private このクラス内からのみ使ってよい変数
	// protected このクラスと、継承したクラスから使ってよい変数
	// public 関係ないクラスからでも、だれからでも使える変数
	// あと、アクセス修飾子を付けないというのもあるけど、同じパッケージのクラスからは使えるってやつだったかな？
	//
	// public class Plus にも、アクセス修飾子付けますが、
	//  これは、そのクラスが、他人からは、そういうこと・・・。

	//コンストラクタ
	public Plus(int x, int y) {
		this.x = x;
		this.y = y;
		//そうですね。パラメータとフィールド変数が同じ名前の場合は、
		//コンパイラに教えてやるために、フィールド変数側に
		//this.を付けてやります。

		//この例題では、これは、ここでは、いらないです。
		//this.z = doCalc(x, y);
	}

	// ↑コンストラクタの説明
	// 型がなくて、クラス名と同じメソッドが、コンストラクタです。
	//  「これから、このクラスの実態を使いますよ〜」と、
	//  new Plus(100, 200); とやったときに呼ばれます。
	//  オブジェクトの中身を用意するのが、主な役目です。
 	//
	//  この場合、括弧の中の i1, i2 が引数（パラメータ）です。
	//-----------------------

	//-----------------------
	// ↓これも、メソッド。
	//  引数がいらない場合は、括弧のみ書く。
	//  return は戻り値。戻り値は、理解しているように見えるけど。
	public int doCalc() {
        int ans = this.x + this.y;
        return ans;

		// x, y はここでは、フィールド変数にしかないので、this.を省略できます。
        // int ans = x + y;
        // return ans;

		//この場合は、↓こう書いてもよいです。
		//return this.x + this.y;
	}
}
