Public Class Form1
    Private Sub Red_Key_CheckedChanged(sender As Object, e As EventArgs) Handles Red_Key.CheckedChanged
        Me.ForeColor = Color.Red
    End Sub
    Private Sub Green_Key_CheckedChanged(sender As Object, e As EventArgs) Handles Green_Key.CheckedChanged
        Me.ForeColor = Color.Green
    End Sub
    Private Sub Blue_Key_CheckedChanged(sender As Object, e As EventArgs) Handles Blue_Key.CheckedChanged
        Me.ForeColor = Color.Blue
    End Sub
End Class
