import java.util.Scanner;
public class TowerOfHunai{
	public static void main(String[] args)
	{
		int num=1;
		Scanner scan = new Scanner(System.in);
		num=scan.nextInt();
		Towers(num,'A','B','C');
		
	}
	static void Towers(int num,char from,char inter,char to)
	{
		if(num==1)
			System.out.println("disk 1 "+from+" to "+to);
		else
		{
			Towers(num-1,from,to,inter);
			System.out.println("disk "+num+" from "+from+" to "+to);
			Towers(num-1,inter,from,to);
		}
	}
}