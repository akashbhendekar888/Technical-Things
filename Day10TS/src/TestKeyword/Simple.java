package TestKeyword;

import java.io.*;

public class Simple {

	public static void main(String[] args) throws Exception {
		
			InputStreamReader is=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(is);
			int a=Integer.parseInt(br.readLine());
			BufferedOutputStream bor=new BufferedOutputStream(br);
			System.out.println(a);
		

	}

}
