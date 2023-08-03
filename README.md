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
https://drive.google.com/file/d/1Hi-sMb4aes3Lh1H_OkoM7ez0v6v-QM3g/view?usp=drive_link
## Задача 2

Создание директории `task2` и перемещение файла `Друзья человека` в эту директорию:
-
```bash
mkdir -p "animal/task2"
mv "Друзья человека" "animal/task2"
cd animal/task2
ls
```
https://drive.google.com/file/d/1ga7bvPDIUFfvrYlhdPuDVMeVPjQQiSid/view?usp=drive_link

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

wget https://dl.google.com/linux/direct/google-chrome-stable_current_amd64.deb
sudo dpkg -i google-chrome-stable_current_amd64.deb
sudo dpkg -r google-chrome-stable
```

https://drive.google.com/file/d/1LhNh5UcN9yEwVPJocZ3xoQPwuiBZSvGt/view?usp=drive_link

---
https://drive.google.com/file/d/18JVz0ibbz0lc0yNclc2S_KtDp-cYeVVS/view?usp=drive_link


## Задача 6
Диаграмма животных
-
https://drive.google.com/file/d/1fQF3PEFCk9Ko10GynPh50OGGL4pfDtt5/view?usp=drive_link
![Снимок экрана 2023-08-03 124658.png](https://drive.google.com/file/d/1VALw_akeEsa3aLpRCoaGqU1ZTFmNcad2/view?usp=drive_link)


## Задача 7 и 8
7. В подключенном MySQL репозитории создать базу данных “Друзья
   человека”
8. Создать таблицы с иерархией из диаграммы в БД
---
- https://drive.google.com/file/d/1C-08QhSA4uU1x_9H5pqKiIiWxSeYzk6z/view?usp=

---
Триггер чтобы сразу добавлялись в домашние животные если добавляли животных в (кошек, собак или хомяков)
- https://drive.google.com/file/d/1XXY29KQbJ8cT5tOdtiQvZ2SEDWKwnuZf/view?usp=drive_link

## Задача 9 и 10
9. Заполнить низкоуровневые таблицы именами(животных), командами
   которые они выполняют и датами рождения
- https://drive.google.com/file/d/1fqdHL8IiDjam4-SHN_R48PFzyNYdd7RV/view?usp=drive_link

--- 
10.  Удалив из таблицы верблюдов, т.к. верблюдов решили перевезти в другой
     питомник на зимовку. Объединить таблицы лошади, и ослы в одну таблицу
- https://drive.google.com/file/d/18y8ShfB8JWDKoFEPbCh3R7ZmtNFZZucr/view?usp=drive_link

## Задача 11 и 12
11. Создать новую таблицу “молодые животные” в которую попадут все
    животные старше 1 года, но младше 3 лет и в отдельном столбце с точностью
    до месяца подсчитать возраст животных в новой таблице
- https://drive.google.com/file/d/1Bo0d4rsa2Tplh-wrZBk8Psp5ZN61k3pO/view?usp=drive_link

12. Объединить все таблицы в одну, при этом сохраняя поля, указывающие на
    прошлую принадлежность к старым таблицам.

- https://drive.google.com/file/d/1gsR98_ql-uCgLFkjlZuITyOEeanMoyRh/view?usp=drive_link

