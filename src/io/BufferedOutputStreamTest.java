package io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamTest {

	public static void main(String[] args) {

		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			//기반스트림 ( 주 스트림 ) - 소스에 연결
			fos = new FileOutputStream("test.txt");

			//보조 스트림 ( 기반스트림(주스트림)에 연결) - Runtime 때 기능이 확장 된다.
			bos = new BufferedOutputStream(fos);

			//output
			for(int i='a';i<='z';i++) {
				//for(int i=97;i<=122;i++) {	ASCII CODE 이용
				bos.write(i);
			}

		} catch (FileNotFoundException e) {
			System.out.println("File Not Found:"+e);
		} catch (IOException e) {
			System.out.println("IOException:"+e);
		}
		finally {
			try {
				if(bos != null) {
					bos.close();
				}
				//보조스트림만 닫아주면 주 스트림도 자동적으로 닫힌다.
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
