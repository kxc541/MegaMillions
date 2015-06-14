<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="com.kc.megamillions.domain.*,java.util.List"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<title>Article: <c:out value="${article.title}" /></title>
	<link type="text/css" rel="stylesheet" href="css/geeknews.css" />
</head>
<body>

<%@ include file="header.jsp" %>

<div id="mainContent">

<p><a href="home.htm">Home</a></p>

<div id="articleContentHeading">
<h2><c:out value="${article.title}" /></h2>
<p>By <span class="articleAuthor"><c:out value="${article.author}" /></span>
   on <span class="articleDate"><fmt:formatDate value="${article.date}" type="both" /></span>
</p>
</div>

<div id="articleContent">
<c:out value="${article.content}" escapeXml="false" />
</div>

</div>

<%@ include file="footer.jsp" %>


</body>
</html>