<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>PfF 회원가입 약관동의</title>
<link href="https://fonts.googleapis.com/earlyaccess/notosanskr.css" rel="stylesheet">
<style>
	*{font-family:'Noto Sans KR', sans-serif;padding: 0;box-sizing: border-box; min-height: 100%; margin-left: 0; margin-right: 0;}
	body{background: #EEEFF1 url(${ contextPath }/resources/image/y-repeat.png) repeat-y 50% 0;}
	ul>li{list-style: none}
	a{text-decoration: none;}
	.clearfix::after{content: "";display: block;clear: both;}
	
	.box{
		width: 600px; height: 100%;background-color: #fff; margin-right: auto; margin-left: auto;
    padding-top: 50px; padding-left: 50px; padding-right: 50px; padding-bottom: 0; min-height: 100%;
    text-align: center; border: none;	
	}
	
	ul.join_box{border: 1px solid #ddd;background-color: #fff;}
	.checkBox,.checkBox>ul{position: relative;}
	.checkBox>ul>li{float: left;}
	.checkBox>ul>li:first-child{width: 85%;padding: 15px;color: #888;}
	.checkBox>ul>li:nth-child(2){position: absolute;top: 50%;right: 30px;margin-top: -12px;}
	.checkBox textarea{width: 96%;height: 90px; margin: 0 2%;background-color: #EEEFF1;color: #888; border: none;}
	.footBtwrap{margin-top: 15px; margin-left: 3%}
	.footBtwrap>li{float: left; width: 50%;height: 60px;}
	.fpmgBtn1, .fpmgBtn2{display: block; width: 94%;height: 100%; font-size: 20px;text-align: center;line-height: 60px;}
	.fpmgBtn1{background-color: #fff;color:#555; border: 1px solid #555; cursor:pointer;}
	.fpmgBtn2{background-color: black;color: #fff; border:none; cursor:pointer;}
	
	
</style>
</head>
<body>
<body>
	<div class="box">
		<form action="enrollView.me" method="post">
			<a href="#"><img alt="로고" src="${ contextPath }/resources/image/logo1.png"></a><br><br><br>
			<ul class="join_box">
				<li class="checkBox check01">
					<ul class="clearfix">
						<li><label for="ckAll"><b>이용약관 및 개인정보수집 및 이용, 쇼핑정보 수신(선택)에 모두 동의합니다.</b></label></li>
						<li class="checkAllBtn"><input type="checkbox" id="ckAll" class="chkAll" onclick="checkAll()"></li>
					</ul>
				</li>
				<li class="checkBox check02">
					<ul class="clearfix">
						<li><label for="ck1" style="float: left;">이용약관 동의(필수)</label></li>
						<li class="checkBtn"><input type="checkbox" id="ck1" required="required" onclick="checkCk1()">
						</li>
					</ul> 
					<textarea name="" id="" disabled="disabled" style="resize:none;">1여러분을 환영합니다.여러분을 환영합니다.여러분을 환영합니다.여러분을 환영합니다.여러분을 환영합니다.여러분을 환영합니다.여러분을 환영합니다.여러분을 환영합니다.여러분을 환영합니다.여러분을 환영합니다.여러분을 환영합니다.여러분을 환영합니다.여러분을 환영합니다.여러분을 환영합니다.여러분을 환영합니다.여러분을 환영합니다.여러분을 환영합니다.여러분을 환영합니다.여러분을 환영합니다.
	        		</textarea>
				</li>
				<li class="checkBox check03">
					<ul class="clearfix">
						<li><label for="ck2" style="float: left;">개인정보 수집 및 이용에 대한 안내(필수)</label></li>
						<li class="checkBtn"><input type="checkbox" id="ck2" required="required" onclick="checkCk2()">
						</li>
					</ul> <textarea name="" id="" disabled="disabled" style="resize:none;">2여러분을 환영합니다.여러분을 환영합니다.여러분을 환영합니다.여러분을 환영합니다.여러분을 환영합니다.여러분을 환영합니다.여러분을 환영합니다.여러분을 환영합니다.여러분을 환영합니다.여러분을 환영합니다.여러분을 환영합니다.여러분을 환영합니다.여러분을 환영합니다.여러분을 환영합니다.여러분을 환영합니다.여러분을 환영합니다.여러분을 환영합니다.여러분을 환영합니다.여러분을 환영합니다.
		       </textarea>
				</li>
				<li class="checkBox check03">
					<ul class="clearfix">
						<li><label for="ckSel" style="float: left;">이벤트 등 프로모션 알림 메일 수신(선택)</label></li>
						<li class="checkBtn"><input type="checkbox" name="eventAgree" id="ckSel" onclick="checkCkSel()" value="check">
						</li>
					</ul> <textarea name="" id="" disabled="disabled" style="resize:none;">3여러분을 환영합니다.여러분을 환영합니다.여러분을 환영합니다.여러분을 환영합니다.여러분을 환영합니다.여러분을 환영합니다.여러분을 환영합니다.여러분을 환영합니다.여러분을 환영합니다.여러분을 환영합니다.여러분을 환영합니다.여러분을 환영합니다.여러분을 환영합니다.여러분을 환영합니다.여러분을 환영합니다.여러분을 환영합니다.여러분을 환영합니다.여러분을 환영합니다.여러분을 환영합니다.
						 </textarea><br><br>
				</li>
			</ul><br/><br/><br/>
			<ul class="footBtwrap clearfix">
				<li><input type="button" class="fpmgBtn1" value="비동의" onClick="location.href='${ contextPath }/loginView.me'"/></li>
				<li><button class="fpmgBtn2">동의</button></li>
			</ul>
		</form>
	</div>
	
<script>
	const ckAll = document.getElementById('ckAll');
	const ck1 = document.getElementById('ck1');
	const ck2 = document.getElementById('ck2');
	const ckSel = document.getElementById('ckSel');
	
// 	카운트 3일때 전체선택, ck1, ck2, ckSel 체크할떄마다 1씩늘어나고 체크해제하면 1씩줄어듦
	let count = 0;
	
	
// 	전체선택 클릭 시 모두체크/체크해제
	const checkAll = ()=>{
		if(ckAll.checked==true){
			ck1.checked = true;
			ck2.checked = true;
			ckSel.checked = true;
			count = 3;
		} else{
			ck1.checked = false;
			ck2.checked = false;
			ckSel.checked = false;
			count = 0;
		}
		
	}
	
	const checkCk1 = () =>{
		if(ck1.checked==true){
			count++;
		} else{
			count--;
		}
		
		if(count == 3){
			ckAll.checked = true;
		} else{
			ckAll.checked = false;
		}
		
	}
	
	const checkCk2 = () =>{
		if(ck2.checked==true){
			count++;
		} else{
			count--;
		}
		
		if(count == 3){
			ckAll.checked = true;
		} else{
			ckAll.checked = false;
		}
		
	}

	const checkCkSel = () =>{
		if(ckSel.checked==true){
			count++;
		} else{
			count--;
		}
		
		if(count == 3){
			ckAll.checked = true;
		} else{
			ckAll.checked = false;
		}
		
	}
	
</script>
</body>
</html>