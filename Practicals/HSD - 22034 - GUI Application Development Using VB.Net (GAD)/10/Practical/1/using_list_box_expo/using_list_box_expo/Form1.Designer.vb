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
        Me.key = New System.Windows.Forms.Button()
        Me.subject_list = New System.Windows.Forms.CheckedListBox()
        Me.SuspendLayout()
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Location = New System.Drawing.Point(12, 22)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(100, 13)
        Me.Label1.TabIndex = 1
        Me.Label1.Text = "Select the Subject :"
        '
        'key
        '
        Me.key.Location = New System.Drawing.Point(63, 168)
        Me.key.Name = "key"
        Me.key.Size = New System.Drawing.Size(100, 23)
        Me.key.TabIndex = 2
        Me.key.Text = "Done !!"
        Me.key.UseVisualStyleBackColor = True
        '
        'subject_list
        '
        Me.subject_list.FormattingEnabled = True
        Me.subject_list.Location = New System.Drawing.Point(15, 38)
        Me.subject_list.Name = "subject_list"
        Me.subject_list.Size = New System.Drawing.Size(201, 124)
        Me.subject_list.TabIndex = 3
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(228, 199)
        Me.Controls.Add(Me.subject_list)
        Me.Controls.Add(Me.key)
        Me.Controls.Add(Me.Label1)
        Me.Name = "Form1"
        Me.Text = "Form1"
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Friend WithEvents Label1 As Label
    Friend WithEvents key As Button
    Friend WithEvents subject_list As CheckedListBox
End Class
