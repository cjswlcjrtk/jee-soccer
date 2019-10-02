var app = (()=>{
	return {
		init : (ctx)=>{
			playerService.login(ctx);
			playerService.join(ctx);
			playerService.moveJoin(ctx);
			playerService.position(ctx);
			playerService.position_r(ctx);
			playerService.searchPosition(ctx);
		}
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
		searchPosition: (ctx)=>{
			$('#searchPosition_btn').click(()=>{
					alert('여기까지 잘가나');
					$('#searchPosition_form').attr('action', ctx + '/player.do');
					$('#searchPosition_form').attr('method', 'POST');
					$('#searchPosition_form').submit();					
			});
		},
		position_r: (ctx)=>{
			$('#position_r_main').click(()=>{
					alert('여기까지 잘가나!!');
					$('#position_form_r').attr('action', ctx + '/player.do');
					$('#position_form_r').attr('method', 'POST');
					$('#position_form_r').submit();
			});
		},
		position: (ctx)=>{
			$('#position_btn').click(()=>{
					alert('여기까지 잘가나');
					$('#position_form').attr('action', ctx + '/player.do');
					$('#position_form').attr('method', 'POST');
					$('#position_form').submit();					
			});
		},
		login: (ctx)=>{
			$('#login_btn').click(()=>{
				if($('#username').val()==='' ||
						$('#solar').val()===''){
					alert('필수값이 없습니다.');
				}else{
					alert('입력한 아이디 값: '+$('#username').val());
					$('#login_form').attr('action', ctx + '/player.do');
					$('#login_form').attr('method', 'POST');
					$('#login_form').submit();
				}
				
			});
		},
		join: (ctx)=>{
			$('#a_join').click(()=>{
				if($('#username').val()==='' ||
						$('#join_solar').val()===''){
					alert('필수값이 없습니다.');
				}else{
					alert('입력한 아이디 값: '+$('#join_solar').val());
					$('#join_form').attr('action', ctx + '/player.do');
					$('#join_form').attr('method', 'POST');
					$('#join_form').submit();
				}
				
			});
		},
//		main: (ctx)=>{
//			
//		},
		moveJoin: (ctx)=>{
			$('#a_join').click(()=>{
				location.assign(ctx+'/facade.do?action=move&page=join');
			});
		}
	};
})();

//=== <== 자바에선 equals ==는 숫자 비교
//$('#username').val();//get
//$('#username').val('abc');//set













