## Problems

出现异常：

`java.lang.IllegalArgumentException: There is no PasswordEncoder mapped for the id "null"`

原因是在Spring Security 5.0之后新增了多种加密方式，也改变了密码的格式，官方文档解释如下：

### [Password Storage Format](https://docs.spring.io/spring-security/site/docs/5.2.0.BUILD-SNAPSHOT/reference/htmlsingle/#pe-dpe-format)
The general format for a password is:

`{id}encodedPassword`

Such that `id` is an identifier used to look up which `PasswordEncoder`
should be used and `encodedPassword` is the original encoded password for
the selected `PasswordEncoder`. The `id` must be at the beginning of the
password, start with `{` and end with `}`. If the `id` cannot be found, the
`id` will be null.

### Revision

将前端传回来的密码进行加密，使用`bcrypt`加密方式，在`WebSecurityConfig.java`中，`config()`
方法改为：

```java
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(customUserService()).passwordEncoder(new BCryptPasswordEncoder());
    }
```

传入数据库中的密码也改为加密后的版本，使用下面函数将密码加密，然后写入数据库的SYS_USER表中：

```java
    public static void main(String[] args) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        //加密"lzc"
        String encodelzc = bCryptPasswordEncoder.encode("lzc");
        //加密"test"
        String encodetest = bCryptPasswordEncoder.encode("test");
        System.out.println(encodelzc);
        System.out.println(encodetest);

        //结果：
        //lzc:  $2a$10$ESRaVCGuIV/mIqDDBlCGaOopq3lzLo07XHteBVzwhSVtLKP.v39CK
        //test: $2a$10$E33yqYlsMRbYPga7XCrb..L72uQZ1YkeZm6b/syIu61.KUgtSaF1K
    }
```

---

Thymeleaf好像有点问题，在`home.html`中，并没有按照用户不同的ROLE而显示不同的信息
```html
<div sec:authorize="hasRole('ROLE_ADMIN')"> <!-- 3 -->
	<p class="bg-info" th:text="${msg.etraInfo}"></p>
</div>

<div sec:authorize="hasRole('ROLE_USER')"> <!-- 4-->
	<p class="bg-info">无更多信息显示</p>
</div>
```

也没有获取到用户的`name`作为`title`
```html
<title sec:authentication="name"></title>
```