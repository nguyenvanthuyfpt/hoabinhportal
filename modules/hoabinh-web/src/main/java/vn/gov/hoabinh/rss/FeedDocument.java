package vn.gov.hoabinh.rss;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import com.liferay.portal.kernel.util.Validator;

public class FeedDocument {
	private String encoding = "";
	private String xmlVersion = "";
	private String rssVersion = "";
	private Channel channel;

	public FeedDocument() {
		encoding = "utf-8";
		xmlVersion = "1.0";
		rssVersion = "2.0";
	}

	public FeedDocument(String xmlVersion, String encoding, String rssVersion) {
		this.xmlVersion = xmlVersion;
		this.encoding = encoding;
		this.rssVersion = rssVersion;
	}

	public Channel getChannel() {
		return channel;
	}

	public void setChannel(Channel channel) {
		this.channel = channel;
	}

	public String getEncoding() {
		return encoding;
	}

	public void setEncoding(String encoding) {
		this.encoding = encoding;
	}

	public String getXmlVersion() {
		return xmlVersion;
	}

	public void setXmlVersion(String xmlVersion) {
		this.xmlVersion = xmlVersion;
	}

	public String getRssVersion() {
		return rssVersion;
	}

	public void setRssVersion(String rssVersion) {
		this.rssVersion = rssVersion;
	}

	private void validate() throws TagMissingException {
		if (xmlVersion.length() == 0)
			xmlVersion = "1.0";
		if (rssVersion.length() == 0)
			rssVersion = "2.0";
		if (encoding.length() == 0)
			encoding = "utf-8";

		if ((channel.getTitle() == null) || (channel.getTitle().length() == 0)) {
			throw new TagMissingException("Channel Title is required!");
		}
		if ((channel.getLink() == null) || (channel.getLink().length() == 0)) {
			throw new TagMissingException("Channel Link is required!");
		}

		// Has Image?
		ChannelImage channelImage = channel.getImage();
		if (channelImage != null) {
			if ((channelImage.getTitle() == null) || (channelImage.getTitle().length() == 0)) {
				throw new TagMissingException("ChannelImage Title is required!");
			}
			if ((channelImage.getLink() == null) || (channelImage.getLink().length() == 0)) {
				throw new TagMissingException("ChannelImage Link is required!");
			}
			if ((channelImage.getImageUrl() == null) || (channelImage.getImageUrl().length() == 0)) {
				throw new TagMissingException("ChannelImage URL is required!");
			}
		}

		// Has Items?
		List<Item> items = channel.getItems();
		if (items != null) {
			for (int i = 0; i < items.size(); i++) {
				Item rssItem = items.get(i);
				if ((rssItem.getTitle() == null) || (rssItem.getTitle().length() == 0)) {
					throw new TagMissingException("Item Title is required!");
				}
				if ((rssItem.getLink() == null) || (rssItem.getLink().length() == 0)) {
					throw new TagMissingException("Item Link is required!");
				}
			}
		}
	}

	// private String documentToString(){
	// try {
	// validate();
	// }catch (Exception ex) {
	// ex.printStackTrace();
	// return null;
	// }
	//
	// Document doc = null;
	// DateFormat format = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z");
	//
	// try {
	// doc =
	// DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
	// } catch (ParserConfigurationException e) {
	// }
	//
	// return doc.toString();
	// }

