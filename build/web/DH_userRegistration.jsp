<!DOCTYPE html>

<html>
    <head>
        <title>Registration testing</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="DHstyle.css" rel="stylesheet" type="text/css" />
    </head>
    <body  style="background:url(images/back_all.jpg) repeat-x;">
        <div id="register">
            <div style="padding: 20px; ">
                <form action="Registration" method="post" > 
                <table align="center">
                    <tr><td><input type="text" name="firstname" placeholder="First Name"></td></tr>
                    <tr><td><input type="text" name="lastname" placeholder="Last Name"></td></tr>                
                    <tr><td><input type="text" name="houseno" placeholder="House number"></td></tr>
                    <tr><td><input type="text" name="colony" placeholder="Colony"></td></tr>
                    <tr><td><input type="text" name="landmark" placeholder="LandMark"></td></tr>
                    <tr><td><input type="text" name="city" placeholder="City"></td></tr>
                    <tr><td><input type="text" name="state" placeholder="State"></td></tr>
                    <tr><td><input type="text" name="pin" placeholder="Pin Code"></td></tr>
                    <tr><td><input type="number" name="phone" placeholder="Mobile number"></td></tr>
                    <tr><td><input type="number" name="aadhar" placeholder="Aadhar number"></td></tr> 
                <!--    <tr><td><input type="file" name="profilephoto"></td></tr>     -->
                    <tr><td><input type="text" name="username" placeholder="Email(username)"></td></tr>                  
                    <tr><td><input type="password" name="password" placeholder="Password"></td></tr>
                    <tr><td><input type="password" name="confirmpassword" placeholder="Confirm Password"></td></tr>
                </table>
                <table align="center">    
                    <tr><td><input type="submit" value="REGISTER"></td></tr>
                </table>                
            </form>
            </div>
        </div>
    </body>
</html>
