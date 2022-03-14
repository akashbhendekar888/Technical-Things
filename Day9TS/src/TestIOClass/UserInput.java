package TestIOClass;
import java.io.*;

public class UserInput {
public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	
	InputStreamReader is=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(is);

	int num= Integer.parseInt(br.readLine());
	System.out.println("Enter the Numbers::"+num);
	
	}

}
