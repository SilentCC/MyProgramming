<!DOCTYPE html>
<html lang="en">
<head>
<title>Home</title>
<!-- for-mobile-apps -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=gbk" />
<meta name="keywords" content="" />
<!-- //for-mobile-apps -->
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<link class="include" rel="stylesheet" type="text/css" href="css/jquery.jqplot.css" />
<!-- font-awesome icons -->
<link rel="stylesheet" href="css/font-awesome.min.css" />
<!-- //font-awesome icons -->
<!-- js -->
<script src="js/jquery-1.11.1.min.js"></script>
<script type="text/javascript" src="js/jquery.marquee.min.js"></script>
<!-- js -->
<!-- elastislide我们的伙伴 -->
<link rel="stylesheet" type="text/css" href="css/elastislide.css" />
<link rel="stylesheet" type="text/css" href="css/custom.css" />
<link rel="stylesheet" href="css/toastr.css">
<script src="js/modernizr.custom.17475.js"></script>
<script src="js/jquerypp.custom.js"></script>
<script src="js/jquery.elastislide.js"></script>
<script src="http://code.jquery.com/jquery-2.1.4.min.js"></script>
<!-- //elastislide-->
<script src="js/move-top.js"></script>
<!-- start-smoth-scrolling -->
<script type="text/javascript">
function show(){
        document.getElementById("overDiv").style.display = "block" ;
        document.getElementById("hsDiv").style.display = "block" ;
    }




window.onload=function(){

//  alert("ok");

  //$.getJSON("http://localhost:8089/Data/servlet/message",function(data){
  //alert("ok");
    //      alert(data);

      //});

}



    $.ajax({
    	url:'http://localhost:8089/Data/servlet/message',
    	method:'get',
		dataType:'json',
    	success:function(data){
    	
    	

    		$.each(data,function(i,term){
    		
    		alert(term.name);
    		});
    	},
    	error:function(XMLHttpRequest,textStatus,errorThrown){

    		alert(XMLHttpRequest.status);
    		alert(XMLHttpRequest.readyState);
    		alert(textStatus);

    	}

    });








</script>

</head>

<body>
<!-- header -->
   <div id="hsDiv">
    <!--begin of 用户登录-->
		<div class="loginc">
			<form action="#" method="post" enctype="multipart/form-data">
				<ul>
					<li class="clearfix">
						<input required type="text" id="fe_user" name="fe_user" placeholder="手机号或用户名">
						<span id="errorUser"></span>
					</li>
					<li class="clearfix">
						<input required type="password" id="password" name="password" placeholder="密码" maxlength="18">
						<span id="errorPwd"></span>
					</li>
					<li class="clearfix">
						<input required type="text" id="captcha" name="captcha" placeholder="验证码">
						<div id="pictureCode"></div>
						<span id="errorCode"></span>
					</li>
					<li class="clearfix">
						<input type="submit" id="loginBtn" name="loginBtn" value="登录">
					</li>
					<div class="forgetPwd"><a href="findPwd.html">忘记密码</a></div>
				</ul>
			</form>
		</div>
<!--end of 用户登录-->
	</div>
	<div id="overDiv" ></div>
	<script src="js/gVerify.js"></script>
	<script type="text/javascript">
	    var verifyCode = new GVerify("pictureCode");
	    var errorCode=document.getElementById("errorCode")
	    document.getElementById("captcha").onblur = function(){
				var res = verifyCode.validate(document.getElementById("captcha").value);
				if(res){
					errorCode.innerHTML="";
				}else{
					errorCode.innerHTML="<font color='red'>*请正确填写验证码</font>";
				}
			}
	</script>
