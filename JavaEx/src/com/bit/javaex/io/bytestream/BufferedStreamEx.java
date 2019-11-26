package com.bit.javaex.io.bytestream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedStreamEx {
	//보조 스트림 활용한 성능 향상
	//데코레이터 패턴
	static String dirName = "D:\\javastudy\\files";
	static String source = dirName + "\\img.jpg";
	static String target = dirName + "\\img.buffered.copy.jpg";
	
	public static void main(String[] args) {
		try {
			//파일 스트림을 열어봅시다
			InputStream fis= new FileInputStream(source);
			OutputStream fos= new FileOutputStream(target);
			
			//성능 향상을 위해서 buffer기반 보조 스트림 연결
			BufferedInputStream bis= new BufferedInputStream(fis);
			//보조 스트림은 입출력 기능은 없으면 부가적 기능만 추가 수행
			BufferedOutputStream bos= new BufferedOutputStream(fos);
			byte[] data=new byte[1024]; // 1kb 버퍼
			int size=0; //읽어들인 바이트 수
			
			while((size=bis.read(data)) !=-1){
				bos.write(data);
				System.out.println(size+"바이트 복사");
			}
			System.out.println("파일 복사 완료!");
			bos.close();
			bis.close();
			//보조 스트림을 close하면 주스트림도 함께 close됨
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
