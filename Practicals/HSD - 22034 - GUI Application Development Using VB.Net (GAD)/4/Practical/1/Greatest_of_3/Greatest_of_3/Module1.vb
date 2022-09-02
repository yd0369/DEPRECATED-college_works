Module Module1
    Sub Main()
        Console.Write("Enter the First Number : ")
        Dim NUM1 As Double = Console.ReadLine()
        Console.Write("Enter the Second Number : ")
        Dim NUM2 As Double = Console.ReadLine()
        Console.Write("Enter the Third Number : ")
        Dim NUM3 As Double = Console.ReadLine()
        If (NUM1 > NUM2 And NUM1 > NUM3) Then
            Console.WriteLine("First is the Greatest")
        ElseIf (NUM2 > NUM1 And NUM2 > NUM3) Then
            Console.WriteLine("Second is the Greatest")
        Else
            Console.WriteLine("Third is the Greatest")
        End If
        Console.ReadLine()
    End Sub
End Module
