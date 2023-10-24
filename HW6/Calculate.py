class Calculate:
    @classmethod
    def what_avg_is_bigger(cls, first, second):
        avg1 = Calculate.avg_calculate(first)
        avg2 = Calculate.avg_calculate(second)
        if avg1 > avg2:
            return "Первый список имеет большее среднее значение"
        elif avg1 < avg2:
            return "Второй список имеет большее среднее значение"
        return "Средние значения равны"

    @classmethod
    def avg_calculate(cls, lists):
        avg = 0
        for i in lists:
            avg += i
        return avg / len(lists)

    # Press the green button in the gutter to run the script.
    # if __name__ == '__main__':
    #     print(what_avg_is_bigger([1, 4, 3], [1, 3, 4]))
