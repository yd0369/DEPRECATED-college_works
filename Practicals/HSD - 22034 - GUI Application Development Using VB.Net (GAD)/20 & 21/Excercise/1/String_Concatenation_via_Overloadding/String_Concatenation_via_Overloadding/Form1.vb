Public Class Form1
    Private Sub key_Click(sender As Object, e As EventArgs) Handles key.Click
        Dim A, B, C As String
        A = input1.Text
        B = input2.Text
        C = input3.Text
        Dim Z As CONCATENATION = New CONCATENATION()
        If ((IN1.Checked = True) = (IN2.Checked = True) = (IN3.Checked = True)) Then
            output.Text = Z.SHOW(A, B, C)
        ElseIf ((IN1.Checked = True) = (IN2.Checked = True)) Then
            output.Text = Z.SHOW(A, B)
        ElseIf ((IN2.Checked = True) = (IN3.Checked = True)) Then
            output.Text = Z.SHOW(B, C)
        ElseIf ((IN3.Checked = True) = (IN1.Checked = True)) Then
            output.Text = Z.SHOW(A, C)
        Else
            output.Text = "Select At least two"
        End If
    End Sub
End Class
Class CONCATENATION
    Function SHOW(A, B)
        Return A + B
    End Function
    Function SHOW(A, B, C)
        Return A + B + C
    End Function
End Class