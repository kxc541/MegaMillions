<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="com.kc.megamillions.domain.*,java.util.List"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
	    <meta name="viewport" content="width=device-width, initial-scale=1">
	    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
	    <meta name="description" content="">
	    <meta name="author" content="">

		<meta http-equiv="X-UA-Compatible" content="IE=11">
		<title>MegaMillions Number Generator</title>
		<link type="text/css" rel="stylesheet" href="css/geeknews.css" />
		
		<!-- Placed at the end of the document so the pages load faster -->
	    <script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
		<!-- Latest compiled and minified JavaScript -->
		<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
	
		<!-- Latest compiled and minified CSS -->
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
		
		<!-- Optional theme -->
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css">

		 <!-- Custom styles for this template -->
	    <link href="css/cover.css" rel="stylesheet">

		<!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
	    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
	    <script src="../../assets/js/ie-emulation-modes-warning.js"></script>
	
	    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
	    <!--[if lt IE 9]>
	      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
	      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
	    <![endif]-->
	    
	    <style>
	    
	    	.modal-body .form-horizontal .col-sm-2,
			.modal-body .form-horizontal .col-sm-10 {
			    width: 100%
			}
			
			.modal-body .form-horizontal .control-label {
			    text-align: left;
			}
			.modal-body .form-horizontal .col-sm-offset-2 {
			    margin-left: 15px;
			}

			#res { 
			float:left; 
            height: 120px;
            text-color: white;
			width:100%;
			background-color: orange;
			font-size: 300%;
			font-weight: bold;
			margin-top: 50px;
			margin-bottom: 50px;
			} 
			
			.res1 { 
			float:left; 
			margin: 0 auto; 
			height: 120px;
			width: 16.333%; 
			background-color: red;
 			padding-top: 30px;
			} 
			
			.res2 { 
			float:left; 
			margin: 0 auto; 
			height: 120px;
			width: 16.333%; 
			padding-top: 30px;
			} 
			
			.res3 { 
			float:left; 
			margin: 0 auto;
			height: 120px;
			width: 16.333%; 
			background-color: red;
			padding-top: 30px;
			} 
			
			.res4 { 
			float:left; 
			margin: 0 auto; 
			height: 120px;
			width: 16.333%; 
			padding-top: 30px;
			} 
			
			.res5 { 
			float:left; 
			margin: 0 auto; 
			height: 120px;
			width: 16.333%; 
			background-color: red;
			padding-top: 30px;
			} 
			
			.res6 { 
			float:left; 
			margin: 0 auto; 
			height: 120px;
			width: 16.333%; 
			padding-top: 30px;
			} 

			}
			
	    </style>
	</head>
	
<body>

<script language="javascript" type="text/javascript">
	//Test Comment for Git.
	$(function(){

		getResult();
		
		$("#getResult").on("click", function(){
	
	     	getResult();

		});
		
		$("#numOfOccurrences").on("click", function(){
	        var userInput = $("#numOccur").val();
	     	getNumberOccurrences(userInput);

		});
		
		$(function(){
		    $('#myFormSubmit').click(function(e){
		      e.preventDefault();
		      alert($('#myField').val());
		      /*
		      $.post('http://path/to/post', 
		         $('#myForm').serialize(), 
		         function(data, status, xhr){
		           // do something here with response;
		         });
		      */
		    });
		});
	
		
	});
	
	function getResult(){
		
	   $.ajax({ 
            url : 'getResult.htm',
            cache : false,
            success : function(data) {
            	
            	//alert(data);
            	
            	//var result = $.parseJSON(data);
            	$.each(data, function(k, v) {
            	
            	    if (k === "firstNum"){
            	    	
            	    	$("#firstspan").text(v);
            	   
            	    }else if (k === "secondNum"){
            	    	
            	    	$("#secondspan").text(v);
            	   
            	    }else if (k === "thirdNum"){
            	    	
            	    	$("#thirdspan").text(v);
            	   
            	    }else if (k === "fourthNum"){
            	    	
            	    	$("#fourthspan").text(v);
            	   
            	    }else if (k === "fifthNum"){
            	    	
            	    	$("#fifthspan").text(v);
            	   
            	    }else if (k === "megaBall"){
            	    	
            	    	$("#megaballspan").text(v);
            	   
            	    }
            	});
	
            }
        });
		
	}
	
	function getNumberOccurrences(userInput){
		   var usi = userInput;
		
		   $.ajax({
	            url : 'getNumberOccurrences/' + userInput + '.htm',
	            success : function(data) {
	            	
	         		
	            	   $('#numOccur').val(usi + " has appeared " + data + " times.");
	          
		
	            }
	        });
		
	}

