<?php 

    if(empty($_GET["query"])) {
        echo "No Input!<br>No Action!";
    }
    else {
        switch($_GET["query"]) {
            case "create" : {
                QUERY_EXECUTER("create table yash_desai (
                    `ID`    int(3) 	  NOT NULL  AUTO_INCREMENT,
                    `DATA`  varchar(30) NOT NULL,
                    PRIMARY KEY (`id`)
                   )");
                break;
            }
            case "insert" : {
                if(!empty($_GET["DATA"])) {
                    QUERY_EXECUTER("insert into yash_desai (DATA) VALUES (\"".$_GET["DATA"]."\")");
                }
                else {
                    echo "Invalid Query";    
                }
                break;
            }
            case "update" : {
                if(!(empty($_GET["ID"]) && empty($_GET["DATA"]))) {
                    QUERY_EXECUTER("update yash_desai
                    set DATA = \"".$_GET["DATA"].
                    "\" where ID = ".$_GET["ID"]);
                }
                else {
                    echo "Invalid Query";    
                }
                break;
            }
            case "delete" : {
                if(!empty($_GET["ID"])) {
                    QUERY_EXECUTER("delete from yash_desai
                    where ID = ".$_GET["ID"]);
                }
                else {
                    echo "Invalid Query";    
                }
                break;
            }
            default : {
                echo "Invalid Query";
                break;
            }
        }
    }
    function QUERY_EXECUTER($QUERY) {
        $DB_OBJ = new mysqli('localhost', 'root', '', 'Yash_Desai_DB');
        echo "[ ! ] Trying to connect to Database...<br>";
        if($DB_OBJ->connect_error){
            die("[ X ] Connection failed : " . $DB_OBJ->connect_error)."<br><br>";
        }
        else {
            echo "[ OK ] Successfully connected to Database<br><br><hr>";
            echo "Table Data :";
            TABLE_PRINTER($DB_OBJ);
            echo ("< ! > Query Generated  : ".$QUERY."<br>");
            if ($DB_OBJ->query($QUERY)){
                echo "< OK > Query Executed successfully<br><br><br><br>";
                echo "[After Query Execution] Table Data :";
                TABLE_PRINTER($DB_OBJ);
            }
            else{
                echo "< X > Query Execution Failed, please try again.<br>Reason : ".$DB_OBJ->error;
            } 
        }
    }
    function TABLE_PRINTER($DB_OBJ) {
        echo "<br><br>";
        $result = $DB_OBJ->query("select * from yash_desai");
        if ($result->num_rows > 0) {
            echo "ID ------ DATA<br>";
            while($row = $result->fetch_assoc()) {
                echo $row["ID"]." ------ ".$row["DATA"]. "<br>";
            }
        } 
        else {
            echo "The Table is Empty";
        }
        echo "<br><br>";
    }
?>