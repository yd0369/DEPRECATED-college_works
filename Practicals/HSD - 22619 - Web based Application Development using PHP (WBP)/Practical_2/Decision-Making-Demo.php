<html>
    <body>
        <?php
            PRINT_STATEMENT("YASH_DESAI",6);
            function PRINT_STATEMENT($TEXT,$SIZE) {
                echo "<".(SIZE_TAG($SIZE)).">";
                if($TEXT <> NULL)
                    echo "$TEXT";
                else echo "!!! Please_Enter_Text !!!";
                echo "</".(SIZE_TAG($SIZE)).">";
            }
            function SIZE_TAG($S) {
                switch($S) {
                    case 1: return "h6"; break;
                    case 2: return "h5"; break;
                    case 3: return "h4"; break;
                    case 4: return "h3"; break;
                    case 5: return "h2"; break;
                    case 6: return "h1"; break;
                    default: return ">!!! Please_Enter_Valid_Text_Size !!!<";
                }
            }
        ?>
    </body>
</html>