Module Module1
    Sub Main()
        Console.Write("Enter the number : ")
        Fibonacci_Series(Console.ReadLine())
        Console.ReadLine()
    End Sub
    Sub Fibonacci_Series(num As Integer)
        Console.WriteLine("Fibonacci Series : ")
        Dim SUM, FIRST, SECOND As Integer
        SECOND = 1
        For i = 1 To num
            Console.Write(SECOND & " ")
            SUM = FIRST + SECOND
            FIRST = SECOND
            SECOND = SUM
        Next
    End Sub
End Module
