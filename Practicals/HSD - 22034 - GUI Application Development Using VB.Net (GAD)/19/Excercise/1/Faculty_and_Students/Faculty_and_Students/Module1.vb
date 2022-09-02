Public Class Faculty
    Public FName, Subject As String
    Sub New(N As String, S As String)
        FName = N
        Subject = S
    End Sub
End Class
Public Class Student
    Inherits Faculty
    Public SName As String
    Sub New(FN As String, FS As String, SN As String)
        MyBase.New(FN, FS)
        SName = SN
    End Sub
End Class
Module Module1
    Sub Main()
        Dim F_Name, S_Name, F_Sub As String
        Console.Write("Enter Faculty Name : ")
        F_Name = Console.ReadLine()
        Console.Write("Enter Faculty Subject : ")
        F_Sub = Console.ReadLine()
        Console.Write("Enter Student Name : ")
        S_Name = Console.ReadLine()
        Dim S As Student = New Student(F_Name, F_Sub, S_Name)
        Console.WriteLine(S.FName & " teaches " & S.Subject & " to " & S.SName)
        Console.ReadLine()
    End Sub
End Module