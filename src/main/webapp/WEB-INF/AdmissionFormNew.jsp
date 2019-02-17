<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>${headerMessage}</h1>

	<h3>STUDENT ADMISSION FORM FOR ENGINEERING COLLEGE</h3>

	<form:errors path="student1.*"/>
	<form action="/SpringMvnMvc/submitAdmissionFormNew.html" method="post">
		<p>
			Student name : <input type="text" name="studentName" />
		</p>

		<p>
			Student Hobby : <input type="text" name="studentHobby" />
		</p>

		<table>
			<tr>
				<td>Student Mobile :</td>
				<td><input type="text" name="studentMobile" /></td>
			</tr>
			<tr>
				<td>Student DOB :</td>
				<td><input type="text" name="studentDOB" /></td>
			</tr>

			<tr>
				<td>Student's skill test :</td>
				<td><select name="studentSkill" multiple="multiple">
						<option value="Java">Core Java</option>
						<option value="spring">Core spring</option>
						<option value="mvc">Spring MVC</option>
				</select></td>
			</tr>
		</table>
		
		<table>
			<tr>
				<td>Student Address :</td>
			</tr>
			<tr>
				<td>Country : <input type="text" name="studentAddress.country" /></td>
				<td>City : <input type="text" name="studentAddress.city" /></td>
				<td>Street : <input type="text" name="studentAddress.street" /></td>
				<td>Pin code : <input type="text" name="studentAddress.pincode" /></td>
			</tr>
		</table>

		<input type="submit" value="Submit" />

	</form>
</body>
</html>