	private String buildRSSDocument() {
		try {
			validate();
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
		DateFormat format = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z", new Locale("en", "US"));
		String str = "";

		str += "<?xml " + (xmlVersion.length() > 0 ? "version=\"" + xmlVersion + "\"" : "") + " "
				+ (encoding.length() > 0 ? "encoding=\"" + encoding + "\"" : "") + "?>\n";
		str += "<rss";
		str += " xmlns:admin=\"http://webns.net/mvcb/\"";
		str += " xmlns:sy=\"http://purl.org/rss/1.0/modules/syndication/\"";
		str += " xmlns:content=\"http://purl.org/rss/1.0/modules/content/\"";
		str += " xmlns:dc=\"http://purl.org/dc/elements/1.1/\"";
		str += (rssVersion.length() > 0 ? " version=\"" + rssVersion + "\"" : "") + ">\n";
		// Has channel?
		if (channel != null) {
			str += "	<channel>\n";
			str += "		<title><![CDATA[" + channel.getTitle() + "]]></title>\n";
			str += "		<description><![CDATA[" + channel.getDescription() + "]]></description>\n";
			// str += " <link>" +
			// RssManagementUtil.correctUrl(channel.getLink()) + "</link>\n";

			// Has Image?
			ChannelImage channelImage = channel.getImage();
			if (channelImage != null) {
				// str += " <link>" +
				// RssManagementUtil.correctUrl(channelImage.getLink()) +
				// "</link>\n";
				str += "		<image>\n";
				// str += " <title><![CDATA[" + channelImage.getTitle() +
				// "]]></title>\n";
				str += "			<title><![CDATA[" + channel.getTitle() + "]]></title>\n";
				str += "			<url>" + channelImage.getImageUrl() + "</url>\n";
				str += "			<link>" + channelImage.getLink() + "</link>\n";
				str += "		</image>\n";
			}
			str += "		<language>" + channel.getLanguage().replaceAll("_", "-") + "</language>\n";
			str += "		<lastBuildDate>" + format.format(new Date()) + "</lastBuildDate>\n";
			str += "		<copyright><![CDATA[" + channel.getCopyright() + "]]></copyright>\n";
			str += "		<ttl>" + channel.getTtl() + "</ttl>\n";
			str += "		<generator><![CDATA[" + channel.getGenerator() + "]]></generator>\n";

			List<Item> items = channel.getItems();

			String description = "";

			if (items != null) {
				for (int i = 0; i < items.size(); i++) {
					Item rssItem = items.get(i);

					String pubDate = "";
					if (rssItem.getPubDate() != null) {
						pubDate = format.format(rssItem.getPubDate());
					}

					description += "<div>" + rssItem.getDescription() + "</div>";
					if (Validator.isNotNull(rssItem.getAttachs()))
						description += "<br/>" + rssItem.getAttachs();

					str += "		<item>\n";
					str += "			<guid isPermaLink=\"false\">" + rssItem.getId() + "@" + pubDate + "</guid>\n";
					// str += " <id>" + rssItem.getId() + "</id>\n";
					str += "			<title><![CDATA[" + rssItem.getTitle() + "]]></title>\n";
					str += "			<link>" + rssItem.getLink() + "</link>\n";

					if (Validator.isNotNull(rssItem.getLogo())) {
						String thumbImage = rssItem.getLogo();
						thumbImage = thumbImage.replaceAll(" ", "%20");
						// thumbImage =
						// RssManagementUtil.correctUrl("/vsi_portlets" +
						// thumbImage);
						String imageType = "image/";
						if (rssItem.getLogo().lastIndexOf(".") > -1)
							imageType += rssItem.getLogo()
									.substring(rssItem.getLogo().lastIndexOf(".") + 1, rssItem.getLogo().length())
									.toLowerCase();
						str += "			<enclosure url=\"" + thumbImage + "\" type=\"" + imageType + "\" />\n";
					}

					str += "			<description><![CDATA[" + description + "]]></description>\n";
					String content = rssItem.getContent();

					if (Validator.isNotNull(content)) {
						str += "			<content:encoded><![CDATA[" + content + "]]></content:encoded>\n";
					}

					str += "			<category>" + rssItem.getCategory() + "</category>\n";
					str += "			<pubDate>" + pubDate + "</pubDate>\n";
					str += "			<author>" + rssItem.getAuthor() + "</author>\n";
					str += "			<source url=\"" + rssItem.getLink() + "\">" + rssItem.getSource()
							+ "</source>\n";

					str += "			<dc:identifier>" + rssItem.getId() + "</dc:identifier>\n";
					str += "			<dc:title><![CDATA[" + rssItem.getTitle() + "]]></dc:title>\n";
					str += "			<dc:link>" + rssItem.getLink() + "</dc:link>\n";
					str += "			<dc:description><![CDATA[" + rssItem.getDescription()
							+ "]]></dc:description>\n";
					str += "			<dc:contributor>" + rssItem.getId() + "</dc:contributor>\n";

					// str += " <dc:category>" + rssItem.getCategory() +
					// "</dc:category>\n";
					// str += " <dc:date>" + pubDate + "</dc:date>\n";
					// str += " <dc:creator>" + rssItem.getAuthor() +
					// "</dc:creator>\n";
					// str += " <dc:source>" + rssItem.getSource() +
					// "</dc:source>\n";
					// str += " <dc:subject/>\n";

					str += "			<dc:language>" + rssItem.getLanguage().replaceAll("_", "-")
							+ "</dc:language>\n";
					str += "			<dc:publisher></dc:publisher>\n";
					str += "			<dc:coverage></dc:coverage>\n";
					str += "			<dc:type/>\n";
					str += "			<dc:format/>\n";
					str += "			<dc:relation/>\n";
					str += "			<dc:rights/>\n";
					str += "		</item>\n";
				}
			}
			str += "	</channel>\n";
		}
		str += "</rss>";

		return str;
	}

	public String toString() {
		return buildRSSDocument();
	}
}
