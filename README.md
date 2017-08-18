项目名称：springMVC
项目代码：springMVC
GIT库名称：springMVC

-------------------------------------------------------------

## 学习记录
1.1.  HelloWorld
	- 1.spring 官网地址
        spring官网地址：http://spring.io/projects，进入spring-framework页面（即http://projects.spring.io/spring-framework/）后可以看到spring发布的各个版本

    - 2.spring 是什么？
        spring是一个开源框架，spring为简化企业级应用开发而生，spring是IOC（DI）和 AOP容器框架
        - 轻量级：spring是非侵入性的。基于spirng开发的应用中的对象可以不依赖于spring的api（不需要继承spring 父类）
        - 依赖注入：（DI --dependency injection ／ IOC）
        - 面向切面的编程（AOP --aspect oriented programming）
        - 容器：spring是一个容器，因为它包含并且管理应用对象的生命周期
        - 框架：Spring 实现了使用简单的组建配置组合成一个复杂的应用，在spring中可以使用XML和Java注解组合这些对象
        - 一站式：在IOC和AOP的基础上可以整合各种企业应用开源框架和优秀的第三方类库，它提供了展现层和持久层的Spring JDBC

    - 3.helloWorld
        - pom.xml中配置稳定版本
        <spring.version>4.3.3.RELEASE</spring.version>
        - 必须的jar包
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-beans</artifactId>
            <version>${spring.version}</version>
        </dependency>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-core</artifactId>
            <version>${spring.version}</version>
        </dependency>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-context</artifactId>
            <version>${spring.version}</version>
        </dependency>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-expression</artifactId>
            <version>${spring.version}</version>
        </dependency>
        commons-logging:1.2(自动会引入)
        - 创建 HelloWorld.java 实现传统的属性注入：com.ivy.p0101.HelloWorld.java
-------------------------------------------------------------