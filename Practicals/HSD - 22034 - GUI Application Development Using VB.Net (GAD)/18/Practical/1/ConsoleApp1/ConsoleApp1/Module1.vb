Imports System.Console
Module Module1
    Sub Main()
        Dim con As New Constructor(20)
        WriteLine(con.ShowAge())
        Read()
    End Sub
End Module
Public Class Constructor
    Public Age As Integer = 40
    Public Sub New(ByVal x As Integer)
    End Sub
    Public Function ShowAge() As Integer
        Return Age
    End Function
End Class