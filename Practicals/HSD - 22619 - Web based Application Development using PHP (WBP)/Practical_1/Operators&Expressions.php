<html>
    <body>
        <?php
            $A = 3;
            $B = 5;
            $C = NULL;
            $TEMP_A = $A;

            $BOOL_A = true;
            $BOOL_B = false;

            $STR_A = "Yash";
            $STR_B = "_Desai";

            $ARRAY_A = array("Y","A","S","H");
            $ARRAY_B = array("_","D","E","S","A","I");

            function ARRAY_PRINTER($TEMP_ARRAY) {
                echo "[";
                foreach($TEMP_ARRAY as $ARRAY_ELEMENT)
                    echo $ARRAY_ELEMENT.",";
                echo "]";
            }

            echo ("
                    <table border=1>
                        <tr>
                            <th>Variable</th>
                            <th>Value</th>
                        </tr>
                        <tr>
                            <td>\$A</td>
                            <td>$A</td>
                        </tr>
                        <tr>
                            <td>\$B</td>
                            <td>$B</td>
                        </tr>
                        <tr>
                            <td>\$C</td>
                            <td>$C</td>
                        </tr>
                        <tr>
                            <td>\$STR_A</td>
                            <td>$STR_A</td>
                        </tr>
                        <tr>
                            <td>\$STR_B</td>
                            <td>$STR_B</td>
                        </tr>
                        <tr>
                            <td>\$ARRAY_A</td>
                            <td>");
            ARRAY_PRINTER($ARRAY_A);
            echo(          "</td>
                        </tr>
                        <tr>
                            <td>\$ARRAY_B</td>
                            <td>");
            ARRAY_PRINTER($ARRAY_B);
            echo(          "</td>
                        </tr>
                    </table>
 
                    <br>
                    <br>
                    <br>
 
                    <table border=1>
                        <tr>
                            <th colspan=4>Arithmetic Operators</th>
                        </tr>
                        <tr>
                            <th>Operator Name</th>
                            <th>Symbol</th>
                            <th>Expression</th>
                            <th>Evaluation</th>
                        </tr>
                        <tr>
                            <td>Identity</td>
                            <td>+{operand}</td>
                            <td>+\$A</td>
                            <td>".(+$A)."</td>
                        </tr>
                        <tr>
                            <td>Negation</td>
                            <td>-{operand}</td>
                            <td>-\$A</td>
                            <td>".(-$A)."</td>
                        </tr>
                        <tr>
                            <td>Addition</td>
                            <td>{operand_1}+{operand_2}</td>
                            <td>\$A+\$B</td>
                            <td>".($A+$B)."</td>
                        </tr>
                        <tr>
                            <td>Subtraction</td>
                            <td>{operand_1}-{operand_2}</td>
                            <td>\$A-\$B</td>
                            <td>".($A-$B)."</td>
                        </tr>
                        <tr>
                            <td>Multiplication</td>
                            <td>{operand_1}*{operand_2}</td>
                            <td>\$A*\$B</td>
                            <td>".($A*$B)."</td>
                        </tr>
                        <tr>
                            <td>Division</td>
                            <td>{operand_1}/{operand_2}</td>
                            <td>\$A/\$B</td>
                            <td>".($A/$B)."</td>
                        </tr>
                        <tr>
                            <td>Modulus</td>
                            <td>{operand_1}%{operand_2}</td>
                            <td>\$A%\$B</td>
                            <td>".($A%$B)."</td>
                        </tr>
                        <tr>
                            <td>Exponentiation</td>
                            <td>{operand_1}**{operand_2}</td>
                            <td>\$A**\$B</td>
                            <td>".($A**$B)."</td>
                        </tr>
                    </table>

                    <br>
                    <br>
                    <br>
 
                    <table border=1>
                    <tr>
                        <th colspan=4>Assignment Operators</th>
                    </tr>
                    <tr>
                        <th>Operator Name</th>
                        <th>Symbol</th>
                        <th>Expression</th>
                        <th>Evaluation [Value of \$C]</th>
                    </tr>
                    
                    <tr>
                        <td>Simple Assignment</td>
                        <td>{operand_1}={operand_2}</td>
                        <td>\$C=\$A</td>
                        <td>".($C=$A)."</td>
                    </tr>
                    <tr>
                        <td>Combined Addition Assignment</td>
                        <td>{operand_1}+={operand_2}</td>
                        <td>\$C+=\$A</td>
                        <td>".($C=NULL).($C+=$A)."</td>
                    </tr>
                    <tr>
                        <td>Combined Subtraction Assignment</td>
                        <td>{operand_1}-={operand_2}</td>
                        <td>\$C-=\$A</td>
                        <td>".($C=NULL).($C-=$A)."</td>
                    </tr>
                    <tr>
                        <td>Combined Multiplication Assignment</td>
                        <td>{operand_1}*={operand_2}</td>
                        <td>\$C*=\$A</td>
                        <td>".($C=NULL).($C*=$A)."</td>
                    </tr>
                    <tr>
                        <td>Combined Division Assignment</td>
                        <td>{operand_1}/={operand_2}</td>
                        <td>\$C/=\$A</td>
                        <td>".($C=NULL).($C/=$A)."</td>
                    </tr>
                    <tr>
                        <td>Combined Modulus Assignment</td>
                        <td>{operand_1}%={operand_2}</td>
                        <td>\$C%=\$A</td>
                        <td>".($C=NULL).($C%=$A)."</td>
                    </tr>
                    <tr>
                        <td>Combined String Concatenate Assignment</td>
                        <td>{string_operand_1}.={string_operand_2}</td>
                        <td>\$STR_A.=\$STR_B</td>
                        <td>".($STR_A.=$STR_B)."</td>
                    </tr>
                    <tr>
                        <td>Combined Bitwise AND Assignment</td>
                        <td>{operand_1}&={operand_2}</td>
                        <td>\$C&=\$A</td>
                        <td>".($C=NULL).($C&=$A)."</td>
                    </tr>
                    <tr>
                        <td>Combined Bitwise OR (Inclusive OR) Assignment</td>
                        <td>{operand_1}|={operand_2}</td>
                        <td>\$C|=\$A</td>
                        <td>".($C=NULL).($C|=$A)."</td>
                    </tr>
                    <tr>
                        <td>Combined Bitwise XOR (Exclusive OR) Assignment</td>
                        <td>{operand_1}^={operand_2}</td>
                        <td>\$C^=\$A</td>
                        <td>".($C=NULL).($C^=$A)."</td>
                    </tr>
                    <tr>
                        <td>Combined Bitwise Left Shift Assignment</td>
                        <td>{operand_1}<<={operand_2}</td>
                        <td>\$C<<=\$A</td>
                        <td>".($C=NULL).($C<<=$A)."</td>
                    </tr>
                    <tr>
                        <td>Combined Bitwise Right Shift Assignment</td>
                        <td>{operand_1}>>={operand_2}</td>
                        <td>\$C>>=\$A</td>
                        <td>".($C=NULL).($C>>=$A)."</td>
                    </tr>
                </table>
 
                <br>
                <br>
                <br>

                <table border=1>
                        <tr>
                            <th colspan=4>Bitwise Operators</th>
                        </tr>
                        <tr>
                            <th>Operator Name</th>
                            <th>Symbol</th>
                            <th>Expression</th>
                            <th>Evaluation</th>
                        </tr>
                        <tr>
                            <td>Bitwise AND</td>
                            <td>{operand_1}&{operand_2}</td>
                            <td>\$A&\$B</td>
                            <td>".($A&$B)."</td>
                        </tr>
                        <tr>
                            <td>Bitwise OR (Inclusive OR)</td>
                            <td>{operand_1}|{operand_2}</td>
                            <td>\$A|\$B</td>
                            <td>".($A|$B)."</td>
                        </tr>
                        <tr>
                            <td>Bitwise XOR (Exclusive OR)</td>
                            <td>{operand_1}^{operand_2}</td>
                            <td>\$A^\$B</td>
                            <td>".($A^$B)."</td>
                        </tr>
                        <tr>
                            <td>Bitwise NOT</td>
                            <td>~{operand}</td>
                            <td>~\$A</td>
                            <td>".(~$A)."</td>
                        </tr>
                        <tr>
                            <td>Bitwise Left Shift</td>
                            <td>{operand_1}<<{operand_2}</td>
                            <td>\$A<<\$B</td>
                            <td>".($A<<$B)."</td>
                        </tr>
                        <tr>
                            <td>Bitwise Right Shift</td>
                            <td>{operand_1}>>{operand_2}</td>
                            <td>\$A>>\$B</td>
                            <td>".($A>>$B)."</td>
                        </tr>
                    </table>
 
                    <br>
                    <br>
                    <br>
                    
                    <table border=1>
                        <tr>
                            <th colspan=4>Relational Operators</th>
                        </tr>
                        <tr>
                            <th>Operator Name</th>
                            <th>Symbol</th>
                            <th>Expression</th>
                            <th>Evaluation</th>
                        </tr>
                        <tr>
                            <td>Equal</td>
                            <td>{operand_1}=={operand_2}</td>
                            <td>\$A==\$B</td>
                            <td>".(($A==$B)?"true":"false")."</td>
                        </tr>
                        <tr>
                            <td>Not Equal</td>
                            <td>{operand_1}!={operand_2}</td>
                            <td>\$A!=\$B</td>
                            <td>".(($A!=$B)?"true":"false")."</td>
                        </tr>
                        <tr>
                            <td>Not Equal</td>
                            <td>{operand_1}<>{operand_2}</td>
                            <td>\$A<>\$B</td>
                            <td>".(($A<>$B)?"true":"false")."</td>
                        </tr>
                        <tr>
                            <td>Identical</td>
                            <td>{operand_1}==={operand_2}</td>
                            <td>\$A===\$B</td>
                            <td>".(($A===$B)?"true":"false")."</td>
                        </tr>
                        <tr>
                            <td>Not Identical</td>
                            <td>{operand_1}!=={operand_2}</td>
                            <td>\$A!==\$B</td>
                            <td>".(($A!==$B)?"true":"false")."</td>
                        </tr>
                        <tr>
                            <td>Less than</td>
                            <td>{operand_1}<{operand_2}</td>
                            <td>\$A<\$B</td>
                            <td>".(($A<$B)?"true":"false")."</td>
                        </tr>
                        <tr>
                            <td>Greater than</td>
                            <td>{operand_1}>{operand_2}</td>
                            <td>\$A>\$B</td>
                            <td>".(($A>$B)?"true":"false")."</td>
                        </tr>
                        <tr>
                            <td>Less than or equal to</td>
                            <td>{operand_1}<={operand_2}</td>
                            <td>\$A<\$B</td>
                            <td>".(($A<$B)?"true":"false")."</td>
                        </tr>
                        <tr>
                            <td>Greater than or equal to</td>
                            <td>{operand_1}>={operand_2}</td>
                            <td>\$A>\$B</td>
                            <td>".(($A>$B)?"true":"false")."</td>
                        </tr>
                        <tr>
                            <td>Spaceship</td>
                            <td>{operand_1}<=>{operand_2}</td>
                            <td>\$A<=>\$B</td>
                            <td>".($A<=>$B)."</td>
                        </tr>
                    </table>
 
                    <br>
                    <br>
                    <br>
 
                    <table border=1>
                        <tr>
                            <th colspan=4>Incrementing/Decrementing Operators</th>
                        </tr>
                        <tr>
                            <th>Operator Name</th>
                            <th>Symbol</th>
                            <th>Expression</th>
                            <th>Evaluation</th>
                        </tr>
                        <tr>
                            <td>Pre-Increment</td>
                            <td>++{operand}</td>
                            <td>++\$A</td>
                            <td>".(++$A)."</td>
                        </tr>");
            $A = $TEMP_A;
            echo("
                        <tr>
                            <td>Pre-Decrement</td>
                            <td>--{operand}</td>
                            <td>--\$A</td>
                            <td>".(--$A)."</td>
                        </tr>");
            $A = $TEMP_A;
            echo("
                        <tr>
                            <td>Post-Increment</td>
                            <td>{operand}++</td>
                            <td>\$A++</td>
                            <td>".($A++)."</td>
                        </tr>");
            $A = $TEMP_A;
            echo("
                        <tr>
                            <td>Post-Decrement</td>
                            <td>{operand--}</td>
                            <td>\$A--</td>
                            <td>".($A--)."</td>
                        </tr>");
            $A = $TEMP_A;
            echo("
                    </table>

                    <br>
                    <br>
                    <br>
 
                    <table border=1>
                        <tr>
                            <th colspan=4>Logical Operators</th>
                        </tr>
                        <tr>
                            <th>Operator Name</th>
                            <th>Symbol</th>
                            <th>Expression</th>
                            <th>Evaluation</th>
                        </tr>
                        <tr>
                            <td>AND</td>
                            <td>{condition_1} and {condition_2}</td>
                            <td>\$BOOL_A and \$BOOL_B</td>
                            <td>".(($BOOL_A and $BOOL_B)?"true":"false")."</td>
                        </tr>
                        <tr>
                            <td>AND</td>
                            <td>{condition_1} && {condition_2}</td>
                            <td>\$BOOL_A && \$BOOL_B</td>
                            <td>".(($BOOL_A && $BOOL_B)?"true":"false")."</td>
                        </tr>
                        <tr>
                            <td>OR</td>
                            <td>{condition_1} or {condition_2}</td>
                            <td>\$BOOL_A or \$BOOL_B</td>
                            <td>".(($BOOL_A or $BOOL_B)?"true":"false")."</td>
                        </tr>
                        <tr>
                            <td>OR</td>
                            <td>{condition_1} || {condition_2}</td>
                            <td>\$BOOL_A || \$BOOL_B</td>
                            <td>".(($BOOL_A || $BOOL_B)?"true":"false")."</td>
                        </tr>
                        <tr>
                            <td>XOR</td>
                            <td>{condition_1} xor {condition_2}</td>
                            <td>\$BOOL_A xor \$BOOL_B</td>
                            <td>".(($BOOL_A xor $BOOL_B)?"true":"false")."</td>
                        </tr>
                        <tr>
                            <td>NOT</td>
                            <td>!{condition}</td>
                            <td>!\$BOOL_A</td>
                            <td>".((!$BOOL_A)?"true":"false")."</td>
                        </tr>
                    </table>

                    <br>
                    <br>
                    <br>
 
                    <table border=1>
                        <tr>
                            <th colspan=4>Array Operators</th>
                        </tr>
                        <tr>
                            <th>Operator Name</th>
                            <th>Symbol</th>
                            <th>Expression</th>
                            <th>Evaluation</th>
                        </tr>
                        <tr>
                            <td>Union</td>
                            <td>{Array_1} + {Array_2}</td>
                            <td>\$ARRAY_A + \$ARRAY_B</td>
                            <td>");
            ARRAY_PRINTER($ARRAY_A + $ARRAY_B);
            echo("              </td>
                        </tr>
                        <tr>
                            <td>Equality</td>
                            <td>{Array_1} == {Array_2}</td>
                            <td>\$ARRAY_A == \$ARRAY_B</td>
                            <td>".(($ARRAY_A == $ARRAY_B)?"true":"false")."</td>
                        </tr>
                        <tr>
                            <td>Inequality</td>
                            <td>{Array_1} <> {Array_2}</td>
                            <td>\$ARRAY_A <> \$ARRAY_B</td>
                            <td>".(($ARRAY_A <> $ARRAY_B)?"true":"false")."</td>
                        </tr>
                        <tr>
                            <td>Inequality</td>
                            <td>{Array_1} != {Array_2}</td>
                            <td>\$ARRAY_A != \$ARRAY_B</td>
                            <td>".(($ARRAY_A != $ARRAY_B)?"true":"false")."</td>
                        </tr>
                        <tr>
                            <td>Identity</td>
                            <td>{Array_1} === {Array_2}</td>
                            <td>\$ARRAY_A === \$ARRAY_B</td>
                            <td>".(($ARRAY_A === $ARRAY_B)?"true":"false")."</td>
                        </tr>
                        <tr>
                            <td>Non-Identity</td>
                            <td>{Array_1} !== {Array_2}</td>
                            <td>\$ARRAY_A !== \$ARRAY_B</td>
                            <td>".(($ARRAY_A !== $ARRAY_B)?"true":"false")."</td>
                        </tr>
                    </table>
             ");
        ?>
    </body>
</html>