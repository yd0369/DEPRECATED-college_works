Public Class Form1
    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        emp_id_combo.Items.Add("AZ425PO")
        emp_id_combo.Items.Add("TY789RT")
        emp_id_combo.Items.Add("GT980TI")
    End Sub
    Private Sub key_Click(sender As Object, e As EventArgs) Handles key.Click
        Dim Emp As Employee = New Employee()
        Dim EMP_ID As String = emp_id_combo.SelectedItem
        Select Case True
            Case key1.Checked
                Emp.Display(EMP_ID, key1.Text)
            Case key2.Checked
                Emp.Display(EMP_ID, key2.Text)
            Case key3.Checked
                Emp.Display(EMP_ID, key3.Text)
            Case key4.Checked
                Emp.Display(EMP_ID, key4.Text)
            Case key5.Checked
                Emp.Display(EMP_ID, key5.Text)
            Case key6.Checked
                Emp.Display(EMP_ID, key6.Text)
            Case key7.Checked
                Emp.Display(EMP_ID, key7.Text)
            Case key8.Checked
                Emp.Display(EMP_ID, "NULL")
        End Select
    End Sub
End Class

Class JOB
    Public Overridable Sub DisplayMSG(EMPID, JOB)
        MsgBox(EMPID & " is currently doesn't Have any Work")
    End Sub
End Class
Class Employee
    Inherits JOB
    Public Overrides Sub DisplayMSG(EMPID, JOB)
        MsgBox(EMPID & " is working on/in " & JOB)
    End Sub
    Public Sub Display(EMPID, JOB)
        If (JOB = "NULL") Then
            MyBase.DisplayMSG(EMPID, JOB)
        Else
            DisplayMSG(EMPID, JOB)
        End If
    End Sub
End Class