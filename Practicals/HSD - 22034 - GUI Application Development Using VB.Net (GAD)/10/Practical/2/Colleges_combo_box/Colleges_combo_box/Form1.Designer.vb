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
        Me.list = New System.Windows.Forms.ComboBox()
        Me.key = New System.Windows.Forms.Button()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.SuspendLayout()
        '
        'list
        '
        Me.list.FormattingEnabled = True
        Me.list.Location = New System.Drawing.Point(26, 32)
        Me.list.Name = "list"
        Me.list.Size = New System.Drawing.Size(285, 21)
        Me.list.TabIndex = 0
        '
        'key
        '
        Me.key.Location = New System.Drawing.Point(236, 70)
        Me.key.Name = "key"
        Me.key.Size = New System.Drawing.Size(75, 23)
        Me.key.TabIndex = 1
        Me.key.Text = "Done !!"
        Me.key.UseVisualStyleBackColor = True
        Me.key.Visible = False
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Location = New System.Drawing.Point(26, 13)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(156, 13)
        Me.Label1.TabIndex = 2
        Me.Label1.Text = "Select from following Colleges : "
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(343, 105)
        Me.Controls.Add(Me.Label1)
        Me.Controls.Add(Me.key)
        Me.Controls.Add(Me.list)
        Me.Name = "Form1"
        Me.Text = "Form1"
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents list As ComboBox
    Friend WithEvents key As Button
    Friend WithEvents Label1 As Label
End Class
