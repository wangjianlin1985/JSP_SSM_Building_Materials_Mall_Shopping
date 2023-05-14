<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="check_logstate.jsp"></jsp:include>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!doctype html>
<html lang="zh_CN">
<head>
<base href="<%=basePath%>" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>欢迎使用后台管理系统</title>
<link href="css/main.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/plugins/spinner/ui.spinner.js"></script>
<script type="text/javascript" src="js/plugins/spinner/jquery.mousewheel.js"></script>
<script type="text/javascript" src="js/jquery-ui.min.js"></script>
<script type="text/javascript" src="js/plugins/charts/excanvas.min.js"></script>
<script type="text/javascript" src="js/plugins/charts/jquery.sparkline.min.js"></script>
<script type="text/javascript" src="js/plugins/forms/uniform.js"></script>
<script type="text/javascript" src="js/plugins/forms/jquery.cleditor.js"></script>
<script type="text/javascript" src="js/plugins/forms/jquery.validationEngine-en.js"></script>
<script type="text/javascript" src="js/plugins/forms/jquery.validationEngine.js"></script>
<script type="text/javascript" src="js/plugins/forms/jquery.tagsinput.min.js"></script>
<script type="text/javascript" src="js/plugins/forms/autogrowtextarea.js"></script>
<script type="text/javascript" src="js/plugins/forms/jquery.maskedinput.min.js"></script>
<script type="text/javascript" src="js/plugins/forms/jquery.dualListBox.js"></script>
<script type="text/javascript" src="js/plugins/forms/jquery.inputlimiter.min.js"></script>
<script type="text/javascript" src="js/plugins/forms/chosen.jquery.min.js"></script>
<script type="text/javascript" src="js/plugins/wizard/jquery.form.js"></script>
<script type="text/javascript" src="js/plugins/wizard/jquery.validate.min.js"></script>
<script type="text/javascript" src="js/plugins/wizard/jquery.form.wizard.js"></script>
<script type="text/javascript" src="js/plugins/uploader/plupload.js"></script>
<script type="text/javascript" src="js/plugins/uploader/plupload.html5.js"></script>
<script type="text/javascript" src="js/plugins/uploader/plupload.html4.js"></script>
<script type="text/javascript" src="js/plugins/uploader/jquery.plupload.queue.js"></script>
<script type="text/javascript" src="js/plugins/tables/datatable.js"></script>
<script type="text/javascript" src="js/plugins/tables/tablesort.min.js"></script>
<script type="text/javascript" src="js/plugins/tables/resizable.min.js"></script>
<script type="text/javascript" src="js/plugins/ui/jquery.tipsy.js"></script>
<script type="text/javascript" src="js/plugins/ui/jquery.collapsible.min.js"></script>
<script type="text/javascript" src="js/plugins/ui/jquery.prettyPhoto.js"></script>
<script type="text/javascript" src="js/plugins/ui/jquery.progress.js"></script>
<script type="text/javascript" src="js/plugins/ui/jquery.timeentry.min.js"></script>
<script type="text/javascript" src="js/plugins/ui/jquery.colorpicker.js"></script>
<script type="text/javascript" src="js/plugins/ui/jquery.jgrowl.js"></script>
<script type="text/javascript" src="js/plugins/ui/jquery.breadcrumbs.js"></script>
<script type="text/javascript" src="js/plugins/ui/jquery.sourcerer.js"></script>
<script type="text/javascript" src="js/plugins/calendar.min.js"></script>
<script type="text/javascript" src="js/plugins/elfinder.min.js"></script>
<script type="text/javascript" src="js/custom.js"></script>
<script type="text/javascript" src="js/peihuo.js" charset="utf-8"></script>
<script type="text/javascript" src="js/selimage.js" charset="utf-8"></script>
<script type="text/javascript" src="<%=basePath%>My97DatePicker/WdatePicker.js" charset="utf-8"></script>
</head>
<body>
	<jsp:include page="menu.jsp"></jsp:include>
	<div id="rightSide">
		<jsp:include page="top.jsp"></jsp:include>
		<div class="line"></div>
		<div class="line"></div>
		<div class="line"></div>
		<div class="line"></div>
		<div class="wrapper">
			<form action="peihuo/addPeihuo.action" name="myform" method="post" onsubmit="return check()" class="form">
				<div class="widget" style="width: 40%">
					<div class="title">
						<img src="images/icons/dark/list.png" alt="" class="titleIcon" />
						<h6>新增配货点信息</h6>
					</div>

					<div class="formRow">
						<label>配货点名称</label>
						<div class="formRight">
							<input type="text" name="peihuoname" class="mws-textinput" id="peihuoname" placeholder="请输入配货点名称" />
						</div>
						<div class="clear"></div>
					</div>
					<div class="formRow">
						<label>城市</label>
						<div class="formRight">
							<select name="cityid" class="mws-textinput" id="cityid"><c:forEach items="${cityList}" var="city">
									<option value="${city.cityid}">${city.cityname }</option>
								</c:forEach></select>
						</div>
						<div class="clear"></div>
					</div>
					<div class="formRow">
						<label>地址</label>
						<div class="formRight">
							<input type="text" name="address" class="mws-textinput" id="address" placeholder="请输入地址" />
						</div>
						<div class="clear"></div>
					</div>
					<div class="formRow">
						<label>联系手机</label>
						<div class="formRight">
							<input type="text" name="contact" class="mws-textinput" id="contact" placeholder="请输入联系手机" />
						</div>
						<div class="clear"></div>
					</div>
					<div class="formRow">
						<label>备注</label>
						<div class="formRight">
							<input type="text" name="memo" class="mws-textinput" id="memo" placeholder="请输入备注" />
						</div>
						<div class="clear"></div>
					</div>

					<div class="formSubmit">
						<input type="submit" id="sub" value="确认提交" class="redB"> &nbsp;&nbsp;&nbsp;&nbsp; <input type="reset"
							id="res" value="取消重置" class="redB">
					</div>
				</div>
			</form>
		</div>
	</div>
	<script>
		function isPhoneNumber(tel) {
		    var reg =/^0?1[3|4|5|6|7|8][0-9]\d{8}$/;
		    return reg.test(tel);
		}
		 function check()
		 {   
  			 var contact = document.getElementById("contact").value;
			
			 if(!isPhoneNumber(contact)){
				 alert("手机格式不对！");
				 return false;
			 }
			 
			 return true;
		 }
		</script>
	<div class="clear"></div>
</body>
</html>

