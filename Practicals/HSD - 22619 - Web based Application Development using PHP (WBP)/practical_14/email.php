<?php
  require_once "Mail.php";
  $from = "froml@gmail.com";
  $to = 'to@gmail.com';

  $host = "ssl://smtp.gmail.com";
  $port = "465";
  $username = "";
  $password = "";
  
  $subject = "TESTING";
  $body = "HELLO! This is a Test Message....";

  $headers = array ('From' => $from, 'To' => $to,'Subject' => $subject);
  $smtp = Mail::factory('smtp',array ('host' => $host,'port' => $port,'auth' => true,'username' => $username,'password' => $password));

          $mail = $smtp->send($to, $headers, $body);
          if (PEAR::isError($mail)) {
            echo($mail->getMessage());
          } else {
            echo("Message successfully sent!\n");
          }
?>