Module Module1
    Public Sub Main()
        Try
            Dim value As Integer = 1 / Integer.Parse("0")
        Catch ex As Exception

            Console.WriteLine(ex.Message)
            Console.ReadLine()

        End Try
    End Sub
End Module