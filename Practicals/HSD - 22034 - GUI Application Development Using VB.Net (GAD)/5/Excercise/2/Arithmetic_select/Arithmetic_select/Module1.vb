﻿Module Module1
    Sub Main()
        Console.Write("Enter the First Number : ")
        Dim A As Double = Console.ReadLine()
        Console.Write("Enter the Second Number : ")
        Dim B As Double = Console.ReadLine()
        Console.Write("1.Add \n2. Sub\n3. Mul\n4. Div\n5. Mod\n>> ")
        Select Case Console.ReadLine()
            Case 1
                Console.WriteLine("Addition : " & (A + B))
            Case 2
                Console.WriteLine("Subtraction : " & (A - B))
            Case 3
                Console.WriteLine("Multiplication : " & (A * B))
            Case 4
                Console.WriteLine("Division : " & (A / B))
            Case 5
                Console.WriteLine("Modulus : " & (A Mod B))
            Case Else
                Console.WriteLine("Invalid Input")
        End Select
        Console.ReadLine()
    End Sub
End Module