<!-- //header -->
<!-- navigation -->
	<div class="trade_navigation" >
		<div class="container">
			<nav class="navbar nav_bottom">
			   <!-- Collect the nav links, forms, and other content for toggling -->
				<div class="collapse navbar-collapse" id="bs-megadropdown-tabs">
					<nav class="wthree_nav">
						<ul class="nav navbar-nav nav_1">
							<li><img src="images/111.png" width="20" height="20" ><p class="con_title">ZxlTrade</p></li>
							<li class="act"><a href="index.html">首页</a></li>
							<li><a href="signaldealer.html">策略中心</a></li>
							<li class="dropdown">
								<a href="#" class="dropdown-toggle" data-toggle="dropdown">线上活动<span class="caret"></span></a>
								<div class="dropdown-menu w3ls_vegetables_menu">
									<ul>
									    <li><a href="#">仿真擂台</a></li>
										<li><a href="#">寻找交易达人</a></li>
										<li><a href="#">ZxlTade计划</a></li>
										<li><a href="#">ZxlTrade管理人</a></li>
										<li><a href="#">其他活动</a></li>
									</ul>
								</div>
							</li>
							<li><a href="#">财经资讯</a></li>
							<li><a href="#">ZxlTrade社区</a></li>

						</ul>
						<div class="loginin"><a href="register.html">注册</a></div>
                        <div ><a class="orange buttonre" href="javascript:void(0);" onclick="show()">登录</a></div>
                        <ul class="nav navbar-nav nav_1">
					    <li class="dropdown">
					    	<a href="#" class="dropdown-toggle" style="font-size: 11px;" data-toggle="dropdown">帮助中心<span class="caret"></span>
					    	</a>
							<div class="dropdown-menu w3ls_vegetables_menu">
								<ul>
									<li><a href="#">新手指南</a></li>
									<li><a href="#">订阅策略</a></li>
								</ul>
							</div>
						</li>
						</ul>
					</nav>
				</div>
			</nav>
		</div>
	</div>
<!-- //navigation -->
	<div class="news" style="display: none;">

	</div>
<!-- banner -->
	<div class="banner" style="margin-top: 55px;">
			<section class="slider">
				<div class="flexslider">
					<ul class="slides">
						<li>
							<div class="w3_agile_banner_text banner1">
							</div>
						</li>
						<li>
							<div class="w3_agile_banner_text banner2">

							</div>
						</li>
						<li>
							<div class="w3_agile_banner_text banner3">

							</div>
						</li>
						<li>
							<div class="w3_agile_banner_text banner4">

							</div>
						</li>
						<li>
							<div class="w3_agile_banner_text banner5">

							</div>
						</li>
					</ul>
				</div>
			</section>
			<!-- flexSlider -->
				<link rel="stylesheet" href="css/flexslider.css" type="text/css" media="screen" property="" />
				<script defer src="js/jquery.flexslider.js"></script>
				<script type="text/javascript">
				$(window).load(function(){
				  $('.flexslider').flexslider({
					animation: "slide",
					start: function(slider){
					  $('body').removeClass('loading');
					}
				  });
				});
			  </script>
			<!-- //flexSlider -->
	</div>
<!-- //banner -->
<!--container-->

