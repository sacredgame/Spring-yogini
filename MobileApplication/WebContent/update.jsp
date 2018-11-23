<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="d" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Update Mobile Details</h1>
<table>
<d:form action="updateMobileAction.obj" modelAttribute="mobile">
<tr><td>Mobile ID :<d:input path="mobileId" readonly="true"/>
<tr><td>Mobile name :<d:input path="name"/>
<tr><td>Mobile price :<d:input path="price"/>
<tr><td>Mobile quantity :<d:input path="quantity"/>
<tr><td><input type="submit" value="Update">
 </d:form>
</table>
</body>
</html>