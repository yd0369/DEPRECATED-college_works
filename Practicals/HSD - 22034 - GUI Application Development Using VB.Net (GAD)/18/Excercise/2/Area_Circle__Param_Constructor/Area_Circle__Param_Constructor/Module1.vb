Class Circle
    Public Sub New(Radius As Decimal)
        Console.WriteLine("Radius : " & ((Radius ^ 2) * 3.14))
    End Sub
End Class
Module Module1
    Sub Main()
        Console.Write("Enter the Radius : ")
        Dim C As Circle = New Circle(Console.ReadLine())
        Console.ReadLine()
    End Sub
End Module
