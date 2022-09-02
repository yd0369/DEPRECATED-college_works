Public Class Form1
    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        subject_list.Items.Add("Java Programming")
        subject_list.Items.Add("C Programming")
        subject_list.Items.Add("C++ Programming")
        subject_list.Items.Add("C# Programming")
        subject_list.Items.Add("Python Programming")
    End Sub
    Private Sub key_Click(sender As Object, e As EventArgs) Handles key.Click
        MsgBox(("Selected Subjects : " & vbNewLine & Subject_Printer()),, "Confirmation")
    End Sub
    Function Subject_Printer()
        Dim Final_STR As String
        For Each STR As String In subject_list.CheckedItems
            Final_STR = Final_STR + vbNewLine + STR
        Next
        Return Final_STR
    End Function
End Class
