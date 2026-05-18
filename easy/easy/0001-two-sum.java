/*
 * Задача: Two Sum
 * Сложность: Easy
 * Тема: массивы, полный перебор
 *
 * Идея:
 * Проверяем все пары элементов массива.
 * Если сумма двух элементов равна target, возвращаем их индексы.
 *
 * Временная сложность: O(n^2)
 * Пространственная сложность: O(1)
 */

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }

        return new int[] {};
    }
}
