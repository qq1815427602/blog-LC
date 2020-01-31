### 2020/1/31
实现登录
添加sql文件

### 2020/1/25
1.common 配置好 jwt 


参考 url
1. [jwt](https://github.com/macrozheng/mall/blob/master/mall-security/src/main/java/com/macro/mall/security/util/JwtTokenUtil.java)

2. security 中类说明
>configure(HttpSecurity httpSecurity)：用于配置需要拦截的url路径、jwt过滤器及出异常后的处理器；
 
>configure(AuthenticationManagerBuilder auth)：用于配置UserDetailsService及PasswordEncoder；
 
>RestfulAccessDeniedHandler：当用户没有访问权限时的处理器，用于返回JSON格式的处理结果；
 
>RestAuthenticationEntryPoint：当未登录或token失效时，返回JSON格式的结果；
 
>UserDetailsService:SpringSecurity定义的核心接口，用于根据用户名获取用户信息，需要自行实现；
 
>UserDetails：SpringSecurity定义用于封装用户信息的类（主要是用户信息和权限），需要自行实现；
 
>PasswordEncoder：SpringSecurity定义的用于对密码进行编码及比对的接口，目前使用的是BCryptPasswordEncoder；
 
>JwtAuthenticationTokenFilter：在用户名和密码校验前添加的过滤器，如果有jwt的token，会自行根据token信息进行登录。

### 2020/1/20
1. 在dao模块中配置好了 jdbc 与 druid