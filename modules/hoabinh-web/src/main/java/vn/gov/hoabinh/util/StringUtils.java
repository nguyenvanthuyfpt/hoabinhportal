package vn.gov.hoabinh.util;

import java.io.IOException;
import java.net.MalformedURLException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import com.liferay.portal.kernel.util.StringUtil;

public class StringUtils {
	
	public static String formatURL(String url) {
		String[] texts = {"documents"};
		int from = StringUtil.indexOfAny(url, texts);
		String retval = url.substring(from-1).replaceAll("&download=true", "&imageThumbnail=1");
		return retval;
	}
	
	public static String removeHTML(String input) {
		String retval = "";
		retval = input.replaceAll("\\<.*?\\>", "");
		return retval;
	}
	
	public static String extractText(String html) {
		String retval = "";
		Document document = Jsoup.parse(html);
		retval = document.body().text();
		return retval;
	}
	
	public static String[] removeInvalid(String[] input) {
		String[] retval = null;
		String[] arrTemp = null;
		String arrVal = "";
		int length = 0;
		for(int i=0;i<input.length;i++) {
			if(!"".equals(input[i])) {
				arrVal += input[i] + ",";
				length++;
			}
		}
		
		retval = new String[length];
		arrTemp = StringUtil.split(arrVal, ",");
		for (int i=0;i<arrTemp.length;i++){
			retval[i] = arrTemp[i];
		}
		return retval;
	}
	
	public static void main(String[] args) throws Exception {
		String[] arrReturn = null;
		String[] arrInput = {"","123","","456", ""};
		arrReturn = removeInvalid(arrInput);
	}
}
