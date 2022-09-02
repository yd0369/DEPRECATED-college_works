Public Class I
    Private Name As String
    Public Function GetName() As String
        Return Name
    End Function
    Public Function SetName(nam As String)
        Name = nam
        Return 0
    End Function
End Class
Module Module1
    Sub Main()
        Dim i As I = New I()
        Console.Write("Enter Name : ")
        i.SetName(Console.ReadLine())
        Console.WriteLine("Hello! " & i.GetName())
        Console.ReadLine()
    End Sub
End Module
