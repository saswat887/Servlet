package pe;

import java.util.Iterator;

public class A3 {
	public static void main(String[] args) {
		String s="saswat nayak";
		String sp[]=s.split("[sta]");
		for (int i = 0; i < sp.length; i++) {
			System.out.println("sp["+i+"]="+sp[i]);
		}
	}

}
