import java.util.Scanner;

public class Q1_Tuition {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the initial tuition: ");
		double initial_t=input.nextDouble();
		double net_sum=initial_t;
		double t_year_b4=initial_t;
		for (int i=0; i<3; i++)
		{
			System.out.println("Enter the percentage increase in tuition in decimal form for year "+ (2014+i+1)+"-"+(2015+i+1)+" :");
			double rate_thisyear=input.nextDouble();
			net_sum+=(t_year_b4)*(1+rate_thisyear);
			t_year_b4*=(1+rate_thisyear);
			}
		System.out.printf("The total tuition for four years is $%.2f", net_sum);
		input.close();
	}

}
