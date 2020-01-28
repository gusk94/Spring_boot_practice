<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<!-- jstl 따로 설치 후 webapp -> WEB-INF  -> lib 에 추가 해야 사용 가능 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<script	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<script	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="/js/modal.js"></script>
	<title>Board</title>
</head>
<body>
	<div class="container">
		<h2>Board</h2>
		<table class="table table-bordered">
			<thead>
				<tr>
					<th class="col-md-1">bno</th>
					<th class="col-md-7">title</th>
					<th class="col-md-2">content</th>
					<th class="col-md-2">수정 / 삭제</th>
				</tr>
			</thead>
			<tbody>
			<!-- jstl 설치 후 사용 가능한 for 문 -->
				<c:forEach var="board" items="${boardList}">
					<tr id="tr${board.bno}">
						<td>${board.bno}</td>
						<td><a href="#">${board.title}</a></td>
						<td>${board.content}</td>
						<td>
							<div class="btn-group">
								<button name="modify" value="${board.bno}"
									class="btn btn-xs btn-warning">수정</button>
								<button name="delete" value="${board.bno}"
									class="btn btn-xs btn-danger">삭제</button>
							</div>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<jsp:include page="../include/modal.jsp"/>
		<button id="createBtn" type="button" class="btn btn-info btn-sm" data-toggle="modal">새 글 쓰기</button>
	</div>
</body>
</html>