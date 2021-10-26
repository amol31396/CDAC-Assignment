import java.util.*;
class PalindromeNum{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any number : ");
		int num=scan.nextInt();
		int temp=num;
		int rev=0,rem;
		while(temp!=0){
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(num==rev){
			System.out.println(num+" is palindrome number");
		}
		else{
			System.out.println(num+" is not a palindrome number");
		}
	}
}
