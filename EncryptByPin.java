import java.util.*;
public class EncryptByPin {
	
	//Name - Ashish Dash
	//Branch - CSIT
	//sec - A
	//registration no. 1941017024
	
	public static void main(String[] args) {
			
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of pin digit you want to encrypt ");
		int n = sc.nextInt();
		double q = Math.pow(10,n-1);
		double w = Math.pow(10,n);
		int num=0;
		int num1=0;
		
		System.out.println("Enter the 4 pin of sufficient digit entered");
		int pin1=sc.nextInt();
		int pin2=sc.nextInt();
		int pin3=sc.nextInt();
		int pin4=sc.nextInt();
		sc.nextLine();
		if((pin1+pin2+pin3+pin4>=4*(q-1))&&pin1+pin2+pin3+pin4<=4*(w)) {
			System.out.print("Okay your pin is registered");
		for(int i=0;i<n;i++) {
			int a=pin1%10;
			int b=pin2%10;
			int c=pin3%10;
			int d=pin4%10;
			int r=(int)Math.pow(10,n-1-i);
			int h=(int)Math.pow(10,i);
			if(a<=b&&a<=c&&a<=d) {
				num1 = (r*a)+num1;
				num =  (h*a)+num;}
				else if(b<=c&&b<=d) {
					num1 =(r*b)+ num1;
					num =(h*b)+num;}
				else if(c<=d) {
					num1 =(r*c)+num1;
					num =(h*c)+num;}
	            else {
	            	num1=(r*d)+num1;
	            	num=(h*d)+num;}
			pin1=pin1/10;
			pin2=pin2/10;
			pin3=pin3/10;
			pin4=pin4/10;
		}0
		System.out.println("The Generated Pin is:"+num);
		System.out.println("Enter the desired message to be Encrypted..");
		String msg=sc.nextLine();
		msg=msg.replaceAll(" ","");
		msg=msg.toLowerCase();
		System.out.println(msg);
		int o=msg.length();
		
		int x= num1;
		String S = "";
		char ch;
		for(int i=0;i<o;i++) {
		 int g=(int)(msg.charAt(i));
		 g=num1%10+g;
		 num1=num1/10;
		 if(num1==0) {
			 num1=x;
		 }
		 else {}
		 if(g>122) {
			 int h=96+(g%122);
			 ch =(char)(h);}
		 else  
	     ch =(char)(g);
		 
			 S=S+ch;
			 }
		 String final1=S.toUpperCase();
		 System.out.println();
		 System.out.println(final1);
		}
		else {
			System.out.println("Entered pin is of invalid digit");
		}
		sc.close();
}

	}


