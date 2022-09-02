<html>
<body>
    <?php
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
        $OBJECT = new YASH(255,255,255);
        $OBJECT->getColor();
    ?>
</body>
</html>