<!--HOT策略-->

	<div class="hot">
			<div class="w3l_news_board1" >
				<div class="indextitle">
					<span>策略提供者</span>
				</div>
				<ul id="myTab" class="nav nav-tabs" role="tablist">
					<li role="presentation" class="active"><a href="#week" id="week-tab" role="tab" data-toggle="tab" aria-controls="week" aria-expanded="true">周盈利</a></li>
					<li role="presentation"><a href="#month" role="tab" id="month-tab" data-toggle="tab" aria-controls="month">月盈利</a></li>
					<li role="presentation"><a href="#year" role="tab" id="year-tab" data-toggle="tab" aria-controls="year">年盈利</a></li>
					<li role="presentation"><a href="#all" role="tab" id="all-tab" data-toggle="tab" aria-controls="all">总盈利</a></li>
				</ul>
				<a class="more_rig" href="signaldealer.html">更多>></a>
				<div id="myTabContent" class="tab-content">
					<div role="tabpanel" class="tab-pane fade in active" id="week" aria-labelledby="week-tab">
						<div class="hotcontain">
							<div class="hotone">
								<div class="touxiang">
									<img class="img-circle" src="images/daji01.jpeg" >
									<div class="touxiangright ">信号商昵称</div>
								</div>
								<div class="toppic"><img src="images/top1.jpg">
								</div>
								<div class="fontdiv0">
									<p class="fonttop"><span class="spanfonttop"></span>9999.99</p>
									<p class="fontbottom" >总获利金额</p>
								</div>
								<div class="fontdiv">
									<p class="fontleft">交易风格</p>
									<p class="fontright">稳健</p>
								</div>
								<div class="fontdiv">
									<p class="fontleft">订阅人数</p>
									<p class="fontright">160</p>
							 	</div>
								<div class="fontdiv2">
									<p class="fontleft">收益率</p>
									<p class="fontright">99%</p>
								</div>
									<a href="#" class="follow">订阅</a>

							</div>
							<div class="hotone">
								<div class="touxiang">
									<img class="img-circle" src="images/daji01.jpeg" >
									<div class="touxiangright ">信号商昵称</div>
								</div>
								<div class="toppic"><img src="images/top2.jpg">
								</div>
								<div class="fontdiv0">
									<p class="fonttop"><span></span>9999.99</p>
									<p class="fontbottom" >总获利金额</p>
								</div>
								<div class="fontdiv">
									<p class="fontleft">交易风格</p>
									<p class="fontright">稳健</p>
								</div>
								<div class="fontdiv">
									<p class="fontleft">订阅人数</p>
									<p class="fontright">160</p>
							 	</div>
								<div class="fontdiv2">
									<p class="fontleft">收益率</p>
									<p class="fontright">99%</p>
								</div>
									<a href="#" class="follow">订阅</a>
							</div>
							<div class="hotone">
								<div class="touxiang">
									<img class="img-circle" src="images/daji01.jpeg" >
									<div class="touxiangright ">信号商昵称</div>
								</div>
								<div class="toppic"><img src="images/top3.jpg">
								</div>
								<div class="fontdiv0">
									<p class="fonttop"><span></span>9999.99</p>
									<p class="fontbottom" >总获利金额</p>
								</div>
								<div class="fontdiv">
									<p class="fontleft">交易风格</p>
									<p class="fontright">稳健</p>
								</div>
								<div class="fontdiv">
									<p class="fontleft">订阅人数</p>
									<p class="fontright">160</p>
							 	</div>
								<div class="fontdiv2">
									<p class="fontleft">收益率</p>
									<p class="fontright">99%</p>
								</div>
									<a href="#" class="follow">订阅</a>
							</div>
							<div class="hotone">
								<div class="touxiang">
									<img class="img-circle" src="images/daji01.jpeg" >
									<div class="touxiangright ">信号商昵称</div>
								</div>
								<div class="fontdiv0">
									<p class="fonttop"><span></span>9999.99</p>
									<p class="fontbottom" >总获利金额</p>
								</div>
								<div class="fontdiv">
									<p class="fontleft">交易风格</p>
									<p class="fontright">稳健</p>
								</div>
								<div class="fontdiv">
									<p class="fontleft">订阅人数</p>
									<p class="fontright">160</p>
							 	</div>
								<div class="fontdiv2">
									<p class="fontleft">收益率</p>
									<p class="fontright">99%</p>
								</div>
									<a href="#" class="follow">订阅</a>
							</div>
							<div class="hotone">
								<div id="toastr-demo" >
									<p class="demo-button">
										<button type="button" class="btn btn-primary btn-toastr-callback" id="toastr-callback3" data-context="info"
								data-message="
								通知：策略开仓 22:24:19<br>
                                品种  合约代码 方向 类型 手数 开仓价格<br>
                                <a>沥青</a>   <a>bu1712</a>   买   开仓  1   2720.00" >点我点我</button>
									</p>
							<!-- END CALLBACK -->
								</div>
								<script src="js/jquery.slimscroll.min.js"></script>
								<script src="js/toastr.js"></script>
								<script src="js/klorofil-common.js"></script>
							</div>
						</div>
					</div>
					<div role="tabpanel" class="tab-pane fade" id="month" aria-labelledby="month-tab">
						<div class="hotcontain">
							<div class="hotone">

							</div>
							<div class="hotone">
								2
							</div>
							<div class="hotone">
								2
							</div>
							<div class="hotone">
								2
							</div>
							<div class="hotone">
								2
							</div>
						</div>
					</div>
					<div role="tabpanel" class="tab-pane fade" id="year" aria-labelledby="year-tab">
						<div class="hotcontain">
							<div class="hotone">
								3
							</div>
							<div class="hotone">
								3
							</div>
							<div class="hotone">
								3
							</div>
							<div class="hotone">
								3
							</div>
							<div class="hotone">
								3
							</div>
						</div>
					</div>
					<div role="tabpanel" class="tab-pane fade" id="all" aria-labelledby="all-tab">
						<div class="hotcontain">
							<div class="hotone">
								4
							</div>
							<div class="hotone">
								4
							</div>
							<div class="hotone">
								4
							</div>
							<div class="hotone">
								4
							</div>
							<div class="hotone">
								4
							</div>
						</div>
					</div>
				</div>

	</div>
