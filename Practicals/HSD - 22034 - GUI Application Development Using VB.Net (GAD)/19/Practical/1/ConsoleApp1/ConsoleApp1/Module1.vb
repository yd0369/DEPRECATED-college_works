Public Class Booksale
    Sub New()
        Console.WriteLine("My Base Class")
    End Sub
End Class
Public Class studentbooksale
    Inherits Booksale
    Sub New()
        MyBase.New()
        Console.WriteLine("My Child Class")
        Console.ReadLine()
    End Sub
End Class
Module Module1
    Sub Main()
        Dim S As studentbooksale = New studentbooksale()
    End Sub
End Module




