<html>
   <body>
      <?php
         $name = "";
         $phone = "";
         $email = "";
         $name_error_msg = "";
         $phone_error_msg = "";
         $email_error_msg = "";

          if ($_SERVER["REQUEST_METHOD"] == "POST") {
            if (empty($_POST["name"])) {
               $name_error_msg = "Name field is empty";
            }
            else {              
               $name = test_input($_POST["name"]);
            }

            if (empty($_POST["phone"])) {
              $phone_error_msg = "Phone Number field is empty";
            }
            else if(!preg_match('/^[0-9]{10}$/', $_POST['phone'])){
              $phone_error_msg = 'Invalid Phone Number Format';
            }
            else {
              $phone = test_input($_POST["phone"]);
            }
            
            if (empty($_POST["email"])) {
               $email_error_msg = "Email Address field is empty";
            }
            else if (!filter_var($_POST["email"], FILTER_VALIDATE_EMAIL)) {
              $email_error_msg = "Invalid Email format"; 
            }
            else {
               $email = test_input($_POST["email"]);
            } 
          }
            
         function test_input($data) {
            $data = trim($data);
            $data = stripslashes($data);
            $data = htmlspecialchars($data);
            return $data;
         }
      ?>
     
      <form method = "post" action = "<?php echo htmlspecialchars($_SERVER["PHP_SELF"]);?>">
        <br>
        Name : <input type = "text" name = "name">
                      <span style="color:red">
                        <?php 
                          if(!empty($name_error_msg)){
                            echo " [!]---[ ".$name_error_msg." ]";
                          }
                        ?>
                      </span>
        <br>
        Phone Number: <input type = "text" name = "phone">
                      <span style="color:red">
                        <?php 
                          if(!empty($phone_error_msg)){
                            echo " [!]---[ ".$phone_error_msg." ]";
                          }
                        ?>
                      </span>
        <br>
        E-mail Address : <input type = "text" name = "email">
                      <span style="color:red">
                        <?php 
                          if(!empty($email_error_msg)){
                            echo " [!]---[ ".$email_error_msg." ]";
                          }
                        ?>
                      </span>
        <br>
        <input type = "submit" name = "submit" value = "SUBMIT">
      </form>
      
      <?php
         echo "<br><br><hr><b>Info Submitted : </b><br><br>";
         echo "<b>Name : </b>".$name."<br>";
         echo "<b>Phone Number : </b>".$phone."<br>";
         echo "<b>Email Address : </b>".$email."<br>";
      ?>
   </body>
</html>   