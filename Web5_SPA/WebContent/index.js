	$(document).ready(function(){
		$("#memberInsertFormBtn").click(function (){
			alert("회원가입 씨발!!");
			var v = "ID<input id='id'><br>PW<input type='password'><br><input type='button' value='회원가입' id='memberInsertBtn'>";
			$("#mainDiv").html(v);
		});
		
		$("#loginBtn").click(function(){	
			$.post("main",
				JSON.stringify({
					sign:"login",
					id:$("#id").val(),
					pw:$("#pw").val()
				})
			,function(data,status){
				var obj=JSON.parse(data);
				console.log(obj);
				if(obj.msg!=null ){
					alert(obj.msg);
				}else{
					if(obj.name!=null){
						$("#loginDiv").html(obj.name+"님 환영합니다");
						$("#mainDiv").html("즐거운 쇼핑 되세요.");
					}else{
						alert("다시 로그인 해주세요");
					}
				}
				
			});
		});
	});