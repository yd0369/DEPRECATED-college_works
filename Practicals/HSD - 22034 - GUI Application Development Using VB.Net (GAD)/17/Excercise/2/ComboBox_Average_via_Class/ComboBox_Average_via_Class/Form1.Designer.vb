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
        Me.Label1 = New System.Windows.Forms.Label()
        Me.add_key = New System.Windows.Forms.Button()
        Me.input_combo = New System.Windows.Forms.ComboBox()
        Me.selected_list = New System.Windows.Forms.ListBox()
        Me.avg_key = New System.Windows.Forms.Button()
        Me.SuspendLayout()
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Location = New System.Drawing.Point(12, 9)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(110, 13)
        Me.Label1.TabIndex = 1
        Me.Label1.Text = "Select the number(s) :"
        '
        'add_key
        '
        Me.add_key.Location = New System.Drawing.Point(184, 31)
        Me.add_key.Name = "add_key"
        Me.add_key.Size = New System.Drawing.Size(39, 23)
        Me.add_key.TabIndex = 2
        Me.add_key.Text = ">>>>"
        Me.add_key.UseVisualStyleBackColor = True
        '
        'input_combo
        '
        Me.input_combo.FormattingEnabled = True
        Me.input_combo.Location = New System.Drawing.Point(12, 31)
        Me.input_combo.Name = "input_combo"
        Me.input_combo.Size = New System.Drawing.Size(166, 21)
        Me.input_combo.TabIndex = 0
        '
        'selected_list
        '
        Me.selected_list.FormattingEnabled = True
        Me.selected_list.Location = New System.Drawing.Point(12, 60)
        Me.selected_list.Name = "selected_list"
        Me.selected_list.Size = New System.Drawing.Size(211, 108)
        Me.selected_list.TabIndex = 3
        '
        'avg_key
        '
        Me.avg_key.Location = New System.Drawing.Point(12, 185)
        Me.avg_key.Name = "avg_key"
        Me.avg_key.Size = New System.Drawing.Size(211, 23)
        Me.avg_key.TabIndex = 2
        Me.avg_key.Text = "Calculate Average"
        Me.avg_key.UseVisualStyleBackColor = True
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(238, 220)
        Me.Controls.Add(Me.selected_list)
        Me.Controls.Add(Me.avg_key)
        Me.Controls.Add(Me.add_key)
        Me.Controls.Add(Me.Label1)
        Me.Controls.Add(Me.input_combo)
        Me.Name = "Form1"
        Me.Text = "Form1"
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents Label1 As Label
    Friend WithEvents add_key As Button
    Friend WithEvents input_combo As ComboBox
    Friend WithEvents selected_list As ListBox
    Friend WithEvents avg_key As Button
End Class
