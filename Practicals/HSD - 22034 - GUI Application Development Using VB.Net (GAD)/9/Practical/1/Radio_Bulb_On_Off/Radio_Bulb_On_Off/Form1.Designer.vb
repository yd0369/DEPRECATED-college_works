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
        Me.PictureBox1 = New System.Windows.Forms.PictureBox()
        Me.PictureBox2 = New System.Windows.Forms.PictureBox()
        Me.On_key = New System.Windows.Forms.RadioButton()
        Me.Off_key = New System.Windows.Forms.RadioButton()
        CType(Me.PictureBox1, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.PictureBox2, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'PictureBox1
        '
        Me.PictureBox1.BackColor = System.Drawing.SystemColors.ActiveCaptionText
        Me.PictureBox1.ImageLocation = "D:\VB. NET\9\Practical\1\Radio_Bulb_On_Off\On.png"
        Me.PictureBox1.Location = New System.Drawing.Point(22, 21)
        Me.PictureBox1.Name = "PictureBox1"
        Me.PictureBox1.Size = New System.Drawing.Size(214, 295)
        Me.PictureBox1.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage
        Me.PictureBox1.TabIndex = 0
        Me.PictureBox1.TabStop = False
        '
        'PictureBox2
        '
        Me.PictureBox2.BackColor = System.Drawing.SystemColors.ActiveCaptionText
        Me.PictureBox2.ImageLocation = "D:\VB. NET\9\Practical\1\Radio_Bulb_On_Off\Off.png"
        Me.PictureBox2.Location = New System.Drawing.Point(22, 21)
        Me.PictureBox2.Name = "PictureBox2"
        Me.PictureBox2.Size = New System.Drawing.Size(214, 295)
        Me.PictureBox2.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage
        Me.PictureBox2.TabIndex = 1
        Me.PictureBox2.TabStop = False
        '
        'On_key
        '
        Me.On_key.AutoSize = True
        Me.On_key.ForeColor = System.Drawing.SystemColors.ButtonHighlight
        Me.On_key.Location = New System.Drawing.Point(69, 322)
        Me.On_key.Name = "On_key"
        Me.On_key.Size = New System.Drawing.Size(41, 17)
        Me.On_key.TabIndex = 2
        Me.On_key.TabStop = True
        Me.On_key.Text = "ON"
        Me.On_key.UseVisualStyleBackColor = True
        '
        'Off_key
        '
        Me.Off_key.AutoSize = True
        Me.Off_key.ForeColor = System.Drawing.SystemColors.ControlLight
        Me.Off_key.Location = New System.Drawing.Point(145, 322)
        Me.Off_key.Name = "Off_key"
        Me.Off_key.Size = New System.Drawing.Size(45, 17)
        Me.Off_key.TabIndex = 3
        Me.Off_key.TabStop = True
        Me.Off_key.Text = "OFF"
        Me.Off_key.UseVisualStyleBackColor = True
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.BackColor = System.Drawing.SystemColors.ActiveCaptionText
        Me.ClientSize = New System.Drawing.Size(262, 353)
        Me.Controls.Add(Me.Off_key)
        Me.Controls.Add(Me.On_key)
        Me.Controls.Add(Me.PictureBox2)
        Me.Controls.Add(Me.PictureBox1)
        Me.Name = "Form1"
        Me.Text = "Form1"
        CType(Me.PictureBox1, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.PictureBox2, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents PictureBox1 As PictureBox
    Friend WithEvents PictureBox2 As PictureBox
    Friend WithEvents On_key As RadioButton
    Friend WithEvents Off_key As RadioButton
End Class
