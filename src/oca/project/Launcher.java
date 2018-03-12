package oca.project;

import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 * Main class that creates all employees and specifies their managers
 */
public class Launcher {
        

    public static void main(String[] args) throws ParseException {
        ArrayList<Person> personList = new ArrayList<>();   //creating the ArrayList to store person objects
        
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");    //setting formatter
        
        //creating person objects and setting their properties
        CEO JamesMint = new CEO();
        JamesMint.setEmpFirstName("James");
        JamesMint.setEmpLastName("Mint");
        JamesMint.setDateOfBirth(formatter.parse("28/12/1977"));
        JamesMint.setStartDate(formatter.parse("10/01/2010"));
        JamesMint.setTimePeriod(TimePeriod.MONTHLY);
        
        AdministrationManager BillJohns = new AdministrationManager(JamesMint);
        BillJohns.setEmpFirstName("Bill");
        BillJohns.setEmpLastName("Johns");
        BillJohns.setDateOfBirth(formatter.parse("13/04/1981"));
        BillJohns.setStartDate(formatter.parse("10/05/2012"));
        BillJohns.setTimePeriod(TimePeriod.MONTHLY);
        
        BranchManager KateHudson = new BranchManager(BillJohns);
        KateHudson.setEmpFirstName("Kate");
        KateHudson.setEmpLastName("Hudson");
        KateHudson.setDateOfBirth(formatter.parse("13/07/1981"));
        KateHudson.setStartDate(formatter.parse("11/03/2013"));
        KateHudson.setTimePeriod(TimePeriod.MONTHLY);
                
                
        BranchManager ScarletGreen = new BranchManager(BillJohns);
        ScarletGreen.setEmpFirstName("Scarlet");
        ScarletGreen.setEmpLastName("Green");
        ScarletGreen.setDateOfBirth(formatter.parse("20/03/1980"));
        ScarletGreen.setStartDate(formatter.parse("10/05/2013"));
        ScarletGreen.setTimePeriod(TimePeriod.MONTHLY);
        
        BranchManager AmandaGreen = new BranchManager(BillJohns);
        AmandaGreen.setEmpFirstName("Amanda");
        AmandaGreen.setEmpLastName("Green");
        AmandaGreen.setDateOfBirth(formatter.parse("05/04/1979"));
        AmandaGreen.setStartDate(formatter.parse("14/10/2014"));
        AmandaGreen.setTimePeriod(TimePeriod.MONTHLY);
        
        SalesManager MichaelBrown = new SalesManager(JamesMint);
        MichaelBrown.setEmpFirstName("Michael");
        MichaelBrown.setEmpLastName("Brown");
        MichaelBrown.setDateOfBirth(formatter.parse("25/12/1985"));
        MichaelBrown.setStartDate(formatter.parse("21/07/2012"));
        MichaelBrown.setTimePeriod(TimePeriod.FORTNIGHTLY);
        
        FinancialAdministrator EricWhite = new FinancialAdministrator(JamesMint);
        EricWhite.setEmpFirstName("Eric");
        EricWhite.setEmpLastName("White");
        EricWhite.setDateOfBirth(formatter.parse("21/05/1984"));
        EricWhite.setStartDate(formatter.parse("10/04/2011"));
        EricWhite.setTimePeriod(TimePeriod.FORTNIGHTLY);
        
        HROfficer JuliaSmith = new HROfficer(JamesMint);
        JuliaSmith.setEmpFirstName("Julia");
        JuliaSmith.setEmpLastName("Smith");
        JuliaSmith.setDateOfBirth(formatter.parse("17/02/1973"));
        JuliaSmith.setStartDate(formatter.parse("13/06/2010"));
        JuliaSmith.setTimePeriod(TimePeriod.MONTHLY);
        
        ProjectManager VictoriaBell = new ProjectManager(AmandaGreen);
        VictoriaBell.setEmpFirstName("Victoria");
        VictoriaBell.setEmpLastName("Bell");
        VictoriaBell.setDateOfBirth(formatter.parse("11/01/1978"));
        VictoriaBell.setStartDate(formatter.parse("30/04/2013"));
        VictoriaBell.setTimePeriod(TimePeriod.FORTNIGHTLY);
        
        ProjectManager CharlotteHond = new ProjectManager(ScarletGreen);
        CharlotteHond.setEmpFirstName("Charlotte");
        CharlotteHond.setEmpLastName("Hond");
        CharlotteHond.setDateOfBirth(formatter.parse("01/07/1988"));
        CharlotteHond.setStartDate(formatter.parse("28/02/2012"));
        CharlotteHond.setTimePeriod(TimePeriod.FORTNIGHTLY);
        
        ProjectManager ChristineBennet = new ProjectManager(ScarletGreen);
        ChristineBennet.setEmpFirstName("Christine");
        ChristineBennet.setEmpLastName("Bennet");
        ChristineBennet.setDateOfBirth(formatter.parse("16/06/1982"));
        ChristineBennet.setStartDate(formatter.parse("11/06/2011"));
        ChristineBennet.setTimePeriod(TimePeriod.FORTNIGHTLY);
        
        SeniorProgramDeveloper JohnNorton = new SeniorProgramDeveloper(VictoriaBell);
        JohnNorton.setEmpFirstName("John");
        JohnNorton.setEmpLastName("Norton");
        JohnNorton.setDateOfBirth(formatter.parse("17/07/1980"));
        JohnNorton.setStartDate(formatter.parse("10/09/2010"));
        JohnNorton.setTimePeriod(TimePeriod.MONTHLY);
        
        SeniorProgramDeveloper AshleySimpson = new SeniorProgramDeveloper(CharlotteHond);
        AshleySimpson.setEmpFirstName("Ashley");
        AshleySimpson.setEmpLastName("Simpson");
        AshleySimpson.setDateOfBirth(formatter.parse("12/05/1984"));
        AshleySimpson.setStartDate(formatter.parse("15/06/2010"));
        AshleySimpson.setTimePeriod(TimePeriod.MONTHLY);
        
        ProgramDeveloper AlexDillon = new ProgramDeveloper(JohnNorton);
        AlexDillon.setEmpFirstName("Alex");
        AlexDillon.setEmpLastName("Dillon");
        AlexDillon.setDateOfBirth(formatter.parse("10/03/1989"));
        AlexDillon.setStartDate(formatter.parse("14/09/2014"));
        AlexDillon.setTimePeriod(TimePeriod.FORTNIGHTLY);
        
        ProgramDeveloper AndrewSampson = new ProgramDeveloper(AshleySimpson);
        AndrewSampson.setEmpFirstName("Andrew");
        AndrewSampson.setEmpLastName("Sampson");
        AndrewSampson.setDateOfBirth(formatter.parse("09/04/1984"));
        AndrewSampson.setStartDate(formatter.parse("04/07/2010"));
        AndrewSampson.setTimePeriod(TimePeriod.FORTNIGHTLY);
        
        ProgramDeveloper DavidGalloway = new ProgramDeveloper(ChristineBennet);
        DavidGalloway.setEmpFirstName("David");
        DavidGalloway.setEmpLastName("Galloway");
        DavidGalloway.setDateOfBirth(formatter.parse("06/12/1981"));
        DavidGalloway.setStartDate(formatter.parse("05/11/2013"));
        DavidGalloway.setTimePeriod(TimePeriod.MONTHLY);
        
        
        Receptionist PeterGordon = new Receptionist(JuliaSmith);
        PeterGordon.setEmpFirstName("Peter");
        PeterGordon.setEmpLastName("Gordon");
        PeterGordon.setDateOfBirth(formatter.parse("30/09/1983"));
        PeterGordon.setStartDate(formatter.parse("10/05/2010"));
        PeterGordon.setTimePeriod(TimePeriod.FORTNIGHTLY);
        
        SystemAdministrator JoanneDowman = new SystemAdministrator(KateHudson);
        JoanneDowman.setEmpFirstName("Joanne");
        JoanneDowman.setEmpLastName("Dowman");
        JoanneDowman.setDateOfBirth(formatter.parse("13/12/1980"));
        JoanneDowman.setStartDate(formatter.parse("07/07/2014"));
        JoanneDowman.setTimePeriod(TimePeriod.FORTNIGHTLY);
        
        SystemAdministrator AndrewBlack = new SystemAdministrator(AmandaGreen);
        AndrewBlack.setEmpFirstName("Andrew");
        AndrewBlack.setEmpLastName("Black");
        AndrewBlack.setDateOfBirth(formatter.parse("15/04/1976"));
        AndrewBlack.setStartDate(formatter.parse("04/05/2012"));
        AndrewBlack.setTimePeriod(TimePeriod.MONTHLY);
        
        SystemAdministrator MichaelPerry = new SystemAdministrator(ScarletGreen);
        MichaelPerry.setEmpFirstName("Michael");
        MichaelPerry.setEmpLastName("Perry");
        MichaelPerry.setDateOfBirth(formatter.parse("12/11/1977"));
        MichaelPerry.setStartDate(formatter.parse("01/03/2014"));
        MichaelPerry.setTimePeriod(TimePeriod.FORTNIGHTLY);
        
        SystemAnalyst AndrewBlank = new SystemAnalyst(VictoriaBell);
        AndrewBlank.setEmpFirstName("Andrew");
        AndrewBlank.setEmpLastName("Blank");
        AndrewBlank.setDateOfBirth(formatter.parse("15/09/1981"));
        AndrewBlank.setStartDate(formatter.parse("19/08/2014"));
        AndrewBlank.setTimePeriod(TimePeriod.MONTHLY);
        
        SystemAnalyst CarolWhite = new SystemAnalyst(CharlotteHond);
        CarolWhite.setEmpFirstName("Carol");
        CarolWhite.setEmpLastName("White");
        CarolWhite.setDateOfBirth(formatter.parse("20/10/1975"));
        CarolWhite.setStartDate(formatter.parse("10/01/2014"));
        CarolWhite.setTimePeriod(TimePeriod.MONTHLY);
        
        SystemAnalyst BradTurner = new SystemAnalyst(ChristineBennet);
        BradTurner.setEmpFirstName("Brad");
        BradTurner.setEmpLastName("Turner");
        BradTurner.setDateOfBirth(formatter.parse("22/11/1988"));
        BradTurner.setStartDate(formatter.parse("26/05/2014"));
        BradTurner.setTimePeriod(TimePeriod.MONTHLY);
        
        SalesConsultant HelenChan = new SalesConsultant(MichaelBrown);
        HelenChan.setEmpFirstName("Helen");
        HelenChan.setEmpLastName("Chan");
        HelenChan.setDateOfBirth(formatter.parse("11/01/1991"));
        
        Tester JamesCarol = new Tester(VictoriaBell);
        JamesCarol.setEmpFirstName("James");
        JamesCarol.setEmpLastName("Carol");
        JamesCarol.setDateOfBirth(formatter.parse("24/03/1978"));
        
        Tester ElenaTang = new Tester(CharlotteHond);
        ElenaTang.setEmpFirstName("Elena");
        ElenaTang.setEmpLastName("Tang");
        ElenaTang.setDateOfBirth(formatter.parse("11/02/1969"));
        
        Tester TessaGreen = new Tester(CharlotteHond);
        TessaGreen.setEmpFirstName("Tessa");
        TessaGreen.setEmpLastName("Green");
        TessaGreen.setDateOfBirth(formatter.parse("31/10/1985"));
        
        Tester DavidChand = new Tester(ChristineBennet);
        DavidChand.setEmpFirstName("David");
        DavidChand.setEmpLastName("Chand");
        DavidChand.setDateOfBirth(formatter.parse("11/04/1973"));
        
        //Adding person objects to ArrayList<Person>
        personList.add(BillJohns);
        personList.add(KateHudson);
        personList.add(ScarletGreen);
        personList.add(AmandaGreen);
        personList.add(JamesMint);
        personList.add(EricWhite);
        personList.add(JuliaSmith);
        personList.add(AlexDillon);
        personList.add(AndrewSampson);
        personList.add(DavidGalloway);
        personList.add(VictoriaBell);
        personList.add(CharlotteHond);
        personList.add(ChristineBennet);
        personList.add(PeterGordon);
        personList.add(HelenChan);
        personList.add(MichaelBrown);
        personList.add(JohnNorton);
        personList.add(AshleySimpson);
        personList.add(AndrewBlack);
        personList.add(JoanneDowman);
        personList.add(MichaelPerry);
        personList.add(AndrewBlank);
        personList.add(CarolWhite);
        personList.add(BradTurner);
        personList.add(JamesCarol);
        personList.add(ElenaTang);
        personList.add(TessaGreen);
        personList.add(DavidChand);
        
        //Adding respective subordinates to the Manager's subordinate list
        ArrayList<ISubordinate> jmSubordinateList = new ArrayList<>();
        jmSubordinateList.add(BillJohns);
        jmSubordinateList.add(EricWhite);
        jmSubordinateList.add(JuliaSmith);
        jmSubordinateList.add(MichaelBrown);
        JamesMint.setSubordinateList(jmSubordinateList);
        
        ArrayList<ISubordinate> bjSubordinateList = new ArrayList<>();
        bjSubordinateList.add(KateHudson);
        bjSubordinateList.add(ScarletGreen);
        bjSubordinateList.add(AmandaGreen);
        BillJohns.setSubordinateList(bjSubordinateList);
        
        ArrayList<ISubordinate> jnSubordinateList = new ArrayList<>();
        jnSubordinateList.add(AlexDillon);
        JohnNorton.setSubordinateList(jnSubordinateList);
        
        ArrayList<ISubordinate> asSubordinateList = new ArrayList<>();
        asSubordinateList.add(AndrewSampson);
        AshleySimpson.setSubordinateList(asSubordinateList);
        
        ArrayList<ISubordinate> agSubordinateList = new ArrayList<>();
        agSubordinateList.add(VictoriaBell);
        agSubordinateList.add(AndrewBlack);
        AmandaGreen.setSubordinateList(agSubordinateList);
        
        ArrayList<ISubordinate> chSubordinateList = new ArrayList<>();
        chSubordinateList.add(AshleySimpson);
        chSubordinateList.add(CarolWhite);
        chSubordinateList.add(ElenaTang);
        chSubordinateList.add(TessaGreen);
        CharlotteHond.setSubordinateList(chSubordinateList);
        
        ArrayList<ISubordinate> cbSubordinateList = new ArrayList<>();
        cbSubordinateList.add(DavidGalloway);
        cbSubordinateList.add(BradTurner);
        cbSubordinateList.add(DavidChand);
        ChristineBennet.setSubordinateList(cbSubordinateList);
        
        ArrayList<ISubordinate> jsSubordinateList = new ArrayList<>();
        jsSubordinateList.add(PeterGordon);
        JuliaSmith.setSubordinateList(jsSubordinateList);
        
        ArrayList<ISubordinate> khSubordinateList = new ArrayList<>();
        khSubordinateList.add(CharlotteHond);
        khSubordinateList.add(JoanneDowman);
        KateHudson.setSubordinateList(khSubordinateList);
        
        ArrayList<ISubordinate> mbSubordinateList = new ArrayList<>();
        mbSubordinateList.add(HelenChan);
        MichaelBrown.setSubordinateList(mbSubordinateList);
        
        ArrayList<ISubordinate> sgSubordinateList = new ArrayList<>();
        sgSubordinateList.add(ChristineBennet);
        sgSubordinateList.add(MichaelPerry);
        ScarletGreen.setSubordinateList(sgSubordinateList);
        
        ArrayList<ISubordinate> vbSubordinateList = new ArrayList<>();
        vbSubordinateList.add(JohnNorton);
        vbSubordinateList.add(AndrewBlank);
        vbSubordinateList.add(JamesCarol);
        VictoriaBell.setSubordinateList(vbSubordinateList);
        
        
        MainForm mainForm = new MainForm(personList);   //creating an isntance of main form and passing the person list
        Color lightGreen = new Color(192,249,142);
        mainForm.getContentPane().setBackground(lightGreen);    //setting background color
        mainForm.setVisible(true);
        
        
        
    }
    
}