</div>
<!--//HOT策略-->
<!--TOP收益-->
	<div class="hot">
			<div class="w3l_news_board1">
				<div class="indextitle">
					<span>订阅者收益</span>
				</div>
				<ul id="myTab" class="nav nav-tabs" role="tablist">
					<li role="presentation" class="active"><a href="#week2" id="week2-tab" role="tab" data-toggle="tab" aria-controls="week2" aria-expanded="true">周盈利</a></li>
					<li role="presentation"><a href="#month2" role="tab" id="month2-tab" data-toggle="tab" aria-controls="month2">月盈利</a></li>
					<li role="presentation"><a href="#year2" role="tab" id="year2-tab" data-toggle="tab" aria-controls="year2">年盈利</a></li>
					<li role="presentation"><a href="#all2" role="tab" id="all2-tab" data-toggle="tab" aria-controls="all2">总盈利</a></li>
				</ul>
				<a class="more_rig" href="#">更多>></a>
				<div id="myTabContent" class="tab-content">
					<div role="tabpanel" class="tab-pane fade in active" id="week2" aria-labelledby="week2-tab">
						<div class="hotcontain">
							<div class="hotone">
								<div class="touxiang">
									<img class="img-circle" src="images/daji01.jpeg" >
									<div class="touxiangright ">信号商昵称</div>
								</div>
								<div class="toppic"><img src="images/top1.jpg"></div>
								<div class="fontdiv0">
									<p class="fonttop"><span></span>9999.99</p>
									<p class="fontbottom" >总获利金额</p>
								</div>
								<div class="fontdiv2">
									<p class="fontleft">相关策略</p>
									<p class="fontright">策略1</p>
								</div>
								<div class="fontdiv2">
									<p class="fontleft">收益率</p>
									<p class="fontright">99%</p>
								</div>

									<a href="#" class="follow">订阅策略</a>
							</div>
							<div class="hotone">
								<div class="touxiang">
									<img class="img-circle" src="images/daji01.jpeg" >
									<div class="touxiangright ">信号商昵称</div>
								</div>
								<div class="toppic"><img src="images/top2.jpg"></div>
								<div class="fontdiv0">
									<p class="fonttop"><span></span>9999.99</p>
									<p class="fontbottom" >总获利金额</p>
								</div>
								<div class="fontdiv2">
									<p class="fontleft">相关策略</p>
									<p class="fontright">策略1</p>
								</div>
								<div class="fontdiv2">
									<p class="fontleft">收益率</p>
									<p class="fontright">99%</p>
								</div>

									<a href="#" class="follow">订阅策略</a>
							</div>
							<div class="hotone">
								<div class="touxiang">
									<img class="img-circle" src="images/daji01.jpeg" >
									<div class="touxiangright ">信号商昵称</div>
								</div>
								<div class="toppic"><img src="images/top3.jpg"></div>
								<div class="fontdiv0">
									<p class="fonttop"><span></span>9999.99</p>
									<p class="fontbottom" >总获利金额</p>
								</div>
								<div class="fontdiv2">
									<p class="fontleft">相关策略</p>
									<p class="fontright">策略1</p>
								</div>
								<div class="fontdiv2">
									<p class="fontleft">收益率</p>
									<p class="fontright">99%</p>
								</div>

									<a href="#" class="follow">订阅策略</a>
							</div>
							<div class="hotone">
								<div class="touxiang">
									<img class="img-circle" src="images/daji01.jpeg" >
									<div class="touxiangright ">信号商昵称</div>
								</div>
								<div class="fontdiv0">
									<p class="fonttop"><span></span>9999.99</p>
									<p class="fontbottom" >总获利金额</p>
								</div>
								<div class="fontdiv2">
									<p class="fontleft">相关策略</p>
									<p class="fontright">策略1</p>
								</div>
								<div class="fontdiv2">
									<p class="fontleft">收益率</p>
									<p class="fontright">99%</p>
								</div>

									<a href="#" class="follow">订阅策略</a>
							</div>
							<div class="hotone">
								<div class="touxiang">
									<img class="img-circle" src="images/daji01.jpeg" >
									<div class="touxiangright ">信号商昵称</div>
								</div>
								<div class="fontdiv0">
									<p class="fonttop"><span></span>9999.99</p>
									<p class="fontbottom" >总获利金额</p>
								</div>
								<div class="fontdiv2">
									<p class="fontleft">相关策略</p>
									<p class="fontright">策略1</p>
								</div>
								<div class="fontdiv2">
									<p class="fontleft">收益率</p>
									<p class="fontright">99%</p>
								</div>

									<a href="#" class="follow">订阅策略</a>
							</div>
						</div>
					</div>
					<div role="tabpanel" class="tab-pane fade" id="month2" aria-labelledby="month2-tab">
						<div class="hotcontain">
							<div class="hotone">
								2
							</div>
							<div class="hotone">
								2
							</div>
							<div class="hotone">
								2
							</div>
							<div class="hotone">
								2
							</div>
							<div class="hotone">
								2
							</div>
						</div>
					</div>
					<div role="tabpanel" class="tab-pane fade" id="year2" aria-labelledby="year2-tab">
						<div class="hotcontain">
							<div class="hotone">
								3
							</div>
							<div class="hotone">
								3
							</div>
							<div class="hotone">
								3
							</div>
							<div class="hotone">
								3
							</div>
							<div class="hotone">
								3
							</div>
						</div>
					</div>
					<div role="tabpanel" class="tab-pane fade" id="all2" aria-labelledby="all2-tab">
						<div class="hotcontain">
							<div class="hotone">
								4
							</div>
							<div class="hotone">
								4
							</div>
							<div class="hotone">
								4
							</div>
							<div class="hotone">
								4
							</div>
							<div class="hotone">
								4
							</div>
						</div>
					</div>

			</div>
		</div>
	</div>
