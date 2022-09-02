Module Module1
    Sub Main()
        Console.Write("Enter the Number : ")
        Reverse(Console.ReadLine())
        Console.ReadLine()
    End Sub
    Sub Reverse(num As Integer)
        Console.Write("Reversed Number : ")
        Dim Remainder As Integer
        While (num > 0)
            Remainder = num Mod 10
            num /= 10
            Console.Write(Remainder)
        End While
    End Sub
End Module
