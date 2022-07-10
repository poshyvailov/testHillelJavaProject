package Lesson8String;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        String testText = "bla bla bla text";

        //Вывести все большими буквами
        System.out.println(testText.toUpperCase());

        //Проверяет на true и false нашу строку, начинается ли она с указанной буквы или нет (тоже самое для окончания строки)
        System.out.println(testText.startsWith("b"));
        System.out.println(testText.startsWith("t"));
        System.out.println(testText.endsWith("a"));
        System.out.println(testText.endsWith("t"));

        //Проверяет содержит ли строка символ
        System.out.println(testText.contains("w"));
        System.out.println(testText.contains("T"));
        System.out.println(testText.contains("t"));

        //Заменяет казанный символ на новый
        System.out.println(testText.replace("t", "T"));

        //trim() - убирает лишние пробелы в начале и в конце стринга (только в начале и в конце)
        System.out.println("   Some test text    ".trim());

        //Разделить строку с использование регулярных выражений. Метод вернет массик строк
        // String [] split (String regex)
        //В примере ниже мы создает тестовую, обычную стрингу. Дальше мы создаем массив стринг в который мы положим -
        // - результат разделения строки (результат приходит в виде массива). В параметрах метода мы указываем регулярное выражение по котормоу и будем разбивать строку-
        // - в нашем случае мы разделяем по пробелам, а потом мы выводим результат разделения, вызывая массив в который мы положили резульатт -
        // - разделения строки и выводим с применением метода toString чтобы резульатт был не строка в хипе, а номральный текст

        String testStringForSplitting = "Some test example with not very long text...yep";
        String [] wordsAfterSplit = testStringForSplitting.split(" ");
        //пример как мы бы могли разбить строку по запятым
        //String [] wordsAfterSplit = testStringForSplitting.split(",");
        System.out.println(Arrays.toString(wordsAfterSplit));


        //МЫ также можем использовать "цепь" методов по изменениб строки
        String methodsChainTestString = "   hello, please type your user name   ";
        String methodsChainTestStringResults = methodsChainTestString.trim().toUpperCase().replaceAll("NAME", "ИМЯ");
        System.out.println(methodsChainTestStringResults);
    }
}
