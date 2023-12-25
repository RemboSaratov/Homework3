public class Main {
    public static void main(String[] args) {
        int table = 1;
        byte myMoney = -100;
        short hands = 2;
        long billGatesMoney = 1000000000L;
        System.out.println("Значение переменной " + "table " + "с типом " + "int "  + "равно " + table  );
        System.out.println("Значение переменной " + "myMoney " + "с типом " + "byte "  + "равно " + myMoney);
        System.out.println("Значение переменной " + "hands " + "с типом " + "short "  + "равно " + hands  );
        System.out.println("Значение переменной " + "billGatesMoney " + "с типом " + "long "  + "равно " + billGatesMoney  );

        float variable1 = 27.12f;
        long variable2 = 987678965549L;
        float variable3 = 2.786f;
        short variable4 = 569;
        short variable5 = -159;
        short variable6 = 27897;
        byte variable7 = 67;

        int studentTeacher1 = 23;
        int studentTeacher2 = 27;
        int studentTeacher3 = 30;
        int paper = 480;
        int paperToStudent = paper / (studentTeacher1 + studentTeacher2 + studentTeacher3);
        System.out.println("На каждого ученика расчитано " + paperToStudent + " листов бумаги");

        var machinePerformancePer1min = 16/2;
        var machinePerformancePer20min = machinePerformancePer1min * 20;
        var machinePerformancePer1day = machinePerformancePer1min * 60 * 24;
        var machinePerformancePer3day = machinePerformancePer1day * 3;
        var machinePerformancePer1month = machinePerformancePer1day * 30;
        System.out.println("За 20 минут машина произвела " + machinePerformancePer20min + " бутылок" );
        System.out.println("За сутки машина произвела " + machinePerformancePer1day + " бутылок");
        System.out.println("За 3 дня машина произвела " + machinePerformancePer3day + " бутылок");
        System.out.println("За 1 месяц " + machinePerformancePer1month + " бутылок");

        int tinOfPaintForSchool = 120;
        int whiteTinOfPaintForClass = 2;
        int brownTinOfPaintForClass = 4;
        int allSchoolClass = tinOfPaintForSchool / (whiteTinOfPaintForClass + brownTinOfPaintForClass);
        int whiteTinOfPaintForSchool = whiteTinOfPaintForClass * allSchoolClass;
        int brownTinOfPaintForSchool = brownTinOfPaintForClass * allSchoolClass;
        System.out.println("В школе где " + allSchoolClass + " классов, нужно " + whiteTinOfPaintForSchool + " банок белой краски и " + brownTinOfPaintForSchool + " " + " банок коричневой краски");

        int allBanana = 5;
        int weightAllBanana = allBanana * 80;
        int allMilk = 2;
        int weightAllMilk = allMilk * 105;
        int allAceCream = 2;
        int weightAllAceCream = allAceCream * 100;
        int allEgs = 4;
        int weightAllEgs = allEgs * 70;
        int cocktail = weightAllBanana + weightAllAceCream + weightAllEgs + weightAllMilk;
        float cocktailInKilo = (weightAllBanana + weightAllAceCream + weightAllEgs + weightAllMilk) / 1000f;
        System.out.println("Вес коктейля " + cocktail + " грамм" + " или " + cocktailInKilo+ " килограмм");

        int excessWeight = 7000;
        int dayForFastWeightLoss = excessWeight / 500;
        int dayForSlowWeightLoss = excessWeight / 250;
        int dayForAverageWeightLoss = (dayForFastWeightLoss + dayForSlowWeightLoss) / 2;
        System.out.println("Теряя в весе 250 грамм в день можно похудеть на 7 килограмм за " + dayForSlowWeightLoss + " дней");
        System.out.println("Теряя в весе 500 грамм в день можно похудеть на 7 килограмм за " +  dayForFastWeightLoss + " дней");
        System.out.println("В среднем для похудения на 7 килограмм нужно " + dayForAverageWeightLoss + " дней");

























    }
}