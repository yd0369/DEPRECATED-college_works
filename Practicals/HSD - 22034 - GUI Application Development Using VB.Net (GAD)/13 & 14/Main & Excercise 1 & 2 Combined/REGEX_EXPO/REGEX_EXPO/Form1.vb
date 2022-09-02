Imports System.Text.RegularExpressions
Public Class Form1
    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        credentials_plane.Enabled = False
    End Sub
    Private Sub login_key_Click(sender As Object, e As EventArgs) Handles login_key.Click
        Dim Info_Valid1 As Boolean = False
        Dim Info_Valid2 As Boolean = False
        If (Regex.IsMatch(user_name_input.Text, "yash_desai_3") = False) Then
            Error_User_Name.SetError(user_name_input, "Invalid User Name")
        Else
            Error_User_Name.SetError(user_name_input, "")
            Info_Valid1 = True
        End If
        If (Regex.IsMatch(user_password_input.Text, "POP") = False) Then
            Error_Password.SetError(user_password_input, "Invalid Password")
        Else
            Error_Password.SetError(user_password_input, "")
            Info_Valid2 = True
        End If
        If (Info_Valid1 = True And Info_Valid2 = True) Then
            MsgBox("Access Granted")
            credentials_plane.Enabled = True
            log_in_plane.Enabled = False
            credentials_plane.Select()
        Else
            MsgBox("Fill the valid information")
        End If
    End Sub

    Private Sub credentials_key_Click(sender As Object, e As EventArgs) Handles credentials_key.Click
        Dim Info_Valid1 As Boolean = False
        Dim Info_Valid2 As Boolean = False
        If (Regex.IsMatch(phone_number_input.Text, "[0-9]{10}") = False) Then
            Error_Phone_Number.SetError(phone_number_input, "Invalid Phone Number")
        Else
            Error_Phone_Number.SetError(phone_number_input, "")
            Info_Valid1 = True
        End If
        If (Regex.IsMatch(email_input.Text, "^[_a-z0-9]+@[a-z0-9]+(.[a-z]{2,4})$") = False) Then
            Error_Email_ID.SetError(email_input, "Invalid Email ID")
        Else
            Error_Email_ID.SetError(email_input, "")
            Info_Valid2 = True
        End If
        If (Info_Valid1 = True And Info_Valid2 = True) Then
            MsgBox("Saving Details...")
        Else
            MsgBox("Fill the valid information")
        End If
    End Sub
End Class
