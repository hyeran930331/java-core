<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	//String ip = request.getRemoteAddr();
	//int port = request.getServerPort();
	//String url = null;
	// url= request.getRequestURL();
	//String contextPath = request.getContextPath();
	String userAgent = request.getHeader("user=agent");
	//메서드  매개변수 문자열을 return해주는 메서드
	Enumeration<String> e = request.getHeaderNames();
%>
	<table border="1">
<%	
	while(e.hasMoreElements()){
		String headerName = e.nextElement();
%>
	<tr>
		<td>
			<div><%=e.nextElement()%></div>
		</td>
		<td>
			<%=request.getHeader(headerName)%><div></div>
		</td>
	</tr>
<%		
	}
%>
	</table>

</body>
</html>