<!--//TOP收益-->
<!--合作伙伴-->
	<div style="margin-top: 1.3em;">
		<p style="text-align: center;font-size: 1.5em;font-weight: bold;">我们的伙伴</p>
		<div style="height:195px; margin:0 auto; ">
			<div class="container demo-1">
				<ul id="carousel" class="elastislide-list">
					<li><a href="#"><img src="images/002.jpg" alt="image01" /></a></li>
					<li><a href="#"><img src="images/002.jpg" alt="image02" /></a></li>
					<li><a href="#"><img src="images/002.jpg" alt="image03" /></a></li>
					<li><a href="#"><img src="images/002.jpg" alt="image04" /></a></li>
					<li><a href="#"><img src="images/002.jpg" alt="image05" /></a></li>
					<li><a href="#"><img src="images/002.jpg" alt="image06" /></a></li>
					<li><a href="#"><img src="images/002.jpg" alt="image07" /></a></li>
					<li><a href="#"><img src="images/002.jpg" alt="image07" /></a></li>
					<li><a href="#"><img src="images/002.jpg" alt="image07" /></a></li>
					<li><a href="#"><img src="images/002.jpg" alt="image07" /></a></li>
				</ul>
			</div>
		</div>
	</div>


		<script type="text/javascript">

			$( '#carousel' ).elastislide();

		</script>
