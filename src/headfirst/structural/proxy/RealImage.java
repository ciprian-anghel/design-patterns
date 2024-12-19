package headfirst.structural.proxy;

public class RealImage implements Image {
	
	private String fileName;
	
	public RealImage(String fileName) {
		this.fileName = fileName;
		loadImageFromDisk();
	}

	@Override
	public void display() {
		System.out.println("Display: " + fileName);
	}
	
	private void loadImageFromDisk() {
		System.out.println("Loading from disk: " + fileName);
	}

}
