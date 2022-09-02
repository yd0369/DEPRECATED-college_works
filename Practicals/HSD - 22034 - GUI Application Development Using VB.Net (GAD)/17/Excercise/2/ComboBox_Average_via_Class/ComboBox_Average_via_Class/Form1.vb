Public Class Form1
    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        For i = 1 To 10000
            input_combo.Items.Add(i)
        Next
        add_key.Enabled = False
        avg_key.Enabled = False
    End Sub
    Private Sub input_combo_SelectedIndexChanged(sender As Object, e As EventArgs) Handles input_combo.SelectedIndexChanged
        add_key.Enabled = True
        avg_key.Enabled = True
    End Sub
    Private Sub add_key_Click(sender As Object, e As EventArgs) Handles add_key.Click
        selected_list.Items.Add(CType(input_combo.SelectedItem, Integer))
    End Sub
    Private Sub avg_key_Click(sender As Object, e As EventArgs) Handles avg_key.Click
        Dim SUM, COUNT, VALUE As Integer
        For Each VALUE In selected_list.Items
            SUM = SUM + VALUE
            COUNT += 1
        Next
        Dim C As CALC = New CALC()
        C.Display(SUM / COUNT)
    End Sub
End Class
Public Class CALC
    Sub Display(AVG As Decimal)
        MsgBox(("The Average is : " & AVG))
    End Sub
End Class