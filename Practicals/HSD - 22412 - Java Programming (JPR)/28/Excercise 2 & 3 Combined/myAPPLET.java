package com.yash_desai;
import java.awt.*;
import java.applet.*;
import java.util.Scanner;
public class myAPPLET extends Applet{
    public void paint(Graphics G) {
        Options(G);
        Scanner S = new Scanner(System.in);
        boolean X = true;
        while(X) {
            System.out.print("\n\nPress \"C\" to Continue " +
                    "or \"X\" to Exit : ");
            switch(S.next().charAt(0)) {
                case 'c':case 'C': { Options(G); break; }
                case 'x':case 'X': { X=false;    break; }
            }
        }
        System.out.println("Terminating the Program...");
    }
    void Options(Graphics G) {
        G.drawString("X",getWidth()/2,getHeight()/2);
        Scanner S = new Scanner(System.in);
        System.out.print(
                "\n1. AccessibleContext getAccessibleContext() :" +
                "\n\tGets the AccessibleContext associated with " +
                "this Applet." +
                "\n2. AppletContext getAppletContext() :" +
                "\n\tDetermines this applet's context, which " +
                "allows the applet to query and affect the " +
                "environment in which it runs." +
                "\n3. String getAppletInfo() :" +
                "\n\tReturns information about this applet." +
                "\n4. URL getCodeBase() :" +
                "\n\tGets the base URL." +
                "\n5. URL getDocumentBase() :" +
                "\n\tGets the URL of the document in which this " +
                "applet is embedded." +
                "\n6. Locale getLocale() :" +
                "\n\tGets the locale of the applet." +
                "\n7. String getParameter(String name) :" +
                "\n\tReturns the value of the named parameter in " +
                "the HTML tag." +
                "\n8. String[][] getParameterInfo() :" +
                "\n\tReturns information about the parameters that " +
                "are understood by this applet." +
                "\n9. void init() :" +
                "\n\tCalled by the browser or applet viewer to " +
                "inform this applet that it has been loaded into " +
                "the system." +
                "\n10. boolean isActive() :" +
                "\n\tDetermines if this applet is active." +
                "\n11. boolean isValidateRoot() :" +
                "\n\tIndicates if this container is a validate " +
                "root." +
                "\n12. void resize(Dimension d) :" +
                "\n\tRequests that this applet be resized." +
                "\n13. void resize(int width, int height)" +
                "\n\tRequests that this applet be resized." +
                "\n14. void showStatus(String msg) :" +
                "\n\tRequests that the argument string be " +
                "displayed in the \"status window\"." +
                "\n15. void stop() :" +
                "\n\tCalled by the browser or applet viewer " +
                "to inform this applet that it should stop " +
                "its execution." +
                "\n\nEnter the Option from the following : ");
        switch (S.nextByte()) {
            case 1 : Get_Accessible_Context(); break;
            case 2 : Get_Applet_Context(); break;
            case 3 : Get_Applet_Info(); break;
            case 4 : Get_Code_Base(); break;
            case 5 : Get_Document_Base(); break;
            case 6 : Get_Locale(); break;
            case 7 : Get_Parameter(); break;
            case 8 : Get_Parameter_Info(); break;
            case 9 : Init(); break;
            case 10 : Is_Active(); break;
            case 11 : Is_Validate_Root(); break;
            case 12 : Resize_1param(); break;
            case 13 : Resize_2param(); break;
            case 14 : Show_Status(); break;
            case 15 : Stop(); break;
            default : {
                System.out.println("Invalid Input");
            }
        }
    }
    void Get_Accessible_Context() {
        System.out.println("Accessible Context : "+getAccessibleContext());
    }
    void Get_Applet_Context() {
        System.out.println("Applet Context : "+getAppletContext());
    }
    void Get_Applet_Info() {
        System.out.println("Applet Info : "+getAppletInfo());
    }
    void Get_Code_Base() {
        System.out.println("Code Base : "+getCodeBase());
    }
    void Get_Document_Base() {
        System.out.println("Document Base : "+getDocumentBase());
    }
    void Get_Locale() {
        System.out.println("Locale : "+getLocale());
    }
    void Get_Parameter() {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter the Name : ");
        System.out.println("Parameters : "+getParameter(S.next()));
    }
    void Get_Parameter_Info() {
        System.out.println("Parameter Info : "+getParameterInfo());
    }
    void Init() {
        init();
        System.out.println("Applet Intialized...");
    }
    void Is_Active() {
        if(isActive())
            System.out.println("Applet is Active");
        else System.out.println("Applet is Inactive");
    }
    void Is_Validate_Root() {
        if(isValidateRoot())
            System.out.println("It is a Validate Root");
        else System.out.println("It isn't a Validate Root");
    }
    void Resize_1param() {
        Scanner S = new Scanner(System.in);
        Dimension D = getSize();
        System.out.println("Current Dimensions : "+
                "\nHeight : "+D.height +
                "\nWidth : "+D.width);
        System.out.print("Enter the New Height : ");
        D.height=S.nextInt();
        System.out.print("Enter the New Width : ");
        D.width=S.nextInt();
        resize(D);
        System.out.println("Applet Resized");
    }
    void Resize_2param() {
        Scanner S = new Scanner(System.in);
        Dimension D = getSize();
        System.out.println("Current Dimensions : "+
                "\nHeight : "+D.height +
                "\nWidth : "+D.width);
        System.out.print("Enter the New Height : ");
        int temp=S.nextInt();
        System.out.print("Enter the New Width : ");
        resize(S.nextInt(),temp);
        System.out.println("Applet Resized");
    }
    void Show_Status() {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter the Message : ");
        showStatus(S.next());
    }
    void Stop() {
        stop();
        System.out.println("Applet Execution Stopped");
    }
}
