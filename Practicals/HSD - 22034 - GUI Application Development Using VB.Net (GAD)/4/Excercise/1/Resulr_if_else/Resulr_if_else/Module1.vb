﻿Module Module1
    Sub Main()
        Console.Write("Enter the Percentage : ")
        Dim PERCENT As Double = Console.ReadLine()
        Console.Write("Result : ")
        If (PERCENT < 40) Then
            Console.Write("Fail")
        ElseIf (PERCENT > 40 And PERCENT < 60) Then
            Console.Write("Pass Class")
        ElseIf (PERCENT > 60 And PERCENT < 75) Then
            Console.Write("First Class")
        ElseIf (PERCENT > 75) Then
            Console.Write("Distinction")
        End If
        Console.ReadLine()
    End Sub
End Module