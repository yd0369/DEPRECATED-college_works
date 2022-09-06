package com.yash_desai;
class bank {
    void Interest_Rates() {
        System.out.print("No Data Available");
    }
    String  Tenure() {
        return "No Data Available";
    }
}
class Axis_Bank extends bank {
    void Interest_Rates() {
        System.out.print("3.50% - 6.90%");
    }
    String Tenure() {
        return "7 days - 10 days";
    }
}
class Central_Bank_of_India extends bank {
    void Interest_Rates() {
        System.out.print("4.75% - 6.50%");
    }
}
class ICICI_Bank extends bank {
    String Tenure() {
        return "7 days - 10 days";
    }
}
class State_Bank_Of_India extends bank {
    void Interest_Rates() {
        System.out.print("5.75% - 6.75%");
    }
    String Tenure() {
        return "7 days - 10 days";
    }
}
class POP_Bank extends bank { }
public class Bank_Overriding {
    public static void main(String[] args) {
        System.out.println("Axis Bank : ");
        Data_Splash(new Axis_Bank());
        System.out.println("Central Bank of India : ");
        Data_Splash(new Central_Bank_of_India());
        System.out.println("ICICI Bank : ");
        Data_Splash(new ICICI_Bank());
        System.out.println("State Bank Of India : ");
        Data_Splash(new State_Bank_Of_India());
        System.out.println("POP Bank : ");
        Data_Splash(new POP_Bank());
    }
    static void Data_Splash(bank B) {
        System.out.print("Interest Rates : ");
        B.Interest_Rates();
        System.out.println("\nTenure         : "+B.Tenure()+"\n");
    }
}	