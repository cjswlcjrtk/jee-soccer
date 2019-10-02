<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <!-- 쿼리 -->
<!-- <h2><input id="btn2" type="button" value="2. 포지션 종류 보기"/></h2> -->
 <!-- 결과 -->
 <div>
 <form id = "position_form">
 	<div>
 		<input id="position_btn" type="button" value="2. 포지션 종류 보기"/>
 	</div>
 	<input type="hidden" name="action" value="position" />
	<input type="hidden" name="page" value="main" />
 </form>
  <form id = "searchPosition_form">
 	<div>
 		<input id="searchPosition_btn" type="button" value="4. 팀아이디 포지션 찾기"/>
 	</div>
 	<input type="hidden" name="action" value="searchPosition" />
	<input type="hidden" name="page" value="main" />
 </form>
 <form id = "searchName_form">
 	<div>
 		<input id="searchHeightName_btn" type="button" value="5. 팀아이디 키,이름 찾기"/>
 	</div>
 	<input type="hidden" name="action" value="searchHeightName" />
	<input type="hidden" name="page" value="main" />
 </form>
 <div></div>
 <script>
 app.init('${ctx}');
 </script>
</div>
