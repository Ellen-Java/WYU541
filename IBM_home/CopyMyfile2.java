package ibm.homework.day917;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ʹ�û����ֽ�������myfile.txt�ļ�Ϊmyfile_cp2.txt
 */
public class CopyMyfile2 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("myfile.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);

		FileOutputStream fos = new FileOutputStream("myfile_cp2.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);

		int len = -1;
		while ((len = bis.read()) != -1) {
			bos.write(len);
		}
		System.out.println("���Ƴɹ�������");
		bos.close();
		bis.close();
	}
}
