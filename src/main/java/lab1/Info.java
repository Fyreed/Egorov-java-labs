package lab1;

public class Info {


    public static void main(String[] args) {
        String firstName = "Александр";
        String middleName = "Егоров";
        String lastName = "Дмитриевич";
        String teacherFirstName = "Татьаяна";
        String teacherMiddleName = "Викторовна";
        String teacherLastName = "Волкова";
        String groupCode = "�?ВТ/б-12о";

        String pattern = "09.09.2018";

        int variant = 8;
        int NumberOfApplicantsSubmittedDocuments = 500;
        int NumberTotalBudgetPlaces = 100;
        int ManToPlaceCompetition = NumberOfApplicantsSubmittedDocuments / NumberTotalBudgetPlaces;

        String fullName = fullName(firstName, middleName, lastName);
        String fullTeacherName = fullName(teacherFirstName, teacherMiddleName, teacherLastName);

        System.out.println("Программу выполнил: \n" + fullName);
        System.out.println("Дата: " + pattern);
        System.out.println("Вариант: " + variant);
        System.out.println("Шифр группы: " + groupCode);
        System.out.println("Число абитуриентов подавших документы: " + NumberOfApplicantsSubmittedDocuments);
        System.out.println("Всего бюджетных мест: " + NumberTotalBudgetPlaces);
        System.out.println("конкурс человек на место: " + ManToPlaceCompetition);
        System.out.println("Проверил: \n" + fullTeacherName);
    }

    public static String fullName(String a, String b, String c) {
        return a + " " + b + " " + c;
    }
}
