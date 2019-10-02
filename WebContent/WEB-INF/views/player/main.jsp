<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../common/head.jsp"/> 
<div class="container">
<div></div> <div><h1>포지션 보기</h1></div> <div></div> 
<div></div> 
<c:choose>
	<c:when test="${page eq 'main'}">	
		<div><jsp:include page="2_positions.jsp"/></div>
	</c:when>
	<c:when test="${page eq 'position'}">	
		<jsp:include page="2_positions_r.jsp"/>
	</c:when>
</c:choose> 
</div> 
<div></div> 
<div></div> <div></div> <div></div> 
</div>  
<jsp:include page="../common/foot.jsp"/>    
    