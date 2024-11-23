import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {
        // Получаем класс String
        Class<?> stringClass = String.class;

        // Получаем все методы класса String
        Method[] methods = stringClass.getDeclaredMethods();

        // Выводим названия всех методов
        System.out.println("Методы класса String:");
        for (Method method : methods) {
            System.out.println(method.getName());
        }
    }

}
