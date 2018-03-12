package oca.project;

import java.util.ArrayList;
import java.util.Date;

/**
 * Main class that creates all employees and specifies their managers
 */
public class OCAProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Person> personList = new ArrayList<>();
        
        CEO JamesMint = new CEO();
        JamesMint.setEmpFirstName("James");
        JamesMint.setEmpLastName("Mint");
        JamesMint.setDateOfBirth(new Date(28/12/1977));
        JamesMint.setStartDate(new Date(10/01/2010));
        JamesMint.setTimePeriod(TimePeriod.MONTHLY);
        
        AdministrationManager BillJohns = new AdministrationManager(JamesMint);
        BillJohns.setEmpFirstName("Bill");
        BillJohns.setEmpLastName("Johns");
        BillJohns.setDateOfBirth(new Date(13/04/1981));
        BillJohns.setStartDate(new Date(10/05/2012));
        BillJohns.setTimePeriod(TimePeriod.MONTHLY);
        
        BranchManager KateHudson = new BranchManager(BillJohns);
        KateHudson.setEmpFirstName("Kate");
        KateHudson.setEmpLastName("Hudson");
        KateHudson.setDateOfBirth(new Date(13/07/1981));
        KateHudson.setStartDate(new Date(11/03/2013));
        KateHudson.setTimePeriod(TimePeriod.MONTHLY);
                
                
        BranchManager ScarletGreen = new BranchManager(BillJohns);
        ScarletGreen.setEmpFirstName("Scarlet");
        ScarletGreen.setEmpLastName("Green");
        ScarletGreen.setDateOfBirth(new Date(20/03/1980));
        ScarletGreen.setStartDate(new Date(10/05/2013));
        ScarletGreen.setTimePeriod(TimePeriod.MONTHLY);
        
        BranchManager AmandaGreen = new BranchManager(BillJohns);
        AmandaGreen.setEmpFirstName("Amanda");
        AmandaGreen.setEmpLastName("Green");
        AmandaGreen.setDateOfBirth(new Date(05/04/1979));
        AmandaGreen.setStartDate(new Date(14/10/2014));
        AmandaGreen.setTimePeriod(TimePeriod.MONTHLY);
        
        SalesManager MichaelBrown = new SalesManager(JamesMint);
        MichaelBrown.setEmpFirstName("Michael");
        MichaelBrown.setEmpLastName("Brown");
        MichaelBrown.setDateOfBirth(new Date(25/12/1985));
        MichaelBrown.setStartDate(new Date(21/07/2012));
        MichaelBrown.setTimePeriod(TimePeriod.FORTNIGHTLY);
        
        FinancialAdministrator EricWhite = new FinancialAdministrator(JamesMint);
        EricWhite.setEmpFirstName("Eric");
        EricWhite.setEmpLastName("White");
        EricWhite.setDateOfBirth(new Date(21/05/1984));
        EricWhite.setStartDate(new Date(10/04/2011));
        EricWhite.setTimePeriod(TimePeriod.FORTNIGHTLY);
        
        HROfficer JuliaSmith = new HROfficer(JamesMint);
        JuliaSmith.setEmpFirstName("Julia");
        JuliaSmith.setEmpLastName("Smith");
        JuliaSmith.setDateOfBirth(new Date(17/02/1973));
        JuliaSmith.setStartDate(new Date(13/06/2010));
        JuliaSmith.setTimePeriod(TimePeriod.MONTHLY);
        
        ProjectManager VictoriaBell = new ProjectManager(AmandaGreen);
        VictoriaBell.setEmpFirstName("Victoria");
        VictoriaBell.setEmpLastName("Bell");
        VictoriaBell.setDateOfBirth(new Date(11/01/1978));
        VictoriaBell.setStartDate(new Date(30/04/2013));
        VictoriaBell.setTimePeriod(TimePeriod.FORTNIGHTLY);
        
        ProjectManager CharlotteHond = new ProjectManager(ScarletGreen);
        CharlotteHond.setEmpFirstName("Charlotte");
        CharlotteHond.setEmpLastName("Hond");
        CharlotteHond.setDateOfBirth(new Date(01/07/1988));
        CharlotteHond.setStartDate(new Date(28/02/2012));
        CharlotteHond.setTimePeriod(TimePeriod.FORTNIGHTLY);
        
        ProjectManager ChristineBennet = new ProjectManager(ScarletGreen);
        ChristineBennet.setEmpFirstName("Christine");
        ChristineBennet.setEmpLastName("Bennet");
        ChristineBennet.setDateOfBirth(new Date(16/06/1982));
        ChristineBennet.setStartDate(new Date(11/06/2011));
        ChristineBennet.setTimePeriod(TimePeriod.FORTNIGHTLY);
        
        SeniorProgramDeveloper JohnNorton = new SeniorProgramDeveloper(VictoriaBell);
        JohnNorton.setEmpFirstName("John");
        JohnNorton.setEmpLastName("Norton");
        JohnNorton.setDateOfBirth(new Date(17/07/1980));
        JohnNorton.setStartDate(new Date(10/9/2010));
        JohnNorton.setTimePeriod(TimePeriod.MONTHLY);
        
        SeniorProgramDeveloper AshleySimpson = new SeniorProgramDeveloper(CharlotteHond);
        AshleySimpson.setEmpFirstName("Ashley");
        AshleySimpson.setEmpLastName("Simpson");
        AshleySimpson.setDateOfBirth(new Date(12/05/1984));
        AshleySimpson.setStartDate(new Date(15/06/2010));
        AshleySimpson.setTimePeriod(TimePeriod.MONTHLY);
        
        ProgramDeveloper AlexDillon = new ProgramDeveloper(JohnNorton);
        AlexDillon.setEmpFirstName("Alex");
        AlexDillon.setEmpLastName("Dillon");
        AlexDillon.setDateOfBirth(new Date(10/03/1989));
        AlexDillon.setStartDate(new Date(14/9/2014));
        AlexDillon.setTimePeriod(TimePeriod.FORTNIGHTLY);
        
        ProgramDeveloper AndrewSampson = new ProgramDeveloper(AshleySimpson);
        AndrewSampson.setEmpFirstName("Andrew");
        AndrewSampson.setEmpLastName("Sampson");
        AndrewSampson.setDateOfBirth(new Date(9/04/1984));
        AndrewSampson.setStartDate(new Date(04/07/2010));
        AndrewSampson.setTimePeriod(TimePeriod.FORTNIGHTLY);
        
        ProgramDeveloper DavidGalloway = new ProgramDeveloper(ChristineBennet);
        DavidGalloway.setEmpFirstName("David");
        DavidGalloway.setEmpLastName("Galloway");
        DavidGalloway.setDateOfBirth(new Date(06/12/1981));
        DavidGalloway.setStartDate(new Date(05/11/2013));
        DavidGalloway.setTimePeriod(TimePeriod.MONTHLY);
        
        
        Receptionist PeterGordon = new Receptionist(JuliaSmith);
        PeterGordon.setEmpFirstName("Peter");
        PeterGordon.setEmpLastName("Gordon");
        PeterGordon.setDateOfBirth(new Date(30/9/1983));
        PeterGordon.setStartDate(new Date(10/05/2010));
        PeterGordon.setTimePeriod(TimePeriod.FORTNIGHTLY);
        
        SystemAdministrator JoanneDowman = new SystemAdministrator(KateHudson);
        JoanneDowman.setEmpFirstName("Joanne");
        JoanneDowman.setEmpLastName("Dowman");
        JoanneDowman.setDateOfBirth(new Date(13/12/1980));
        JoanneDowman.setStartDate(new Date(07/07/2014));
        JoanneDowman.setTimePeriod(TimePeriod.FORTNIGHTLY);
        
        SystemAdministrator AndrewBlack = new SystemAdministrator(AmandaGreen);
        AndrewBlack.setEmpFirstName("Andrew");
        AndrewBlack.setEmpLastName("Black");
        AndrewBlack.setDateOfBirth(new Date(15/04/1976));
        AndrewBlack.setStartDate(new Date(04/05/2012));
        AndrewBlack.setTimePeriod(TimePeriod.MONTHLY);
        
        SystemAdministrator MichaelPerry = new SystemAdministrator(ScarletGreen);
        MichaelPerry.setEmpFirstName("Michael");
        MichaelPerry.setEmpLastName("Perry");
        MichaelPerry.setDateOfBirth(new Date(12/11/1977));
        MichaelPerry.setStartDate(new Date(01/03/2014));
        MichaelPerry.setTimePeriod(TimePeriod.FORTNIGHTLY);
        
        SystemAnalyst AndrewBlank = new SystemAnalyst(VictoriaBell);
        AndrewBlank.setEmpFirstName("Andrew");
        AndrewBlank.setEmpLastName("Blank");
        AndrewBlank.setDateOfBirth(new Date(15/9/1981));
        AndrewBlank.setStartDate(new Date(19/8/2014));
        AndrewBlank.setTimePeriod(TimePeriod.MONTHLY);
        
        SystemAnalyst CarolWhite = new SystemAnalyst(CharlotteHond);
        CarolWhite.setEmpFirstName("Carol");
        CarolWhite.setEmpLastName("White");
        CarolWhite.setDateOfBirth(new Date(20/10/1975));
        CarolWhite.setStartDate(new Date(10/01/2014));
        CarolWhite.setTimePeriod(TimePeriod.MONTHLY);
        
        SystemAnalyst BradTurner = new SystemAnalyst(ChristineBennet);
        BradTurner.setEmpFirstName("Brad");
        BradTurner.setEmpLastName("Turner");
        BradTurner.setDateOfBirth(new Date(22/11/1988));
        BradTurner.setStartDate(new Date(26/05/2014));
        BradTurner.setTimePeriod(TimePeriod.MONTHLY);
        
        SalesConsultant HelenChan = new SalesConsultant(MichaelBrown);
        HelenChan.setEmpFirstName("Michael");
        HelenChan.setEmpLastName("Brown");
        HelenChan.setDateOfBirth(new Date(25/12/1985));
        MichaelBrown.setTimePeriod(TimePeriod.FORTNIGHTLY);
        
        Tester JamesCarol = new Tester(VictoriaBell);
        Tester ElenaTang = new Tester(CharlotteHond);
        Tester TessaGreen = new Tester(CharlotteHond);
        Tester DavidChand = new Tester(ChristineBennet);
        
        
    }
    
}
