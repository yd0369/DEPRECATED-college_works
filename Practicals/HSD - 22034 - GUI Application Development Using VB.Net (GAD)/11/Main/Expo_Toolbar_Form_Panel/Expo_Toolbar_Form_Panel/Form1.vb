Public Class Form1
    Private Sub form_red_key_Click(sender As Object, e As EventArgs) Handles form_red_key.Click
        Me.BackColor = Color.Red
    End Sub
    Private Sub form_green_key_Click(sender As Object, e As EventArgs) Handles form_green_key.Click
            Me.BackColor = Color.Green
        End Sub
    Private Sub form_blue_key_Click(sender As Object, e As EventArgs) Handles form_blue_key.Click
        Me.BackColor = Color.Blue
    End Sub
    Private Sub panel_red_key_Click(sender As Object, e As EventArgs) Handles panel_red_key.Click
        Panel.BackColor = Color.Red
    End Sub
    Private Sub panel_green_key_Click(sender As Object, e As EventArgs) Handles panel_green_key.Click
        Panel.BackColor = Color.Green
    End Sub
    Private Sub panel_blue_key_Click(sender As Object, e As EventArgs) Handles panel_blue_key.Click
        Panel.BackColor = Color.Blue
    End Sub
End Class
