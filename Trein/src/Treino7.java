import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;

public class Treino7 {
	
	
	public static void main(String[] args) throws Exception {
		String s = "AILTON";
		StringReader sr = new StringReader(s);
		BufferedReader br = new BufferedReader(sr);
		
		System.out.println((char) br.read());
		System.out.println((char) br.read());
		System.out.println((char) br.read());
		
		br.mark(0);
		System.out.println("Mark Invoked");
		System.out.println((char) br.read());
		System.out.println((char) br.read());
		System.out.println((char) br.read());
		
		br.reset();
		System.out.println("Reset invoked");
		System.out.println((char) br.read());
		System.out.println((char) br.read());
		System.out.println((char) br.read());
		
		
		}
	
}
