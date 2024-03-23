Leetcode 100 刷题记录
=====
### day 1 2024/3/14 
-----
##### leetcode 1.[两数之和](https://leetcode.cn/problems/two-sum/description/?envType=study-plan-v2&envId=top-100-liked)
##### 暴力解O(n^2) + T(1)  / 哈希表O(n) + T(n)
##### 只做出来暴力解
##### 哈希表的方式为将数组存储的值作为哈希表的键，将原数组下标作为哈希表的值，这样哈希表成为一个类似以值为下标的数组。
##### 哈希表可以看成是数组的逆映射

### day 2 2024/3/15
-----
##### leetcode 2.[搜索插入位置](https://leetcode.cn/problems/search-insert-position/submissions/512277194/?envType=study-plan-v2&envId=top-100-liked)
##### 调API Collections.binarySearch / 二分查找

### day 3 2024/3/23
-----
##### leetcode 3.[字母异位词分组](https://leetcode.cn/problems/group-anagrams/?envType=study-plan-v2&envId=top-100-liked)
##### 哈希表
##### 原始想法：hm = new Hashmap<String, List<List<String>>>, 将输入的词重排列后作为键，原始的词作为值，加入到hm中，没加入一个新的词，判断和已有的重排列键是否一样
#####           如果一样，利用Hashmap的特性获取到被覆盖的值列表，将新加入的键加进去。
