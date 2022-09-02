<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class Form1
    Inherits System.Windows.Forms.Form

    'Form overrides dispose to clean up the component list.
    <System.Diagnostics.DebuggerNonUserCode()> _
    Protected Overrides Sub Dispose(ByVal disposing As Boolean)
        Try
            If disposing AndAlso components IsNot Nothing Then
                components.Dispose()
            End If
        Finally
            MyBase.Dispose(disposing)
        End Try
    End Sub

    'Required by the Windows Form Designer
    Private components As System.ComponentModel.IContainer

    'NOTE: The following procedure is required by the Windows Form Designer
    'It can be modified using the Windows Form Designer.  
    'Do not modify it using the code editor.
    <System.Diagnostics.DebuggerStepThrough()> _
    Private Sub InitializeComponent()
        Me.Red_Key = New System.Windows.Forms.RadioButton()
        Me.Green_Key = New System.Windows.Forms.RadioButton()
        Me.Blue_Key = New System.Windows.Forms.RadioButton()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.SuspendLayout()
        '
        'Red_Key
        '
        Me.Red_Key.AutoSize = True
        Me.Red_Key.Location = New System.Drawing.Point(29, 100)
        Me.Red_Key.Name = "Red_Key"
        Me.Red_Key.Size = New System.Drawing.Size(48, 17)
        Me.Red_Key.TabIndex = 0
        Me.Red_Key.TabStop = True
        Me.Red_Key.Text = "RED"
        Me.Red_Key.UseVisualStyleBackColor = True
        '
        'Green_Key
        '
        Me.Green_Key.AutoSize = True
        Me.Green_Key.Location = New System.Drawing.Point(145, 100)
        Me.Green_Key.Name = "Green_Key"
        Me.Green_Key.Size = New System.Drawing.Size(63, 17)
        Me.Green_Key.TabIndex = 0
        Me.Green_Key.TabStop = True
        Me.Green_Key.Text = "GREEN"
        Me.Green_Key.UseVisualStyleBackColor = True
        '
        'Blue_Key
        '
        Me.Blue_Key.AutoSize = True
        Me.Blue_Key.Location = New System.Drawing.Point(271, 100)
        Me.Blue_Key.Name = "Blue_Key"
        Me.Blue_Key.Size = New System.Drawing.Size(53, 17)
        Me.Blue_Key.TabIndex = 0
        Me.Blue_Key.TabStop = True
        Me.Blue_Key.Text = "BLUE"
        Me.Blue_Key.UseVisualStyleBackColor = True
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Font = New System.Drawing.Font("Microsoft Sans Serif", 45.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label1.Location = New System.Drawing.Point(-10, 9)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(389, 69)
        Me.Label1.TabIndex = 1
        Me.Label1.Text = "YASH DESAI"
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(365, 127)
        Me.Controls.Add(Me.Label1)
        Me.Controls.Add(Me.Blue_Key)
        Me.Controls.Add(Me.Green_Key)
        Me.Controls.Add(Me.Red_Key)
        Me.Name = "Form1"
        Me.Text = "Form1"
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents Red_Key As RadioButton
    Friend WithEvents Green_Key As RadioButton
    Friend WithEvents Blue_Key As RadioButton
    Friend WithEvents Label1 As Label
End Class
