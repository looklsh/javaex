package com.bit.javaex.io.bytestream;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DataStreamEx {
	static String dirName = "D:\\javastudy\\files";
	static String filename = dirName + "\\primitives.txt";

	// DataInputStream과 DataOutputStream
	// 기본 데이터 ㅌ입을 byteSTREAM타입으로 다루기 위한
	// 보조 스트림 클래스(변환작업 대신 수행
	public static void main(String[] args) {
		try {
			// 메인스트림 열어보자
			OutputStream fos = new FileOutputStream(filename);
			// 보조 스트임 연결
			DataOutputStream dos = new DataOutputStream(fos);

			// 기본 데이터 풀력
			// String - boolean - float순서
			dos.writeUTF("홍길동");
			dos.writeBoolean(true);
			dos.writeInt(25);
			dos.writeFloat(80.9f);

			dos.writeUTF("장길산");
			dos.writeBoolean(false);
			dos.writeInt(30);
			dos.writeFloat(99.9f);

			dos.close();
			// InputStream 설정
			InputStream fis = new FileInputStream(filename);
			// 기본 타입으로 변환을 위한 보조 스트림 연결
			DataInputStream dis = new DataInputStream(fis);

			// 루푸 돌ㄹ서 냐용 읽어오기
			for (int i = 0; i < 2; i++) {
				// 읽어올때 출력한 순서에 맞게 읽어와야 함(주의)
				String s= dis.readUTF();
				boolean b= dis.readBoolean();
				int val= dis.readInt();
				float f = dis.readFloat();
				
//				double d= dis.readDouble();
				
				System.out.printf("%s:%b:%d:%f:%n",s,b,val,f);

			}
			
			dis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
