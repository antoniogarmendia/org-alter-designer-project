package alter.miso.ui.views.http;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.concurrent.ExecutionException;

//import org.apache.hc.client5.http.classic.HttpClient;
//import org.apache.hc.client5.http.classic.methods.HttpGet;
//import org.apache.http.impl.client.DefaultHttpClient;

import alter.miso.ui.views.api.MongoDBStruct;

public class MongoDBHttp {
	
	private final MongoDBStruct struct;
	private final String rawJson;

	public MongoDBHttp(MongoDBStruct struct, String rawJson) {
		this.struct = struct;
		this.rawJson = rawJson;
	}
	
	//Submit JSON to the MongoDB database
	public boolean submitJSON() {
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder()
									.uri(URI.create(this.struct.getUrl()))
									.POST(HttpRequest.BodyPublishers.ofString("{\"" 
												+ this.struct.getKey() 
												+ ":"
												+ "\"" + this.rawJson + "\"" + "}"))
									.build();
		try {
			HttpResponse<String> response = client.sendAsync(request, BodyHandlers.ofString())
		        									.get();		        													
		    if (response.statusCode()==200) {
		    	return false;
		    }

		} catch (InterruptedException | ExecutionException e) {
		        e.printStackTrace();
		} 
		return false;
	}	

}
