﻿Module Module1
    Sub Main()
        Dim NUM, TMP, REMAIN, SUM As Integer
        For NUM = 1 To 500
            TMP = NUM
            SUM = 0
            While TMP > 0
                REMAIN = TMP Mod 10
                SUM = SUM + (REMAIN ^ 3)
                TMP = TMP \ 10
            End While
            If NUM = SUM Then
                Console.WriteLine(NUM)
            End If
        Next
        Console.ReadLine()
    End Sub
End Module
