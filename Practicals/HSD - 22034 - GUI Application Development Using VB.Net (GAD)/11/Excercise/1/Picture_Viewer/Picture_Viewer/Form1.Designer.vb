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
        Me.image_box = New System.Windows.Forms.PictureBox()
        Me.ToolStrip1 = New System.Windows.Forms.ToolStrip()
        Me.load_key = New System.Windows.Forms.ToolStripLabel()
        CType(Me.image_box, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.ToolStrip1.SuspendLayout()
        Me.SuspendLayout()
        '
        'image_box
        '
        Me.image_box.Location = New System.Drawing.Point(12, 28)
        Me.image_box.Name = "image_box"
        Me.image_box.Size = New System.Drawing.Size(407, 299)
        Me.image_box.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage
        Me.image_box.TabIndex = 0
        Me.image_box.TabStop = False
        '
        'ToolStrip1
        '
        Me.ToolStrip1.Items.AddRange(New System.Windows.Forms.ToolStripItem() {Me.load_key})
        Me.ToolStrip1.Location = New System.Drawing.Point(0, 0)
        Me.ToolStrip1.Name = "ToolStrip1"
        Me.ToolStrip1.Size = New System.Drawing.Size(431, 25)
        Me.ToolStrip1.TabIndex = 1
        Me.ToolStrip1.Text = "ToolStrip1"
        '
        'load_key
        '
        Me.load_key.Name = "load_key"
        Me.load_key.Size = New System.Drawing.Size(33, 22)
        Me.load_key.Text = "Load"
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(431, 339)
        Me.Controls.Add(Me.ToolStrip1)
        Me.Controls.Add(Me.image_box)
        Me.Name = "Form1"
        Me.Text = "Form1"
        CType(Me.image_box, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ToolStrip1.ResumeLayout(False)
        Me.ToolStrip1.PerformLayout()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents image_box As PictureBox
    Friend WithEvents ToolStrip1 As ToolStrip
    Friend WithEvents load_key As ToolStripLabel
End Class
