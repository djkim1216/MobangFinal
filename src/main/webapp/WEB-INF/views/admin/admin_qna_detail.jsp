<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<link rel="stylesheet" href="resources/css/bootstrap.min.css"> 
<link rel="stylesheet" href="resources/css/bootstrap-theme.min.css">

  
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="resources/js/bootstrap.min.js"></script>

<title>부동산 필수웹 모방</title>
</head>
<body>
<jsp:include page="/WEB-INF/views/admin/header.jsp"/>
<div class ="container">
<input type="hidden" value="${dto.seqQ }" name="seqQ"/> <!-- 수정할 때 글봐야하니까. -->
	
		<h2>${dto.titleQ }</h2>	
		<p>작성자 : ${dto.email }</p>
		<br/>
		
		
		<p>내용</p>
		<p>${dto.contentQ }</p>
		<input type="submit" value="수정" />
		<input type="button" value="취소" onclick="location.href='admin_qna.admin'"/>
		<input type="button" value="삭제" onclick="location.href='qna_delete.admin?seqQ=${dto.seqQ}'"/>
		
		<div>
		<h2>답글창</h2>
		
		
		</div>
</div>

</body>
</html>