<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.oreilly.servlet.*"%>
<%@ page import="com.oreilly.servlet.multipart.*"%>
<%@ page import="java.util.*"%>
<%@ page import="java.io.*"%>

<%
request.setCharacterEncoding("UTF-8");
String savePath = "c:/_jsp/upload";
int sizeLimit = 5 * 1024 * 1024;

try{
	MultipartRequest multi = new MultipartRequest(request, savePath, sizeLimit, "UTF-8", new DefaultFileRenamePolicy());
	// 폼에서 전송된 파일 정보 가져오기
	Enumeration formNames = multi.getFileNames();
	
	// 파일 업로드가 여러개 일 경우 while 문 사용
	String formName = (String)formNames.nextElement();
	
	//서버에 저장된 파일 이름를 리턴 (파일의 이름 얻기)
	String fileName=multi.getFilesystemName(formName); 
	
	if(fileName == null) {// 파일이 업로드 되지 않았을때
	    out.print("파일 업로드 되지 않았음");
	}else{  // 파일이 업로드 되었을때
		// 웹 브라우저에 출력
		// 일반 자료
		out.print("Name:"+multi.getParameter("name")+"<BR>");//★★★
		out.print("ID:"+multi.getParameter("id")+"<BR>");//★★★
		out.print("PWD:"+multi.getParameter("pwd")+"<BR>");//★★★

		// 참고
		out.print("Form 안의  Name : " + formName + "<BR>");//별의미 없음
		out.print("File Name  : " + fileName);//별의미 없음

		//input 태그속성이 file인것,//서버에 저장된 파일 이름  
		String fileName2=multi.getFilesystemName("upfile");

		// 전송된 원래 파일 이름
		String original=multi.getOriginalFileName("upfile");
		  
		//input 항목이름에 해당하는 
		//파일 정보를 File형으로 리턴합니다
		File file = multi.getFile("upfile"); 
		String type = multi.getContentType("upfile");
		
		out.print("<br><br>실제 파일 이름 : " + original + "<br>");
		out.print("저장된 파일 이름 : " + fileName2+"<br>");
		out.print("file getFile : "+ file + "<br>");
		out.print("파일 타입 : " + type +"<br>");
		
		if(file != null){
			out.println("파일 size : " + file.length() + "<br>");
		}
	}
} catch(Exception e){
	out.println("파일 업로드 실패");
	e.printStackTrace();
}// end of catch
%>