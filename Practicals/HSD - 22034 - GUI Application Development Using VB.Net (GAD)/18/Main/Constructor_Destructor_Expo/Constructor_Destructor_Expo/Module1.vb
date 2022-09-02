Class Yash
    Public Sub New()
        Console.WriteLine("Executing Constructor...")
    End Sub
    Protected Overrides Sub Finalize()
        Console.WriteLine("Executing Destructor...")
        Console.ReadLine()
    End Sub
End Class
Module Module1
    Sub Main()
        Dim Y As Yash = New Yash()
    End Sub
End Module
