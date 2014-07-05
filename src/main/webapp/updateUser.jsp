<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
	<head>
		<title>My JSP 'updateUser.jsp' starting page</title>
	</head>

	<body>
		<form action="<%=path %>/muserController/updateUser.do" method="POST">
			<input type="hidden" name="id" value="${user.id }">
			<table>
				<tr>
					<td>
						name: 
					</td>
					<td>
						<input type="text" name="name" value="${user.name }">
					</td>
				</tr>
				<tr>
					<td>
						age:
					</td>
					<td>
						<input type="text" name="age" value="${user.age }">
					</td>
				</tr>
				<tr>
					<td>
						address:
					</td>
					<td>
						<input type="text" name="address" value="${user.address }">
					</td>
				</tr>
				<tr>
					<td>
						<input type="submit" value="Update">
					</td>
					<td>
						<input type="reset" value="Reset">
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>
