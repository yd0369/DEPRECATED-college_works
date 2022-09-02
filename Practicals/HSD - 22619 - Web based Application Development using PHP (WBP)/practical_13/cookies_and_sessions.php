<html>
    <body>
        <form method = "post" action = "cookies_and_sessions.php">
            <?php 
                echo "<br>Site's all Cookie(s) : <br>";
                print_r($_COOKIE);
                echo "<br><br><hr><br>";
                echo "<h4>Cookies Management</h4>";
                echo "<br><br>[ ! ] Searching for any existing cookie....<br>";

                if(empty($_COOKIE["yash_desai"])) {
                    echo "[ ! ] Can't find any existing cookie....<br>";
                    echo "[ * ] Trying to create a cookie....<br>";
                    setcookie("yash_desai", "Cookie is a Lie", time() +10,'/');
                    echo "[:) ] Successfully created a cookie [Timeout : 10 Seconds]....<br>";
                }   
                else {
                    echo "[:) ] Found a cookie with name \"yash_desai\"....<br>";
                    echo "[ * ] Retrieving cookie data.... <br><br>";
                    echo "<br><b>Displaying Cookie Information : </b><br>";
                    echo "<br>Cookie Name : yash_desai";
                    echo "<br>Cookie Value : ".$_COOKIE["yash_desai"]."<br><br>";
                }
            ?>
            <br><br><hr><br>
            <h4>Session Management</h4>
            <br>
            <?php 
                
                if(isset($_POST["SUBMIT"])) {
                    echo "<!--";
                    session_unset();
                    session_destroy();
                    echo "-->";
                    echo "[  ! ] Destroyed the session....<br>";
                }
                else {
                    echo "[ ! ] Searching for any previous session....<br>";
                    if(!isset($_SESSION['count'])) {
                        echo "[ ! ] Can't find any previous session....<br>";
                        echo "[ * ] Trying to create a new session....<br>";
                        if(session_start()) {
                            $_SESSION['count'] += 1;
                            echo "[:) ] Successfully created and started a new session....<br>";
                        }
                        
                    }
                    else {
                        echo "[:) ] Found previous session....<br>";
                        echo "[ * ] Retrieving session data.... <br><br>";
                        echo "<br><b>Displaying Session Information : </b><br>";
                        echo "<br>PHP Session ID cookie : ".$_COOKIE["PHPSESSID"]."<br><br>";
                    }
                }
            ?>
            <input type="submit" name="SUBMIT" value="DELETE CURRENT SESSION">
        </form>
    </body>
</html>