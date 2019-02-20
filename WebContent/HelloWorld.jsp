<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<b>Example if If and Else</b><br/>
	<s:property value="name"/>
<s:if test="name=='Mike'">
   You have selected 'Mike'. 
</s:if>
<s:elseif test="name=='Jason' ">
   You have selected 'Jason'
</s:elseif>
<s:else>
   You have not selected 'Mike' or 'Jason'.
</s:else>
</body>
</html>