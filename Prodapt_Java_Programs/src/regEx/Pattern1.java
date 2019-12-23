package regEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pattern1 {

	public static void main(String[] args) {
		Pattern pt= Pattern.compile("hello");
		Matcher mt = pt.matcher("Hello");
		System.out.println(mt.matches());
		
		System.out.println(Pattern.compile("hello").matcher("hello").matches());
		System.out.println(Pattern.matches("HELLO","hello"));
		
		Pattern pt1 = Pattern.compile("wor");
		Matcher mt1 = pt1.matcher("Hello world");
		while(mt1.find()) {
			System.out.print(mt1.start()+"\t");  //returns start index from where it is start
			System.out.print(mt1.end()+"\n");  
			
		}
		Pattern pt2 = Pattern.compile("\\d\\d\\d-\\d\\d\\d-\\d\\d\\d");
		Pattern pt3=Pattern.compile("\\d+-\\d+-\\d+");
		Pattern pt4=Pattern.compile("\\d{3}-\\d{3}-\\d{3}");
		Pattern pt5=Pattern.compile("[0-9][0-9][0-9]-[0-9][0-9][0-9]-[0-9][0-9][0-9]");
		Pattern pt6=Pattern.compile("[0-9]+-[0-9]+-[0-9]+");
		Pattern pt7=Pattern.compile("[0-9]{3}-[0-9]{3}-[0-9]{3}");

		
		Matcher mt2 = pt2.matcher("192-168-589");
		System.out.println(mt2.matches());
		System.out.println(pt2.matcher("192-168-589").matches());
		System.out.println(pt3.matcher("192-168-589").matches());
		System.out.println(pt4.matcher("192-168-589").matches());
		System.out.println(pt5.matcher("192-168-589").matches());
		System.out.println(pt6.matcher("192-168-589").matches());
		System.out.println(pt7.matcher("192-168-589").matches());
	
		 //System.out.println("Backslash      : " + "ABCDE\\FGHIJ");
		
		Pattern ip=Pattern.compile("[0-9]{1,3}.[0-9]{1,3}.[0-9]{1,3}");
		System.out.println(ip.matcher("192.18.5").matches());
		
		
		Pattern ip1 = Pattern.compile("[a-f0-9]*::[a-f0-9]*:[a-f0-9]*:[a-f0-9]*:[a-f0-9]*:[a-f0-9]*");
		System.out.println(ip1.matcher("fe04:::9f2::fe3:a9e").matches());
				
		Pattern str=Pattern.compile("mr[.]?");
		System.out.println(str.matcher("mr").matches());
		
		Pattern sr1 = Pattern.compile("(\\d{3})-(\\d{8})");
		Matcher mt3 = sr1.matcher("021-78654321");
		System.out.println(mt3.matches());
		System.out.println(mt3.group());
		System.out.println(mt3.group(1));
		
		Pattern num=Pattern.compile("\\d{3}[.-]*\\d{3}[.-]*\\d+");
		Matcher mt4 = num.matcher("021-7865.4321");
		System.out.println(mt3.matches());
		
		Pattern id=Pattern.compile("http.*");
		Matcher mt5 = id.matcher("https");
		System.out.println(mt5.matches());
		
		Pattern num1=Pattern.compile("(\\d{4}-\\d{7}) / (\\d{3}-\\d{7})\\s/\\s(\\d{4}-\\d{7})\\s/\\s(\\d{3}-\\d{7})");
		Matcher num2=num1.matcher("1234-6543214 / 987-5643217 / 1234-6543214 / 987-5643217");
		System.out.println(num2.matches());
		System.out.println(num2.group(2));
		
		Pattern mailId = Pattern.compile("(\\w+).(\\w+)@([a-z]+).([a-z]{3})");
		Matcher mail = mailId.matcher("user.123@gmail.com");
		System.out.println(mail.matches());
		System.out.println(mail.group(3));
		
		
		
	}

}
