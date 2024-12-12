package refactoringguru.behavioral.chainofresponsibility;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import refactoringguru.behavioral.chainofresponsibility.handlers.Middleware;
import refactoringguru.behavioral.chainofresponsibility.handlers.RoleCheckMiddleware;
import refactoringguru.behavioral.chainofresponsibility.handlers.ThrottlingMiddleware;
import refactoringguru.behavioral.chainofresponsibility.handlers.UserExistsMiddleware;
import refactoringguru.behavioral.chainofresponsibility.server.Server;

/*
 * Intent
 * 		Chain of responsibility is a behavioral design pattern that lets you pass requests
 * 		along a chain of handlers. Upon receiving a request, each handler decides either to process
 * 		the request or to pass it to the next handler in the chain.
 * 
 * Applicability
 * 		Use the Chain of Responsibility pattern when your program is expected to process different
 * 		kinds of requests in various ways, but the exact types of requests and their sequence are 
 * 		unknown beforehand.
 * 
 *		Use the pattern when it’s essential to execute several handlers in a particular order.
 */
public class MainClient {
	
	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static Server server;
	
	private static void init() {
		server = new Server();
		server.register("admin@example.com", "admin_pass");
		server.register("user@example.com", "user_pass");
		
		// All checks are linked. Client can build various chains using the same
        // components.
		Middleware middleware = Middleware.link(
				new ThrottlingMiddleware(2),
				new UserExistsMiddleware(server),
				new RoleCheckMiddleware()
		);
		
		// Server gets a chain from client code.
		server.setMiddleware(middleware);
	}
	
	public static void main(String[] args) throws Exception {
		init();
		
		boolean success;
		do {
			System.out.println("Enter email: ");
			String email = reader.readLine();
			System.out.println("Input password: ");
			String password = reader.readLine();
			success = server.logIn(email, password);
		} while (!success);
	}

}
