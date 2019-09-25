<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>로그인</title>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<body>
<div id="wrapper" style="width: 100%; height: 100%">
	<form id="login_form" action="<%=request.getContextPath()%>/player.do">
	<input type="hidden" name="action" value="move"/>	
	<input type="hidden" name="page" value="home"/>		
		<table border="1" style="width:300px; height:200px; margin: 300px auto">
			<tr>
				<td style="width:300px">
					ID : <input type = "text" name = "playerId" />
				</td>
				<td rowspan="2"> 
					<input type = "submit" value="로그인" style="width: 100%; height: 100%"/>
				</td>
			</tr>
			<tr>
				<td>
					PW : <input type = "text" name = "solar" />
				</td>
				
			</tr>
			
		</table>
	</form>
	<h3 style="width:300px; margin: 300px auto"><a id="a_join" href="">회원가입</a></h3>	
</div>	
</body>
</html>
