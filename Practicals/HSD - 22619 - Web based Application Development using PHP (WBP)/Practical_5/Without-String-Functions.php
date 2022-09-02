<html>
    <body>
        <?php
            echo "String : ".($STR = "Yash_Desai_3@outlook.com");
            $STR_LEN=0;
            $STR_WORD_COUNT=0;
            echo "<br><!--";
            while($STR[$STR_LEN]!='') {
                if(($STR[$STR_LEN] >= "A" && $STR[$STR_LEN] <= "Z")||($STR[$STR_LEN] >= "a" && $STR[$STR_LEN] <= "z")) {
                    $STR_WORD_COUNT++;
                }
                $STR_LEN++;
            }
            echo "-->String Length : ".$STR_LEN."<br>Word Count : ".$STR_WORD_COUNT;
        ?>
    </body>
</html>