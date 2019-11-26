package com.bit.javaex.io.bytestream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileStreamEx {
	//FileInputStream과 FileOutputStream
	static String dirName = "D:\\javastudy\\files";
	static String source = dirName + "\\img.jpg";
	static String target = dirName + "\\img.copy.jpg";
	public static void main(String[] args) {
		//source파일을 /FileInputStream으로 열어서 
		//target 파일로 복사( FileOutputStream)
		try {
			//스트림 열기
			InputStream is = new FileInputStream(source);
			OutputStream os= new  FileOutputStream(target);
			
			int data=0; //데이터 저장용
			//InputStream으로부토 데이터를 불러와서
			//OutputStream으로 저장
			while((data=is.read())!=-1) {
				System.out.println("*");
				os.write(data);
				//한 바이트 단위로 복사 시도 : 효율상 문제
				//TODO: 버퍼 방식으로 변경해볼 예정
			}
			//
			os.close();
			is.close();
			System.out.println("파일을 복사했어요!");
		}catch(IOException e) {
			e.printStackTrace();
		}
		

	}

}
