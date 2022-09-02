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
        Me.Check1 = New System.Windows.Forms.CheckBox()
        Me.Check2 = New System.Windows.Forms.CheckBox()
        Me.Check3 = New System.Windows.Forms.CheckBox()
        Me.Radiokey1 = New System.Windows.Forms.RadioButton()
        Me.Radiokey2 = New System.Windows.Forms.RadioButton()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.Label3 = New System.Windows.Forms.Label()
        Me.SuspendLayout()
        '
        'Check1
        '
        Me.Check1.AutoSize = True
        Me.Check1.Location = New System.Drawing.Point(12, 22)
        Me.Check1.Name = "Check1"
        Me.Check1.Size = New System.Drawing.Size(70, 17)
        Me.Check1.TabIndex = 0
        Me.Check1.Text = "Display A"
        Me.Check1.UseVisualStyleBackColor = True
        '
        'Check2
        '
        Me.Check2.AutoSize = True
        Me.Check2.Location = New System.Drawing.Point(133, 22)
        Me.Check2.Name = "Check2"
        Me.Check2.Size = New System.Drawing.Size(70, 17)
        Me.Check2.TabIndex = 0
        Me.Check2.Text = "Display B"
        Me.Check2.UseVisualStyleBackColor = True
        '
        'Check3
        '
        Me.Check3.AutoSize = True
        Me.Check3.Location = New System.Drawing.Point(257, 22)
        Me.Check3.Name = "Check3"
        Me.Check3.Size = New System.Drawing.Size(70, 17)
        Me.Check3.TabIndex = 0
        Me.Check3.Text = "Display C"
        Me.Check3.UseVisualStyleBackColor = True
        '
        'Radiokey1
        '
        Me.Radiokey1.AutoSize = True
        Me.Radiokey1.Location = New System.Drawing.Point(65, 143)
        Me.Radiokey1.Name = "Radiokey1"
        Me.Radiokey1.Size = New System.Drawing.Size(70, 17)
        Me.Radiokey1.TabIndex = 1
        Me.Radiokey1.TabStop = True
        Me.Radiokey1.Text = "Check All"
        Me.Radiokey1.UseVisualStyleBackColor = True
        '
        'Radiokey2
        '
        Me.Radiokey2.AutoSize = True
        Me.Radiokey2.Location = New System.Drawing.Point(178, 143)
        Me.Radiokey2.Name = "Radiokey2"
        Me.Radiokey2.Size = New System.Drawing.Size(83, 17)
        Me.Radiokey2.TabIndex = 2
        Me.Radiokey2.TabStop = True
        Me.Radiokey2.Text = "Uncheck All"
        Me.Radiokey2.UseVisualStyleBackColor = True
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Font = New System.Drawing.Font("Microsoft Sans Serif", 48.0!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label1.Location = New System.Drawing.Point(16, 52)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(76, 73)
        Me.Label1.TabIndex = 3
        Me.Label1.Text = "A"
        Me.Label1.Visible = False
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Font = New System.Drawing.Font("Microsoft Sans Serif", 48.0!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label2.Location = New System.Drawing.Point(127, 52)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(76, 73)
        Me.Label2.TabIndex = 3
        Me.Label2.Text = "B"
        Me.Label2.Visible = False
        '
        'Label3
        '
        Me.Label3.AutoSize = True
        Me.Label3.Font = New System.Drawing.Font("Microsoft Sans Serif", 48.0!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label3.Location = New System.Drawing.Point(238, 52)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(79, 73)
        Me.Label3.TabIndex = 3
        Me.Label3.Text = "C"
        Me.Label3.Visible = False
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(339, 171)
        Me.Controls.Add(Me.Label3)
        Me.Controls.Add(Me.Label2)
        Me.Controls.Add(Me.Label1)
        Me.Controls.Add(Me.Radiokey2)
        Me.Controls.Add(Me.Radiokey1)
        Me.Controls.Add(Me.Check3)
        Me.Controls.Add(Me.Check2)
        Me.Controls.Add(Me.Check1)
        Me.Name = "Form1"
        Me.Text = "Form1"
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents Check1 As CheckBox
    Friend WithEvents Check2 As CheckBox
    Friend WithEvents Check3 As CheckBox
    Friend WithEvents Radiokey1 As RadioButton
    Friend WithEvents Radiokey2 As RadioButton
    Friend WithEvents Label1 As Label
    Friend WithEvents Label2 As Label
    Friend WithEvents Label3 As Label
End Class
