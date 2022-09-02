Class Box
    Private length, breadth, height As Double
    Public Sub GetValues(L As Decimal, B As Decimal, H As Decimal)
        length = L
        breadth = B
        height = H
    End Sub
    Public Function Volume() As Double
        Return length * breadth * height
    End Function
End Class
Module Module1
    Sub Main()
        Dim l, b, h As Decimal
        Console.Write("Enter Length Value : ")
        l = Console.ReadLine()
        Console.Write("Enter Breadth Value : ")
        b = Console.ReadLine()
        Console.Write("Enter Height Value : ")
        h = Console.ReadLine()
        Dim BOX As Box = New Box()
        BOX.GetValues(l, b, h)
        Console.Write("Volume : " & BOX.Volume())
        Console.ReadLine()
    End Sub
End Module