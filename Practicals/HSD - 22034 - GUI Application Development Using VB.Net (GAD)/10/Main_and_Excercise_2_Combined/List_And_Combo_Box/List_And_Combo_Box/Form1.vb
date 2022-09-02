Imports System.Text.RegularExpressions
Public Class Form1
    Private Sub Stud_enroll_no_TextChanged(sender As Object, e As EventArgs) Handles Stud_enroll_no.TextChanged
        If (Regex.IsMatch(Stud_enroll_no.Text, "^[0-9]{12}$")) Then
            Stud_enroll_no.Enabled = False
            year_combo.Enabled = True
            year_combo.Items.Add("First Year")
            year_combo.Items.Add("Second Year")
            year_combo.Items.Add("Third Year")
            year_combo.Items.Add("Fourth Year")
        End If
    End Sub
    Private Sub year_combo_SelectedIndexChanged(sender As Object, e As EventArgs) Handles year_combo.SelectedIndexChanged
        year_combo.Enabled = False
        semester_combo.Enabled = True
        Select Case year_combo.SelectedIndex + 1
            Case 1
                semester_combo.Items.Add("First Semester")
                semester_combo.Items.Add("Second Semester")
            Case 2
                semester_combo.Items.Add("Third Semester")
                semester_combo.Items.Add("Fourth Semester")
            Case 3
                semester_combo.Items.Add("Fifth Semester")
                semester_combo.Items.Add("Sixth Semester")
            Case 4
                semester_combo.Items.Add("Seventh Semester")
                semester_combo.Items.Add("Eighth Semester")
        End Select
    End Sub
    Private Sub semester_combo_SelectedIndexChanged(sender As Object, e As EventArgs) Handles semester_combo.SelectedIndexChanged
        semester_combo.Enabled = False
        subject_list.Enabled = True
        Select Case year_combo.SelectedIndex + 1
            Case 1
                Select Case semester_combo.SelectedIndex + 1
                    Case 1
                        subject_list.Items.Add("1Y.1S.01")
                        subject_list.Items.Add("1Y.1S.02")
                        subject_list.Items.Add("1Y.1S.03")
                        subject_list.Items.Add("1Y.1S.04")
                    Case 2
                        subject_list.Items.Add("1Y.2S.01")
                        subject_list.Items.Add("1Y.2S.02")
                        subject_list.Items.Add("1Y.2S.03")
                        subject_list.Items.Add("1Y.2S.04")
                End Select
            Case 2
                Select Case semester_combo.SelectedIndex + 1
                    Case 1
                        subject_list.Items.Add("2Y.3S.01")
                        subject_list.Items.Add("2Y.3S.02")
                        subject_list.Items.Add("2Y.3S.03")
                        subject_list.Items.Add("2Y.3S.04")
                    Case 2
                        subject_list.Items.Add("2Y.4S.01")
                        subject_list.Items.Add("2Y.4S.02")
                        subject_list.Items.Add("2Y.4S.03")
                        subject_list.Items.Add("2Y.4S.04")
                End Select
            Case 3
                Select Case semester_combo.SelectedIndex + 1
                    Case 1
                        subject_list.Items.Add("3Y.5S.01")
                        subject_list.Items.Add("3Y.5S.02")
                        subject_list.Items.Add("3Y.5S.03")
                        subject_list.Items.Add("3Y.5S.04")
                    Case 2
                        subject_list.Items.Add("3Y.6S.01")
                        subject_list.Items.Add("3Y.6S.02")
                        subject_list.Items.Add("3Y.6S.03")
                        subject_list.Items.Add("3Y.6S.04")
                End Select
            Case 4
                Select Case semester_combo.SelectedIndex + 1
                    Case 1
                        subject_list.Items.Add("4Y.7S.01")
                        subject_list.Items.Add("4Y.7S.02")
                        subject_list.Items.Add("4Y.7S.03")
                        subject_list.Items.Add("4Y.7S.04")
                    Case 2
                        subject_list.Items.Add("4Y.8S.01")
                        subject_list.Items.Add("4Y.8S.02")
                        subject_list.Items.Add("4Y.8S.03")
                        subject_list.Items.Add("4Y.8S.04")
                End Select
        End Select
    End Sub

    Private Sub subject_list_SelectedIndexChanged(sender As Object, e As EventArgs) Handles subject_list.SelectedIndexChanged
        key.Enabled = True
    End Sub

    Private Sub key_Click(sender As Object, e As EventArgs) Handles key.Click
        key.Enabled = False
        subject_list.Enabled = False
        MsgBox((Stud_enroll_no.Text & " of " & year_combo.SelectedItem.ToString() & " : " &
             semester_combo.SelectedItem.ToString() & " has Registered."), MsgBoxStyle.OkOnly,
             "Confirmation Window")
    End Sub
End Class
