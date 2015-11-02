package myobject; /**
 * Created by natalia on 27.01.15.
 */

import Base.MOTestBase;
import org.openqa.selenium.*;
import org.testng.annotations.*;

import static Base.MOWebdriver.*;

/*здесь будут тесты всех правых панелей в системе по списку*/

/*
Персонал

    Сотрудник - поле "Должность"
    Ответственность - поле "Сотрудник"

Планы

    План - поле "Ответственное лицо"

Объекты

    Объект - поле "Ответственный" (пока должно быть ограничение, но в дальнейшем ограничение может быть убрано из-за реализации создания сотрудников для всех объектов)
    ПЛА - поле "Ответственный руководитель работ по локализации и ликвидации аварии"

Аварии

    Данные аварии - блок "Кто сообщил об аварии" - поле "Сотрудник"
    Данные аварии - блок "Ответственные" - поле "Сотрудник"
    Данные аварии - блок "План ликвидации аварии" - поле "Ответственный"
    Расследование, комиссия - блок "Состав комиссии тех. расследования причин аварии" - поле "Сотрудник"

Инциденты

    Блок "Ответственные за возникновение" - поле "Сотрудник"
    Блок "Состав комиссии по расследованию" - поле "Сотрудник"
    Поле "План мероприятий"

Утрата ВМ

    Данные утраты ВМ - блок "Кто сообщил об аварии" - поле "Сотрудник"
    Данные утраты ВМ - блок "Ответственные" - поле "Сотрудник"
    Данные утраты ВМ - блок "План ликвидации аварии" - поле "Ответственный"
    Расследование, комиссия - блок "Состав комиссии тех. расследования случая утраты ВМ" - поле "Сотрудник"

НС

    Блок "Ответственные за возникновение" - поле "Сотрудник"
    Блок "Состав комиссии по расследованию" - поле "Сотрудник"
    Блок "Пострадавшие" - поле "Сотрудник"
    Поле "План мероприятий"

Предписания РТН

    Поле "Ответственный"
    Нарушение - поле "Ответственный"

Протоколы ВП

    Поле "Ответственный за выполнение"
    Нарушение - поле "Ответственный за устранение нарушения"
    Нарушение - блок "Сотрудники, привлеченные к ответственности" - поле "Сотрудник"

Пользователи

    Поле "Роль (набор прав пользователя)"

Документы

    Поле "Сотрудник"

Мероприятия

    Поле "Ответственный за выполнение"

     */
public class RightView extends MOTestBase {

    @Test
    public void testEmployeePosition() throws Exception
    {
        goTo("Общее","Персонал");
        add();

        legend="Общие сведения";
        //addByRightView

        //тут добавление должности в правой панели

    }

}