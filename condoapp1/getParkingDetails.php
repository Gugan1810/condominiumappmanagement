<?php
	$hostname = "localhost";
	$username = "root";
	$password = "";
	$database = "condoapp";

	// Connect to the database
	$conn = mysqli_connect('localhost', 'username', 'password');
	mysqli_select_db($conn, $database);

	$sql="SELECT parkingNumber FROM `visitors` ";
	$result=mysqli_query($conn,$sql);
	$Visitors=array();

	while($row = mysqli_fetch_assoc($result)){
		
		$index['parkingNumber']=$row['parkingNumber'];
		

		array_push($Visitors, $index);
	}
	echo json_encode($Visitors);

	// Close the connection
	mysqli_close($conn);
?>