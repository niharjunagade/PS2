package MainPackage;

public class MyInteger {

	private int value;
	
	public MyInteger (int prime) {
	int value = prime;
	}
	public int getValue() {
		return value;
	}


	public boolean isEven()
	{
		if (this.getValue() % 2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public boolean isOdd()
	{
		if (this.getValue() % 2 == 1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isPrime()
	{
		if (this.value % 2 == 0){
			return false;
		} else {
		for (int i = 2; i < this.value; i = i +1){
			if (this.value % i == 0){
				return false;
			}		
		}
	}
		return true;
	}
	
	public static boolean isEven(int x)
	{
		if (x % 2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static boolean isOdd(int x)
	{
		if (x % 2 == 1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static boolean isPrime(int x)
	{
		if (x % 2 == 0){
			return false;
		} else {
		for (int i = 2; i < x; i = i +1){
			if (x % i == 0){
				return false;
			}		
		}
	}
		return true;
	}


	public static boolean isEven(MyInteger myInt)
	{
		if (myInt.getValue() % 2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static boolean isOdd(MyInteger myInt)
	{
		if (myInt.getValue() % 2 == 1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static boolean isPrime(MyInteger myInt)
	{
		if (myInt.getValue() % 2 == 0){
			return false;
		} else {
		for (int i = 2; i < myInt.getValue(); i = i +1){
			if (myInt.getValue() % i == 0){
				return false;
			}		
		}
	}
		return true;
	}

	public boolean equals(int x) {
		if (this.value == x){
			return true;
		} else {
			return false;
		}
	}
	
	public boolean equals(MyInteger x) {
		if (this.value == x.getValue()){
			return true;
		} else {
			return false;
		}
	}
		
	
	public static int parseInt(char[] x) {
		return Integer.parseInt(new String (x));
	}
	
	public static int parseInt(String x) {
		return Integer.parseInt(x);
	}
		
	}
