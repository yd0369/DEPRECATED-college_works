Module Module1
    Sub Main()
        Dim i As Integer = 1
        While (i < 51)
            If ((i Mod 2) = 0) Then
                Console.WriteLine(i & " : Even")
            Else
                Console.WriteLine(i & " : Odd")
            End If
            i = i + 1
        End While
        Console.ReadLine()
    End Sub
End Module