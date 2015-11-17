package api;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class APITest implements API{

	public static void main(String[] args) {
		String path = "";
		APITest api = new APITest();
		System.out.println(api.receiveMessage(path));
		System.out.println(api.receiveWS(path));
		System.out.println(api.receiveFile(path));
		
	}

	@Override
	public String receiveMessage(String path) {
		String s = new String();
		try{
			byte[] encoded = Files.readAllBytes(Paths.get(path));
			s = new String(encoded);
		}
		catch (Exception e){
			System.err.println("File doesn't exist or cannot be read, pathname : " + path);
		}
		return s;
	}

	@Override
	public String receiveWS(String path) {
		String s = new String();
		try{
			byte[] encoded = Files.readAllBytes(Paths.get(path));
			s = new String(encoded);
		}
		catch (Exception e){
			System.err.println("File doesn't exist or cannot be read, pathname : " + path);
		}
		return s;
	}

	@Override
	public File receiveFile(String path) {
		File f = new File(path);
		if (!f.exists()){
			System.err.println("File doesn't exist or cannot be read, pathname : " + path);
			return null;
		}
		return new File(path);
	}

}
