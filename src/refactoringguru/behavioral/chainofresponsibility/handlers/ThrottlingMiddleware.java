package refactoringguru.behavioral.chainofresponsibility.handlers;

/**
 * ConcreteHandler. Checks whether there are too many failed login requests.
 */
public class ThrottlingMiddleware extends Middleware {
	
	private int requestsPerMinute;
	private int request;
	private long currentTime;
	
	public ThrottlingMiddleware(int requestPerMinute) {
		this.requestsPerMinute = requestPerMinute;
		this.currentTime = System.currentTimeMillis();
	}
	
	/**
     * Please, note that checkNext() call can be inserted both in the beginning
     * of this method and in the end.
     *
     * This gives much more flexibility than a simple loop over all middleware
     * objects. For instance, an element of a chain can change the order of
     * checks by running its check after all other checks.
     */
	@Override
	public boolean check(String email, String password) {
		if (System.currentTimeMillis() > currentTime + 60_000) {
			request = 0;
			currentTime = System.currentTimeMillis();
		}
		
		request++;
		
		if (request > requestsPerMinute) {
			System.out.println("Request limit exceed!");
			Thread.currentThread().stop();
		}
		return checkNext(email, password);
	}

}
