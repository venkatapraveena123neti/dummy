function personalDetailsFrmValidation(){

	var mob = /^[7-9]{1}[0-9]{9}$/;
	var email=/[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$/;
	if (document.personalDetailsFrm.txtFirstName.value == ""){
			alert("Please fill the First Name");
			return false;
	}
	else if (document.personalDetailsFrm.txtLastName.value == ""){
			alert("Please fill the Last Name");
			return false;
	}
	else if (document.personalDetailsFrm.txtEmail.value == ""){
			alert("Please fill the Email");
			return false;
	}
	else if (email.test(document.personalDetailsFrm.txtEmail.value) == false){
			alert("Please enter valid Email Id.");
			return false;
	}
	else if (document.personalDetailsFrm.txtPhone.value == "") {
			alert("Please fill the Contact No.");
			return false;
	}
	else if (mob.test(document.personalDetailsFrm.txtPhone.value) == false) {
			alert("Please enter valid Contact no.");
			return false;
	}
	
	else if (document.personalDetailsFrm.txtAddress1.value == ""){
			alert("Please fill the address line 1");
			return false;
	}
	else if (document.personalDetailsFrm.txtAddress2.value == ""){
			alert("Please fill the address line 2");
			return false;
	}
	else if (document.personalDetailsFrm.city.value=="Select City"){
			alert("Please select city");
			return false;
	}
	else if (document.personalDetailsFrm.state.value=="Select State"){
			alert("Please select state");
			return false;	
	}
	else{
			alert("Personal details are validated and accepted successfully.");
			window.location = 'EducationalDetails.html';
	}
}






function educationalDetailsFrmValidation(){
	if(document.educationalDetailsFrm.graduation.value == "Select graduation"){
		alert("Please Select Graduation");
		return false;	
	}
	else if(document.educationalDetailsFrm.percentage.value == ""){
		alert("Please fill Percentage detail");
		return false;
	}
	else if (document.educationalDetailsFrm.passingYear.value == ""){
		alert("Please fill Passing Year");
		return false;
	}
	else if (document.educationalDetailsFrm.projectName.value == ""){
		alert("Please fill Project Name");
		return false;
	}
	else if (document.educationalDetailsFrm.technologies[0].checked == false&&document.educationalDetailsFrm.technologies[1].checked == false&&document.educationalDetailsFrm.technologies[2].checked == false&&document.educationalDetailsFrm.technologies[3].checked == false){
		alert("Please Select Technologies Used");
		return false;
	}
	else if(document.educationalDetailsFrm.technologies[3].checked==true){
		if(document.educationalDetailsFrm.otherTechnologies.value==""){
			alert("Please fill other Technologies Used");
		}
	}
	else {
		alert("Your Registration Has succesfully done Plz check you registerd email for account activation link !!!");
	}
}