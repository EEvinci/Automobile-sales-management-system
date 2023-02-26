# car-sale-system

[TOC]



## 数据库设计

![f03376e6c715cf8790839cba3a7bfd2](../AppData/Local/Temp/WeChat Files/f03376e6c715cf8790839cba3a7bfd2.png)

### 系统基本月份表

![d06c9a386f61dd425ecbf63c98b9e42](../AppData/Local/Temp/WeChat Files/d06c9a386f61dd425ecbf63c98b9e42.png)

### 品牌编号表

![image-20230226115022547](../AppData/Roaming/Typora/typora-user-images/image-20230226115022547.png)

### 车辆编号表

![image-20230226115035145](../AppData/Roaming/Typora/typora-user-images/image-20230226115035145.png)

### 顾客表

![image-20230226115044719](../AppData/Roaming/Typora/typora-user-images/image-20230226115044719.png)

### 员工表

![image-20230226115101337](../AppData/Roaming/Typora/typora-user-images/image-20230226115101337.png)

### 订单表

![image-20230226115136726](../AppData/Roaming/Typora/typora-user-images/image-20230226115136726.png)

### 订单详情表

![image-20230226115158447](../AppData/Roaming/Typora/typora-user-images/image-20230226115158447.png)

### 车系表

![image-20230226115222172](../AppData/Roaming/Typora/typora-user-images/image-20230226115222172.png)

## 功能展示

### 经理

#### 登录界面

![image-20230226115232803](../AppData/Roaming/Typora/typora-user-images/image-20230226115232803.png)

#### 管理功能分为五个部分：

![image-20230226115258032](../AppData/Roaming/Typora/typora-user-images/image-20230226115258032.png)



#### 首页：呈现昨日销售额和销量，昨日销售额以可视化饼状图形式显示

![image-20230226115245607](../AppData/Roaming/Typora/typora-user-images/image-20230226115245607.png)

#### 销售管理

![image-20230226115549173](../AppData/Roaming/Typora/typora-user-images/image-20230226115549173.png)

##### 新订单添加：

在基于已经录入有购买需求的客户信息的基础上，以身份证号为基准进行客户姓名的自动索引，从而进行新订单的确认

![image-20230226115559874](../AppData/Roaming/Typora/typora-user-images/image-20230226115559874.png)

##### 销售订单：

显示已存在订单的基本信息，其中若支付状态为未支付，则不纳入销售额的统计

![image-20230226115619949](../AppData/Roaming/Typora/typora-user-images/image-20230226115619949.png)

##### 订单详情：

详细展现订单信息，其中包括客户编号、车辆编号以及购买车辆数量，对购买细节信息进行详细的记录，具有订单溯回和追踪的完善性





#### 客户管理

![image-20230226115655282](../AppData/Roaming/Typora/typora-user-images/image-20230226115655282.png)

##### 添加客户：

录入客户的基本信息

![image-20230226115705320](../AppData/Roaming/Typora/typora-user-images/image-20230226115705320.png)

##### 客户信息：

展现已录入客户的详细信息

![image-20230226115714849](../AppData/Roaming/Typora/typora-user-images/image-20230226115714849.png)

#### 库存管理

![image-20230226115722512](../AppData/Roaming/Typora/typora-user-images/image-20230226115722512.png)

##### 添加库存：

添加库存只能添加已有的品牌/车系的车，如要添加新品牌可直接添加品牌名称/车系，并均可对其进行删除

![image-20230226115732158](../AppData/Roaming/Typora/typora-user-images/image-20230226115732158.png)

##### 车辆库存：

详细展现现已有的车辆和相关车辆信息

![image-20230226115740819](../AppData/Roaming/Typora/typora-user-images/image-20230226115740819.png)

#### 财务报表

![image-20230226115748448](../AppData/Roaming/Typora/typora-user-images/image-20230226115748448.png)

##### 员工报表：

以可视化图标的形式展现员工销售额信息

![image-20230226115758513](../AppData/Roaming/Typora/typora-user-images/image-20230226115758513.png)

##### 销量报表：

以月为单位通过柱状图展现每月的利润、收入及支出额

![image-20230226115806954](../AppData/Roaming/Typora/typora-user-images/image-20230226115806954.png)

##### 个人月报表：

根据已登陆的管理人的销售信息，以售出的车型为统计基准，以月为时间基准，统计该员工每月的车型销售信息

![image-20230226115815885](../AppData/Roaming/Typora/typora-user-images/image-20230226115815885.png)

#### 员工管理

![image-20230226115824328](../AppData/Roaming/Typora/typora-user-images/image-20230226115824328.png)

##### 添加员工：

记录入职员工的基本信息，并录入该员工登录系统的密码

![image-20230226115833187](../AppData/Roaming/Typora/typora-user-images/image-20230226115833187.png)

##### 员工信息：

自动生成员工编号，显示员工基本个人信息及入职信息，并以员工编号为系统登入id进行系统登录

![image-20230226115841908](../AppData/Roaming/Typora/typora-user-images/image-20230226115841908.png)

### 销售

#### 登录界面

![image-20230226115904128](../AppData/Roaming/Typora/typora-user-images/image-20230226115904128.png)

#### 销售员工的管理功能：

![image-20230226115923548](../AppData/Roaming/Typora/typora-user-images/image-20230226115923548.png)

#### 首页：

同样显示该员工本月销售额以及本月的汽车销量

![image-20230226115914489](../AppData/Roaming/Typora/typora-user-images/image-20230226115914489.png)

#### 销售管理与客户管理：

与经理管理功能一致

![image-20230226120005778](../AppData/Roaming/Typora/typora-user-images/image-20230226120005778.png)

#### 库存管理：

销售只能对车辆库存信息进行查看，不能进行任何编辑和修改

![image-20230226120016742](../AppData/Roaming/Typora/typora-user-images/image-20230226120016742.png)

#### 个人月报表：

只能对该员工自己的销售报表进行查看

![image-20230226120027678](../AppData/Roaming/Typora/typora-user-images/image-20230226120027678.png)

#### 我的信息：

对该员工的个人信息和入职信息进行查看，只可进行对基本信息即姓名、联系电话、身份证号、性别的修改，可以进行系统登入密码的修改

![image-20230226120035219](../AppData/Roaming/Typora/typora-user-images/image-20230226120035219.png)

### 系统页面调整功能

#### 页面侧方目录可折叠并保存记录标签页打开

![image-20230226120113910](../AppData/Roaming/Typora/typora-user-images/image-20230226120113910.png)

#### 页面全屏-直接返回首页-退出登录

![image-20230226120151629](../AppData/Roaming/Typora/typora-user-images/image-20230226120151629.png)