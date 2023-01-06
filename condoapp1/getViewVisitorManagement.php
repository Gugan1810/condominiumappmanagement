<?php
	$hostname = "localhost";
	$username = "root";
	$password = "";
	$database = "condoapp";

	// Connect to the database
	$conn = mysqli_connect('localhost', 'username', 'password');
	mysqli_select_db($conn, $database);

	$sql="SELECT * FROM `visitors` ";
	$result=mysqli_query($conn,$sql);
	$Visitors=array();

	while($row = mysqli_fetch_assoc($result)){
		$index['visitorName']=$row['visitorName'];
		$index['phoneNumber']=$row['phoneNumber'];
		$index['checkInDate']=$row['checkInDate'];
		$index['checkOutDate']=$row['checkOutDate'];
		$index['parkingNumber']=$row['parkingNumber'];
		$index['approveParking'] = $row['approveParking'];

		array_push($Visitors, $index);
	}
	echo json_encode($Visitors);

	// Close the connection
	mysqli_close($conn);
?>