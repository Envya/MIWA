package api;

import java.io.File;

public interface API {

	public String receiveMessage(String path);
	
	public String receiveWS(String path);
	
	public File receiveFile(String path);
}
