Module Module1
    Sub Main()
        Console.WriteLine("Name : " & Student.Name())
        Console.WriteLine("Enrollment Number : " & Student.Enrollment_Number())
        Console.ReadLine()
    End Sub
End Module
Namespace Student
    Module Information
        Function Name()
            Return "Yash Desai"
        End Function
        Function Enrollment_Number()
            Return 1711880033
        End Function
    End Module
End Namespace
