Imports System.Text.RegularExpressions
Public Class Form1
    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        If ((Regex.IsMatch(IN1.Text, "^[0-9]+$")) And (Regex.IsMatch(IN2.Text, "^[0-9]+$"))) Then
            If (CType(IN1.Text, Integer) > CType(IN2.Text, Integer)) Then
                Label3.Text = "Max : Input 1"
            ElseIf (CType(IN1.Text, Integer) = CType(IN2.Text, Integer)) Then
                Label3.Text = "Both Equal"
            Else
                Label3.Text = "Max : Input 2"
            End If
        Else
            Label3.Text = "Error"
        End If
    End Sub
End Class
