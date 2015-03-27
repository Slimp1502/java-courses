public class Calculate
{
  public static void main(String[] arg) {
	System.out.println("Calculate...");
	int first = Integer.valueOf(arg[0]);
	int second = Integer.valueOf(arg[1]);
	int summ = first + second;
	System.out.println("Sum " + summ);
	int multiplication = first * second;
	System.out.println("multiplication " + multiplication);
	int min = first - second;
	System.out.println("mim " + min);
	
}
}