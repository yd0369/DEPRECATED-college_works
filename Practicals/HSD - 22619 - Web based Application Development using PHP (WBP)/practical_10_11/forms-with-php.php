<html>
    <body>
        <form action="forms-with-php.php" enctype="multipart/form-data" method="post">
            Text-Box : <input type="textbox" name="TEXTBOX"><br>
            Radio Button : <input type="radio" name="RADIOBUTTON" value="A">A   <input type="radio" name="RADIOBUTTON" value="B">B<br>
            Check-Box : <input type="checkbox" name="CHECKBOX" value="A"><br>
            List-Box :  <select name="LISTBOX"> <option value="A">A</option> <option value="B">B</option> <option value="C">C</option> </select> <br>
            Combo-Box :  <select name="COMBOBOX" id="CB" multiple> <option id="CB" name="COMBOBOX1" value="A">A</option> <option id="CB" name="COMBOBOX2" value="B">B</option> <option id="CB" name="COMBOBOX3" value="C">C</option> </select> <br>
            Hidden Field : <input type="hidden" name="HIDDENFIELD" value="Yash_Desai"><br>
            Button : <a href="forms-with-php.php"><button type="reset" name="BUTTON" value="RESET">Reset Form</button></a><br><br><br><br>
            <input type="submit" name="SUBMIT" value="SUBMIT">
        </form>
        <?php
            if(isset($_POST["SUBMIT"])){
                echo "<hr>";
                echo "Text-Box : ".$_POST["TEXTBOX"]."<br>";
                echo "Radio Button : ".$_POST["RADIOBUTTON"]."<br>";
                echo "Check-Box : ";
                if(isset($_POST["CHECKBOX"])){
                    echo "Checked";
                }
                else {
                    echo "Unchecked";
                }
                echo "<br>";
                echo "List-Box :  ".$_POST["LISTBOX"]."<br>";
                echo "Combo-Box : ".$_POST["COMBOBOX"]."<br>";
                echo "Hidden Field : ".$_POST["HIDDENFIELD"]."<br>";
            }
        ?>
    </body>
</html>