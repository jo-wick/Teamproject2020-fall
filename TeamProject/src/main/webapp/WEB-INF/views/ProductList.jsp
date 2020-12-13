<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품목록 </title>

<style>
#list {
  font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 100%;
}
#list td, #list th {
  border: 1px solid #ddd;
  padding: 8px;
  text-align:center;
}
#list tr:nth-child(even){background-color: #f2f2f2;}
#list tr:hover {background-color: #ddd;}
#list th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: center;
  background-color: #006bb3;
  color: white;
}
</style>

</head>
<body>
	
	<h1>상품목록  </h1>
	
	<table id="list" width="90%">
	<tr>
		<th> 상품사진  </th>
		<th> 상품명 </th>
		<th> 판매가 </th>
		<th> 남은 수량 </th>
		<th> 유통기한 </th>
	</tr>
	
	<c:forEach items="${list}" var="u">
		<tr>
			<td>사진 </td>
			<td>${u.productname}</td>
			<td>${u.price}</td>
			<td>${u.amount}</td>
			<td>${u.regdate}</td>
		</tr>
	</c:forEach>
	</table>
	
	<footer>
		<h2>쇼핑몰 정보 </h2>
		<p> 사업자: 조형우, 김다영  </p>
		</br>
		<p> 고객센터 </p>
		<p>123-456-789</p>
		
	</footer>
</body>
</html>