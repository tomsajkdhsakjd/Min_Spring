# Min_Spring
这是一个模拟spring一些小功能的框架;

具有的功能:

1.单例和多例对象的创建,通过xml文件
2 简单对象的自动注入,属性注入不支持只能通过xml文件配置支持注解@Component
3 简单的aop功能,基于AspectJ包下的注解

IOC使用方法如图

首先将配置文件放在一个spring文件夹下

![](https://github.com/tomsajkdhsakjd/Min_Spring/blob/master/imgs/20190309160358.png)

如何如图进行配置,必须严格按照spring配置的规范进行,不然会出现一些错误,我没进行校验,工作量太大了

![](https://github.com/tomsajkdhsakjd/Min_Spring/blob/master/imgs/20190309160436.png)

最后如图测试

![](https://github.com/tomsajkdhsakjd/Min_Spring/blob/master/imgs/20190309160525.png)


自动注入的使用方法

![](https://github.com/tomsajkdhsakjd/Min_Spring/blob/master/imgs/20190310172024.png)

配置文件要主要添加上面的约束就行不然解析不了<scan>标签,而且需要注意的是如果你的项目在C盘,需要打开所有文件的权限,不然扫描不了包下的类
  
结果如图
  
  ![](https://github.com/tomsajkdhsakjd/Min_Spring/blob/master/imgs/20190310171956.png)
  
  ![](https://github.com/tomsajkdhsakjd/Min_Spring/blob/master/imgs/20190310172046.png)
  
  ![](https://github.com/tomsajkdhsakjd/Min_Spring/blob/master/imgs/20190310174036.png)
  
可以看出Testa Testb Testc三个类都自动生成了,对了获取是要通过类名来获取,因为我是用类名作为id放到缓存里面去的

2 简单AOP使用例图

配置文件如图所示

![](https://github.com/tomsajkdhsakjd/Min_Spring/blob/master/imgs/springaop.png)

效果如下

![](https://github.com/tomsajkdhsakjd/Min_Spring/blob/master/imgs/aop.png)

必须严格按照图的方式来进行配置,这里我现在只支持JDK动态代理的方式来实现aop,所有你必须将你要代理的对象实现摸个接口,以后我会进一步完善

