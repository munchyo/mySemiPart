<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품목록</title>
<link href="https://fonts.googleapis.com/earlyaccess/notosanskr.css" rel="stylesheet">
<style>
	.menuCategoryBox{
		width:100%
	}
	.menuCategory{
		font-family:'Noto Sans KR', sans-serif;
		font-weight: lighter;
		font-size: 13px;
		margin:0 auto;
		display:flex;
		width:350px;
	}
	
	.menuCategory li{
		text-align:center;
		width:200px;
		list-style:none;
	}
	
	.menuCategory li a{
		text-decoration:none;
	    color: black;
	}
	
	.menuCategory li a:hover{
		text-decoration:none;
	    color: gray;
	}
	
	.product-list{
	    width: 1000px;
	    margin-left: auto;
	    margin-right: auto;
	}
	.products h3{
	    font-size: 24px;
	    color: #555;
	    margin-top:60px;
	    margin-bottom: 60px;
	    text-align: center;
	}
	
	.product{
	    display: block;
	    width: 225px;
	    text-align: center;
	    text-decoration:none;
	    color: black;
	    float:left;
	    margin-left: 10px;
	    margin-right: 10px;
	    margin-bottom: 30px;
	}
	
	img{border: 1px solid gray;}
	
	.product-name{
	    margin-top: 5px;
	    color:black;
	}
	
	.product-price{
		color:gray;
	}
	
	.product-name, .product-price{
		font-family:'Noto Sans KR', sans-serif;
		font-weight: lighter;
		font-size: 13px;
	}
	
	.clearfix{
	    clear: both;
	}
</style>
</head>
<body>
	<div class="menuCategoryBox">
	<ui class="menuCategory">
		<li>ㅡ</li>
		<li><a href="#">스웨트</a></li>
		<li><a href="#">긴소매</a></li>
		<li><a href="#">반소매</a></li>
		<li><a href="#">민소매</a></li>
		<li>ㅡ</li>
	</ui>
	</div>

    <div class="products">
        <h3>반소매 셔츠</h3>

        <div class="product-list">
            <a href="#" class="product">
                <img src="https://balenciaga.dam.kering.com/m/3becacd7c6d635f6/Small-739028TOVN81055_Y.jpg?v=1" width="225" height="225px">
                <div class="product-name">
                    반소매 셔츠
                </div>
                <div class="product-price">
                    890,000
                </div>
            </a>

            
            <a href="#" class="product">
                <img src="https://balenciaga.dam.kering.com/m/3becacd7c6d635f6/Small-739028TOVN81055_Y.jpg?v=1" width="225" height="225px">
                <div class="product-name">
                    반소매 셔츠
                </div>
                <div class="product-price">
                    890,000
                </div>
            </a>

            
            <a href="#" class="product">
                <img src="https://balenciaga.dam.kering.com/m/3becacd7c6d635f6/Small-739028TOVN81055_Y.jpg?v=1" width="225" height="225px">
                <div class="product-name">
                    반소매 셔츠
                </div>
                <div class="product-price">
                    890,000
                </div>
            </a>

            
            <a href="#" class="product">
                <img src="https://balenciaga.dam.kering.com/m/3becacd7c6d635f6/Small-739028TOVN81055_Y.jpg?v=1" width="225" height="225px">
                <div class="product-name">
                    반소매 셔츠
                </div>
                <div class="product-price">
                    890,000
                </div>
            </a>

            
            <a href="#" class="product">
                <img src="https://balenciaga.dam.kering.com/m/3becacd7c6d635f6/Small-739028TOVN81055_Y.jpg?v=1" width="225" height="225px">
                <div class="product-name">
                    반소매 셔츠
                </div>
                <div class="product-price">
                    890,000
                </div>
            </a>

            
            <a href="#" class="product">
                <img src="https://balenciaga.dam.kering.com/m/3becacd7c6d635f6/Small-739028TOVN81055_Y.jpg?v=1" width="225" height="225px">
                <div class="product-name">
                    반소매 셔츠
                </div>
                <div class="product-price">
                    890,000
                </div>
            </a>

            <a href="#" class="product">
                <img src="https://balenciaga.dam.kering.com/m/3becacd7c6d635f6/Small-739028TOVN81055_Y.jpg?v=1" width="225" height="225px">
                <div class="product-name">
                    반소매 셔츠
                </div>
                <div class="product-price">
                    890,000
                </div>
            </a>
            
            <a href="#" class="product">
                <img src="https://balenciaga.dam.kering.com/m/3becacd7c6d635f6/Small-739028TOVN81055_Y.jpg?v=1" width="225" height="225px">
                <div class="product-name">
                    반소매 셔츠
                </div>
                <div class="product-price">
                    890,000
                </div>
            </a>
            
            <a href="#" class="product">
                <img src="https://balenciaga.dam.kering.com/m/3becacd7c6d635f6/Small-739028TOVN81055_Y.jpg?v=1" width="225" height="225px">
                <div class="product-name">
                    반소매 셔츠
                </div>
                <div class="product-price">
                    890,000
                </div>          
            </a>
            <div class="clearfix"></div>
        </div>
    </div>
	
</body>
</html>