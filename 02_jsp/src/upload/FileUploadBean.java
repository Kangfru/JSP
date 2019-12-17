package upload;

import java.io.*;

import javax.servlet.http.*;

import com.oreilly.servlet.*;
import com.oreilly.servlet.multipart.*;

public class FileUploadBean {
	
	public String upload(HttpServletRequest request) {
		String reply = "";
		int size = 5 * 1024 * 1024;

		try {
//			MultipartRequest multi = new MultipartRequest(request, "c:\\_jsp\\upload\\");
			MultipartRequest multi = new MultipartRequest(request, "c:\\_jsp\\upload\\", size, "UTF-8", new DefaultFileRenamePolicy());
			reply = "파일 업로드 성공";

		} catch (Exception ex) {
			reply = "파일 업로드 실패:" + ex;
		}

		return reply;
	}// upload
}