</script>


 <div class="site-wrapper">

      <div class="site-wrapper-inner">

        <div class="cover-container">

          <div class="masthead clearfix">
            <div class="inner">
            <span class="masthead-brand"><img src="images/MegaMillionsGenLogo.png" /></span>
            	<h1 class="cover-heading">Mega Millions, Yo</h1>
            
              <nav>
                <ul class="nav masthead-nav">
                  <li class="active"><a href="home.htm">Home</a></li>
                  <li><a href="about.htm">About</a></li>
                  <li><a href="#">Contact</a></li>
                </ul>
              </nav>
            </div>
          </div>

          <div class="inner cover">

            <div id="res"> 
				<div class="res1"><span id="firstspan"></span></div> 
				<div class="res2"><span id="secondspan"></span></div> 
				<div class="res3"><span id="thirdspan"></span></div> 
				<div class="res4"><span id="fourthspan"></span></div>
				<div class="res5"><span id="fifthspan"></span></div>
				<div class="res6"><span id="megaballspan"></span></div>
			</div>

            <p class="lead">
              <button id="clickresult" class="btn btn-lg btn-default" onclick="getResult()">Click For New Numbers</button>
            </p>
           <br /><br />
            <div id="occurdiv">
	            <!-- Input for number of occurrences -->
	             <input type="text" id="numOccur" class="form-control" />
	             <!--  Button for number of occurrences -->
	             <button id="numOfOccurrences" class="btn btn-lg btn-default">Number of Occurrences</button>
            </div>
       
          </div>

 		<br /><br />
		<!-- Button trigger modal -->
		<button class="btn btn-primary btn-lg" data-toggle="modal" data-target="#mbResults">
		    Launch NY Mega Million Results
		</button>

		<!-- Modal -->
		<div class="modal fade" id="mbResults" tabindex="-1" role="dialog" 
		     aria-labelledby="myModalLabel" aria-hidden="true">
		    <div class="modal-dialog">
		        <div class="modal-content">
		            <!-- Modal Header -->
		            <div class="modal-header">
		                <button type="button" class="close" 
		                   data-dismiss="modal">
		                       <span aria-hidden="true">&times;</span>
		                       <span class="sr-only">Close</span>
		                </button>
		                <h4 class="modal-title" id="myModalLabel">
		                    NY Results Form
		                </h4>
		            </div>
		            
		            <!-- Modal Body -->
		            <div class="modal-body">
		                
		              <div><iframe width="500px" title="Lottery Mega Millions Winning Numbers: Beginning 2002" height="425px" src="https://data.ny.gov/w/5xaw-6ayf/caer-yrtv?cur=jvPTrqoEa2-&from=root" frameborder="0" scrolling="no"><a href="https://data.ny.gov/Government-Finance/Lottery-Mega-Millions-Winning-Numbers-Beginning-20/5xaw-6ayf" title="Lottery Mega Millions Winning Numbers: Beginning 2002" target="_blank">Lottery Mega Millions Winning Numbers: Beginning 2002</a></iframe></div>
		
		            </div> 
		            
		            <!-- Modal Footer -->
		            <div class="modal-footer">
		                <button type="button" class="btn btn-default"
		                        data-dismiss="modal">
		                            Close
		                </button>
		            </div>
		        </div>
		    </div>
		</div>

    	   <%@ include file="footer.jsp" %>        

        </div>

      </div>

    </div>

</body>
</html>