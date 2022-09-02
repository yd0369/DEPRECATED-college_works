Public Class Form1
    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        list.Items.Add("Dharampeth Polytechnic")
        list.Items.Add("Raisoni Polytechnic")
        list.Items.Add("Anjuman Polytechnic")
    End Sub
    Private Sub list_SelectedIndexChanged(sender As Object, e As EventArgs) Handles list.SelectedIndexChanged
        key.Visible = True
    End Sub
    Private Sub key_Click(sender As Object, e As EventArgs) Handles key.Click
        MsgBox("You have Choosed : " & list.SelectedItem)
    End Sub
End Class
