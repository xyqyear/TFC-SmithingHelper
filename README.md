# 群峦传说打铁助手

*此程序需要你有世界种子*

*此程序适用于1.7.10的群峦*

## 使用方法

[简明使用方法](#使用流程)

另见博客文章:

[https://blog.xyqyear.com/2020/01-24/qun-luan-chuan-shuo-duan-zao-gong-shi-ji-suan-qi/](https://www.xyqyear.com/2020/01-24/qun-luan-chuan-shuo-duan-zao-gong-shi-ji-suan-qi/)

打开程序，程序会要去输入

- 世界种子
- 原料物品id
- 产物物品id
- 最后三步

这里一一解释：

- 世界种子
  
  顾名思义世界种子就是创建地图的种子如果开了作弊或者有op权限可以通过/seed指令获得，但是如果没有op也可以通过崩溃报告获得（1.7.10）

- 原料物品id

  就是原料物品的id，忽略冒号后的数字， 如果有两个物品作为原料则使用第一个物品的id
  
- 产品id

  就是产品的物品id，同样也是忽略冒号后的数字
  
- 最后三步

  按钮对应数字（下面会讲），输入的三个数字中间加个空格。 要注意输入程序的顺序是和砧里的顺序反过来的，因为砧里面显示的最左边的步骤其实是最后一步。如果砧里面只显示了两个那就手动随便补一个。

最后会以这样的形式输出: (注意： 手动输入的最后三步也是包含在里面的)

    8->8->8->8->8->7->7->6->6->2->2->2->Done

这个数字对应的按钮如下:

![界面图片](readmeImage/AnvilGUIExplained.png)

上面说的手动输入也是用的这个数字的格式来输入。

## 使用流程

所以一个完整的流程是这样的：

    请输入世界种子:
    8041252338967350698
    请输入原料物品id （如果是两个物品则是第一个物品）:
    4114
    请输入产品物品id （忽略id的冒号后数字）:
    4123
    请输入最后三步, 空格分隔（和砧上面显示是倒着的）:
    4 5 6
    最短步骤： （需要帮助见 https://github.com/xyqyear/TFC-SmithingHelper）
    8->8->8->8->8->7->4->5->6->Done

也可以一次性把所有需要输入的东西输入完:

    请输入世界种子:
    8041252338967350698 4114 4123 4 5 6
    请输入原料物品id （如果是两个物品则是第一个物品）:
    请输入产品物品id （忽略id的冒号后数字）:
    请输入最后三步, 空格分隔（和砧上面显示是倒着的）:
    最短步骤： （需要帮助见 https://github.com/xyqyear/TFC-SmithingHelper）
    8->8->8->8->8->7->4->5->6->Done

推荐加热金属锭之前先把所有需要的东西收集好，输入程序算出来后开始加热，不然加热完再算，算了又冷了。
