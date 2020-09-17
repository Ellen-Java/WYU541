package ibm.homework.day917;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用缓冲字节流复制myfile.txt文件为myfile_cp2.txt
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
		System.out.println("复制成功！！！");
		bos.close();
		bis.close();
	}
}
