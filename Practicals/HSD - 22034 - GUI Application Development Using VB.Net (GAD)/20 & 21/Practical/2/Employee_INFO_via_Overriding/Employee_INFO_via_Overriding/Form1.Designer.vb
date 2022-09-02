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
        Me.emp_id_combo = New System.Windows.Forms.ComboBox()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.GroupBox1 = New System.Windows.Forms.GroupBox()
        Me.key1 = New System.Windows.Forms.RadioButton()
        Me.key5 = New System.Windows.Forms.RadioButton()
        Me.key2 = New System.Windows.Forms.RadioButton()
        Me.key3 = New System.Windows.Forms.RadioButton()
        Me.key6 = New System.Windows.Forms.RadioButton()
        Me.key4 = New System.Windows.Forms.RadioButton()
        Me.key7 = New System.Windows.Forms.RadioButton()
        Me.key8 = New System.Windows.Forms.RadioButton()
        Me.key = New System.Windows.Forms.Button()
        Me.GroupBox1.SuspendLayout()
        Me.SuspendLayout()
        '
        'emp_id_combo
        '
        Me.emp_id_combo.FormattingEnabled = True
        Me.emp_id_combo.Location = New System.Drawing.Point(72, 6)
        Me.emp_id_combo.Name = "emp_id_combo"
        Me.emp_id_combo.Size = New System.Drawing.Size(168, 21)
        Me.emp_id_combo.TabIndex = 1
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Location = New System.Drawing.Point(9, 9)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(57, 13)
        Me.Label1.TabIndex = 2
        Me.Label1.Text = "Select ID :"
        '
        'GroupBox1
        '
        Me.GroupBox1.Controls.Add(Me.key1)
        Me.GroupBox1.Controls.Add(Me.key5)
        Me.GroupBox1.Controls.Add(Me.key2)
        Me.GroupBox1.Controls.Add(Me.key3)
        Me.GroupBox1.Controls.Add(Me.key6)
        Me.GroupBox1.Controls.Add(Me.key4)
        Me.GroupBox1.Controls.Add(Me.key7)
        Me.GroupBox1.Controls.Add(Me.key8)
        Me.GroupBox1.Location = New System.Drawing.Point(12, 33)
        Me.GroupBox1.Name = "GroupBox1"
        Me.GroupBox1.Size = New System.Drawing.Size(228, 111)
        Me.GroupBox1.TabIndex = 4
        Me.GroupBox1.TabStop = False
        Me.GroupBox1.Text = "JOB"
        '
        'key1
        '
        Me.key1.AutoSize = True
        Me.key1.Location = New System.Drawing.Point(6, 18)
        Me.key1.Name = "key1"
        Me.key1.Size = New System.Drawing.Size(103, 17)
        Me.key1.TabIndex = 3
        Me.key1.TabStop = True
        Me.key1.Text = "Testing Phase A"
        Me.key1.UseVisualStyleBackColor = True
        '
        'key5
        '
        Me.key5.AutoSize = True
        Me.key5.Location = New System.Drawing.Point(115, 18)
        Me.key5.Name = "key5"
        Me.key5.Size = New System.Drawing.Size(102, 17)
        Me.key5.TabIndex = 3
        Me.key5.TabStop = True
        Me.key5.Text = "Programming A2"
        Me.key5.UseVisualStyleBackColor = True
        '
        'key2
        '
        Me.key2.AutoSize = True
        Me.key2.Location = New System.Drawing.Point(6, 41)
        Me.key2.Name = "key2"
        Me.key2.Size = New System.Drawing.Size(103, 17)
        Me.key2.TabIndex = 3
        Me.key2.TabStop = True
        Me.key2.Text = "Testing Phase B"
        Me.key2.UseVisualStyleBackColor = True
        '
        'key3
        '
        Me.key3.AutoSize = True
        Me.key3.Location = New System.Drawing.Point(6, 64)
        Me.key3.Name = "key3"
        Me.key3.Size = New System.Drawing.Size(93, 17)
        Me.key3.TabIndex = 3
        Me.key3.TabStop = True
        Me.key3.Text = "UX Interfacing"
        Me.key3.UseVisualStyleBackColor = True
        '
        'key6
        '
        Me.key6.AutoSize = True
        Me.key6.Location = New System.Drawing.Point(115, 41)
        Me.key6.Name = "key6"
        Me.key6.Size = New System.Drawing.Size(102, 17)
        Me.key6.TabIndex = 3
        Me.key6.TabStop = True
        Me.key6.Text = "Programming B4"
        Me.key6.UseVisualStyleBackColor = True
        '
        'key4
        '
        Me.key4.AutoSize = True
        Me.key4.Location = New System.Drawing.Point(6, 87)
        Me.key4.Name = "key4"
        Me.key4.Size = New System.Drawing.Size(77, 17)
        Me.key4.TabIndex = 3
        Me.key4.TabStop = True
        Me.key4.Text = "Debugging"
        Me.key4.UseVisualStyleBackColor = True
        '
        'key7
        '
        Me.key7.AutoSize = True
        Me.key7.Location = New System.Drawing.Point(115, 64)
        Me.key7.Name = "key7"
        Me.key7.Size = New System.Drawing.Size(72, 17)
        Me.key7.TabIndex = 3
        Me.key7.TabStop = True
        Me.key7.Text = "UI Design"
        Me.key7.UseVisualStyleBackColor = True
        '
        'key8
        '
        Me.key8.AutoSize = True
        Me.key8.Location = New System.Drawing.Point(115, 87)
        Me.key8.Name = "key8"
        Me.key8.Size = New System.Drawing.Size(53, 17)
        Me.key8.TabIndex = 3
        Me.key8.TabStop = True
        Me.key8.Text = "NULL"
        Me.key8.UseVisualStyleBackColor = True
        '
        'key
        '
        Me.key.Location = New System.Drawing.Point(12, 150)
        Me.key.Name = "key"
        Me.key.Size = New System.Drawing.Size(228, 23)
        Me.key.TabIndex = 0
        Me.key.Text = "CONFIRM"
        Me.key.UseVisualStyleBackColor = True
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(252, 181)
        Me.Controls.Add(Me.GroupBox1)
        Me.Controls.Add(Me.Label1)
        Me.Controls.Add(Me.emp_id_combo)
        Me.Controls.Add(Me.key)
        Me.Name = "Form1"
        Me.Text = "Form1"
        Me.GroupBox1.ResumeLayout(False)
        Me.GroupBox1.PerformLayout()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Friend WithEvents emp_id_combo As ComboBox
    Friend WithEvents Label1 As Label
    Friend WithEvents GroupBox1 As GroupBox
    Friend WithEvents key1 As RadioButton
    Friend WithEvents key5 As RadioButton
    Friend WithEvents key2 As RadioButton
    Friend WithEvents key3 As RadioButton
    Friend WithEvents key6 As RadioButton
    Friend WithEvents key4 As RadioButton
    Friend WithEvents key7 As RadioButton
    Friend WithEvents key8 As RadioButton
    Friend WithEvents key As Button
End Class
