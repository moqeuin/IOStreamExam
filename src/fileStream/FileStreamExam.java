package fileStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamExam {

	public static void main(String[] args) {
		
		// 스트림 : 자바 어플리케이션(프로그램)과 파일 사이에 데이터를 이동시키기 위한 통로역할.
		// 입출력 스트림 : 파일에 입출력 작업을 하기 스트림 객체.
		
		// 파일에 이진 스트림을 출력
		
		byte[] data = {8,0,1,5,6,2};
		// 출력객체 변수
		FileOutputStream out = null;
		
		try {
			// 출력 객체 생성, 파일 생성(프로젝트경로)
			// 매개변수로 두 가지를 지정가능하다.
			// 파일이름 : 디폴트경로에 파일을 찾아서 파일에 입출력을 하기위한 스트림 객체 생성(없으면 파일생성함)
			// 파일객체 : 파일객체의 저장된 경로의 파일에 입출력을 하기위한 스트림 객체 생성.
			out = new FileOutputStream("test.bin");
			try {
				// 파일에 이진스트림 출력
				out.write(data);
				System.out.println("write success");
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			
			try {
				out.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}

}
