# car-sale-system

[TOC]



## 数据库设计

![f03376e6c715cf8790839cba3a7bfd2](http://evinci.oss-cn-hangzhou.aliyuncs.com/evinci/f03376e6c715cf8790839cba3a7bfd2.png)

### 系统基本月份表

![d06c9a386f61dd425ecbf63c98b9e42](http://evinci.oss-cn-hangzhou.aliyuncs.com/evinci/d06c9a386f61dd425ecbf63c98b9e42.png)

### 品牌编号表

![f2bb4c93e16c4ac0edad4c9fccf1246](http://evinci.oss-cn-hangzhou.aliyuncs.com/evinci/f2bb4c93e16c4ac0edad4c9fccf1246.png)

### 车辆编号表

![59eb6ea593f099c7e6117cc2fb178f4](http://evinci.oss-cn-hangzhou.aliyuncs.com/evinci/59eb6ea593f099c7e6117cc2fb178f4.png)

### 顾客表

![2e299c38e8c677bf3423309f90fc8a1](http://evinci.oss-cn-hangzhou.aliyuncs.com/evinci/2e299c38e8c677bf3423309f90fc8a1.png)

### 员工表

![1bc445cb2769a52d2557bfc2af391c1](http://evinci.oss-cn-hangzhou.aliyuncs.com/evinci/1bc445cb2769a52d2557bfc2af391c1.png)

### 订单表

![4d9fe7936d310cabcea8afe20f1406c](http://evinci.oss-cn-hangzhou.aliyuncs.com/evinci/4d9fe7936d310cabcea8afe20f1406c.png)

### 订单详情表

![961a5bad0e70224068f2aff215f8e21](http://evinci.oss-cn-hangzhou.aliyuncs.com/evinci/961a5bad0e70224068f2aff215f8e21.png)

### 车系表

![8babb1155619678ca4bfaddeec30f90](http://evinci.oss-cn-hangzhou.aliyuncs.com/evinci/8babb1155619678ca4bfaddeec30f90.png)

## 功能展示

### 经理

#### 登录界面

![d9d26ead676a25a4c018d7679716f45](http://evinci.oss-cn-hangzhou.aliyuncs.com/evinci/d9d26ead676a25a4c018d7679716f45.png)

#### 管理功能分为五个部分：

![fca3e1d0678320d6f4581bd4227ec26](http://evinci.oss-cn-hangzhou.aliyuncs.com/evinci/fca3e1d0678320d6f4581bd4227ec26.png)

#### 首页：呈现昨日销售额和销量，昨日销售额以可视化饼状图形式显示

![ba25899b3dbba23b61c83d5ca38d8b1](http://evinci.oss-cn-hangzhou.aliyuncs.com/evinci/ba25899b3dbba23b61c83d5ca38d8b1.png)

#### 销售管理

![b41b749d0bb0bd12ee0779708870a9c](http://evinci.oss-cn-hangzhou.aliyuncs.com/evinci/b41b749d0bb0bd12ee0779708870a9c.png)

##### 新订单添加：

在基于已经录入有购买需求的客户信息的基础上，以身份证号为基准进行客户姓名的自动索引，从而进行新订单的确认

![f7db4a7f1e4d30a70356c6442286e7b](http://evinci.oss-cn-hangzhou.aliyuncs.com/evinci/f7db4a7f1e4d30a70356c6442286e7b.png)

##### 销售订单：

显示已存在订单的基本信息，其中若支付状态为未支付，则不纳入销售额的统计

![86e8d96e146bbe224e731fe87faa037](http://evinci.oss-cn-hangzhou.aliyuncs.com/evinci/86e8d96e146bbe224e731fe87faa037.png)

##### 订单详情：

详细展现订单信息，其中包括客户编号、车辆编号以及购买车辆数量，对购买细节信息进行详细的记录，具有订单溯回和追踪的完善性





#### 客户管理

![aef2684f7bbb821a41028fbaf997b5c](http://evinci.oss-cn-hangzhou.aliyuncs.com/evinci/aef2684f7bbb821a41028fbaf997b5c.png)

##### 添加客户：

录入客户的基本信息

![586e7d91eabda80da8ef740be1c6825](http://evinci.oss-cn-hangzhou.aliyuncs.com/evinci/586e7d91eabda80da8ef740be1c6825.png)

##### 客户信息：

展现已录入客户的详细信息

![7dde58351db6d466fb153807da6ded7](http://evinci.oss-cn-hangzhou.aliyuncs.com/evinci/7dde58351db6d466fb153807da6ded7.png)

#### 库存管理

![2beabc809e55cc06cbcaf885d7d78e6](http://evinci.oss-cn-hangzhou.aliyuncs.com/evinci/2beabc809e55cc06cbcaf885d7d78e6.png)

##### 添加库存：

添加库存只能添加已有的品牌/车系的车，如要添加新品牌可直接添加品牌名称/车系，并均可对其进行删除

![604dd7f32032252262e6fa2d28526d8](http://evinci.oss-cn-hangzhou.aliyuncs.com/evinci/604dd7f32032252262e6fa2d28526d8.png)

##### 车辆库存：

详细展现现已有的车辆和相关车辆信息

![8cfd816e48b17d785e3f2e3a50cbdb3](http://evinci.oss-cn-hangzhou.aliyuncs.com/evinci/8cfd816e48b17d785e3f2e3a50cbdb3.png)

#### 财务报表

![08dee58d6241aa3ce811e45163ca92c](http://evinci.oss-cn-hangzhou.aliyuncs.com/evinci/08dee58d6241aa3ce811e45163ca92c.png)

##### 员工报表：

以可视化图标的形式展现员工销售额信息

![fc0bc3c0e0a4571cfab5d1c4250b835](http://evinci.oss-cn-hangzhou.aliyuncs.com/evinci/fc0bc3c0e0a4571cfab5d1c4250b835.png)

##### 销量报表：

以月为单位通过柱状图展现每月的利润、收入及支出额

![d2026d090808d144158c413006729d4](http://evinci.oss-cn-hangzhou.aliyuncs.com/evinci/d2026d090808d144158c413006729d4.png)

##### 个人月报表：

根据已登陆的管理人的销售信息，以售出的车型为统计基准，以月为时间基准，统计该员工每月的车型销售信息

![e351565917ac3d1976f3a0628266deb](http://evinci.oss-cn-hangzhou.aliyuncs.com/evinci/e351565917ac3d1976f3a0628266deb.png)

#### 员工管理

![d3905711f9bcbda73e045296e6c0868](http://evinci.oss-cn-hangzhou.aliyuncs.com/evinci/d3905711f9bcbda73e045296e6c0868.png)

##### 添加员工：

记录入职员工的基本信息，并录入该员工登录系统的密码

![eb8c5f4b5fbc80f02464d76e170a02d](http://evinci.oss-cn-hangzhou.aliyuncs.com/evinci/eb8c5f4b5fbc80f02464d76e170a02d.png)

##### 员工信息：

自动生成员工编号，显示员工基本个人信息及入职信息，并以员工编号为系统登入id进行系统登录

![eb9b0fd8a420a9f5ea722286cdd76f8](http://evinci.oss-cn-hangzhou.aliyuncs.com/evinci/eb9b0fd8a420a9f5ea722286cdd76f8.png)

### 销售

#### 登录界面

![6162264f5638c4a99ef88b4d99c7cab](http://evinci.oss-cn-hangzhou.aliyuncs.com/evinci/6162264f5638c4a99ef88b4d99c7cab.png)

#### 销售员工的管理功能：

![f9b815d94cc6f1567f1cd384a22a450](http://evinci.oss-cn-hangzhou.aliyuncs.com/evinci/f9b815d94cc6f1567f1cd384a22a450.png)

#### 首页：

同样显示该员工本月销售额以及本月的汽车销量

![574b8d40df1ac5aff044b149a794e9b](http://evinci.oss-cn-hangzhou.aliyuncs.com/evinci/574b8d40df1ac5aff044b149a794e9b.png)

#### 销售管理与客户管理：

与经理管理功能一致

![8da5307aa65ecae6fb0fa9a43c9c9e8](http://evinci.oss-cn-hangzhou.aliyuncs.com/evinci/8da5307aa65ecae6fb0fa9a43c9c9e8.png)

#### 库存管理：

销售只能对车辆库存信息进行查看，不能进行任何编辑和修改

![18e253cc278e76c10af8bf1157cd636](http://evinci.oss-cn-hangzhou.aliyuncs.com/evinci/18e253cc278e76c10af8bf1157cd636.png)

#### 个人月报表：

只能对该员工自己的销售报表进行查看

![73d13eb0c79c49d0f34823d06c45e9d](http://evinci.oss-cn-hangzhou.aliyuncs.com/evinci/73d13eb0c79c49d0f34823d06c45e9d.png)

#### 我的信息：

对该员工的个人信息和入职信息进行查看，只可进行对基本信息即姓名、联系电话、身份证号、性别的修改，可以进行系统登入密码的修改

![12b4454fe0e8fe4242e2d72a7a759ec](http://evinci.oss-cn-hangzhou.aliyuncs.com/evinci/12b4454fe0e8fe4242e2d72a7a759ec.png)

### 系统页面调整功能

#### 页面侧方目录可折叠并保存记录标签页打开

![f4ad2830d5b5656dc0db963d7431fc0](http://evinci.oss-cn-hangzhou.aliyuncs.com/evinci/f4ad2830d5b5656dc0db963d7431fc0.png)

#### 页面全屏-直接返回首页-退出登录

![5ef48428eba8acd5262b6d1cfd3c9b2](http://evinci.oss-cn-hangzhou.aliyuncs.com/evinci/5ef48428eba8acd5262b6d1cfd3c9b2.png)