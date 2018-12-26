## Some problems

书中使用的数据库时Oracle，这里用的是mysql

当使用@Transaction注解，从链接 http://localhost:8080/rollback?name=lzc&age=22 访问时并没有rollback

查到stackoverflow上说的是

Springboot 2.0 @Transaction doesn't get supported by org.hibernate.dialect.MySQL5Dialect

然后在application.properties里面加上

spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5InnoDBDialect

rollback和norollback好像可以用了，但是正常的sql语句插入数据用不了