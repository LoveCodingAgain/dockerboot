<div align="center">
    <h2>关于项目</h2>  
</div>

### 一: SpringBoot常用开发技术整合<br/>

- SpringBoot整合MyBatis框架分为注解版本和配置文件版本的.Druid数据库连接池加监控的页面配置.
- SpringBoot整合Thymeleaf模板引擎,做Web视图层.常用标记使用.
- lombok插件的配置使用可以替换set方法的,但是和直接写的配置方法有些不一样的就是不会在实体类下面有显示提示额.
- SpringBoot整合Swagger2实现RestFul的接口文档编写.
- SpringBoot集成异步任务,异步执行任务.主类添加@EnableAsync注解.Spring容器便可以自动扫描到了.异步方法上标记@Async注解即可.实战发送消息和发送邮件.
- SpringBoot整合定时任务.主类添加@EnableScheduling注解.定时任务方法上面标注注解@Scheduled(fixedRate = 3000).表示每三秒执行一次方法.
- 定时任务的表达式cron的使用.cron表达式生成：http://cron.qqe2.com.@Scheduled(cron="3-30 * * * * ?")表示每一分钟的3~30秒打印时间.
- SpringBoot整合devtools实现项目的热部署.直接添加依赖即可,IDEA中也配置一下.
- SpringBoot的资源配置文件与映射之实体类.注解@Value和注解@ConfirgutationProperties和注解@PropertySource指定配置文件位置.多用于自定义属性.还要添加依赖的.
- SpringBoot的配置文件格式yml注意事项.url映射保证唯一.
- SpringBoot返回JSON对象.JackJson.@ResponseBody.封装类.@jsonignore(忽略json返回)以及@JsonFormat格式化注解.@JsonInclude(Include.NON_NULL)
- SpringBoot配置拦截器.使用JAVA注解@Confirguration,然后继承WebMvdConfigurationAdapter.然后重写方法addInterceptors方法.然后配置功能拦截器即可.
- SpringBoot整合Redis缓存,添加依赖,然后配置redis属性,注入依赖StringRedisTemplate.JedisAPI五种数据类型.
- SpringBoot整合HttpClient模拟浏览器访问站点.
- SpringBoot返回Xml格式数据.
- Redis的客户端使用命令：./redis-cli  auth password.
- IDEA安装实体类序列化插件.
- 应用项目启动图标设置.这个网站设置,复制到resources目录即可,链接如下:http://patorjk.com/software/taag/
- SpringBoot配置日志信息位于资源目录下的logback.xml.常用的标签熟悉掌握使用.以及多环境日志输出配置.使用spring扩展profile支持.命名为logback-spring.xml.

>  <!-- 测试环境+开发环境. 多个使用逗号隔开. -->
>  <springProfile name="test,dev">
>      <logger name="com.dudu.controller" level="info" />
>  </springProfile>
>  <!-- 生产环境. -->
>  <springProfile name="prod">
>      <logger name="com.dudu.controller" level="ERROR" />
>  </springProfile>
 
- SpringBoot整合全局异常处理.使用注解@ControllerAdvice+@ExceptionHandler,返回页面类型和返回json数据.Controller层异常只需要抛出即可,无需捕获了.
- SpringBoot整合阿里云IP归属地查询API.HttpClient封装Https接口调用.

  