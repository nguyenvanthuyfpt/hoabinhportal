package vn.gov.hoabinh.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.json.JSONObject;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.FileUtil;
import com.liferay.portal.kernel.util.HtmlUtil;

import vn.gov.hoabinh.model.VcmsArticle;


public class SoundUtil {
	
	static Log log = LogFactoryUtil.getLog(UploadFileUtils.class);
	
	public static InputStream getTTS(String apiUrl, String datajson) throws IOException {
        HttpClient httpClient = HttpClientBuilder.create().build();
        HttpPost request = new HttpPost(apiUrl);
        StringEntity body = new StringEntity(datajson, "UTF-8");
        
        /*add content-type, token into header request */
        request.addHeader("content-type", "application/json;charset=UTF-8");
        request.addHeader("token", PortalConstant.API_SOUND_TOKEN);
        request.getRequestLine();
        request.setEntity(body);
        HttpResponse response = httpClient.execute(request);
        return response.getEntity().getContent();
    }
	
    public static void main(String[] args) throws IOException {
        JSONObject json = new JSONObject();
        json.put("text", "Nghiên cứu của Trường Y, Đại học Harvard, sử dụng ảnh vệ tinh và xu hướng tìm kiếm trên mạng cho thấy Covid-19 có thể đã lây lan ở Trung Quốc từ tháng 8/2019.");
        json.put("voice", PortalConstant.API_SOUND_VOICE[2]);
        json.put("id", "3");
        json.put("without_filter", false);
        json.put("speed", 1.0);
        json.put("tts_return_option", 2);
        
        InputStream result = getTTS(PortalConstant.API_SOUND_LINK, json.toString());
        
        /* you can write result to file to use */
        saveFile(result);
    }
    
    public static void saveFile(InputStream is) throws IOException {
    	OutputStream outputStream = null;
        try
        {
            File file = new File("E:\\test.mp3");
            outputStream = new FileOutputStream(file);
            int read = 0;
            byte[] bytes = new byte[1024];
            while ((read = is.read(bytes)) != -1) {
                outputStream.write(bytes, 0, read);
            }
        }
        finally
        {
            if(outputStream != null)
            {
                outputStream.close();
            }
        }
    }
    
	public static File getFileSound(VcmsArticle article) throws Exception {
		File file = null;
		OutputStream outputStream = null;
		try {
			String content = article.getTitle();
			content += article.getLead();
			content += HtmlUtil.extractText(article.getContent());

			JSONObject json = new JSONObject();
			json.put("text", content);
			json.put("voice", PortalConstant.API_SOUND_VOICE[2]);
			json.put("id", "3");
			json.put("without_filter", false);
			json.put("speed", 1.0);
			json.put("tts_return_option", 2);
			InputStream is = getTTS(PortalConstant.API_SOUND_LINK, json.toString());

			file = FileUtil.createTempFile("mp3");
			outputStream = new FileOutputStream(file);
			int read = 0;
			byte[] bytes = new byte[1024];
			while ((read = is.read(bytes)) != -1) {
				outputStream.write(bytes, 0, read);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return file;
	}    
}
