package fileStream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class IOStreamExam {

	public static void main(String[] args) {
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;
		
		
		// ByteArrayInput(Output)Stream은 바이트배열에 입출력을 하는 스트림으로 내부버퍼에 저장이 된다. 
		// 주로 파일에 입출력하기 전에 데이터를 임시로 담아서 변환 등의 작업을 하기위한 스트림이다. 잘 사용하지는 않는다.
		// 파일이 아닌 자바 어플리케이션 상에서 입출력을 사용하기위한 객체
		// 사용하는 자원이 메모리 밖에 없기 때문에 close()를 사용하지 않아도 된다.
		
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;
		
		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();
		
		int data = 0;
		
		while((data = input.read()) != -1) {
			output.write(data);
		}
		outSrc = output.toByteArray();
		System.out.println(Arrays.toString(outSrc));
	}

}
