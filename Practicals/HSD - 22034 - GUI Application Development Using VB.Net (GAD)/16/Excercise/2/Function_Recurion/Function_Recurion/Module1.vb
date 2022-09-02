Module Module1
    Sub Main()
        Console.Write("Enter the Number : ")
        Recursion(Console.ReadLine())
        Console.ReadLine()
    End Sub
    Function Recursion(i As Integer)
        Console.WriteLine(i)
        i -= 1
        If (i > 0) Then
            Recursion(i)
        End If
    End Function
End Module

