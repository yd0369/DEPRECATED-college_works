<html>
    <body>
        <?php
            print "<h1>INTROSPECTION</h1>";
            class COLOR {
                var $Red;
                var $Green;
                var $Blue;
            }
            class YASH extends COLOR {
                public function YASH($R,$G,$B) {
                    $this->setColor($R,$G,$B);
                }
                public function setColor($R,$G,$B) {
                    $this->Red = $R;
                    $this->Green = $G;
                    $this->Blue = $B;
                }
                public function getColor() {
                    print("R : $this->Red<br>G : $this->Green<br>B : $this->Blue");
                }
            }
            $classes = ["COLOR","YASH"]; 
            foreach($classes as $class) { 
                echo "<h3>Showing information about $class</h3>"; 
                echo "<h5>$class Methods : </h5>"; 
                $methods = get_class_methods($class); 
                if(!count($methods)) { 
                    echo "None"; 
                } 
                else { 
                    foreach($methods as $method) { 
                        echo "$method()<br>"; 
                    } 
                } 
                echo "<h5>$class Variables : </h5>"; 
                $Variables = get_class_vars($class); 
                if(!count($Variables)) { 
                    echo "None"; 
                } 
                else { 
                    foreach(array_keys($Variables) as $VAR) { 
                        echo "\$$VAR<br>"; 
                    } 
                } 
            } 
        
            echo "<br><br><br><hr><h1>SERIALIZATION</h1>";

            $ARRAY = ["Yash", "Desai"];
            echo "Normal Array : <br>";
            print_r($ARRAY);
            echo "<br><br>";
            echo "Serialized Array : <br>";
            $SERIALIZE_ARRAY = serialize($ARRAY);
            print_r($SERIALIZE_ARRAY);
            echo "<br><br>";
            echo "Unserialized Array : <br>";
            $UNSERIALIZE_ARRAY = unserialize($SERIALIZE_ARRAY);
            print_r($UNSERIALIZE_ARRAY);
        ?>    
    </body>
</html>
