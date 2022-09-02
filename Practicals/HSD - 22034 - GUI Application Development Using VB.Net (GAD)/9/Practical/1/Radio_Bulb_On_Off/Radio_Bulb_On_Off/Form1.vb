Public Class Form1
    Private Sub On_key_CheckedChanged(sender As Object, e As EventArgs) Handles On_key.CheckedChanged
        PictureBox1.BringToFront()
    End Sub

    Private Sub Off_key_CheckedChanged(sender As Object, e As EventArgs) Handles Off_key.CheckedChanged
        PictureBox2.BringToFront()
    End Sub
End Class
