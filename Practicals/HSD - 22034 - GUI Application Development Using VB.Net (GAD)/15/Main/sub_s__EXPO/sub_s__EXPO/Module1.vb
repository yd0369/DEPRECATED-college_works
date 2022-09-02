Module Module1
    Public Sub Main()
        Dim A, B As Double
        GETInput(A, B)
        Output(A + B)
        getch()
    End Sub
    Public Sub GETInput(ByRef A, ByRef B)
        Console.Write("Enter First Value : ")
        A = Console.ReadLine()
        Console.Write("Enter Second Value : ")
        B = Console.ReadLine()
    End Sub
    Private Sub Output(sum)
        Console.Write("Result : " & sum)
    End Sub
    Sub getch()
        Console.ReadLine()
    End Sub
End Module
