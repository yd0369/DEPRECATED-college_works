Public Class Form1
    Private Sub load_key_Click(sender As Object, e As EventArgs) Handles load_key.Click
        Dim DIR As String
        DIR = InputBox("Enter Picture Directory :", "Load Image", "Enter Picture Directory Here")
        image_box.ImageLocation = DIR
    End Sub
End Class
