<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	Cookie[] cookies = request.getCookies();
	String id = "";
	if (cookies != null){ 
		for(Cookie c : cookies) {
			if(c.getName().equals("id")){
				id = c.getValue();
			}
		}	
	}
%>
	<form method="post" action="<%=request.getContextPath()%>/loginAction">
	<div>
		<table border="1">
			<tr>
				<td>ID</td>
				<td><input type="text" name="id" value="<%=id%>">
				
				<td rowspan="2"><button type="submit">login</button></td>
			</tr>
			
			<tr>
				<td>PW</td>
				<td><input type="password" name="pw">
			</tr>
			
			<tr>
				<td colspan="3"><input type="checkbox" name="save" value="save">ID저장</td>
			</tr>
	
		</table>
	</div>
	</form>
	
</body>
</html>