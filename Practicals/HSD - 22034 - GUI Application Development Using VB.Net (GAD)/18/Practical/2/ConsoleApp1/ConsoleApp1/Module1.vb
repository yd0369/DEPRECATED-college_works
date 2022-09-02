Module Module1
    Sub Main()
        Dim obj As New Destroy()
    End Sub
End Module
Public Class Destroy
    Protected Overrides Finalize()
        Console.Write("VB.NET")
        Read()
    End Sub
End Class
