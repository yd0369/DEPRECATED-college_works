<html>
    <body>
        <?php
        	$ARR = array("Y","A","S","H"," ","D","E","S","A","I");
            echo "For Loop : [";
            for($i=0;$i<10;$i++) 
            	echo ($ARR[$i]).",";
            echo "]<br>For Each Loop : [";            
            foreach($ARR as $j)
            	echo ($j).",";
            echo "]<br>While Loop : [";
            $i=0;
            while($i<10) {
            	echo ($ARR[$i]).",";
            	$i++;
            }
            echo "]<br>Do-While Loop : [";
            $i=0;
            do {
            	echo ($ARR[$i]).",";
            	$i++;
            }
            while($i<10);
			echo "]";
        ?>
    </body>
</html>