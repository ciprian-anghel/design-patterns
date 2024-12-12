package refactoringguru.structural.decorator.component;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;

/*
 * There might be several variations of these classes in a program.
 * Needs to be decorated.
 */
public class FileDataSource implements DataSource {
	
	private String name;
	
	public FileDataSource(String name) {
		this.name = name;
	}

	@Override
	public void writeData(String data) {
		File file = new File(name);
		if (!file.getParentFile().exists()) {
			file.getParentFile().mkdirs();
		}
		try (OutputStream fos = new FileOutputStream(file)) {
			fos.write(data.getBytes(), 0, data.length());
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
	}

	@Override
	public String readData() {
		char[] buffer = null;
		File file = new File(name);
		try(FileReader reader = new FileReader(file)) {
			buffer = new char[(int) file.length()];
			reader.read(buffer);
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
		return new String(buffer);
	}

}
