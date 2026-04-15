//Java program to demonstrater the Interger Wrapper class
class WrapperClass
{
	public static void main(String args[])
	{
		Integer iob = new Integer(5);
		int x = iob.intValue();
		System.out.println("X = "+x + " "+ iob);
		Character cob = new Character('a');
		char ch = cob.charValue();
		System.out.println("Char = "+ch + " "+ cob);
		Float fob = new Float(5.0);
		float f = fob.floatValue();
		System.out.println("F = "+f + " "+ fob);
		Double dob = new Double(5.0);
		double d = dob.doubleValue();
		System.out.println("D = "+d + " "+ dob);
	}
}