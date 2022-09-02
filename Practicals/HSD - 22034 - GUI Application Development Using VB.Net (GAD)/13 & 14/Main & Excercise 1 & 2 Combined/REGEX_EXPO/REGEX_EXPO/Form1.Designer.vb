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
        Me.components = New System.ComponentModel.Container()
        Me.Error_User_Name = New System.Windows.Forms.ErrorProvider(Me.components)
        Me.log_in_plane = New System.Windows.Forms.TabPage()
        Me.login_key = New System.Windows.Forms.Button()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.user_password_input = New System.Windows.Forms.TextBox()
        Me.user_name_input = New System.Windows.Forms.TextBox()
        Me.TabControl1 = New System.Windows.Forms.TabControl()
        Me.credentials_plane = New System.Windows.Forms.TabPage()
        Me.credentials_key = New System.Windows.Forms.Button()
        Me.Label3 = New System.Windows.Forms.Label()
        Me.Label4 = New System.Windows.Forms.Label()
        Me.email_input = New System.Windows.Forms.TextBox()
        Me.phone_number_input = New System.Windows.Forms.TextBox()
        Me.Error_Password = New System.Windows.Forms.ErrorProvider(Me.components)
        Me.Error_Phone_Number = New System.Windows.Forms.ErrorProvider(Me.components)
        Me.Error_Email_ID = New System.Windows.Forms.ErrorProvider(Me.components)
        CType(Me.Error_User_Name, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.log_in_plane.SuspendLayout()
        Me.TabControl1.SuspendLayout()
        Me.credentials_plane.SuspendLayout()
        CType(Me.Error_Password, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.Error_Phone_Number, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.Error_Email_ID, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'Error_User_Name
        '
        Me.Error_User_Name.ContainerControl = Me
        '
        'log_in_plane
        '
        Me.log_in_plane.Controls.Add(Me.login_key)
        Me.log_in_plane.Controls.Add(Me.Label2)
        Me.log_in_plane.Controls.Add(Me.Label1)
        Me.log_in_plane.Controls.Add(Me.user_password_input)
        Me.log_in_plane.Controls.Add(Me.user_name_input)
        Me.Error_User_Name.SetIconAlignment(Me.log_in_plane, System.Windows.Forms.ErrorIconAlignment.TopRight)
        Me.log_in_plane.Location = New System.Drawing.Point(4, 22)
        Me.log_in_plane.Name = "log_in_plane"
        Me.log_in_plane.Padding = New System.Windows.Forms.Padding(3)
        Me.log_in_plane.Size = New System.Drawing.Size(305, 185)
        Me.log_in_plane.TabIndex = 0
        Me.log_in_plane.Text = "Log In"
        Me.log_in_plane.UseVisualStyleBackColor = True
        '
        'login_key
        '
        Me.login_key.Location = New System.Drawing.Point(61, 113)
        Me.login_key.Name = "login_key"
        Me.login_key.Size = New System.Drawing.Size(168, 23)
        Me.login_key.TabIndex = 3
        Me.login_key.Text = "Sign in >>>"
        Me.login_key.UseVisualStyleBackColor = True
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Location = New System.Drawing.Point(58, 77)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(65, 13)
        Me.Label2.TabIndex = 2
        Me.Label2.Text = "Password  : "
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Location = New System.Drawing.Point(54, 51)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(69, 13)
        Me.Label1.TabIndex = 2
        Me.Label1.Text = "User Name : "
        '
        'user_password_input
        '
        Me.user_password_input.Location = New System.Drawing.Point(129, 74)
        Me.user_password_input.Name = "user_password_input"
        Me.user_password_input.Size = New System.Drawing.Size(100, 20)
        Me.user_password_input.TabIndex = 0
        '
        'user_name_input
        '
        Me.user_name_input.Location = New System.Drawing.Point(129, 48)
        Me.user_name_input.Name = "user_name_input"
        Me.user_name_input.Size = New System.Drawing.Size(100, 20)
        Me.user_name_input.TabIndex = 0
        '
        'TabControl1
        '
        Me.TabControl1.Controls.Add(Me.log_in_plane)
        Me.TabControl1.Controls.Add(Me.credentials_plane)
        Me.TabControl1.Location = New System.Drawing.Point(0, 0)
        Me.TabControl1.Name = "TabControl1"
        Me.TabControl1.SelectedIndex = 0
        Me.TabControl1.Size = New System.Drawing.Size(313, 211)
        Me.TabControl1.TabIndex = 0
        '
        'credentials_plane
        '
        Me.credentials_plane.Controls.Add(Me.credentials_key)
        Me.credentials_plane.Controls.Add(Me.Label3)
        Me.credentials_plane.Controls.Add(Me.Label4)
        Me.credentials_plane.Controls.Add(Me.email_input)
        Me.credentials_plane.Controls.Add(Me.phone_number_input)
        Me.credentials_plane.Location = New System.Drawing.Point(4, 22)
        Me.credentials_plane.Name = "credentials_plane"
        Me.credentials_plane.Padding = New System.Windows.Forms.Padding(3)
        Me.credentials_plane.Size = New System.Drawing.Size(305, 185)
        Me.credentials_plane.TabIndex = 1
        Me.credentials_plane.Text = "Fill Credentials"
        Me.credentials_plane.UseVisualStyleBackColor = True
        '
        'credentials_key
        '
        Me.credentials_key.Location = New System.Drawing.Point(69, 116)
        Me.credentials_key.Name = "credentials_key"
        Me.credentials_key.Size = New System.Drawing.Size(168, 23)
        Me.credentials_key.TabIndex = 8
        Me.credentials_key.Text = "Save Details"
        Me.credentials_key.UseVisualStyleBackColor = True
        '
        'Label3
        '
        Me.Label3.AutoSize = True
        Me.Label3.Location = New System.Drawing.Point(8, 77)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(68, 13)
        Me.Label3.TabIndex = 6
        Me.Label3.Text = "E - Mail ID  : "
        '
        'Label4
        '
        Me.Label4.AutoSize = True
        Me.Label4.Location = New System.Drawing.Point(8, 51)
        Me.Label4.Name = "Label4"
        Me.Label4.Size = New System.Drawing.Size(87, 13)
        Me.Label4.TabIndex = 7
        Me.Label4.Text = "Phone Number : "
        '
        'email_input
        '
        Me.email_input.Location = New System.Drawing.Point(82, 74)
        Me.email_input.Name = "email_input"
        Me.email_input.Size = New System.Drawing.Size(196, 20)
        Me.email_input.TabIndex = 4
        '
        'phone_number_input
        '
        Me.phone_number_input.Location = New System.Drawing.Point(101, 48)
        Me.phone_number_input.Name = "phone_number_input"
        Me.phone_number_input.Size = New System.Drawing.Size(177, 20)
        Me.phone_number_input.TabIndex = 5
        '
        'Error_Password
        '
        Me.Error_Password.ContainerControl = Me
        '
        'Error_Phone_Number
        '
        Me.Error_Phone_Number.ContainerControl = Me
        '
        'Error_Email_ID
        '
        Me.Error_Email_ID.ContainerControl = Me
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(314, 214)
        Me.Controls.Add(Me.TabControl1)
        Me.Name = "Form1"
        Me.Text = "Form1"
        CType(Me.Error_User_Name, System.ComponentModel.ISupportInitialize).EndInit()
        Me.log_in_plane.ResumeLayout(False)
        Me.log_in_plane.PerformLayout()
        Me.TabControl1.ResumeLayout(False)
        Me.credentials_plane.ResumeLayout(False)
        Me.credentials_plane.PerformLayout()
        CType(Me.Error_Password, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.Error_Phone_Number, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.Error_Email_ID, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)

    End Sub

    Friend WithEvents Error_User_Name As ErrorProvider
    Friend WithEvents TabControl1 As TabControl
    Friend WithEvents log_in_plane As TabPage
    Friend WithEvents credentials_plane As TabPage
    Friend WithEvents login_key As Button
    Friend WithEvents Label2 As Label
    Friend WithEvents Label1 As Label
    Friend WithEvents user_password_input As TextBox
    Friend WithEvents user_name_input As TextBox
    Friend WithEvents credentials_key As Button
    Friend WithEvents Label3 As Label
    Friend WithEvents Label4 As Label
    Friend WithEvents email_input As TextBox
    Friend WithEvents phone_number_input As TextBox
    Friend WithEvents Error_Password As ErrorProvider
    Friend WithEvents Error_Phone_Number As ErrorProvider
    Friend WithEvents Error_Email_ID As ErrorProvider
End Class
