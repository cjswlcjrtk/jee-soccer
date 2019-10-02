<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

 <div>
 <form id = "position_form_r">
 	<div>
 		포지션은   ${positions}  입니다.
 	</div>
 	<input type="hidden" name="action" value="login" />
	<input type="hidden" name="page" value="main" />
 </form>
</div>
<div>
 	<h3 id="main_position_r"><a id="position_r_main" href="#">문제 보기</a></h3>
 </div>
<script>
app.init('${ctx}');
</script>	