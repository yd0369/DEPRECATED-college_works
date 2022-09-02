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
        Me.Input1 = New System.Windows.Forms.RichTextBox()
        Me.Input2 = New System.Windows.Forms.RichTextBox()
        Me.add_key = New System.Windows.Forms.Button()
        Me.sub_key = New System.Windows.Forms.Button()
        Me.div_key = New System.Windows.Forms.Button()
        Me.mul_key = New System.Windows.Forms.Button()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.Output = New System.Windows.Forms.RichTextBox()
        Me.Label3 = New System.Windows.Forms.Label()
        Me.SuspendLayout()
        '
        'Input1
        '
        Me.Input1.Font = New System.Drawing.Font("Microsoft Sans Serif", 36.0!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Input1.Location = New System.Drawing.Point(23, 26)
        Me.Input1.Name = "Input1"
        Me.Input1.Size = New System.Drawing.Size(217, 96)
        Me.Input1.TabIndex = 0
        Me.Input1.Text = ""
        '
        'Input2
        '
        Me.Input2.Font = New System.Drawing.Font("Microsoft Sans Serif", 36.0!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Input2.Location = New System.Drawing.Point(263, 26)
        Me.Input2.Name = "Input2"
        Me.Input2.Size = New System.Drawing.Size(217, 96)
        Me.Input2.TabIndex = 1
        Me.Input2.Text = ""
        '
        'add_key
        '
        Me.add_key.Font = New System.Drawing.Font("Consolas", 26.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.add_key.Location = New System.Drawing.Point(23, 128)
        Me.add_key.Name = "add_key"
        Me.add_key.Size = New System.Drawing.Size(99, 70)
        Me.add_key.TabIndex = 2
        Me.add_key.Text = "+"
        Me.add_key.UseVisualStyleBackColor = True
        '
        'sub_key
        '
        Me.sub_key.Font = New System.Drawing.Font("Consolas", 26.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.sub_key.Location = New System.Drawing.Point(141, 128)
        Me.sub_key.Name = "sub_key"
        Me.sub_key.Size = New System.Drawing.Size(99, 70)
        Me.sub_key.TabIndex = 2
        Me.sub_key.Text = "-"
        Me.sub_key.UseVisualStyleBackColor = True
        '
        'div_key
        '
        Me.div_key.Font = New System.Drawing.Font("Consolas", 26.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.div_key.Location = New System.Drawing.Point(381, 128)
        Me.div_key.Name = "div_key"
        Me.div_key.Size = New System.Drawing.Size(99, 70)
        Me.div_key.TabIndex = 2
        Me.div_key.Text = "/"
        Me.div_key.UseVisualStyleBackColor = True
        '
        'mul_key
        '
        Me.mul_key.Font = New System.Drawing.Font("Consolas", 26.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.mul_key.Location = New System.Drawing.Point(263, 128)
        Me.mul_key.Name = "mul_key"
        Me.mul_key.Size = New System.Drawing.Size(99, 70)
        Me.mul_key.TabIndex = 2
        Me.mul_key.Text = "*"
        Me.mul_key.UseVisualStyleBackColor = True
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Location = New System.Drawing.Point(20, 9)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(53, 13)
        Me.Label1.TabIndex = 3
        Me.Label1.Text = "Number 1"
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Location = New System.Drawing.Point(20, 210)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(37, 13)
        Me.Label2.TabIndex = 3
        Me.Label2.Text = "Result"
        '
        'Output
        '
        Me.Output.Font = New System.Drawing.Font("Microsoft Sans Serif", 36.0!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Output.Location = New System.Drawing.Point(23, 226)
        Me.Output.Name = "Output"
        Me.Output.Size = New System.Drawing.Size(457, 96)
        Me.Output.TabIndex = 1
        Me.Output.Text = ""
        '
        'Label3
        '
        Me.Label3.AutoSize = True
        Me.Label3.Location = New System.Drawing.Point(260, 9)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(53, 13)
        Me.Label3.TabIndex = 3
        Me.Label3.Text = "Number 2"
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(501, 332)
        Me.Controls.Add(Me.Label3)
        Me.Controls.Add(Me.Label2)
        Me.Controls.Add(Me.Label1)
        Me.Controls.Add(Me.mul_key)
        Me.Controls.Add(Me.div_key)
        Me.Controls.Add(Me.sub_key)
        Me.Controls.Add(Me.add_key)
        Me.Controls.Add(Me.Output)
        Me.Controls.Add(Me.Input2)
        Me.Controls.Add(Me.Input1)
        Me.Name = "Form1"
        Me.Text = "Form1"
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents Input1 As RichTextBox
    Friend WithEvents Input2 As RichTextBox
    Friend WithEvents add_key As Button
    Friend WithEvents sub_key As Button
    Friend WithEvents div_key As Button
    Friend WithEvents mul_key As Button
    Friend WithEvents Label1 As Label
    Friend WithEvents Label2 As Label
    Friend WithEvents Output As RichTextBox
    Friend WithEvents Label3 As Label
End Class
