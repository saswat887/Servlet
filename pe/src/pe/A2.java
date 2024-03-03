package pe;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A2 {
	public static void main(String[] args)
	{
		Pattern p=Pattern.compile("[abc]",Pattern.CASE_INSENSITIVE);
		Matcher m=p.matcher("d");
		boolean c=m.find();
		if(c==true)
			System.out.println("Match");
		else 
			System.out.println("Not Match");
	}
}
