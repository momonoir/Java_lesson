import java.io.File;
import java.io.Reader;
import java.io.FileReader;

public class PrTxt {
    public static void main(String[] args) {
        try {
            //�A�[�M�������g�Ɏw�肳�ꂽ�t�@�C�������w�肵��
            File file = new File(args[0]);

            //�t�@�C����ǂ�ł����I�u�W�F�N�g�𐶐�����
            Reader reader = new FileReader(file);

            //�ŏ��̕�����ǂݍ���
            int ch = reader.read();

            while (ch != -1) {  //�t�@�C���̏I���łȂ�������
                //�W���o�́i��ʁj�ɏo��
                System.out.print(ch);//((char)ch);

                //���̕�����ǂݍ���ŁA�J��Ԃ�
                ch = reader.read();
            }

            //��Еt��
            reader.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
