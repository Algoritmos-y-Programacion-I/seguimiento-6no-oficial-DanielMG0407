package customExceptions;

public class QuotaEnrollExceedException extends Exception{
	private int quota;
	
	public QuotaEnrollExceedException(int q) {
		super("Quota exceeded. The enrollment is full. Quota is "+q);
		quota = q;
	}
	
	public int getQuota() {
		return quota;
	}
}
