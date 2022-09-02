Public Class Form1
    Private Sub Check1_CheckedChanged(sender As Object, e As EventArgs) Handles Check1.CheckedChanged
        If (Label1.Visible = True) Then
            Label1.Visible = False
        Else Label1.Visible = True
        End If
    End Sub
    Private Sub Check2_CheckedChanged(sender As Object, e As EventArgs) Handles Check2.CheckedChanged
        If (Label2.Visible = True) Then
            Label2.Visible = False
        Else Label2.Visible = True
        End If
    End Sub
    Private Sub Check3_CheckedChanged(sender As Object, e As EventArgs) Handles Check3.CheckedChanged
        If (Label3.Visible = True) Then
            Label3.Visible = False
        Else Label3.Visible = True
        End If
    End Sub
    Private Sub Radiokey1_CheckedChanged(sender As Object, e As EventArgs) Handles Radiokey1.CheckedChanged
        Check1.CheckState = 1
        Check2.CheckState = 1
        Check3.CheckState = 1
    End Sub
    Private Sub Radiokey2_CheckedChanged(sender As Object, e As EventArgs) Handles Radiokey2.CheckedChanged
        Check1.CheckState = 0
        Check2.CheckState = 0
        Check3.CheckState = 0
    End Sub
End Class
