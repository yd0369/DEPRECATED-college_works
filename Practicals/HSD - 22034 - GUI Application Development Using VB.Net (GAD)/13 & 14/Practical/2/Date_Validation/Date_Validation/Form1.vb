Imports System.Text.RegularExpressions
Public Class Form1
    Private Sub key_Click(sender As Object, e As EventArgs) Handles key.Click
        If (Regex.IsMatch(input.Text, "^((0[1-9]{1})|([0-9]{2}))\s((0[1-9]{1})|11|12)\s([0-9]{4})$")) Then
            ErrorProvider.SetError(input, "")
            MsgBox("Date Format Matched")
        Else
            ErrorProvider.SetError(input, "Enter the Date in [DD MM YYYY] Format")
        End If
    End Sub
End Class
