package function_lab;

public class que1 {
	double f = 50.0;
	double c = 0.0;
	void input()
	{
	c = (f-32)/1.8;
	}
	void output()
	{
            System.out.println("Temperature is Celcius is " +c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		que1 a = new que1();
		a.input();
		a.output();
	}
}