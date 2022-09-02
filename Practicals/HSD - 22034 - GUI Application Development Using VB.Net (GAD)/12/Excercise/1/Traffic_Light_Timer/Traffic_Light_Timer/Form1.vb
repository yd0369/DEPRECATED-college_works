Public Class Form1
    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        Timer.Interval = 30000
        Timer.Start()
        Me.BackColor = Color.Red
    End Sub
    Private Sub Timer_Tick(sender As Object, e As EventArgs) Handles Timer.Tick
        Select Case Me.BackColor
            Case Color.Red
                Me.BackColor = Color.Yellow
                Timer.Interval = 5000
            Case Color.Yellow
                Me.BackColor = Color.Green
                Timer.Interval = 30000
            Case Color.Green
                Me.BackColor = Color.Red
                Timer.Interval = 30000
        End Select
    End Sub
End Class
