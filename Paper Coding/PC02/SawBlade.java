import java.util.Scanner;

public class SawBlade{

	Scanner scan = new Scanner(System.in);
	int a, b, c, d, num;

	public static void main(String [] args){
		new SawBlade();
	}

	public SawBlade(){
		System.out.print("Enter a number: ");
		num = scan.nextInt();
		SawBlade(num);
	}

	public void SawBlade(int k){
		System.out.print("\n");
		for(a=0; a<k;a++){
			for(d=a; d>=0; d--){
				for(b=0; b<=d; b++){
					System.out.print("*");
				}

				for(c=1; c<k-a;c++){
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}