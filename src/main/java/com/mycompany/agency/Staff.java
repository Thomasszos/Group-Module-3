package com.mycompany.agency;




public class Staff
{
    private final StaffMember[] staffList;

    //-----------------------------------------------------------------
    //  Constructor: Sets up the list of staff members.
    //-----------------------------------------------------------------
    public Staff()
    {
        staffList = new StaffMember[6];

        // TODO 1: Add 6 emploees to the staffList
        staffList[0] = new Executive("Bob", "New York City", "516-555-555", "123-45-6789", 120.00);
        staffList[1] = new StaffEmployee("Mary", "Atlanta", "911-592-4774","098-76-5432", 90.00 );
        staffList[2] = new Intern("Rachel", "Farmingdale", "891-758-9173");
        staffList[3] = new TempEmploee("Mark", "London", "516-010-7634", "824-76-2745", 60.00);
        staffList[4] = new Executive("Randy", "Salt Lake City", "516-444-631", "321-54-9876", 200.00);
        staffList[5] = new StaffEmployee("Brenda", "Las Vegas", "732-7563-9274", "892-52-7826", 95.00);

        ((Executive)staffList[0]).awardBonus(500.00);

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
