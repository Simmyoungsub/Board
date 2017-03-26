<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, user-scalable=no">
<script src="https://cdn.jsdelivr.net/vue/2.0.0-rc.2/vue.min.js"></script>
<script src="https://unpkg.com/axios@0.12.0/dist/axios.min.js"></script>
<title>Board</title>
</head>
<body>
	<div id="app">
	</div>
	<router-view></router-view>
	<script type="text/javascript" src="<c:url value='/resources/dist/build.js'/>"></script>
</body>
</html>
