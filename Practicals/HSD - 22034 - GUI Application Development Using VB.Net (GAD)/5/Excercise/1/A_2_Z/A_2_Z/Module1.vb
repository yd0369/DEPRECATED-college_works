Module Module1
    Sub Main()
        Dim vowel_count As Integer = 0
        Dim consonant_count As Integer = 0
        For Ch = 97 To 122
            Select Case Chr(Ch)
                Case "a", "e", "i", "o", "u"
                    vowel_count = vowel_count + 1
                Case Else
                    consonant_count = consonant_count + 1
            End Select
        Next Ch
        Console.WriteLine("Vowel : " & vowel_count)
        Console.WriteLine("Consonant : " & consonant_count)
        Console.ReadLine()
    End Sub
End Module