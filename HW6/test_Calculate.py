import unittest

from Calculate import Calculate


class test_Calculate(unittest.TestCase):
    def test_what_avg_is_bigger(self):
        self.assertEqual(Calculate.what_avg_is_bigger([1, 2, 7], [1, 2, 6]), "Первый список имеет большее среднее "
                                                                             "значение")
        self.assertEqual(Calculate.what_avg_is_bigger([1], [1, 2, 6]), "Второй список имеет большее среднее значение")
        self.assertEqual(Calculate.what_avg_is_bigger([1], [1]), "Средние значения равны")

    def test_avg_calculate(self):
        self.assertEqual(Calculate.avg_calculate([1, 5, 6]), 4)


if __name__ == '__main__':
    unittest.main()
