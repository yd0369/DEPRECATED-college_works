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
        Me.RedKey = New System.Windows.Forms.Button()
        Me.Green_Key = New System.Windows.Forms.Button()
        Me.Blue_Key = New System.Windows.Forms.Button()
        Me.SuspendLayout()
        '
        'RedKey
        '
        Me.RedKey.Location = New System.Drawing.Point(27, 27)
        Me.RedKey.Name = "RedKey"
        Me.RedKey.Size = New System.Drawing.Size(104, 89)
        Me.RedKey.TabIndex = 0
        Me.RedKey.Text = "RED"
        Me.RedKey.UseVisualStyleBackColor = True
        '
        'Green_Key
        '
        Me.Green_Key.Location = New System.Drawing.Point(174, 27)
        Me.Green_Key.Name = "Green_Key"
        Me.Green_Key.Size = New System.Drawing.Size(104, 89)
        Me.Green_Key.TabIndex = 0
        Me.Green_Key.Text = "GREEN"
        Me.Green_Key.UseVisualStyleBackColor = True
        '
        'Blue_Key
        '
        Me.Blue_Key.Location = New System.Drawing.Point(321, 27)
        Me.Blue_Key.Name = "Blue_Key"
        Me.Blue_Key.Size = New System.Drawing.Size(104, 89)
        Me.Blue_Key.TabIndex = 0
        Me.Blue_Key.Text = "BLUE"
        Me.Blue_Key.UseVisualStyleBackColor = True
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.BackColor = System.Drawing.SystemColors.ControlLightLight
        Me.ClientSize = New System.Drawing.Size(460, 142)
        Me.Controls.Add(Me.Blue_Key)
        Me.Controls.Add(Me.Green_Key)
        Me.Controls.Add(Me.RedKey)
        Me.Name = "Form1"
        Me.Text = "Form1"
        Me.ResumeLayout(False)

    End Sub

    Friend WithEvents RedKey As Button
    Friend WithEvents Green_Key As Button
    Friend WithEvents Blue_Key As Button
End Class
