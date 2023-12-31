## Юнит-тесты:
1. Тест добавления контакта
   Этот тест проверяет, что функция для добавления контакта работает правильно, добавляя новый контакт в записную книжку и сохраняя его данные.
2. Тест редактирования контакта
   Этот тест проверяет, что функция редактирования контакта правильно обновляет информацию о контакте в записной книжке.
3. Тест удаления контакта
   Этот тест проверяет, что функция удаления контакта удаляет указанный контакт из записной книжки.

## Интеграционные тесты:
1. Тест сохранения и загрузки данных
   Этот тест проверяет, что приложение может успешно сохранять и загружать данные о контактах, чтобы обеспечить сохранение данных между сеансами работы.
2. Тест поиска контакта
   Этот тест проверяет, что функция поиска контакта корректно находит контакт в записной книжке на основе заданных критериев.

## Сквозные (end-to-end) тесты:
1. Тест создания нового контакта через пользовательский интерфейс
   Этот тест проверяет, что пользователь может успешно создать новый контакт через интерфейс приложения, а данные сохраняются в записной книжке.
2. Тест редактирования контакта через пользовательский интерфейс
  Этот тест проверяет, что пользователь может успешно отредактировать контакт через интерфейс приложения, и обновленные данные сохраняются.
3. Тест удаления контакта через пользовательский интерфейс
   Этот тест проверяет, что пользователь может успешно удалить контакт через интерфейс приложения, и контакт удаляется из записной книжки.
4. Тест взаимодействия с различными устройствами (например, мобильным и веб-приложениями)
   Этот тест проверяет, что приложение может взаимодействовать с различными устройствами и платформами, обеспечивая согласованное поведение.




## 1. Юнит-тест.
- Этот тест проверяет отдельную функцию `addContact`, которая добавляет новый контакт в список. Он изолирован от других компонентов системы и фокусируется исключительно на проверке этой функции. Таким образом, это юнит-тест.

## 2. Интеграционный тест.
- Этот тест проверяет цикл взаимодействия пользователя с пользовательским интерфейсом, начиная с создания контакта и заканчивая его отображением в списке контактов. Проверяет несколько звеньев цепи, но не всю цепочку.

## 3. Сквозной (end-to-end) тест.
- Этот тест проверяет весь жизненный цикл контакта, начиная с создания, прохождения через редактирование и, наконец, удаление.