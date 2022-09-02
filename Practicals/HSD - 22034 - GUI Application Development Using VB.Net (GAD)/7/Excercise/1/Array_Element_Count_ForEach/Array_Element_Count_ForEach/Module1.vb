Module Module1
    Sub Main()
        Dim i, count As Integer
        Console.Write("Enter the Size of Array : ")
        i = Console.ReadLine()
        Dim array(i) As Integer
        For Each x As Integer In array
            count = count + 1
        Next x
        Console.WriteLine("Total Elements in Array : " & count)
        Console.ReadLine()
    End Sub
End Module