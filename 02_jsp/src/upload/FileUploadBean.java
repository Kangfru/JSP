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
			reply = "���� ���ε� ����";

		} catch (Exception ex) {
			reply = "���� ���ε� ����:" + ex;
		}

		return reply;
	}// upload
}