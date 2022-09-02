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
        Dim resources As System.ComponentModel.ComponentResourceManager = New System.ComponentModel.ComponentResourceManager(GetType(Form1))
        Me.ToolStrip1 = New System.Windows.Forms.ToolStrip()
        Me.ToolStripDropDownButton1 = New System.Windows.Forms.ToolStripDropDownButton()
        Me.ToolStripDropDownButton2 = New System.Windows.Forms.ToolStripDropDownButton()
        Me.form_red_key = New System.Windows.Forms.ToolStripMenuItem()
        Me.form_green_key = New System.Windows.Forms.ToolStripMenuItem()
        Me.form_blue_key = New System.Windows.Forms.ToolStripMenuItem()
        Me.panel_red_key = New System.Windows.Forms.ToolStripMenuItem()
        Me.panel_green_key = New System.Windows.Forms.ToolStripMenuItem()
        Me.panel_blue_key = New System.Windows.Forms.ToolStripMenuItem()
        Me.Panel = New System.Windows.Forms.Panel()
        Me.ToolStrip1.SuspendLayout()
        Me.SuspendLayout()
        '
        'ToolStrip1
        '
        Me.ToolStrip1.Items.AddRange(New System.Windows.Forms.ToolStripItem() {Me.ToolStripDropDownButton1, Me.ToolStripDropDownButton2})
        Me.ToolStrip1.Location = New System.Drawing.Point(0, 0)
        Me.ToolStrip1.Name = "ToolStrip1"
        Me.ToolStrip1.Size = New System.Drawing.Size(389, 25)
        Me.ToolStrip1.TabIndex = 0
        Me.ToolStrip1.Text = "ToolStrip1"
        '
        'ToolStripDropDownButton1
        '
        Me.ToolStripDropDownButton1.DisplayStyle = System.Windows.Forms.ToolStripItemDisplayStyle.Image
        Me.ToolStripDropDownButton1.DropDownItems.AddRange(New System.Windows.Forms.ToolStripItem() {Me.form_red_key, Me.form_green_key, Me.form_blue_key})
        Me.ToolStripDropDownButton1.Image = CType(resources.GetObject("ToolStripDropDownButton1.Image"), System.Drawing.Image)
        Me.ToolStripDropDownButton1.ImageTransparentColor = System.Drawing.Color.Magenta
        Me.ToolStripDropDownButton1.Name = "ToolStripDropDownButton1"
        Me.ToolStripDropDownButton1.Size = New System.Drawing.Size(29, 22)
        Me.ToolStripDropDownButton1.Text = "ToolStripDropDownButton1"
        '
        'ToolStripDropDownButton2
        '
        Me.ToolStripDropDownButton2.DisplayStyle = System.Windows.Forms.ToolStripItemDisplayStyle.Image
        Me.ToolStripDropDownButton2.DropDownItems.AddRange(New System.Windows.Forms.ToolStripItem() {Me.panel_red_key, Me.panel_green_key, Me.panel_blue_key})
        Me.ToolStripDropDownButton2.Image = CType(resources.GetObject("ToolStripDropDownButton2.Image"), System.Drawing.Image)
        Me.ToolStripDropDownButton2.ImageTransparentColor = System.Drawing.Color.Magenta
        Me.ToolStripDropDownButton2.Name = "ToolStripDropDownButton2"
        Me.ToolStripDropDownButton2.Size = New System.Drawing.Size(29, 22)
        Me.ToolStripDropDownButton2.Text = "ToolStripDropDownButton2"
        '
        'form_red_key
        '
        Me.form_red_key.Name = "form_red_key"
        Me.form_red_key.Size = New System.Drawing.Size(110, 22)
        Me.form_red_key.Text = "RED"
        '
        'form_green_key
        '
        Me.form_green_key.Name = "form_green_key"
        Me.form_green_key.Size = New System.Drawing.Size(110, 22)
        Me.form_green_key.Text = "GREEN"
        '
        'form_blue_key
        '
        Me.form_blue_key.Name = "form_blue_key"
        Me.form_blue_key.Size = New System.Drawing.Size(110, 22)
        Me.form_blue_key.Text = "BLUE"
        '
        'panel_red_key
        '
        Me.panel_red_key.Name = "panel_red_key"
        Me.panel_red_key.Size = New System.Drawing.Size(110, 22)
        Me.panel_red_key.Text = "RED"
        '
        'panel_green_key
        '
        Me.panel_green_key.Name = "panel_green_key"
        Me.panel_green_key.Size = New System.Drawing.Size(110, 22)
        Me.panel_green_key.Text = "GREEN"
        '
        'panel_blue_key
        '
        Me.panel_blue_key.Name = "panel_blue_key"
        Me.panel_blue_key.Size = New System.Drawing.Size(110, 22)
        Me.panel_blue_key.Text = "BLUE"
        '
        'Panel
        '
        Me.Panel.Location = New System.Drawing.Point(24, 47)
        Me.Panel.Name = "Panel"
        Me.Panel.Size = New System.Drawing.Size(339, 192)
        Me.Panel.TabIndex = 1
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(389, 264)
        Me.Controls.Add(Me.Panel)
        Me.Controls.Add(Me.ToolStrip1)
        Me.Name = "Form1"
        Me.Text = "Form1"
        Me.ToolStrip1.ResumeLayout(False)
        Me.ToolStrip1.PerformLayout()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents ToolStrip1 As ToolStrip
    Friend WithEvents ToolStripDropDownButton1 As ToolStripDropDownButton
    Friend WithEvents form_red_key As ToolStripMenuItem
    Friend WithEvents form_green_key As ToolStripMenuItem
    Friend WithEvents form_blue_key As ToolStripMenuItem
    Friend WithEvents ToolStripDropDownButton2 As ToolStripDropDownButton
    Friend WithEvents panel_red_key As ToolStripMenuItem
    Friend WithEvents panel_green_key As ToolStripMenuItem
    Friend WithEvents panel_blue_key As ToolStripMenuItem
    Friend WithEvents Panel As Panel
End Class
