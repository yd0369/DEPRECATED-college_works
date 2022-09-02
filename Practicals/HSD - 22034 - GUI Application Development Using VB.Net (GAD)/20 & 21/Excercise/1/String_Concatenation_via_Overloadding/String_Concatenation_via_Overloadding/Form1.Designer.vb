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
        Me.key = New System.Windows.Forms.Button()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.input1 = New System.Windows.Forms.TextBox()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.input2 = New System.Windows.Forms.TextBox()
        Me.Label3 = New System.Windows.Forms.Label()
        Me.input3 = New System.Windows.Forms.TextBox()
        Me.output = New System.Windows.Forms.Label()
        Me.IN3 = New System.Windows.Forms.CheckBox()
        Me.IN2 = New System.Windows.Forms.CheckBox()
        Me.IN1 = New System.Windows.Forms.CheckBox()
        Me.SuspendLayout()
        '
        'key
        '
        Me.key.Font = New System.Drawing.Font("Microsoft Sans Serif", 6.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.key.Location = New System.Drawing.Point(194, 6)
        Me.key.Name = "key"
        Me.key.Size = New System.Drawing.Size(75, 72)
        Me.key.TabIndex = 0
        Me.key.Text = "CONCATENATE"
        Me.key.UseVisualStyleBackColor = True
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Location = New System.Drawing.Point(12, 9)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(52, 13)
        Me.Label1.TabIndex = 1
        Me.Label1.Text = "String 1 : "
        '
        'input1
        '
        Me.input1.Location = New System.Drawing.Point(70, 6)
        Me.input1.Name = "input1"
        Me.input1.Size = New System.Drawing.Size(100, 20)
        Me.input1.TabIndex = 2
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Location = New System.Drawing.Point(12, 35)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(52, 13)
        Me.Label2.TabIndex = 1
        Me.Label2.Text = "String 2 : "
        '
        'input2
        '
        Me.input2.Location = New System.Drawing.Point(70, 32)
        Me.input2.Name = "input2"
        Me.input2.Size = New System.Drawing.Size(100, 20)
        Me.input2.TabIndex = 2
        '
        'Label3
        '
        Me.Label3.AutoSize = True
        Me.Label3.Location = New System.Drawing.Point(12, 61)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(52, 13)
        Me.Label3.TabIndex = 1
        Me.Label3.Text = "String 3 : "
        '
        'input3
        '
        Me.input3.Location = New System.Drawing.Point(70, 58)
        Me.input3.Name = "input3"
        Me.input3.Size = New System.Drawing.Size(100, 20)
        Me.input3.TabIndex = 2
        '
        'output
        '
        Me.output.AutoSize = True
        Me.output.Location = New System.Drawing.Point(275, 35)
        Me.output.Name = "output"
        Me.output.Size = New System.Drawing.Size(0, 13)
        Me.output.TabIndex = 1
        '
        'IN3
        '
        Me.IN3.AutoSize = True
        Me.IN3.Location = New System.Drawing.Point(176, 61)
        Me.IN3.Name = "IN3"
        Me.IN3.Size = New System.Drawing.Size(15, 14)
        Me.IN3.TabIndex = 3
        Me.IN3.UseVisualStyleBackColor = True
        '
        'IN2
        '
        Me.IN2.AutoSize = True
        Me.IN2.Location = New System.Drawing.Point(176, 35)
        Me.IN2.Name = "IN2"
        Me.IN2.Size = New System.Drawing.Size(15, 14)
        Me.IN2.TabIndex = 3
        Me.IN2.UseVisualStyleBackColor = True
        '
        'IN1
        '
        Me.IN1.AutoSize = True
        Me.IN1.Location = New System.Drawing.Point(176, 9)
        Me.IN1.Name = "IN1"
        Me.IN1.Size = New System.Drawing.Size(15, 14)
        Me.IN1.TabIndex = 3
        Me.IN1.UseVisualStyleBackColor = True
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(455, 80)
        Me.Controls.Add(Me.IN1)
        Me.Controls.Add(Me.IN2)
        Me.Controls.Add(Me.IN3)
        Me.Controls.Add(Me.input3)
        Me.Controls.Add(Me.Label3)
        Me.Controls.Add(Me.input2)
        Me.Controls.Add(Me.Label2)
        Me.Controls.Add(Me.input1)
        Me.Controls.Add(Me.output)
        Me.Controls.Add(Me.Label1)
        Me.Controls.Add(Me.key)
        Me.Name = "Form1"
        Me.Text = "Form1"
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents key As Button
    Friend WithEvents Label1 As Label
    Friend WithEvents input1 As TextBox
    Friend WithEvents Label2 As Label
    Friend WithEvents input2 As TextBox
    Friend WithEvents Label3 As Label
    Friend WithEvents input3 As TextBox
    Friend WithEvents output As Label
    Friend WithEvents IN3 As CheckBox
    Friend WithEvents IN2 As CheckBox
    Friend WithEvents IN1 As CheckBox
End Class
