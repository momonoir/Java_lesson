import java.io.File;
import java.io.Reader;
import java.io.FileReader;

public class PrTxt {
    public static void main(String[] args) {
        try {
            //アーギュメントに指定されたファイル名を指定して
            File file = new File(args[0]);

            //ファイルを読んでくれるオブジェクトを生成する
            Reader reader = new FileReader(file);

            //最初の文字を読み込む
            int ch = reader.read();

            while (ch != -1) {  //ファイルの終わりでなかったら
                //標準出力（画面）に出力
                System.out.print(ch);//((char)ch);

                //次の文字を読み込んで、繰り返し
                ch = reader.read();
            }

            //後片付け
            reader.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
