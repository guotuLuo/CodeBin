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
##### 原始想法：hm = new Hashmap<String, List<List<String>>>, 将输入的词重排列后作为键，原始的词作为值，加入到hm中，没加入一个新的词，判断和已有的重排列键是否一样，如果一样，利用Hashmap的特性获取到被覆盖的值列表，将新加入的键加进去。
##### 题解：大致思想差不多，但是作为键之后，添加值只需要查询当前hashmap是否包含键就可以，我真是个傻逼

### day 4 2024/3/25
-----
##### leetcode 4.[最长连续序列](https://leetcode.cn/problems/longest-consecutive-sequence/description/?envType=study-plan-v2&envId=top-100-liked)
##### 哈希？
##### 原始想法：空间换时间，每一个原始数组元素值映射为新数组的索引，但是有些值特别大会超内存
##### 题解：hashset去重，先看是否包含当前值减一的元素，不包含的情况下，从该元素值开始依次找大1的连续串，只有个别元素会进入这个过程，看起来是O(n^2), 实际上不是，这个想不出来

### day 5 2024/3/26
-----
##### leetcode 4.[移动零](https://leetcode.cn/problems/move-zeroes/?envType=study-plan-v2&envId=top-100-liked)
##### 双指针
##### 原始想法：冒泡，遇到0将移动到末尾，设置high标记记录剩余需要清楚零元素的个数， 但是时间用时比较多， 时间复杂度O(n^2)
##### 题解：快慢指针，满指针始终指向待交换的0元素，快指针指向非零元素的时候需要和慢指针交换，当快慢指针指向同一个元素时不交换，时间复杂度O(n)， 像快排？

### day 6 2024/3/27
-----
##### leetcode 4.[盛水最多的容器](https://leetcode.cn/problems/container-with-most-water/description/?envType=study-plan-v2&envId=top-100-liked)
##### 双指针
##### 原始想法：暴力解，两个for遍历所有面积求最大，超时
##### 题解：双指针，左右边界作为边界之后就不会，看比较小的那个height，移动对应所指的指针
