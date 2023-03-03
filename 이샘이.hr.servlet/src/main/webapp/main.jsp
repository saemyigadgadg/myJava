<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<%@ page import='service.LaborerService, service.LaborerServiceImpl' %>
<!DOCTYPE html>
<html>
<head>
<meta charset='utf-8'>
<meta name='viewport' content='width=device-width, initial-scale=1'>
<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css' rel='stylesheet'>
<script src='https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js'></script>
<link rel='stylesheet' href='https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.0/font/bootstrap-icons.css'>
<script src='https://code.jquery.com/jquery-3.6.0.min.js'></script>
<title>hr.bootstrap</title>


<script>
    function isVal(field) {
        let isGood = false
        let errMsg

        if(!field.length) errMsg = '노동자를 선택하세요.'
        else {
            if(!field.val()) errMsg = field.attr('placeholder') + ' 입력하세요.'
            else isGood = true 
        }

        if(!isGood) {
            $('#modalMsg').text(errMsg).css('color', 'red')
            $('#modalBtn').hide()
            $('#modal').modal('show')
        }

        return isGood
    }
	
    $(listLaborers)
    
    function listLaborers() {
        $('input').not(':radio').val('')
        $('#laborers').empty()

        $.ajax({
            url: 'getLaborers.jsp',
            dataType: 'json',
            success: laborers => {
               if(laborers.length) {
                  const laborerArr = []
                  $.each(laborers, (i, laborer) => {
                     laborerArr.unshift(
                    	`<tr>
                             <td><input type='radio' value='\${laborer.laborerId}' id='laborerId' name='laborerId'/></td>
                             <td>\${laborer.laborerId}</td>
                             <td name='laborerName'>\${laborer.laborerName}</td>
                             <td name='hireDate'>\${laborer.hireDate}</td>   
                         </tr>`
                     	)
                  	})
                  $('#laborers').append(laborerArr.join(''))
               } else $('#laborers').append(
            		   `<tr><td colspan='4' class='text-center'>노동자가 없습니다.</td></tr>`)
            }
         })
      }
    
    function init() {
        //노동자 추가
        $('#addLaborerBtn').click(() => {
            if(isVal($('#laborerName')) && isVal($('#hireDate'))) {
            	e.preventDefault()
            } 
        })
    
        //노동자 수정
        $('#fixLaborerBtn').click(() =>{
            if(isVal($('#laborerId:checked')) && 
                isVal($('#laborerName')) && isVal($('#hireDate'))){
            	e.preventDefault()
            }
        })


        $('#laborers').on({
            change() {
                $('#laborerName').val($(this).parent().next().next().text())
                $('#hireDate').val($(this).parent().next().next().next().text())
            }
        }, '#laborerId')

        //노동자 삭제
        $('#delLaborerBtn').click(() => {
            if(isVal($('#laborerId:checked'))) {
                $('#modalMsg').text('노동자를 삭제하시겠습니까?')
                $('#modalBtn').show()
                $('#modal').modal('show')
            }
        })

        $('#delLaborerOkBtn').click(() => {
        	e.preventDefault()
        })
    }
    
    $(init)
</script>
</head>
<body>
<div class='container'>
    <div class='row mb-5'>
        <div class='col'>
            <header class='p-2 bg-light shadow'>
                <h1 class='text-center'><b>HR</b></h1>
            </header>
        </div>
    </div>
<div class='row'>
    <div class='col'>
        <form>
            <div class='row mb-3'>
                <div class='col-2'>
                    <input type='text' class='form-control' placeholder='노동자명' name='laborerName' id='laborerName' maxlength='5'/>
                </div>
                <div class='col-5'>
                    <div class='row'>
                        <div class='col-4 d-none d-md-inline text-end align-bottom pt-1'>
                            <label for='hireDate'>입사일 :</label>
                        </div>
                        <div class='col'>
                            <input type='date' class='form-control' id='hireDate'
                               name='hireDate' placeholder='입사일' required/>
                        </div>
                    </div>
                </div>
                <div class='col'>
                    <div class='gap-2 d-flex justify-content-end'>
                        <button type='submit' class='btn btn-primary' id='addLaborerBtn' formaction='addLaborerProc.jsp'>
                            <i class='bi bi-plus-circle'></i>
                            <span class='d-none d-md-inline'>&nbsp;추가</span>
                        </button>
                        <button type='submit' class='btn btn-success' id='fixLaborerBtn' formaction='fixLaborerProc.jsp'>
                            <i class='bi bi-check-circle'></i>
                            <span class='d-none d-md-inline'>&nbsp;수정</span>
                        </button>
                        <button type='button' class='btn btn-danger' id ='delLaborerBtn'> 
                            <i class='bi bi-x-circle'></i>
                            <span class='d-none d-md-inline'>&nbsp;삭제</span>
                        </button>
                    </div>
                </div>
            </div>
            <div class='row'>
                <div class='col'>
                    <table class='table'>
                        <thead class='table-warning'>
                            <tr><th></th><th>ID</th><th>이름</th><th>입사일</th></tr>
                        </thead>
                        <tbody id='laborers'>
                            <tr><td colspan='4' class='text-center'>노동자가 없습니다.</td></tr>
                        </tbody>
                    </table>
                </div>
            </div>
<div class='modal fade' id='modal'>
	<div class='modal-dialog'>
		<div class='modal-content'>
	 		<div class='modal-header'>
	      		<button type='button' class='btn-close' data-bs-dismiss='modal'></button>
     		</div>
     		<div class='modal-body'>
         		 <p id='modalMsg'></p>
     		</div>
     		<div class='modal-footer' id='modalBtn'>
          		<button type='button' class='btn btn-secondary' data-bs-dismiss="modal">아니오</button>
          		<button type='submit' class='btn btn-primary' id='delLaborerOkBtn' formaction='delLaborerProc.jsp'>예</button>
		</div>
	</div>
</div>
</div>
</form>
</div>
</div>
</div>
</body>
</html>