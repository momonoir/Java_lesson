import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CpTxt0 {
    public static void main(String[] args) {
        try {
            //入力ファイルの指定
            File input = new File(args[0]);
            FileInputStream filein = new FileInputStream(input);

            //出力ファイル名の指定
            File output = new File(args[1]);
            FileOutputStream fileout = new FileOutputStream(output);

            //入力ファイルをそのまま出力ファイルに書き出す
           byte buf[] = new byte[256];
           int len;
            while ((len = filein.read(buf)) != -1) {  //ファイルの終わりでなかったら
            fileout.write(buf, 0, len);
            }

            //後片付け
            fileout.flush();
            fileout.close();
            filein.close();

            System.out.println("コピーが完了しました");
        } catch(IOException e) {
            //例外時処理
            System.out.println("コピーに失敗しました。");
            e.printStackTrace();
        }
    }
}
