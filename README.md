# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)

### Guides
The following guides illustrate how to use some features concretely:

* [Quick Start](https://github.com/mybatis/spring-boot-starter/wiki/Quick-Start)
本案例是我专门用来测试验证mybatis的核心功能的案例.

###代理模式
2020-09-26 通过代理中间件,调用UserMapper一个接口方法,spring托管bean,mybatis能获取mapper中的SQL语句,通过SqlSession对象执行SQL得到结果.
对代理模式的理解,家里的电灯开关，我们不能操作220v电线的人肉连接，但是可以使用开关，避免触电