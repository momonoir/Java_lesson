import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CpTxt0 {
    public static void main(String[] args) {
        try {
            //���̓t�@�C���̎w��
            File input = new File(args[0]);
            FileInputStream filein = new FileInputStream(input);

            //�o�̓t�@�C�����̎w��
            File output = new File(args[1]);
            FileOutputStream fileout = new FileOutputStream(output);

            //���̓t�@�C�������̂܂܏o�̓t�@�C���ɏ����o��
           byte buf[] = new byte[256];
           int len;
            while ((len = filein.read(buf)) != -1) {  //�t�@�C���̏I���łȂ�������
            fileout.write(buf, 0, len);
            }

            //��Еt��
            fileout.flush();
            fileout.close();
            filein.close();

            System.out.println("�R�s�[���������܂���");
        } catch(IOException e) {
            //��O������
            System.out.println("�R�s�[�Ɏ��s���܂����B");
            e.printStackTrace();
        }
    }
}
