<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hello World</title>
</head>
<body>
   <h1>Hello World From Struts2</h1>
   <form action="hello">
      <label for="name">Please pick a name</label><br/>
      <select name="name">
         <option name="Mike">Mike</option>
         <option name="Jason">Jason</option>
         <option name="Mark">Mark</option>
      </select>
      <input type="submit" value="Say Hello"/>
   </form>
</body>
</html>