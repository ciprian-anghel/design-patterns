package designpatterns.structural.proxy.proxy;

import java.util.HashMap;

import designpatterns.structural.proxy.someexternallib.ThirdPartyYouTubeClass;
import designpatterns.structural.proxy.someexternallib.ThirdPartyYouTubeLib;
import designpatterns.structural.proxy.someexternallib.Video;

/*
	To save some bandwidth, we can cache request results and keep
	them for some time. But it may be impossible to put such code
	directly into the service class. For example, it could have
	been provided as part of a third party library and/or defined
	as `final`. That's why we put the caching code into a new
	proxy class which implements the same interface as the
	service class. It delegates to the service object only when
	the real requests have to be sent.
*/
public class YouTubeCacheProxy implements ThirdPartyYouTubeLib {
	
	private ThirdPartyYouTubeLib youtubeService;
	private HashMap<String, Video> cachePopular = new HashMap<>();
	private HashMap<String, Video> cacheAll = new HashMap<>();

	public YouTubeCacheProxy() {
		this.youtubeService = new ThirdPartyYouTubeClass();
	}
	
	@Override
	public HashMap<String, Video> popularVideos() {
		if (cachePopular.isEmpty()) {
			System.out.println("Get popular videos from server.");
			cachePopular = youtubeService.popularVideos();
		} else {
			System.out.println("Get popular videos from cache.");
		}
		return cachePopular;
	}

	@Override
	public Video getVideo(String videoId) {
		Video video = cacheAll.get(videoId);
		if (video == null) {
			video = youtubeService.getVideo(videoId);
			cacheAll.put(videoId, video);
		} else {
			System.out.println("Retrieved video '" + videoId + "' from cache.");
		}
		return video;
	}
	
	public void reset() {
        cachePopular.clear();
        cacheAll.clear();
    }

}
