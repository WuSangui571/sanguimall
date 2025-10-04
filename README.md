> 开启分布式微服务项目的学习，开始时间：2025年10月4日11:27

# 1. 环境

## 1.1. 确定 SpringBoot 项目版本

1. SpringBoot
   + 3.3.4

2. SpringCloud

   + 2023.0.3

3. SpringCloud Alibaba

   + 2023.0.3.2

4. RuoYi-Vue

   + 3.9.0

5. Nacos

   + 

   

## 1.2. 创建 SpringBoot 项目

直接创建新的 SpringBoot 项目，取名 `sanguimall`，创建完成之后删掉除了 `.idea` 文件夹 和 `pom.xml` 之外的所有文件。并将 `pom.xml` 文件修改为：

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <!--确定 SpringBoot 的版本-->
        <version>3.3.4</version>
        <relativePath/>
    </parent>
    <packaging>pom</packaging>
    <modules>
        <module>services</module>
    </modules>

    <!--确定项目信息-->
    <groupId>com.sangui</groupId>
    <artifactId>sanguimall</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <name>sanguimall</name>
    <description>sanguimall</description>
    
    <!--添加依赖配置信息-->
    <properties>
        <maven.compiler.source>21</maven.compiler.source>
        <maven.compiler.target>21</maven.compiler.target>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <spring-cloud.version>2023.0.3</spring-cloud.version>
        <spring-cloud-alibaba.version>2023.0.3.2</spring-cloud-alibaba.version>
    </properties>
    
    <!--添加依赖-->
    <dependencyManagement>
        <dependencies>
            <dependency>
                <groupId>org.springframework.cloud</groupId>
                <artifactId>spring-cloud-dependencies</artifactId>
                <version>${spring-cloud.version}</version>
                <type>pom</type>
                <scope>import</scope>
            </dependency>
            <dependency>
                <groupId>com.alibaba.cloud</groupId>
                <artifactId>spring-cloud-alibaba-dependencies</artifactId>
                <version>${spring-cloud-alibaba.version}</version>
                <type>pom</type>
                <scope>import</scope>
            </dependency>
        </dependencies>
    </dependencyManagement>

    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
        </plugins>
    </build>

</project>
```

## 1.3 创建微服务项目

1. **添加父 service 模块**

   为项目添加新的模块，添加普通的 Java 模块，取名 `services`。这就是微服务模块。

   删除改模块里的 `src` 文件夹，并修改该模块的打包方式为 `pom`，如：

   ```xml
   <?xml version="1.0" encoding="UTF-8"?>
   <project xmlns="http://maven.apache.org/POM/4.0.0"
            xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
            xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
       <modelVersion>4.0.0</modelVersion>
       
       <!--确定父项目信息-->
       <parent>
           <groupId>com.sangui</groupId>
           <artifactId>sanguimall</artifactId>
           <version>0.0.1-SNAPSHOT</version>
       </parent>
       
       <dependencies>
           <!--未来可在此中加入依赖，每个具体的微服务模块都可以使用这个依赖（继承父依赖）-->
       </dependencies>
   
       <packaging>pom</packaging>
   
       <artifactId>services</artifactId>
   
       <properties>
           <maven.compiler.source>21</maven.compiler.source>
           <maven.compiler.target>21</maven.compiler.target>
           <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
       </properties>
   
   </project>
   ```

2. **添加具体的微服务模块**

   在 services 里添加具体的微服务模块模块：`product`，该模块也是普通的 Java 模块，其父模块是 services。同样的道理，总共先生成如下微服务模块：

   + product

   + order

   + ware

   + coupon

   + member

## 1.4. 数据库

为各个微服务模块，导入各自的数据库。

详见 https://github.com/WuSangui571/sanguimall/tree/main/sql/init ，里面的五个 sql 文件。

## 1.5. 若依框架

我们的商城的后台管理系统的前端和后台，使用开源项目：RuoYi-Vue。

代码下载：https://gitee.com/y_project/RuoYi-Vue 

文档浏览：https://doc.ruoyi.vip/ruoyi-vue/ 

按照文档，访问：http://localhost/ ，默认账户/密码 `admin/admin123`。若能正确展示登录页面，并能成功登录，菜单及页面展示正常，则表明环境搭建成功

