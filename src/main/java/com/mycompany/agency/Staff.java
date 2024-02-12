package com.mycompany.agency;




public class Staff
{
    private StaffMember[] staffList;

    //-----------------------------------------------------------------
    //  Constructor: Sets up the list of staff members.
    //-----------------------------------------------------------------
    public Staff()
    {
        staffList = new StaffMember[6];

        // TODO 1: Add 6 emploees to the staffList
        staffList[0] = new Executive("Jeffrey Bezos","25 New Tree Line","123-456-7890", "000-000-1234",200.0);
        ((Executive)staffList[0]).awardBonus(500.00);
        staffList[1] = new StaffMember("Shahin","123 apple ave","516-123-3453");
        staffList[2] = new Intern("Radin","423 apple ave","123-454-5342","000-000-2232",0.0);
        staffList[3] = new TempEmploee("Russel Adler","232 banana street","544-423-4232","111-222-3333",100.0);
        ((TempEmploee)staffList[3]).addHours(40);
    }

    //-----------------------------------------------------------------
    //  Pays all staff members.
    //-----------------------------------------------------------------
    public void payday ()
    {
        double amount;

        for (int count=0; count < staffList.length; count++)
        {
            System.out.println(staffList[count]);

            amount = staffList[count].pay();  // polymorphic

            if (amount == 0.0)
                System.out.println("Thanks!");
            else
                System.out.println("Paid: " + amount);

            System.out.println("-----------------------------------");
        }
    }
}
