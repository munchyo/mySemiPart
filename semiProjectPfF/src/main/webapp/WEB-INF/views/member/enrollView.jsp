<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>PfF 회원가입</title>
<link href="https://fonts.googleapis.com/earlyaccess/notosanskr.css" rel="stylesheet">
<style>
	* {font-family:'Noto Sans KR', sans-serif;}
	
	body{background: #EEEFF1 url(${ contextPath }/resources/image/y-repeat.png) repeat-y 50% 0;}
	
	.box{
		width: 400px; height: 100%;background-color: #fff; margin-right: auto; margin-left: auto;
    padding-top: 50px; padding-left: 100px; padding-right: 100px; padding-bottom: 50px; 
    text-align: center; border: none;
	}
	
	.input-container{
		position:relative;
		margin-bottom:30px;
	}
	.input-container label{
		position:absolute;
		top:10px;
		left:60px;
		font-size:16px;
		color:#555;	
	    pointer-event:none;
		transition: all 0.2s ease-in-out;
	}
	.input-container label b{
		color: #e74c3c;
	}
	.input-container input{ 
	  border:0;
	  border-bottom:1px solid #555;  
	  background:transparent;
	  width:70%;
	  padding:8px 0 5px 0;
	  font-size:16px;
	  color:#555;
	}
	.input-container input:focus{ 
	 border:none;	
	 outline:none;
	 border-bottom:1px solid #e74c3c;	
	}
	
	.gender-container {position:relative; margin-bottom:30px; float: left; margin-left: 15%;}
	
	#postCode{border:0; border-bottom:1px solid #555; background:transparent; width:45%; padding:8px 0 5px 0; font-size:16px; color:#555;}
	#postCode:focus{border:none; outline:none; border-bottom:1px solid #e74c3c;}
	#addrBtn{ border: none; background-color: lightgray; color: white; cursor:pointer; padding:8px;}
	#addrBtn:active{color: #808080}
	#norAddress, #restAddress{border:0; border-bottom:1px solid #555; background:transparent; width:70%; padding:8px 0 5px 0; font-size:16px; color:#555;}
	#norAddress:focus, #restAddress:focus{border:none; outline:none; border-bottom:1px solid #e74c3c;}
	
	.homePhone{margin-right: 93px;}
	
	#homePhone1{border:0; border-bottom:1px solid #555; background:transparent; font-size:16px; color:#555;}
	#homePhone2, #homePhone3{border:0; border-bottom:1px solid #555; background:transparent; width:50px; text-align: center; font-size:16px; color:#555;}
	#homePhone1:focus, #homePhone2:focus, #homePhone3:focus{border:none; outline:none; border-bottom:1px solid #e74c3c;}

	.phone{margin-right: 100px;}
	
	#phone1{border:0; border-bottom:1px solid #555; background:transparent; font-size:16px; color:#555;}
	#phone2, #phone3{border:0; border-bottom:1px solid #555; background:transparent; width:50px; text-align: center; font-size:16px; color:#555;}
	#phone1:focus, #phone2:focus, #phone3:focus{border:none; outline:none; border-bottom:1px solid #e74c3c;}
	
	table{background:transparent;
	  width:70%;
	  padding:8px 0 5px 0;
	  font-size:16px;
	  color:#555;}
	  
	#btn:active{color: #808080;}
	#btn {font-size: 14px; border: none; padding: 10px; width: 260px; background-color: black; margin-bottom: 30px; color: white; cursor:pointer;}
	.input-container input:focus ~ label,
	.input-container input:valid ~ label{
		top:-12px;
		font-size:12px;
		
	}
</style>
</head>
<body>
	<div class="box">
		<form action="${ contextPath }/enroll.me" method="post">
			<input type="hidden" name="eventCheck">
			<a href="${ contextPath }"><img alt="로고" src="${ contextPath }/resources/image/logo1.png"></a><br><br><br>
		
			<div class="input-container">
				<input type="text" name="memberId" id="id" required="required" onkeyup="checkId()"/>
				<label for="id">회원 ID&nbsp;<b>*</b></label>	<br>
				<span id="idCheck" style="float: left; margin-left: 15%; font-size: 12px"></span>
			</div>
			
			<div class="input-container">
				<input type="password" name="memberPwd" id="pwd" required="required"/>
				<label for="pwd">비밀번호&nbsp;<b>*</b></label>
				<span style="float:left; margin-left: 15%; font-size: 12px"></span>	
			</div>
			
			<div class="input-container">
				<input type="password" name="pwd2" id="pwd2" required="required" onblur="checkPwd()"/>
				<label for="pwd2">비밀번호 확인&nbsp;<b>*</b></label>
				<span id="pwdCheck" style="float: left; margin-left: 15%; font-size: 12px"></span>
			</div><br/>
			
			<span style="color:#555; margin-right: 50%;">기본 배송지<span style="color:#e74c3c;">&nbsp;*</span></span><br/>
			<input type="text" name="postCode" id="postCode" placeholder="우편번호" readonly="readonly" onclick="DaumPostcode()" >
			<input type="button" id="addrBtn" onclick="DaumPostcode()" value="우편번호 찾기"><br/>
			<input type="text" name="norAddress" id="norAddress" placeholder="기본 주소" readonly="readonly" onclick="DaumPostcode()" >
			<br /><input type="text" name="restAddress" id="restAddress" placeholder="나머지 주소" /><br/><br/><br/>
			
			<div class="input-container">
				<input type="text" name="memberName" id="name" required="required"/>
				<label for="name">이름&nbsp;<b>*</b></label>		
			</div>
			
			<span style="color:#555; margin-right: 55%;">일반전화</span><br/>
			<div class="homePhone">
			<select name="homePhone1" id="homePhone1">
				<option value="02">02</option>
				<option value="031">031</option>
				<option value="032">032</option>
				<option value="033">033</option>
				<option value="041">041</option>
				<option value="042">042</option>
				<option value="043">043</option>
				<option value="044">044</option>
				<option value="051">051</option>
				<option value="052">052</option>
				<option value="053">053</option>
				<option value="054">054</option>
				<option value="055">055</option>
				<option value="061">061</option>
				<option value="062">062</option>
				<option value="063">063</option>
				<option value="064">064</option>
				<option value="0502">0502</option>
				<option value="0503">0503</option>
				<option value="0504">0504</option>
				<option value="0505">0505</option>
				<option value="0506">0506</option>
				<option value="0507">0507</option>
				<option value="070">070</option>
				<option value="010">010</option>
				<option value="011">011</option>
				<option value="016">016</option>
				<option value="017">017</option>
				<option value="018">018</option>
				<option value="019">019</option>
				<option value="0508">0508</option>
			</select>
			-
			<input type="tel" name="homePhone2" id="homePhone2" maxlength="4">
			-
			<input type="tel" name="homePhone3" id="homePhone3" maxlength="4">
			</div><br>
			
			<span style="color:#555; margin-right: 52%;">휴대전화<span style="color:#e74c3c;">&nbsp;*</span></span><br/>
			<div class="phone">
			<select name="phone1" id="phone1">
				<option>010</option>
				<option>011</option>
				<option>016</option>
				<option>017</option>
				<option>018</option>
				<option>019</option>
			</select>
			-
			<input type="tel" name="phone2" id="phone2" maxlength="4" required="required">
			-
			<input type="tel" name="phone3" id="phone3" maxlength="4" required="required">
			</div><br><br>
			
			<div class="input-container">		
				<input type="email" required="required" id="email" name="memberEmail"/>
				<label for="email">이메일&nbsp;<b>*</b></label>
			</div>
			
			<div class="gender-container">
			<span style="color:#555; float: right;">성별<span style="color:#e74c3c;">&nbsp;*</span>
			<input type="radio" name="memberGender" id="male" value="M" checked /><label for="male">남자</label>&nbsp;
			<input type="radio" name="memberGender" id="female" value="F"/><label for="female">여자</label></span>
			</div>
			
			<br/><br/><br/>
			
			<div class="input-container">
				<input type="date" name="memberAge" id="age" autocomplete="off" required="required" />
				<label for="age">생년월일(ex-2023-05-05)&nbsp;<b>*</b></label>	
			</div>
		
			<button id="btn">회원가입</button>
		</form>	
	</div>

<script>
	const id = document.getElementById('id');
	const cId = document.getElementById('idCheck');
	
	const pwd = document.getElementById('pwd');
	const pwd2 = document.getElementById('pwd2');
	const cPwd = document.getElementById('pwdCheck');
	
	const checkId = ()=>{
		if(id.value.trim().length==0 || id.value.trim()==""){
			cId.innerText = "";
		} else if (id.value=='user01'){
			cId.innerText = "이미 존재하는 아이디입니다.";
			cId.style.color = 'red';
		} else if (id.value!='user01'){
			cId.innerText = "사용가능한 아이디입니다.";
			cId.style.color = 'green';
		}
	}
	
	const checkPwd = ()=>{
		if(pwd2.value.trim().length==0 || pwd2.value.trim()==""){
			cPwd.innerText = "";
		} else if(pwd.value != pwd2.value){
			cPwd.innerText = "비밀번호가 일치하지 않습니다.";
			cPwd.style.color = 'red';
		} else if(pwd.value == pwd2.value){
			cPwd.innerText = "비밀번호가 일치합니다.";
			cPwd.style.color = 'green';
		}
	}
	
// 	age에 있는 플레이스홀더같은거 안보이는척하기
	const age = document.getElementById('age');
	window.onload = ()=>{
		age.style.color = 'white';
		
		age.addEventListener('change', function(){
			if(this.value == null){
				this.style.color = 'white';
			} else{
				this.style.color = '#555';
			}
		})
		
	}
	
</script>
</body>
</html>