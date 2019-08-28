<%@ page 
	language="java" 
	contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    isELIgnored="false"%>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Account Crud</title>
		<link href="css/formStyling.css" rel="stylesheet">
		<link href="https://fonts.googleapis.com/css?family=Lexend+Tera|Raleway&display=swap" rel="stylesheet">
		<script type="text/javascript" src="js/accountCrud.js"></script>
	</head>
	
	<body>
		<input type="hidden" id="status" value='${accModel.status}'/>
		<input type="hidden" id="error" value='${accModel.error}'/>
		<input type="hidden" id="accNo" value='${accModel.accNo}'/>
	
		<div id="header">
			<h1 id="fancyfont">The <span id="brand-key">Golden</span> Bank</h1>
		</div>
	        
	    <ul>
	  		<li><a href="employeeDash">Home</a></li>
			<li><a href="customerCrud">Customer Management</a></li>
			<li><a class="active" href="accountCrud">Account Management</a></li>
			<li><a href="loanCrud">Loan Management</a></li>
			<li><a href="transactionCrud">Transaction Management</a></li>
			<li style="float:right"><a href="login">Logout</a></li>
		</ul>
		
		<nav>
			<ul class="sub-nav">
				<li>
					<button class="subnav-button active" onclick="toggleFunction(event)" name="add">
						Add New Account
					</button>
				</li>
				<li>
					<button class="subnav-button" onclick="toggleFunction(event)" name="update">
						Update Existing Account
					</button>
				</li>
				<li>
					<button class="subnav-button" onclick="toggleFunction(event)" name="delete">
					Delete Existing Account
					</button>
				</li>
				<li>
					<button class="subnav-button" onclick="toggleFunction(event)" name="view">
					View Existing Account
					</button>
				</li>
			</ul>
		</nav>
	      
		<div class="content">
			<div id= "div1">
				<br />
				<center>Add new account:</center>
				<br/>
				<form action="addAccount" method="POST" name="accountForm" onsubmit="return validateAccountForm()" modelAttribute="AccountModel">
					Customer ID:
						<input type="number" name="cusID" required/> <br>
					Branch: 
						<input type="text" name="branch" required/> <br>
					Initial Amount: 
						<input type="number" name="amount" required/> <br>
					Account Type: 
						<input type="text" name="accType" required/> <br>
					Account Nominee: 
						<input type="text" name="accNominee" required/> <br> <br>
						<input type="submit" value="Add">
				</form>
			</div>

			<div id="div2">
				<br />
				<center>Update existing account:</center>
				<br/>
				<form action="UpdateAccount" method="GET" name="updateAccountForm" onsubmit="return validateUpdateAccountForm()" modelAttribute="AccountModel">
					<label> Account Number: </label> 
					<input type="number" name="accNo" required/><br>
					<input type="submit" value="Update"/> 
				</form>
			</div>
	     
			<div id="div3">
				<br />
				<center>Delete existing account:</center>
				<br/>
				<form action="deleteAccount" method="post" name="deleteAccountForm" onsubmit="return validateDeleteAccountForm()" modelAttribute="AccountModel">
						<label> Account Number: </label> 
						<input type="number" name="accNo" required/><br>
						<input type="submit" value="Delete"/>
				</form>
			</div>
	     
			<div id="div4">
				<br />
				<center>View existing account:</center>
				<br/>
				<form action="readAccount" method="GET" name="viewAccountForm" onsubmit="return validateViewAccountForm()" modelAttribute="AccountModel">
					<label> Account Number: </label> 
					<input type="number" id="accNo" name="accNo" required/><br>
					<input type="submit" value="View"/> 
				</form>
			</div>
		</div> 
	</body>
</html>