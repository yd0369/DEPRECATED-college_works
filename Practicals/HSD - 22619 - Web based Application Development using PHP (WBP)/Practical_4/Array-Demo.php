<html>
    <body>
        <?php
            $Indexed_Array = ["Y","A","S","H"];
            $Associative_Array = ['a' => "Y", 'b' => "A",'c' => "S",'d' => "H"];
            $Multidimensional_Array = [[1,2,3],[4,5,6],[7,8,9]];
            $IA = &$Indexed_Array;
            $AA = &$Associative_Array;
            $MA = &$Multidimensional_Array;
            ARRAY_DATA_RETRIEVE($IA,$AA,$MA);
            echo "<hr>After adding some element(s) to arrays...<hr>";
            $Indexed_Array[] = 3;
            $Associative_Array += ['e' => 3];
            $Multidimensional_Array[] = ["A","B","C","#"];
            $Multidimensional_Array[0][] = "X";
            $Multidimensional_Array[1][] = "Y";
            $Multidimensional_Array[2][] = "Z";
            ARRAY_DATA_RETRIEVE($IA,$AA,$MA);
            function ARRAY_DATA_RETRIEVE($IA,$AA,$MA) {
                echo "Indexed Array : [ ";
                foreach($IA as $i) {
                    echo $i." ";
                }
                echo "]<br>Associative Array : [ ";
                foreach($AA as $i) {
                    echo $i." ";
                }
                echo "]<br>Multidimensional Array : <br>[ <br>";
                foreach($MA as $arr) {
                    echo "[ ";
                    foreach($arr as $i) {
                        echo $i." ";
                    }
                    echo "]<br>";
                }
                echo "]";
            }
        ?>
    </body>
</html>