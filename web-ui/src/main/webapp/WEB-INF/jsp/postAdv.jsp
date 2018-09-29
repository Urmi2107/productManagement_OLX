<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Post Advertisement</title>
<style>
body {font-family: Arial, Helvetica, sans-serif;}
* {box-sizing: border-box;}

input[type=text], select, textarea,input[type=file] {
    width: 100%;
    padding: 12px;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
    margin-top: 6px;
    margin-bottom: 16px;
    resize: vertical;
    width: 400px;
}

input[type=submit] {
    background-color: #4CAF50;
    color: white;
    padding: 12px 20px;
    border: none;
    border-radius: 4px;
    cursor: pointer;
}
input[type=reset] {
    background-color: red;
    color: white;
    padding: 12px 20px;
    border: none;
    border-radius: 4px;
    cursor: pointer;
}
input[type=submit]:hover {
    background-color: #45a049;
}
input[type=reset]:hover {
    background-color:red;
}
.container_ad {
    border-radius: 5px;
    background-image: url("/buy-sell1.jpg");
     background-size: cover;
    padding: 20px;
 }

form
{
	width:500px;
	 padding: 5px;
	background-color: rgba(255,255,255,0.4);
}

</style>
</head>
<body>
<h3 align="center">Submit a Classified Ad</h3>
<center>
<div class="container_ad">
  <form action="">
    <label for="title">Title<span style="color:red">*</span></label><br/>
    <input type="text" id="title" name="title" placeholder="Enter title..." pattern="[a-zA-Z]{10,}" required>
<br/><br/>
    <label for="category">Category<span style="color:red">*</span></label><br/>
    <select required>
    <option value="select">--Select--</option>
  <option value="properties">Properties</option>
  <option value="used cars">Used Cars</option>
  <option value="furniture">Furniture</option>
  <option value="jobs">Jobs</option>
  <option value="electronics and appliances">Electronics and Appliances</option>
  <option value="mobiles">Mobiles</option>
  <option value="bikes">Bikes</option>
  <option value="fashion">Fashion</option>
  <option value="books,sports & hobbies">Books, Sports & Hobbies</option>
  <option value="services">Services</option>
</select>
  <br/><br/>
<label for="description">Description<span style="color:red">*</span></label><br/>
    <textarea id="description" name="description" placeholder="Enter description.." required rows="4" cols="40"></textarea>
<br/><br/>
    <label for="photo">Image<span style="color:red">*</span></label><br/>
   <input type="file" name="photo" id="photo" accept="image/*" required>
<br/><br/>
     <label for="name">Name<span style="color:red">*</span></label><br/>
     <input type="text" id="name" name="name" placeholder="Enter name..." pattern="[a-zA-Z\s]+" required>
    <br/><br/>
     <label for="phno">Phone No.<span style="color:red">*</span></label><br/>
     <input type="text" id="phno" name="phno" placeholder="Enter phone no..." pattern="[7-9]{1}[0-9]{9}" required>
    <br/><br/>
     <label for="city">City<span style="color:red">*</span></label><br/>
     <input type="text" id="city" name="city" placeholder="Enter city..." pattern="[a-zA-Z\s]+" required>
   <br/><br/>
   <input type="reset" class="resetbtn" value="Reset"/>
    <input type="submit" value="Submit">
  </form>
</div>
</center>
</body>
</html>