<!--//合作伙伴-->

<!-- footer -->
	<div class="footer">
		<div class="main">
			<div class="leftinfo">
				<div class="guideitem">
					<h6 class="ftitle">友情链接</h6>
					<a href="#" target="_blank" class="linkitem">华夏银行</a>
					<a href="#" target="_blank" class="linkitem">华夏银行</a>
					<a href="#" target="_blank" class="linkitem">华夏银行</a>
					<a href="#" target="_blank" class="linkitem">华夏银行</a>
				</div>
				<div class="guideitem">
					<h6 class="ftitle">帮助中心</h6>
					<a href="#" target="_blank" class="linkitem">新手指南</a>
					<a href="#" target="_blank" class="linkitem">订阅策略</a>
					<a href="#" target="_blank" class="linkitem">常见问题</a>
					<a href="#" target="_blank" class="linkitem">网站地图</a>
				</div>
				<div class="guideitem">
					<a href="weblaw.html" ><h6 class="ftitle">网站条款</h6></a>
					<a href="weblaw.html#section-1" target="_blank" class="linkitem">法律申明</a>
					<a href="weblaw.html#section-2" target="_blank" class="linkitem">风险提示</a>
					<a href="weblaw.html#section-3" target="_blank" class="linkitem">免责条款</a>
					<a href="weblaw.html#section-4" target="_blank" class="linkitem">法律保障</a>
					<a href="weblaw.html#section-5" target="_blank" class="linkitem">订阅须知</a>
				</div>
				<div class="guideitem">
					<h6 class="ftitle">关于我们</h6>
					<a href="#" target="_blank" class="linkitem">平台简介</a>
					<a href="#" target="_blank" class="linkitem">发展历程</a>
					<a href="#" target="_blank" class="linkitem">加入我们</a>
					<a href="#" target="_blank" class="linkitem">About us</a>
				</div>
				<div class="guideitemlast">
					<h6 class="ftitle">联系我们</h6>
					<div class="telephone">xxxx-xxxxxx</div>
					<p class="tip">服务时间：周一至周五9:00-18:00</p>
					<p class="tip">e-mail：xxxxxxxxxxxxxx</p>
					<p class="tip">公司名称：xxxxxxxxxxxxxxxxxxxxxxx</p>
					<p class="tip">联系地址：xxxxxxxxxxxxxxxxxxxxxxxxxx</p>
				</div>
			</div>
			<div class="rightinfo">
				<div class="wxitem">
					<img src="images/zxl.jpg" alt="官方微信二维码" >
					<p>官方微信二维码</p>
				</div>
				<div class="wxitemr">
					<img src="images/zxl.jpg" alt="APP下载二维码" >
					<p>APP下载二维码</p>
				</div>
			</div>
		</div>
	</div>
	<div class="copyright">
				Copyright  &copy;2017 ZxlTrade 版权所有，保留所有权利  |  备案号：
		</div>
<!-- //footer -->


<!-- Bootstrap Core JavaScript -->
<script src="js/bootstrap.min.js"></script>
<script>
$(document).ready(function(){
    $(".dropdown").hover(
        function() {
            $('.dropdown-menu', this).stop( true, true ).slideDown("fast");
            $(this).toggleClass('open');
        },
        function() {
            $('.dropdown-menu', this).stop( true, true ).slideUp("fast");
            $(this).toggleClass('open');
        }
    );
});
</script>
<!-- //Bootstrap Core JavaScript -->
<!-- here stars scrolling icon -->
	<script type="text/javascript">
		$(document).ready(function() {
			/*
				var defaults = {
				containerID: 'toTop', // fading element id
				containerHoverID: 'toTopHover', // fading element hover id
				scrollSpeed: 1200,
				easingType: 'linear'
				};
			*/

			$().UItoTop({ easingType: 'easeOutQuart' });

			});
	</script>
<!-- //here ends scrolling icon -->
</body>
</html>
