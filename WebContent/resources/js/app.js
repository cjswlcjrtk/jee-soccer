var app = (()=>{
	return {
		init : (ctx)=>{	
			playerService.login();				
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
/*$('#login_form').submit(()=>{
alert('form 태그 클릭!!');
alert(ctx + '/player.do');
ctx + '/player.do';
});*/
/*var app = (()=>{})();  Member m = new Member(); 의 의미*/

/*form태그는 submit, a태그는 click*/
/*var user = (()=>{})(); IIFE패턴*/
/*_ <-- private의 의미를 가진다.*/

var player = (()=>{
	var _playerId, _playerName, _teamId, _ePlayerName, _nickname, _joinYyyy,
	_position, _backNo, _nation, _birthDate, _solar, _height, _weight;
	var setPlayerId = (playerId)=>{this._playerId = playerId;}
	var setSolar = (solar)=>{this._solar = solar;}
	var getPlayerId = ()=>{return this._playerId;}
	var getSolar = ()=>{return this._solar;}
	return {
		setPlayerId : setPlayerId,
		setSolar : setSolar,
		getPlayerId : getPlayerId,
		getSolar : getSolar
	};
})();

var playerService = (()=>{
	return {
		login: ()=>{
			$('#login_btn').click(()=>{
				if($('#username').val()==='' ||
						$('#solar').val()===''){
					alert('필수값이 없습니다.');
				}else{
					alert('입력한 아이디 값: '+$('#username').val());
					$('#login_form').attr('action', '/jee-soccer/player.do');
					$('#login_form').submit();
				}
				
			});
		}
	};
})();

//=== <== 자바에선 equals ==는 숫자 비교
//$('#username').val();//get
//$('#username').val('abc');//set













