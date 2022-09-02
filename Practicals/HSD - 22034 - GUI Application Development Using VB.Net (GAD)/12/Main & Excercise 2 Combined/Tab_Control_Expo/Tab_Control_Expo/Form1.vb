Public Class Form1
    Private Sub display_on_key_CheckedChanged(sender As Object, e As EventArgs) Handles display_on_key.CheckedChanged
        label.Visible = True
    End Sub
    Private Sub display_key_off_CheckedChanged(sender As Object, e As EventArgs) Handles display_key_off.CheckedChanged
        label.Visible = False
    End Sub
    Private Sub text_update_key_Click(sender As Object, e As EventArgs) Handles text_update_key.Click
        label.Text = new_text_input.Text
    End Sub
    Private Sub font_a_key_CheckedChanged(sender As Object, e As EventArgs) Handles font_a_key.CheckedChanged
        label.Font = New Font("Agency FB", (label.Font.Size))
    End Sub
    Private Sub font_b_key_CheckedChanged(sender As Object, e As EventArgs) Handles font_b_key.CheckedChanged
        label.Font = New Font("Comic Sans MS", (label.Font.Size))
    End Sub
    Private Sub font_c_key_CheckedChanged(sender As Object, e As EventArgs) Handles font_c_key.CheckedChanged
        label.Font = New Font("Algerian", (label.Font.Size))
    End Sub
    Private Sub font_size_TextChanged(sender As Object, e As EventArgs) Handles font_size.TextChanged
        label.Font = New Font(label.Font.Name, CType(font_size.Text, Integer))
    End Sub
    Private Sub red_key_CheckedChanged(sender As Object, e As EventArgs) Handles red_key.CheckedChanged
        label.ForeColor = Color.Red
    End Sub
    Private Sub green_key_CheckedChanged(sender As Object, e As EventArgs) Handles green_key.CheckedChanged
        label.ForeColor = Color.Green
    End Sub
    Private Sub blue_key_CheckedChanged(sender As Object, e As EventArgs) Handles blue_key.CheckedChanged
        label.ForeColor = Color.Blue
    End Sub
End Class
