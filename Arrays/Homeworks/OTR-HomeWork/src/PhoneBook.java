import java.util.*;

public class PhoneBook {

    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> phoneMap = new HashMap();
        phoneMap.put("Сатдаров М.Р", new ArrayList<>(Arrays.asList("+7-917-917-91-17")));
        phoneMap.put("Иванов И.И", new ArrayList<>(Arrays.asList("+8 800 2000 500", "+8-800-200-600")));
        phoneMap.put("Петров П.П", new ArrayList<>(Arrays.asList("+8 800 2000 700")));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Ф.И.О абонента:");
        String namePhone = scanner.nextLine();
        if (phoneMap.containsKey(namePhone)) {
            ArrayList<String> numbers = phoneMap.get(namePhone);
            for (String number : numbers) {
                System.out.println(number);
            }
        } else {
            System.err.println("Данный абонент отсутствует в справочнике");
        }
    }
}