package pe;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A4 {
	public static void main(String[] args) {
		Pattern p=Pattern.compile("s{2,4}",Pattern.CASE_INSENSITIVE);
	//	System.out.println(p);
		Matcher m=p.matcher("sssss");
	//	System.out.println(m);
		boolean c=m.find();
		boolean c1=Pattern.compile("^s").matcher("saswat").find();
		
		System.out.println(c);
		System.out.println(Pattern.matches("b.x", "bar"));
		
		System.out.println("---------------");
		System.out.println(Pattern.compile("^s").matcher("saswat").find());//start with s
		System.out.println(Pattern.compile("t$").matcher("saswat").find());//end with t
		System.out.println(Pattern.compile("s....t").matcher("saswat").find());
		System.out.println(Pattern.compile("s|q").matcher("saswat").find());
		System.out.println(Pattern.compile("s").matcher("saswat").find());
		System.out.println(Pattern.compile("sa").matcher("saswat").find());
		System.out.println(Pattern.compile("s+").matcher("saswat").find());
		System.out.println(Pattern.compile("sa?").matcher("saswat").find());
		System.out.println(Pattern.compile("s{3}").matcher("dsss").find());
		System.out.println(Pattern.compile("s{2,4}").matcher("sssss").find());
		//System.out.println(Pattern.compile("^s").matcher("saswat").find());
		 String input = "Hello World!";
	        Pattern pattern = Pattern.compile("[aeiouAEIOU]");
	        Matcher matcher = pattern.matcher(input);

	        int count = 0;

	        while (matcher.find()) {
	            count++;
	        }

	        System.out.println("Number of vowels: " + count);
	}

}
