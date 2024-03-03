package pe;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A5 {
	public static void main(String[] args) {
		String s="Saswat Nayak";
		Matcher s_=Pattern.compile("[s]",Pattern.CASE_INSENSITIVE).matcher(s);
		Matcher a=Pattern.compile("[a]",Pattern.CASE_INSENSITIVE).matcher(s);
		int s_count=0;
		int a_count=0;
		while(s_.find())
			s_count++;
		while(a.find())
			a_count++;
		System.out.println(s_count);
		System.out.println(a_count);
	}

}
