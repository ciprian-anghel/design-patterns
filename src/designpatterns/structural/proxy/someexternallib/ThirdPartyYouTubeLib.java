package designpatterns.structural.proxy.someexternallib;

import java.util.HashMap;

/*
 * The interface of a remote service.
 */
public interface ThirdPartyYouTubeLib {
	
	HashMap<String, Video> popularVideos();
	Video getVideo(String videoId);
	
}
