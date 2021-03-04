package vn.gov.hoabinh.rss;

public class Channel {
	private String title = "";
	private String link = "";
	private String description = "";
	private String language = "";
	private String copyright = "";
	private String ttl = "";
	private String generator = "";
	private ChannelImage image;
	private FeedItems items;

	public Channel() {
	}

	public Channel(String title, String link, String description, String language, String copyright, String ttl,
			String generator) {
		this.title = title;
		this.link = link;
		this.description = description;
		this.language = language;
		this.copyright = copyright;
		this.ttl = ttl;
		this.generator = generator;
	}

	public String getCopyright() {
		return copyright;
	}

	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getGenerator() {
		return generator;
	}

	public void setGenerator(String generator) {
		this.generator = generator;
	}

	public FeedItems getItems() {
		return items;
	}

	public void setItems(FeedItems items) {
		this.items = items;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
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

	public String getTtl() {
		return ttl;
	}

	public void setTtl(String ttl) {
		this.ttl = ttl;
	}

	public ChannelImage getImage() {
		return image;
	}

	public void setImage(ChannelImage image) {
		this.image = image;
	}
}