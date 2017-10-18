<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery-1.11.0.min.js"></script>
<link href="/CarRentalBilling/css/bootstrap.css" rel="stylesheet"
	type="text/css" media="all">
<link href="/CarRentalBilling/css/style.css" rel="stylesheet"
	type="text/css" media="all" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Invoice</title>
</head>
<body>
	<div class="web-forms">
		<div class="col-md-12 first-one">
			<div class="first-one-inner lost">
				<div class="here">
					<div class="here-bottom">
						<img src="images/hyundai-verna.jpg" alt="" height="100" width="250">
						<h4>Car Rental Invoice</h4>
						<h6></h6>
					</div>
				</div>
			</div>
			<div class="deals">
				<div class="sap_tabs">
					<div id="horizontalTab"
						style="display: block; width: 100%; margin: 0px;">
						<ul class="resp-tabs-list">
							<li class="resp-tab-item" aria-controls="tab_item-0" role="tab">Create Invoice</li>
							<li class="resp-tab-item" aria-controls="tab_item-1" role="tab">All invoices</li>
							<li class="resp-tab-item " aria-controls="tab_item-2" role="tab">Master Data</li>
						</ul>
						<div class="resp-tabs-container">
							<h2 class="resp-accordion" role="tab" aria-controls="tab_item-0">
								<span class="resp-arrow"></span>TAB
								DATAPOPULARConnexionConnexion
							</h2>
							<h2 class="resp-accordion" role="tab" aria-controls="tab_item-1">
								<span class="resp-arrow"></span>RECENTS'inscrireS'inscrire
							</h2>
							<h2 class="resp-accordion" role="tab" aria-controls="tab_item-2">
								<span class="resp-arrow"></span>nava
							</h2>
							<div class="tab-1 resp-tab-content" aria-labelledby="tab_item-0">
								<!--first-one-->
								<div class="col-md-12 first-one">
									<div class="first-one-inner">
										<h3 class="tittle">Invoice</h3>
										<form>
											<select>
												<option title="Combo 1">TCS</option>
												<option title="Combo 2">WIPRO</option>
												<option title="Combo 3">EXPENZING</option>
											</select> <br /> <select>
												<option title="Combo 1">Volvo</option>
												<option title="Combo 2">Saab</option>
												<option title="Combo 3">Opel</option>
												<option title="Combo 3">Audi</option>
											</select>

											<div class="submit">
												<input onclick=	"myFunction()" value="submit" type="submit">
											</div>
											<div class="clearfix"></div>
										</form>
									</div>
									<%--<a href="#" class="hvr-bounce-to-bottom">Sign in with
										Twitter</a> --%>
								</div>
							</div>
							<div class="tab-1 resp-tab-content" aria-labelledby="tab_item-1">
								<p>Not Available for now</p>
							</div>
							<div class="tab-2 resp-tab-content" aria-labelledby="tab_item-2">
								<div class="pricing-grids">
									<div class="col-md-3 pricing-grid">
										<div class="price-value">
											<h3>Car</h3>
										</div>
										<div class="price-bg">							
											<p class="bottom"><a href="#">Create</a></p>
											<p class="bottom"><a href="#">View</a></p>
										</div>
									</div>
									<div class="col-md-3 pricing-grid">
										<div class="price-value">
											<h3>Car Category</h3>
										</div>
										<div class="price-bg">							
											<p class="bottom"><a href="#">Create</a></p>
											<p class="bottom"><a href="#">View</a></p>
										</div>
									</div>
									<div class="col-md-3 pricing-grid">
										<div class="price-value">
											<h3>Client</h3>
										</div>
										<div class="price-bg">							
											<p class="bottom"><a href="#">Create</a></p>
											<p class="bottom"><a href="#">View</a></p>
										</div>

									</div>
									<div class="col-md-3 pricing-grid">
										<div class="price-value">
											<h3>Others</h3>
										</div>
										<div class="price-bg">							
											<p class="bottom"><a href="#">Create</a></p>
											<p class="bottom"><a href="#">View</a></p>
										</div>
									</div>

									<div class="clearfix"></div>
								</div>
								</div>
						</div>
					</div>
					<script src="js/easyResponsiveTabs.js" type="text/javascript"></script>
					<script type="text/javascript">
						$(document).ready(function() {
							$('#horizontalTab').easyResponsiveTabs({
								type : 'default', //Types: default, vertical, accordion           
								width : 'auto', //auto or any width like 600px
								fit : true
							// 100% fit in a container
							});
						});
					</script>
				</div>
			</div>
		</div>



	</div>
</body>
</html>