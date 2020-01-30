var action = '';
var url = '';
var type = '';
var bno = 0;

$(document).ready(function(){

	
	$("#createBtn").click(function(){
		action='create';
		type = 'POST';
		console.log('click')
		
		$("#modal-title").text("새 글 작성");
		$("#myModal").modal();
	});
	
	
	$("button[name='modifyBtn']").click(function(){
		action='modify';
		type = 'PUT';
		bno = this.value;
		console.log('click')

		// 부모요소
		var row = $(this).parent().parent().parent();
		// 자식요소
		var tr = row.children();
		
		var title = tr.eq(1).text();
		var content = tr.eq(2).text();

		$("#modal-title").text("수정하기");

		$("#title").val(title);
		$("#content").val(content)
		
		$("#myModal").modal();
	});
	

	$("button[name='deleteBtn']").click(function(){
		bno = this.value;
		console.log('click')
		$.ajax({
			url : '/delete/' + bno,
			type : 'DELETE',
		});
		location.reload();
	})
	
	
	
	$("#modalSubmit").click(function(){
		
		if(action == 'create'){
			bno = 0;
			url = '/insert';
		}else if(action == 'modify'){
			url = '/update';
		}

		var data = {
			"bno" : bno,
			"title" : $("#title").val(),
			"content" : $("#content").val()
		};
		
		$.ajax({
			url : url,
			type : type,
			data : data
		})
		location.reload();
	});
	

});