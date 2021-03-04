package vn.gov.hoabinh.business;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

import vn.gov.hoabinh.util.PortalConstant;
import vn.gov.hoabinh.util.StringUtils;

public class SoundServices {
	/*public static void main(String[] args) throws MalformedURLException, IOException {
		String wsURL = "http://tts.isolar.vn/TTSWebService.asmx?wsdl";
		
		String xml="<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://schemas.xmlsoap.org/soap/envelope/\">\r\n" + 
				"   <soap12:Body>\r\n" + 
				"      <GetSoundLinkFromTTSService xmlns=\"http://tempuri.org/\">\r\n "+ 
				"         <TxtContent>[$content$]</TxtContent>\r\n" + 
				"         <VoiceType>[$typeVoice$]</VoiceType>\r\n" + 
				"         <verificationPassword>[$code$]</verificationPassword>\r\n" + 
				"      </GetSoundLinkFromTTSService>\r\n" + 
				"   </soap12:Body>\r\n" + 
				"</soap12:Envelope>";
		
		String soundLink = "";
		String xmlInput = xml.replace("[$content$]", hello.replaceAll("\\<.*?\\>", ""));
		xmlInput = xmlInput.replace("[$typeVoice$]", "male-2");
		xmlInput = xmlInput.replace("[$code$]", "20130827103400");
		
		URL url = new URL(wsURL);
		URLConnection connection = url.openConnection();
		HttpURLConnection httpConn = (HttpURLConnection) connection;
		
		try {
			String responseString = "";
			String outputString = "";
			
			ByteArrayOutputStream bout = new ByteArrayOutputStream();
			
			byte[] buffer = new byte[xmlInput.length()];
			buffer = xmlInput.getBytes();
			bout.write(buffer);
			byte[] b = bout.toByteArray();
			
			httpConn.setRequestProperty("Content-Length", String.valueOf(b.length));
			httpConn.setRequestProperty("Content-Type", "text/xml; charset=utf-8");
			httpConn.setRequestMethod("POST");
			httpConn.setDoOutput(true);
			httpConn.setDoInput(true);
			OutputStream out = httpConn.getOutputStream();
			out.write(b);
			out.close();

			InputStreamReader isr = new InputStreamReader(httpConn.getInputStream());
			BufferedReader in = new BufferedReader(isr);

			// Write the SOAP message response to a String.
			while ((responseString = in.readLine()) != null) {
				outputString = outputString + responseString;
			}
			
			int idxFrom = outputString.indexOf("<SoundLink>");
			int idxTo = outputString.indexOf("</SoundLink>");
			if (idxFrom>-1 && idxTo>-1) {
				soundLink = outputString.substring(idxFrom+"<SoundLink>".length(), idxTo);
			}
			System.out.println("1. " + soundLink.replaceFirst("http://tts.isolar.vn", "http://thunghiem.hoabinh.gov.vn:9630"));
		} catch (Exception ex) {
			httpConn.disconnect();
			System.err.println(ex);
		}
		
		System.out.println("2. " + soundLink);
	}*/
	
	public static String getSoundLink(String wsURL, String title, String lead, String content, String typeVoice) throws Exception {
		String xml="<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://schemas.xmlsoap.org/soap/envelope/\">\r\n" + 
				"   <soap12:Body>\r\n" + 
				"      <GetSoundLinkFromTTSService xmlns=\"http://tempuri.org/\">\r\n "+ 
				"         <TxtContent>[$content$]</TxtContent>\r\n" + 
				"         <VoiceType>[$typeVoice$]</VoiceType>\r\n" + 
				"         <verificationPassword>[$code$]</verificationPassword>\r\n" + 
				"      </GetSoundLinkFromTTSService>\r\n" + 
				"   </soap12:Body>\r\n" + 
				"</soap12:Envelope>";
		String soundLink = "";
		String textContent = title + ". " + StringUtils.removeHTML(lead) + ". " + StringUtils.extractText(content);
		String xmlInput = xml.replace("[$content$]", textContent.replaceAll("&nbsp;", ""));
		xmlInput = xmlInput.replace("[$typeVoice$]", typeVoice);
		xmlInput = xmlInput.replace("[$code$]", "20130827103400");
		
		URL url = new URL(wsURL);
		URLConnection connection = url.openConnection();
		HttpURLConnection httpConn = (HttpURLConnection) connection;
		
		try {
			String responseString = "";
			String outputString = "";
			
			ByteArrayOutputStream bout = new ByteArrayOutputStream();
			
			byte[] buffer = new byte[xmlInput.length()];
			buffer = xmlInput.getBytes();
			bout.write(buffer);
			byte[] b = bout.toByteArray();
			
			httpConn.setRequestProperty("Content-Length", String.valueOf(b.length));
			httpConn.setRequestProperty("Content-Type", "text/xml; charset=utf-8");
			httpConn.setRequestMethod("POST");
			httpConn.setDoOutput(true);
			httpConn.setDoInput(true);
			OutputStream out = httpConn.getOutputStream();
			out.write(b);
			out.close();
			// Ready with sending the request.

			// Read the response.
			InputStreamReader isr = new InputStreamReader(httpConn.getInputStream());
			BufferedReader in = new BufferedReader(isr);

			// Write the SOAP message response to a String.
			while ((responseString = in.readLine()) != null) {
				outputString = outputString + responseString;
			}
			
			int idxFrom = outputString.indexOf("<SoundLink>");
			int idxTo = outputString.indexOf("</SoundLink>");
			if (idxFrom>-1 && idxTo>-1) {
				soundLink = outputString.substring(idxFrom+"<SoundLink>".length(), idxTo);
			}
			// System.out.print("soundLink " + soundLink.replaceFirst("http://localhost:9630", "http://thunghiem.hoabinh.gov.vn:9630"));
			return soundLink;
		} catch (Exception ex) {
			httpConn.disconnect();
			System.err.println(ex);
		}
		return soundLink.replaceFirst("http://localhost:9630", "http://thunghiem.hoabinh.gov.vn:9630");
	}
}
