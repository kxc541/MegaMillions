<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="com.kc.megamillions.domain.*,java.util.List"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<title>Post a New Article</title>
	<link type="text/css" rel="stylesheet" href="css/geeknews.css" />
</head>
<body>

<%@ include file="header.jsp" %>

<div id="articleForm">

<p><a href="home.htm">Home</a></p>

<p id="articleFormInstructions">Enter the information for an article posting and press "Post"</p>

<form:form action="post.htm" method="POST" commandName="newsArticle" >

<table>
	<tr>
		<th rowspan="2">Title:</th>
		<td><form:input path="title" size="60" /></td>
	</tr>
	<tr>
		<td><form:errors path="title" cssClass="validationError"/></td>
	</tr>
	<tr>
		<th rowspan="2">Author:</th>
		<td><form:input path="author" size="60" /></td>
	</tr>
	<tr>
		<td><form:errors path="author" cssClass="validationError"/></td>
	</tr>
	<tr>
		<th rowspan="2">Date:</th>
		<td><form:input path="date" size="60" /></td>
	</tr>
	<tr>
		<td><form:errors path="date" cssClass="validationError"/></td>
	</tr>
	<tr>
		<th rowspan="2">Summary:</th>
		<td><form:textarea path="summary" rows="3" cols="90"></form:textarea></td>
	</tr>
	<tr>
		<td><form:errors path="summary" cssClass="validationError"/></td>
	</tr>
	<tr>
		<th rowspan="2">Content:</th>
		<td><form:textarea path="content" rows="20" cols="90"></form:textarea></td>
	</tr>
	<tr>
		<td><form:errors path="content" cssClass="validationError"/></td>
	</tr>
	<tr>
		<th></th>
		<td><input type="submit" value="Post" /></td>
	</tr>
</table>

</form:form>

</div>

<%@ include file="footer.jsp" %>

</body>
</html>