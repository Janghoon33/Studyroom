//
	
	$(document).ready( () => {
	
	$.ajax({
		url : 'boardList.do',
		type : 'post',
		dataType : 'json',
		success : function(res){
			console.log(res);
		
		
		$('#tbody').html('');
		for(let i = 0; i < res.length; i++){
			tr = `
			<tr>
				<td>${res[i].b_num}</td>
				<td><a href='javascript:open(${res[i].b_num})'>${res[i].b_title}</a></td>
				<td>${res[i].b_writer}</td>
				<td>${res[i].b_date}</td>
			</tr>
			<tr>
			<tr id="board${res[i].b_num}" style="display:none;">
				<td colspan="5">
					<textarea rows="5" class="form-control">${res[i].b_content}</textarea>
				</td>
			</tr>
			`;
			
			$('#tbody').append(tr);
		}
		
		},
		error : function(e){
			alert('error');
		}
			
	});
	
	})
	
	
	