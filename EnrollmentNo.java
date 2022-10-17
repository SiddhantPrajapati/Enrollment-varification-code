import java.util.*;

public class EnrollmentNo {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Enrollment No :");
		String en = input.nextLine();
		int flag = 0;
		if( en.length() != 12) {
        flag = 1;
		System.out.println("Enrollment NO is not valid");
		}
        else {			
		String a =en.substring(0, 2);
		String b = en.substring(2, 5);
		String c = en.substring(5, 7);
		String d = en.substring(7, 9);
		String e = en.substring(9, 12);
		if(Integer.parseInt(a)>=10 && Integer.parseInt(a)<=22) {
			flag++;
		}
		if(Integer.parseInt(b)==47) {
			flag++;
		}
		if(Integer.parseInt(c)==1) {
			flag++;		
		}
		if(Integer.parseInt(d)==07) {
			flag++;			
		}
		int x = Integer.parseInt(e);
		if(Integer.parseInt(e)>0 && Integer.parseInt(e)<999) {
			flag++;		
		}
		//System.out.println(x);
		System.out.println(flag);
		if(flag == 5) {
			System.out.println("Enrollment No is valid");
		}
		else {
			System.out.println("Enrollment NO is not valid");
		}
		}
	}
}
