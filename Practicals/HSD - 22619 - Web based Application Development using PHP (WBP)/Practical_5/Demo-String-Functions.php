<html>
    <body>
        <?php
            echo "<b>String [\$STR] : </b>".($STR = "Yash_Desai_3 -\"This is the test String\"")
            ."<br><b>str_replace(\"_\",\" \",\$STR) : </b>"
            .(str_replace("_"," ",$STR))
            ."<br><b>str_word_count(\$STR) : </b>"
            .(str_word_count($STR))
            ."<br><b>strcmp(\"Yash Desai\",\$STR) : </b>"
            .(strcmp("Yash Desai",$STR))
            ."<br><b>strlen(\$STR) : </b>"
            .(strlen($STR))
            ."<br><b>strpos(\$STR,\"3\") : </b>"
            .(strpos($STR,"3"))
            ."<br><b>strrev(\$STR) : </b>"
            .(strrev($STR))
            ."<br><b>strtolower(\$STR) : </b>"
            .(strtolower($STR))
            ."<br><b>strtoupper(\$STR) : </b>"
            .(strtoupper($STR))
            ."<br><b>substr_replace(\$STR,\"RFX\",11) : </b>"
            .(substr_replace($STR,"RFX",11))
            ."<br><b>ucwords(\$STR) : </b>"
            .(ucwords($STR));
        ?>
    </body>
</html>














