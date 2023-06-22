package haru.recursive;

public class Recursive {

	public long fibo(long n) {
		if (n < 3)
			return 1;

		return fibo(n - 1) + fibo(n - 2);
	}
}
