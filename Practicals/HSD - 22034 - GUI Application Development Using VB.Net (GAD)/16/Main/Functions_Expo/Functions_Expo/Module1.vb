Module Module1
    Sub Main()
        Dim A, B As Integer
        Console.Write("Enter Frist Value : ")
        A = Console.ReadLine()
        Console.Write("Enter Second Value : ")
        B = Console.ReadLine()
        Result()
        Console.Write(Sum(A, B))
        Console.ReadLine()
    End Sub
    Private Function Sum(ByVal A, ByVal B) As Integer
        Return A + B
    End Function
    Private Function Result()
        Console.Write("Sum : ")
    End Function
End Module
