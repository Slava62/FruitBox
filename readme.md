В программе операции с коробкой выполняет оператор

Практическое задание
1. Создать стандартный Maven проект (архетип quickstart);++
2. Найти в центральном репозитории и добавить зависимости: JUnit 4.13, SQLite JDBC (любой
версии);
3. В pom.xml указать версию JDK на используемую.
4. В полученном проекте решить задачу:
0 Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;++
0 Класс Box, в который можно складывать фрукты. Коробки условно сортируются по
типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
0 Для хранения фруктов внутри коробки можно использовать ArrayList;++
0 Сделать метод getWeight(), который высчитывает вес коробки. Задать вес одного
фрукта и их количество: вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не
важны);++
0 Внутри класса Box сделать метод compare(), который позволяет сравнить текущую
коробку с той, которую подадут в compare() в качестве параметра. true – если их массы
равны, false в противоположном случае. Можно сравнивать коробки с яблоками и
апельсинами;++
0 Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются
объекты, которые были в первой;++
0 Не забываем про метод добавления фрукта в коробку
