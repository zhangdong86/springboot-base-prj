## molicode 基础工程

本工程主要用于作为一个脚手架工程，将常用的工具和一些业务常量配置到系统中。通过molicode工具生成的代码到工程中，应该免配置或者少量配置之后是可以直接运行的。


## 可适配的模板引擎
示例模板：
[https://github.com/cn2oo8/autocode-template-example](https://github.com/cn2oo8/autocode-template-example)

请选择其中的：autocode-template-selfsdk	

其主要特性和molicode工具的底层架构是基本一致的。


## 技术栈
后台： springoot + mybatis + MySQL + SpringMVC 

前台： vue + iview admin + nodejs + webpack

## molicode替换表达式

如下：新建一个usercenter的项目， maven的artifact前缀为：usercenter-***
包路径以： com.shareyi.user.center 开始；

### 替换表达式（用于文本内容替换）
```
baseproject-springboot=usercenter
com.shareyi.basespringboot=com.shareyi.user.center
```

### 目录转换表达式（用于包路径转换）
```
com/shareyi/basespringboot=com/shareyi/user.center
```
