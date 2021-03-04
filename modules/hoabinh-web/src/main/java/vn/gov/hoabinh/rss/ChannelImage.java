package vn.gov.hoabinh.rss;

public class ChannelImage {
	String title = "";
	String imageUrl = "";
	String link = "";

	public ChannelImage() {

	}

	public ChannelImage(String title, String imageUrl, String link) {
		super();
		this.title = title;
		this.imageUrl = imageUrl;
		this.link = link;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}