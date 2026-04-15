//Java program to implementing the interface
interface CallBack
{
	void callback(int param);
}
class Client implements CallBack
{
	public void callback(int p)
	{
		System.out.println("CallBack called with "+p);
	}
}
class TestInterface
{
	public static void main(String args[])
	{
			CallBack cb = new Client();
			cb.callback(15);
	}
}