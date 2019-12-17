package mail;

import java.io.*;
import com.oreilly.servlet.*;

public class MailSender {
	
	//�ʵ�=��������=property=�Ӽ�
	private String from, to, subject, content;
	
	// ������
	public MailSender(){
		from = "";
		to = "";
		subject = "";
		content = "";
	} // constructor

	public void setFrom(String from) {
		this.from = from;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	// Bean���� ���ͼ��� ���� �ٸ� �޼ҵ嵵 ������.
	public String send() {
		String reply="";//����
		try{
			MailMessage msg = new MailMessage("smtp.nate.com"); // ���� ������ host�� �Է�
			msg.from(from);
			msg.to(to);
			msg.setSubject(subject);
			
			//MailMessage ���� ��¿� ��Ʈ�� ����
	        PrintStream out=msg.getPrintStream(); 
	        out.println(content);
	        
	        //��¿� ��Ʈ���� ������ ������ ����
	        msg.sendAndClose();
	        
	        reply="���� ���� ����";
		} catch (Exception e){
			reply = "���� ���� ����" + e;
			e.printStackTrace();
		}
		
		return reply;
	}
}