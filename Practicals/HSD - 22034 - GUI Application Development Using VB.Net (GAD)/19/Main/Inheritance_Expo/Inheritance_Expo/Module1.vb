Class Parent
    Public Sub New()
        Console.WriteLine("Executing Parent Class Constructor...")
    End Sub
End Class
Class Child
    Inherits Parent
    Public Sub New()
        Console.WriteLine("Executing Child Class Constructor...")
    End Sub
    Protected Overrides Sub Finalize()
        Console.WriteLine("Executing Child Class Destructor...")
    End Sub
End Class
Module Module1
    Sub Main()
        Dim C As Child = New Child()
    End Sub
End Module
