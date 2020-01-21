<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn/bootstrap/3.3.2/css/bootstrap.min.css">
	<title>Test</title>
</head>
<body>
	<div class="container">
		<h2>Board</h2>
		<table class="table table-bordered">
			<thead>
				<tr>
					<th>bno</th>
					<th>title</th>
					<th>content</th>
				</tr>
			</thead>
			<tbody>
			<!-- http://www.devkuma.com/books/pages/1180 -->
			<!-- <"%@" taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core%> -->
				<tr>
					<td>${boardList[0].bno}</td>
					<td><a href="#">${boardList[0].title}</a></td>
					<td>${boardList[0].content}</td>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>