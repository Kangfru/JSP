package emailupload;

import java.io.*;
import javax.servlet.http.*;

import com.oreilly.servlet.*;
import com.oreilly.servlet.multipart.*;

public class EmailUpload {
	
	public String upload(HttpServletRequest request){
		String reply = "";
		try {
			MultipartRequest multi = new MultipartRequest(request,"c:\\_jsp\\upload\\",1024*1024*5,"utf-8",new DefaultFileRenamePolicy());
			
			String from = multi.getParameter("from");
			String to = multi.getParameter("to");
			String subject = multi.getParameter("subject");
			String content = multi.getParameter("content");
			
			subject = new String(subject.getBytes("UTF-8"), "8859_1");
			content = new String(content.getBytes("UTF-8"), "8859_1");
			
			MailMessage msg = new MailMessage("smtp.nate.com");
			msg.from(from);
			msg.to(to);
			msg.setSubject(subject);
			
			// MailMessage ���� ��¿� ��Ʈ�� ����
			PrintStream out = msg.getPrintStream();
			out.println(content);
			
			msg.sendAndClose(); // ��¿� ��Ʈ�� ������ ������ ����
			reply = "���Ϻ�����, ���Ͼ��ε� ����";
			// MailMessage ���� ��¿� ��Ʈ�� ����
			out.close();
			
		} catch (Exception e){
			reply = "���Ϻ�����, ���Ͼ��ε� ����";
			e.printStackTrace();
		}
		
		return reply;
	}
}