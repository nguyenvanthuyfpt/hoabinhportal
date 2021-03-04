package vn.gov.hoabinh.business;

import java.util.List;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import vn.gov.hoabinh.rss.Feed;
import vn.gov.hoabinh.rss.FeedMessage;
import vn.gov.hoabinh.rss.RSSFeedParser;

public class RssServices {
	public static Log log = LogFactoryUtil.getLog(RssServices.class);
	
	public static void main(String[] args) {
		RSSFeedParser parser = new RSSFeedParser("https://vnexpress.net/rss/tin-moi-nhat.rss");
		Feed feed = parser.readFeed();
		System.out.println(feed);
		for (FeedMessage message : feed.getMessages()) {
			System.out.println(message);
		}
	}

	public static List<FeedMessage> syncArticle(String rssURL) throws Exception {
		List<FeedMessage> listMessage = null;
		try {
			RSSFeedParser parser = new RSSFeedParser(rssURL);
			Feed feed = parser.readFeed();
			listMessage = feed.getMessages();
		} catch (Exception e) {
			// TODO: handle exception
			log.info(e.toString());
		}
		return listMessage;
	}
}
