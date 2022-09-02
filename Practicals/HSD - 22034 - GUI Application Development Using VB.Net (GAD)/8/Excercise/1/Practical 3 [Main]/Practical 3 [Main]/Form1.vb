Public Class Form1
    Private Sub add_key_Click(sender As Object, e As EventArgs) Handles add_key.Click
        Output.Text = CType((Input1.Text), Double) + CType((Input2.Text), Double)
    End Sub

    Private Sub sub_key_Click(sender As Object, e As EventArgs) Handles sub_key.Click
        Output.Text = CType((Input1.Text), Double) - CType((Input2.Text), Double)
    End Sub

    Private Sub mul_key_Click(sender As Object, e As EventArgs) Handles mul_key.Click
        Output.Text = CType((Input1.Text), Double) * CType((Input2.Text), Double)
    End Sub

    Private Sub div_key_Click(sender As Object, e As EventArgs) Handles div_key.Click
        Output.Text = CType((Input1.Text), Double) / CType((Input2.Text), Double)
    End Sub
End Class