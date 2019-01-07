package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class PhoneList01 {

	public static void main(String[] args) {
		BufferedReader br = null;

		try {
			File file = new File("phone.txt");
			//파일의 존재유무
			if(file.exists()==false) {
				System.out.println("File Not Found");
				return;
			}

			System.out.println("=========파일정보=========");
			System.out.println(file.getAbsolutePath());	//주소
			System.out.println(file.length()+"bytes");	//size
			//Date d = new Date(file.lastModified());
			//SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-DD hh:mm:ss");
			//System.out.println(sdf.format(d));	//파일 생성 시간
			System.out.println(new SimpleDateFormat("yyyy-MM-DD hh:mm:ss").format(new Date(file.lastModified())));	//파일 생성 시간

			System.out.println("=========전화번호=========");

			//기반스트림(byte)
			FileInputStream fis = new FileInputStream(file);

			//보조스트림 1 (byte -> char)
			InputStreamReader isr = new InputStreamReader(fis,"utf-8");

			//보조스트림 2 (line 입력)
			br = new BufferedReader(isr);
			
			//처리
			String line = null;
			while((line = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line,"\t ");
				int index = 0;
				while(st.hasMoreElements() == true) {
					String token = st.nextToken();
					System.out.print(token);

					if(index == 0) {//이름
						System.out.print(":");
					} else if(index == 1) {//번호
						System.out.print("-");						
					} else if(index == 2) {
						System.out.print("-");						
					}
					index++;
				}
				System.out.println();
			}

		} catch (IOException e) {
			System.out.println("Error : "+e);
		} finally {
			try {
				if(br != null) {
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}


	}

}
