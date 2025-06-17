import java.util.Scanner;
public class Even{
	public static void main(String[]args){
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter number");
		int n= sc.nextInt();
		if(n%2==0){
			System.out.println("even"+n);
		}else{
			System.out.println("odd"+n);;
		}
		sc.close();
	}
}