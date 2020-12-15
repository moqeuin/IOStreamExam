package fileStream;

import java.io.FileInputStream;

import java.io.IOException;

public class FileStreamExam2 {

	public static void main(String[] args) {
		
		// 자바파일의 모든 코드 출력
		
		try {
			FileInputStream fis = new FileInputStream(".\\src\\fileStream\\FileStreamExam2.java");
			
			int data = 0;
			
			
			while((data = fis.read()) != -1) {
				
				char c = (char)data;
				System.out.print(c);
			}
		}catch (IOException e) {	
				e.printStackTrace();
			}	
	}

}
