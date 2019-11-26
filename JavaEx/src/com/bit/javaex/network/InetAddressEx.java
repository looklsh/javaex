package com.bit.javaex.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx {
	//1. 내로컬 IP확인
	//2.도메인 네임으로 서버 IP확인
	public static void printLocalIP() {
		//InetAdress 클래스 : ip확인
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.printf("Local IP:%s%n", local.getHostAddress());
			System.out.printf("Local Host:%s%n", local.getHostName());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void printServerIP(String hostname) {
		//hostname으로 명명된 서버의 ip확인
		try {
			InetAddress[] addrs = InetAddress.getAllByName(hostname);
			//hostname에 연결된 모든 InetAddress 정보 반환
			for (InetAddress remote:addrs) {
				System.out.printf("%s IP: %s%n", remote.getHostName(),remote.getHostAddress());
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		//printLocalIP();
		printServerIP("www.Naver.com");
		printServerIP("www.google.com");
	}

}
