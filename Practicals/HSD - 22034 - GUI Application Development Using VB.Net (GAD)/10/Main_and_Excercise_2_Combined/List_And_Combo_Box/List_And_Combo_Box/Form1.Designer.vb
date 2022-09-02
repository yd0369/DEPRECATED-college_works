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
        Me.semester_combo = New System.Windows.Forms.ComboBox()
        Me.Stud_enroll_no = New System.Windows.Forms.TextBox()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.year_combo = New System.Windows.Forms.ComboBox()
        Me.Label3 = New System.Windows.Forms.Label()
        Me.key = New System.Windows.Forms.Button()
        Me.Label4 = New System.Windows.Forms.Label()
        Me.subject_list = New System.Windows.Forms.CheckedListBox()
        Me.SuspendLayout()
        '
        'semester_combo
        '
        Me.semester_combo.Enabled = False
        Me.semester_combo.FormattingEnabled = True
        Me.semester_combo.Location = New System.Drawing.Point(12, 132)
        Me.semester_combo.Name = "semester_combo"
        Me.semester_combo.Size = New System.Drawing.Size(191, 21)
        Me.semester_combo.TabIndex = 0
        '
        'Stud_enroll_no
        '
        Me.Stud_enroll_no.Location = New System.Drawing.Point(12, 33)
        Me.Stud_enroll_no.Name = "Stud_enroll_no"
        Me.Stud_enroll_no.Size = New System.Drawing.Size(191, 20)
        Me.Stud_enroll_no.TabIndex = 2
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Location = New System.Drawing.Point(13, 14)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(136, 13)
        Me.Label1.TabIndex = 3
        Me.Label1.Text = "Student Enrollment Number"
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Location = New System.Drawing.Point(12, 116)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(51, 13)
        Me.Label2.TabIndex = 3
        Me.Label2.Text = "Semester"
        '
        'year_combo
        '
        Me.year_combo.Enabled = False
        Me.year_combo.FormattingEnabled = True
        Me.year_combo.Location = New System.Drawing.Point(12, 83)
        Me.year_combo.Name = "year_combo"
        Me.year_combo.Size = New System.Drawing.Size(191, 21)
        Me.year_combo.TabIndex = 0
        '
        'Label3
        '
        Me.Label3.AutoSize = True
        Me.Label3.Location = New System.Drawing.Point(12, 67)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(29, 13)
        Me.Label3.TabIndex = 3
        Me.Label3.Text = "Year"
        '
        'key
        '
        Me.key.Enabled = False
        Me.key.Location = New System.Drawing.Point(12, 315)
        Me.key.Name = "key"
        Me.key.Size = New System.Drawing.Size(191, 65)
        Me.key.TabIndex = 4
        Me.key.Text = "Register"
        Me.key.UseVisualStyleBackColor = True
        '
        'Label4
        '
        Me.Label4.AutoSize = True
        Me.Label4.Location = New System.Drawing.Point(9, 167)
        Me.Label4.Name = "Label4"
        Me.Label4.Size = New System.Drawing.Size(43, 13)
        Me.Label4.TabIndex = 5
        Me.Label4.Text = "Subject"
        '
        'subject_list
        '
        Me.subject_list.FormattingEnabled = True
        Me.subject_list.Location = New System.Drawing.Point(12, 183)
        Me.subject_list.Name = "subject_list"
        Me.subject_list.Size = New System.Drawing.Size(191, 109)
        Me.subject_list.TabIndex = 6
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(221, 392)
        Me.Controls.Add(Me.subject_list)
        Me.Controls.Add(Me.Label4)
        Me.Controls.Add(Me.key)
        Me.Controls.Add(Me.Label3)
        Me.Controls.Add(Me.Label2)
        Me.Controls.Add(Me.Label1)
        Me.Controls.Add(Me.Stud_enroll_no)
        Me.Controls.Add(Me.year_combo)
        Me.Controls.Add(Me.semester_combo)
        Me.Name = "Form1"
        Me.Text = "Form1"
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents semester_combo As ComboBox
    Friend WithEvents Stud_enroll_no As TextBox
    Friend WithEvents Label1 As Label
    Friend WithEvents Label2 As Label
    Friend WithEvents year_combo As ComboBox
    Friend WithEvents Label3 As Label
    Friend WithEvents key As Button
    Friend WithEvents Label4 As Label
    Friend WithEvents subject_list As CheckedListBox
End Class
