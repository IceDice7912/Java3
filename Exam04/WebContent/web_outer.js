$(document).ready(function(){
	$('#loginBtn').click(function(){
	var id=$('#id').val();
	var pw=$('#pw').val();
	alert(id + " : " + pw);

	$.ajax({
		type: "post",
		data: {id:id},
		url: "./Main",
		success:function (data,textStatus){
            $('#message').append(data);
         }
	});
	});
});