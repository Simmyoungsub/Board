<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="https://unpkg.com/vue"></script>
<title>Insert title here</title>
</head>
<body>
	<div id="app">
		{{message}}
	</div>
	<div>
		${session}
	</div>
</body>
</html>
<script>
	var app = new Vue({
		el : '#app',
		data : {
			'message' : 'Hello World'
		}
	});
</script>