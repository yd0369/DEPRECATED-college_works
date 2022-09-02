Class Parent
    Overridable Sub HelloMSG()
        Console.WriteLine("Hello, From Parent Class")
    End Sub
End Class
Class Child
    Inherits Parent
    Overrides Sub HelloMSG()
        Console.WriteLine("Hello, From Child Class")
    End Sub
End Class
Module Module1
    Sub Main()
        Create_OBJ(1)
        Create_OBJ(True)
        Console.ReadLine()
    End Sub
    Sub Create_OBJ(i As Integer)
        Console.WriteLine("Executing Create_OBJ with Integer as Argument")
        Console.WriteLine("Creating Object of Parent Class")
        Dim P As Parent = New Parent()
        P.HelloMSG()
    End Sub
    Sub Create_OBJ(b As Boolean)
        Console.WriteLine("Executing Create_OBJ with Boolean as Argument")
        Console.WriteLine("Creating Object of Child Class")
        Dim C As Child = New Child()
        C.HelloMSG()
    End Sub
End Module
