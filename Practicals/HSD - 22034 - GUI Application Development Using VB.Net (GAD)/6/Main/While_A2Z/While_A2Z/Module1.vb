﻿Module Module1
    Sub Main()
        Dim Ch As Integer = 97
        While (Ch <> 123)
            Console.WriteLine(Ch & " : " & Chr(Ch))
            Ch = Ch + 1
        End While
        Console.ReadLine()
    End Sub
End Module