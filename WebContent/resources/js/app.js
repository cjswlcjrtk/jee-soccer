var app = (()=>{
	return {
		init : (ctx)=>{
			$('#login_form').submit(()=>{
				alert('form 태그 클릭!!');
				alert(ctx + '/player.do');
				ctx + '/player.do';
			});
			$('#a_join').click(()=>{
				alert('회원가입 이동');
				location.assign(ctx + '/player.do?action=move&page=join');
			});
			$('#back_login').click(()=>{
				alert('로그인페이지로 다시 이동');
				location.assign(ctx + '/player.do?action=move&page=login');
			});
		} /* 메소드 이름을 이렇게 준다   */
	};
})(); 

/*var app = (()=>{})();  Member m = new Member(); 의 의미*/

/*form태그는 submit, a태그는 click*/