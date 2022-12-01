package alter.miso.ui.views.api;

import alter.miso.ui.views.utils.AlterDesignerUtils;

public class MongoDBStruct {
	
	private String url;
	private String key;
	
	private MongoDBStruct(final String url, final String key) {
		this.url = url;
		this.key = key;
	}
	
	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	public String getKey() {
		return this.key;
	}
	
	public void setParameter(String key) {
		this.key = key;
	}
	
	public static MongoDBStruct of(final String url, final String parameter) {
		return new MongoDBStruct(url, parameter);
	}
	
	public static MongoDBStruct of() {
		return new MongoDBStruct(AlterDesignerUtils.MONGO_URL, AlterDesignerUtils.JSON_KEY);
	}	
}
