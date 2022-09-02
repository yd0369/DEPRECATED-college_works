<html>
    <body>
        <?php
            $ARRAY = [[1,2,3],[4,5,6],[7,8,9]];
            Tablizer($ARRAY,10,"BLACK",30,"GREEN","Algerian");
            function Tablizer($DATA_ARRAY,$TAB_BORDER,$TAB_BGCOLOR,$TXT_SIZE,$TXT_COLOR,$TXT_FONT) {
                echo "<table border=".$TAB_BORDER." bgcolor=".$TAB_BGCOLOR.">";
                foreach($DATA_ARRAY as $TMP_ARRAY) {
                    echo "<tr>";
                    foreach($TMP_ARRAY as $DATA)
                        echo "<td>".TEXT_STYLER($DATA,$TXT_SIZE,$TXT_COLOR,$TXT_FONT)."</td>";
                    echo "</tr>";
                }
                echo "</table>";
                DONE_MSG();
            }
            function TEXT_STYLER($TEXT,$SIZE,$COLOR,$FONT) {
                return "<font size=".$SIZE." color=".$COLOR." face=".$FONT.">".$TEXT."</font>";
            }
            function DONE_MSG() {
                echo "<br><h6>Table Rendered Successfully . . .</h6>";
            }
        ?>
    </body>
</html>