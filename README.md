# final_work_program
# Описание проекта

Проект представляет собой систему учета для питомника, в котором проживают домашние и вьючные животные. Для работы с системой реализован набор команд, которые можно выполнять из терминала операционной системы Linux.

## Задача 1

Создание и объединение файлов с помощью команд `echo`, `cat`. В терминале выполняются следующие команды:
-

```bash
echo "собаки" > "Домашние животные"
echo "кошки" >> "Домашние животные"
echo "хомяки" >> "Домашние животные"
echo "лошади" > "Вьючные животные"
echo "верблюды" >> "Вьючные животные"
echo "ослы" >> "Вьючные животные"
cat "Домашние животные" "Вьючные животные" > "Друзья человека"
cat "Друзья человека"
```
![Снимок экрана 2023-08-03 110559](https://github.com/SergeiSlobodchikov/final_work_program/blob/main/img/%D0%A1%D0%BD%D0%B8%D0%BC%D0%BE%D0%BA%20%D1%8D%D0%BA%D1%80%D0%B0%D0%BD%D0%B0%202023-08-03%20110559.png)

## Задача 2

Создание директории `task2` и перемещение файла `Друзья человека` в эту директорию:
-
```bash
mkdir -p "animal/task2"
mv "Друзья человека" "animal/task2"
cd animal/task2
ls
```
![Снимок экрана 2023-08-03 110559](https://github.com/SergeiSlobodchikov/final_work_program/blob/d5300d8e79dcd8bda6debc030b68ead543b9f652/img/%D0%A1%D0%BD%D0%B8%D0%BC%D0%BE%D0%BA%20%D1%8D%D0%BA%D1%80%D0%B0%D0%BD%D0%B0%202023-08-03%20111308.png)

## Задача 3 и 4
Установка MySQL и Google Chrome с помощью команд `sudo apt-get` и `wget`:
-
```bash
sudo apt-get update
sudo apt-get install -y lsb-release wget
wget https://dev.mysql.com/get/mysql-apt-config_0.8.23-1_all.deb
sudo dpkg -i mysql-apt-config_0.8.23-1_all.deb
sudo apt-get update
sudo apt-get install -y mysql-server
```
![Снимок экрана 2023-08-03 110559](https://github.com/SergeiSlobodchikov/final_work_program/blob/d5300d8e79dcd8bda6debc030b68ead543b9f652/img/%D0%A1%D0%BD%D0%B8%D0%BC%D0%BE%D0%BA%20%D1%8D%D0%BA%D1%80%D0%B0%D0%BD%D0%B0%202023-08-03%20120708.png)

```bash
wget https://dl.google.com/linux/direct/google-chrome-stable_current_amd64.deb
sudo dpkg -i google-chrome-stable_current_amd64.deb
sudo dpkg -r google-chrome-stable
```
![Снимок экрана 2023-08-03 110559](https://github.com/SergeiSlobodchikov/final_work_program/blob/d5300d8e79dcd8bda6debc030b68ead543b9f652/img/%D0%A1%D0%BD%D0%B8%D0%BC%D0%BE%D0%BA%20%D1%8D%D0%BA%D1%80%D0%B0%D0%BD%D0%B0%202023-08-03%20122539.png)


## Задача 6
Диаграмма животных
-
https://drive.google.com/file/d/1fQF3PEFCk9Ko10GynPh50OGGL4pfDtt5/view?usp=drive_link

![Снимок экрана 2023-08-03 124658.png](https://github.com/SergeiSlobodchikov/final_work_program/blob/d5300d8e79dcd8bda6debc030b68ead543b9f652/img/%D0%A1%D0%BD%D0%B8%D0%BC%D0%BE%D0%BA%20%D1%8D%D0%BA%D1%80%D0%B0%D0%BD%D0%B0%202023-08-03%20124658.png)


## Задача 7 и 8
7. В подключенном MySQL репозитории создать базу данных “Друзья
   человека”
8. Создать таблицы с иерархией из диаграммы в БД
---
![Снимок экрана 2023-08-03 165058.png](https://github.com/SergeiSlobodchikov/final_work_program/blob/d5300d8e79dcd8bda6debc030b68ead543b9f652/img/%D0%A1%D0%BD%D0%B8%D0%BC%D0%BE%D0%BA%20%D1%8D%D0%BA%D1%80%D0%B0%D0%BD%D0%B0%202023-08-03%20165005.png)

---
Триггер чтобы сразу добавлялись в домашние животные если добавляли животных в (кошек, собак или хомяков)
![Снимок экрана 2023-08-03 124658.png](https://github.com/SergeiSlobodchikov/final_work_program/blob/d5300d8e79dcd8bda6debc030b68ead543b9f652/img/%D0%A1%D0%BD%D0%B8%D0%BC%D0%BE%D0%BA%20%D1%8D%D0%BA%D1%80%D0%B0%D0%BD%D0%B0%202023-08-03%20165030.png)

## Задача 9 и 10
9. Заполнить низкоуровневые таблицы именами(животных), командами
   которые они выполняют и датами рождения
![- https://drive.google.com/file/d/1fqdHL8IiDjam4-SHN_R48PFzyNYdd7RV/view?usp=drive_link](https://github.com/SergeiSlobodchikov/final_work_program/blob/d5300d8e79dcd8bda6debc030b68ead543b9f652/img/%D0%A1%D0%BD%D0%B8%D0%BC%D0%BE%D0%BA%20%D1%8D%D0%BA%D1%80%D0%B0%D0%BD%D0%B0%202023-08-03%20165105.png)

--- 
10.  Удалив из таблицы верблюдов, т.к. верблюдов решили перевезти в другой
     питомник на зимовку. Объединить таблицы лошади, и ослы в одну таблицу
![https://drive.google.com/file/d/18y8ShfB8JWDKoFEPbCh3R7ZmtNFZZucr/view?usp=drive_link](https://github.com/SergeiSlobodchikov/final_work_program/blob/d5300d8e79dcd8bda6debc030b68ead543b9f652/img/%D0%A1%D0%BD%D0%B8%D0%BC%D0%BE%D0%BA%20%D1%8D%D0%BA%D1%80%D0%B0%D0%BD%D0%B0%202023-08-03%20165121.png)

## Задача 11 и 12
11. Создать новую таблицу “молодые животные” в которую попадут все
    животные старше 1 года, но младше 3 лет и в отдельном столбце с точностью
    до месяца подсчитать возраст животных в новой таблице
![ https://drive.google.com/file/d/1Bo0d4rsa2Tplh-wrZBk8Psp5ZN61k3pO/view?usp=drive_link](https://github.com/SergeiSlobodchikov/final_work_program/blob/d5300d8e79dcd8bda6debc030b68ead543b9f652/img/%D0%A1%D0%BD%D0%B8%D0%BC%D0%BE%D0%BA%20%D1%8D%D0%BA%D1%80%D0%B0%D0%BD%D0%B0%202023-08-03%20165137.png)

12. Объединить все таблицы в одну, при этом сохраняя поля, указывающие на
    прошлую принадлежность к старым таблицам.

![ https://drive.google.com/file/d/1gsR98_ql-uCgLFkjlZuITyOEeanMoyRh/view?usp=drive_link](https://github.com/SergeiSlobodchikov/final_work_program/blob/d5300d8e79dcd8bda6debc030b68ead543b9f652/img/%D0%A1%D0%BD%D0%B8%D0%BC%D0%BE%D0%BA%20%D1%8D%D0%BA%D1%80%D0%B0%D0%BD%D0%B0%202023-08-03%20165500.png)


# Описание кода 13-15

В представленном коде реализовано приложение для работы с реестром домашних и вьючных животных. Код разделен на несколько классов:

1. `Animal` - родительский класс для животных. Определяет основные характеристики животных, такие как имя, команды и дата рождения.

2. `DomesticAnimal` - дочерний класс `Animal`, представляющий домашних животных. Расширяет базовый функционал класса `Animal`, добавляя информацию о владельце и типе животного (например, собака, кошка, хомяк и т.д.).

3. `DraughtAnimal` - дочерний класс `Animal`, представляющий вьючных животных. Также расширяет функционал класса `Animal`, добавляя информацию о задании и типе животного (например, лошадь, осел, верблюд и т.д.).

4. `AnimalRegistry` - класс, представляющий реестр животных. Содержит два списка: `domesticAnimals` для хранения домашних животных и `draughtAnimals` для хранения вьючных животных. Реализует методы для добавления животных в реестр, просмотра списков и добавления новых команд.

5. `Menu` - класс, представляющий консольное меню для взаимодействия с реестром животных. Включает метод `main`, в котором пользователю предоставляются опции для добавления нового животного, просмотра списка домашних и вьючных животных, добавления новых команд и выхода из программы. Также в этом классе используется объект `Counter` для подсчета количества добавленных животных.

6. `Counter` - класс, реализующий счетчик для подсчета количества добавленных животных. Реализует метод `add()` для увеличения значения счетчика, а также реализует интерфейс `AutoCloseable` для использования в блоке try-with-resources. В методе `close()` происходит проверка на значение счетчика, и если значение больше 0, бросается исключение `RuntimeException`.

7. `Main` - класс для тестирования кода, создает экземпляры домашних и вьючных животных и выводит информацию о каждом из них.


Программа позволяет пользователю управлять реестром животных, добавлять новых животных, просматривать списки, добавлять новые команды для животных и корректно обрабатывает объект `Counter` в блоке try-with-resources.
![](https://github.com/SergeiSlobodchikov/final_work_program/blob/d5300d8e79dcd8bda6debc030b68ead543b9f652/img/%D0%A1%D0%BD%D0%B8%D0%BC%D0%BE%D0%BA%20%D1%8D%D0%BA%D1%80%D0%B0%D0%BD%D0%B0%202023-08-03%20205032.png)
