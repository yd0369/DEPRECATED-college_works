﻿Module Module1
    Sub Main()
        Dim i As Integer = 2
        Dim j As Integer
        While (i <= 100)
            j = 2
            While (j <= i)
                If (j = i) Then
                    Console.WriteLine(i)
                End If
                If ((i Mod j) = 0) Then
                    Exit While
                End If
            j = j + 1
        End While
        i = i + 1
        End While
        Console.ReadLine()
    End Sub
End Module