package designpatterns.structural.proxy;

import designpatterns.structural.proxy.proxy.YouTubeCacheProxy;
import designpatterns.structural.proxy.someexternallib.ThirdPartyYouTubeClass;

/*
 * Intent
 * 		Proxy is a structural design pattern that lets you provide a substitute or placeholder 
 * 		for another object. A proxy controls access to the original object, allowing you 
 * 		to perform something either before or after the request gets through to the original object.
 * 
 * Applicability
 * 		Lazy initialization (virtual proxy). This is when you have a heavyweight service object 
 * 		that wastes system resources by being always up, even though you only need it from time to time.
 * 
 * 		Access control (protection proxy). This is when you want only specific clients to be able to use 
 * 		the service object; for instance, when your objects are crucial parts of an operating system and 
 * 		clients are various launched applications (including malicious ones).
 * 
 * 		Local execution of a remote service (remote proxy). This is when the service object is located 
 * 		on a remote server.
 * 
 * 		Logging requests (logging proxy). This is when you want to keep a history of requests to the service object.
 * 
 * 		Caching request results (caching proxy). This is when you need to cache results of client requests and 
 * 		manage the life cycle of this cache, especially if results are quite large.
 * 
 * 		Smart reference. This is when you need to be able to dismiss a heavyweight object 
 * 		once there are no clients that use it.
 * 
 */
public class MainClient {
	/*
	 * In this example, the Proxy pattern helps to implement the lazy initialization 
	 * and caching to an inefficient 3rd-party YouTube integration library.
	 * 
	 * Proxy is invaluable when you have to add some additional behaviors to a class 
	 * which code you can’t change.
	 */
	public static void main(String[] args) {
		YouTubeDownloader naiveDownloader = new YouTubeDownloader(new ThirdPartyYouTubeClass());
		YouTubeDownloader smartDownloader = new YouTubeDownloader(new YouTubeCacheProxy());
		
		long naive = test(naiveDownloader);
		long smart = test(smartDownloader);
		
		System.out.print("Time saved by caching proxy: " + (naive - smart) + "ms");
	}
	
	private static long test(YouTubeDownloader downloader) {
		long startTime = System.currentTimeMillis();
		
		// User behavior in our app:
        downloader.renderPopularVideos();
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderPopularVideos();
        downloader.renderVideoPage("dancesvideoo");
        // Users might visit the same page quite often.
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderVideoPage("someothervid");

        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.print("Time elapsed: " + estimatedTime + "ms\n");
        return estimatedTime;
	}
	
}
